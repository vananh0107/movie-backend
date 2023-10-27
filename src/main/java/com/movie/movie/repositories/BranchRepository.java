package com.movie.movie.repositories;

import com.movie.movie.pojo.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Integer> {
     List<Branch> getBranchThatShowTheMovie(Integer movieId) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Branch> criteriaQuery = criteriaBuilder.createQuery(Branch.class);
        Root<Branch> branchRoot = criteriaQuery.from(Branch.class);

        // Tạo một subquery để lấy danh sách branch.id từ bảng Schedule
        Subquery<Integer> subquery = criteriaQuery.subquery(Integer.class);
        Root<Schedule> scheduleRoot = subquery.from(Schedule.class);
        Join<Schedule, Movie> movieJoin = scheduleRoot.join("movie");
        subquery.select(scheduleRoot.get("branch").get("id"));
        subquery.where(criteriaBuilder.equal(movieJoin.get("id"), movieId));

        // Sử dụng subquery trong điều kiện WHERE của truy vấn chính
        Predicate condition = branchRoot.get("id").in(subquery);
        criteriaQuery.where(condition);

        List<Branch> result = entityManager.createQuery(criteriaQuery).getResultList();
        return result;
    }
}
