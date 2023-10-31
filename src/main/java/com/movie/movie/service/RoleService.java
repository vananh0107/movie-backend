package com.movie.movie.service;

import com.movie.movie.pojo.Role;

public interface RoleService extends GeneralService<Role> {
    Role findByName(String name);
}