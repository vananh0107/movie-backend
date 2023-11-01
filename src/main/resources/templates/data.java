import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

@Autowired
private UserService userService;

@Autowired
private MovieRepository movieRepository;

@Autowired
private BranchRepository branchRepository;

@Autowired
private RoomRepository roomRepository;

@Autowired
private ScheduleRepository scheduleRepository;

@Autowired
private SeatRepository seatRepository;
@PostConstruct
public void init() {
        Room room = roomRepository.findById(4).orElse(null);

        for(int i=1;i<=8;i++){
        Seat seat = new Seat();
        seat.setName("A"+i);
        seat.setRoom(room);
        seatRepository.save(seat);
        }

        for(int i=1;i<=8;i++){
        Seat seat = new Seat();
        seat.setName("B"+i);
        seat.setRoom(room);
        seatRepository.save(seat);
        }
        for(int i=1;i<=8;i++){
        Seat seat = new Seat();
        seat.setName("C"+i);
        seat.setRoom(room);
        seatRepository.save(seat);
        }
        for(int i=1;i<=8;i++){
        Seat seat = new Seat();
        seat.setName("D"+i);
        seat.setRoom(room);
        seatRepository.save(seat);
        }
        for(int i=1;i<=8;i++){
        Seat seat = new Seat();
        seat.setName("E"+i);
        seat.setRoom(room);
        seatRepository.save(seat);
        }

        List<Movie> movies = movieRepository.findAll();
        if (movies.isEmpty()) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Movie nhocTrum = addNewMovie("Nhóc Trùm: Nối Nghiệp Gia Đình","https://www.cgv.vn/media/catalog/product/cache/1/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/p/o/poster_boss_baby_2_24.12.2021_1_1_1__1.jpg",
        "Nhóc trùm Ted giờ đây đã trở thành một triệu phú nổi tiếng trong khi Tim lại có một cuộc sống đơn giản bên vợ anh Carol và hai cô con gái nhỏ yêu dấu. Mỗi mùa Giáng sinh tới, cả Tina và Tabitha đều mong được gặp chú Ted",
        "Nhóc trùm Ted giờ đây đã trở thành một triệu phú nổi tiếng trong khi Tim lại có một cuộc sống đơn giản bên vợ anh Carol và hai cô con gái nhỏ yêu dấu. Mỗi mùa Giáng sinh tới, cả Tina và Tabitha đều mong được gặp chú Ted nhưng dường như hai anh em nhà Templeton nay đã không còn gần gũi như xưa. Nhưng bất ngờ thay khi Ted lại có màn tái xuất không thể hoành tráng hơn khi đáp thẳng máy bay trực thăng tới nhà Tim trước sự ngỡ ngàng của cả gia đình.",
        "https://img-zlr1.tv360.vn/image1/2023/07/28/16/1690536781505/077ff4cebd04_640_360.jpg",
        "Tom McGrath","Amy Sedaris, Jeff Goldblum, James Marsden",
        "Hoạt Hình", LocalDate.parse("24/12/2023",formatter),
        105,"https://www.youtube.com/embed/Lv8nL2q8yRI",
        "Tiếng Anh với phụ đề tiếng Việt và lồng tiếng Việt",
        "P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG",1);
        Movie venom = addNewMovie("Venom: Đối Mặt Tử Thù","https://www.cgv.vn/media/catalog/product/cache/1/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/p/o/poster_venom_121121_1__1.jpg",
        "Siêu bom tấn #VENOM: LET THERE BE CARNAGE hứa hẹn trận chiến khốc liệt nhất giữa Venom và kẻ thù truyền kiếp, Carnage.",
        "Siêu bom tấn #VENOM: LET THERE BE CARNAGE hứa hẹn trận chiến khốc liệt nhất giữa Venom và kẻ thù truyền kiếp, Carnage.",
        "https://images2.thanhnien.vn/Uploaded/duyentn/2021_12_08/61892e1fa9371f3a919b76c6-venom-2-1-550.jpg",
        "Andy Serkis","Tom Hardy, Michelle Williams, Woody Harrelson, Naomie Harris",
        "Hành Động, Khoa Học Viễn Tưởng, Phiêu Lưu, Thần thoại",
        LocalDate.parse("10/12/2023",formatter),97,"https://www.youtube.com/embed/EVWdzVtSh1I",
        "Tiếng Anh - Phụ đề Tiếng Việt","C13 - PHIM CẤM KHÁN GIẢ DƯỚI 13 TUỔI",1);
        Movie maTran = addNewMovie("Ma Trận: Hồi Sinh","https://www.cgv.vn/media/catalog/product/cache/1/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/p/o/poster_matrix_4_1__1.jpg",
        "Sau 20 năm, siêu phẩm ma trận đã trờ lại với người xem, Neo is back! Liệu đây có phải phần kết cho franchise này",
        "Ma Trận: Hồi Sinh là phần phim tiếp theo rất được trông đợi của loạt phim “Ma Trận” đình đám, đã góp phần tái định nghĩa thể loại phim khoa học viễn tưởng. Phần phim mới nhất này đón chào sự trở lại của cặp đôi Keanu Reeves và Carrie-Anne Moss với vai diễn biểu tượng đã làm nên tên tuổi của họ, Neo và Trinity. Ngoài ra, phim còn có sự góp mặt của dàn diễn viên đầy tài năng gồm Yahya Abdul-Mateen II, Jessica Henwick, Jonathan Groff, Neil Patrick Harris, Priyanka Chopra Jonas và Christina Ricci.",
        "https://genk.mediacdn.vn/139269124445442048/2020/10/22/keanu-reeves-as-neo-in-the-matrix-16033410366641196344830.jpg",
        "Lana Wachowski","Keanu Reeves, Carrie-Anne Moss, Yahya Abdul-Mateen II, Jessica Henwick, Jonathan Groff, Neil Patrick Harris, Priyanka Chopra Jonas và Christina Ricci",
        "Hành Động, Khoa Học Viễn Tưởng",LocalDate.parse("24/12/2023",formatter),
        148,"https://www.youtube.com/embed/l2UTOJC5Tbk",
        "Tiếng Anh - Phụ đề Tiếng Việt, Phụ đề Tiếng Hàn",
        "C18 - PHIM CẤM KHÁN GIẢ DƯỚI 18 TUỔI",1);
        Movie doremon = addNewMovie("Doraemon: Ôi Bạn Ơi 2","https://www.cgv.vn/media/catalog/product/cache/1/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/p/o/poster_doremon_2_1__1.jpg",
        "Một ngày nọ, Nobita vô tình tìm thấy chú gấu bông cũ, món đồ chơi chất chứa bao kỉ niệm cùng người bà đáng kính. Với khát khao “muốn gặp bà lần nữa”, Nobita đã trở về quá khứ bằng cổ máy thời gian, bất chấp sự phản đối của Doraemon",
        "Một ngày nọ, Nobita vô tình tìm thấy chú gấu bông cũ, món đồ chơi chất chứa bao kỉ niệm cùng người bà đáng kính. Với khát khao “muốn gặp bà lần nữa”, Nobita đã trở về quá khứ bằng cổ máy thời gian, bất chấp sự phản đối của Doraemon. Dù ngạc nhiên, bà vẫn tin cậu thiếu niên lớn tướng trước mặt mình là cháu mình. Trước nguyện vọng tha thiết “mong được thấy cháu dâu một lần”, chuyến phiêu lưu của Doraemon và Nobita bắt đầu. Nobita muốn cho bà xem đám cưới của mình, nhưng đúng ngày thành hôn với Shizuka, chú rể Nobita lại trốn mất? Jaian và Suneo chạy đôn chạy đáo tìm bạn, còn Shizuka vẫn tin tưởng chờ đợi Nobita. Để thực hiện nguyện vọng của bà, đáp lại niềm tin của gia đình, bạn bà và Shizuka yêu quý, Nobita sẽ cùng Doraemon du hành vượt thời gian. Họ sẽ mang đến cho chúng ta một câu chuyện cảm động đến rơi lệ về quan hệ con người, kết nối giữa quá khứ, hiện tại và tương lai.",
        "https://www.cgv.vn/media/banner/cache/1/b58515f018eb873dafa430b6f9ae0c1e/d/o/doreamon.jpg","Ryuichi Yagi, Takashi Yamazaki",
        "Wasabi Mizuta, Megumi Oohara, Yumi Kakazu, Subaru Kimura, Tomokazu Seki",
        "Hài, Hoạt Hình",LocalDate.parse("17/12/2023",formatter),
        96,"https://www.youtube.com/embed/GXnOs4Hj8MA","Tiếng Nhật - Phụ đề Tiếng Việt; Lồng tiếng",
        "P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG",1);
        Movie cauChuyenPhiaTay = addNewMovie("Câu Chuyện Phía Tây","https://www.cgv.vn/media/catalog/product/cache/1/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/p/o/poster_wss_1200x1800__1.jpg",
        "“Câu chuyện phía Tây” kể lại câu chuyện tình yêu kinh điển của Tony và Maria, giữa sự giằng xé của tình yêu trẻ tuổi và sự ngăn cấm, thù hằn ở thành phố NewYork những năm 1950",
        "Được đạo diễn bởi đạo diễn gạo cội từng giành giải Oscar Steven Spielberg, cùng kịch bản bởi biên kịch từng giành giải Pulitzer Prize và giải Tony Award, Tony Kushner, “Câu chuyện phía Tây” kể lại câu chuyện tình yêu kinh điển của Tony và Maria, giữa sự giằng xé của tình yêu trẻ tuổi và sự ngăn cấm, thù hằn ở thành phố NewYork những năm 1950.",
        "https://www.cgv.vn/media/banner/cache/1/b58515f018eb873dafa430b6f9ae0c1e/w/s/wss_sneak_980x448.jpg",
        "Steven Spielberg","Ansel Elgort, Rachel Zegler, Ariana DeBose, David Alvarez, Mike Faist, Josh Andrés Rivera, Ana Isabelle, Corey Stoll, Brian d’Arcy James, Rita Moreno",
        "Nhạc kịch, Tình cảm",LocalDate.parse("24/12/2023",formatter),
        156,"https://www.youtube.com/embed/QPvqV71P0Fo","Tiếng Anh - Phụ đề Tiếng Việt",
        "C16 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI",1);
        Movie blackPink = addNewMovie("BlackPink The Movie","https://www.cgv.vn/media/catalog/product/cache/1/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/p/o/poster_blackpink_vie_2_1__1.jpg",
        "Nhóm nhạc nữ được yêu thích toàn cầu, BLACKPINK sẽ kỷ niệm năm thứ 5 hoạt động của nhóm với việc phát hành BLACKPINK THE MOVIE",
        "Nhóm nhạc nữ được yêu thích toàn cầu, BLACKPINK sẽ kỷ niệm năm thứ 5 hoạt động của nhóm với việc phát hành BLACKPINK THE MOVIE, đây cũng như là món quà đặc biệt dành tặng cho các BLINK— fandom của BLACKPINK — bộ phim sẽ tái hiện một cách sống động những kỷ niệm không thể quên cùng những màn trinh diễn đầy cuồng nhiệt đúng tinh thần lễ hội.",
        "https://www.cgv.vn/media/banner/cache/1/b58515f018eb873dafa430b6f9ae0c1e/b/l/blackpink-rolling_1_.jpg",
        "Su Yee Jung, Oh Yoon-Dong","JISOO, JENNIE, ROSÉ, LISA",
        "Phim tài liệu",LocalDate.parse("24/12/2023",formatter),99,
        "https://www.youtube.com/embed/Q_rK9UlUN-Q","Tiếng Hàn - Phụ đề tiếng Việt",
        "P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG",1);
        Movie nguoiNhen = addNewMovie("Người Nhện: Không Còn Nhà","https://www.cgv.vn/media/catalog/product/cache/1/small_image/240x388/dd828b13b1cb77667d034d5f59a82eb6/s/n/snwh_poster_bluemontage_4x5fb_1__1.jpg"
        ,"Đa vũ trụ được mở ra, những kẻ phản diện nào sẽ trạm chán spidey, cùng đón xem nhá",
        "Lần đầu tiên trong lịch sử điện ảnh của Người Nhện, thân phận người hàng xóm thân thiện bị lật mở, khiến trách nhiệm làm một Siêu Anh Hùng xung đột với cuộc sống bình thường và đặt người anh quan tâm nhất vào tình thế nguy hiểm. Khi anh nhờ đến giúp đỡ của Doctor Strange để khôi phục lại bí mật, phép thuật đã gây ra lỗ hổng thời không, giải phóng những ác nhân mạnh mẽ nhất từng đối đầu với Người Nhện từ mọi vũ trụ. Bây giờ, Peter sẽ phải vượt qua thử thách lớn nhất của mình, nó sẽ thay đổi không chỉ tương lai của chính anh mà còn là tương lai của cả Đa Vũ Trụ."
        ,"https://images.fptplay.net/media/OTT/VOD/2022/10/18/nguoi-nhen-khong-con-nha-ban-mo-rong-fpt-play-1666081142074_Landscape.jpg",
        "Jon Watts","Tom Holland, Zendaya, Benedict Cumberbatch, Jacob Batalon, Jon Favreau","Hành Động, Phiêu Lưu",
        LocalDate.parse("17/12/2023",formatter),
        149,"https://www.youtube.com/embed/daHCu_jU5mQ",
        "Tiếng Anh - Phụ đề Tiếng Việt",
        "C13 - PHIM CẤM KHÁN GIẢ DƯỚI 13 TUỔI",1);
        Movie demKinhHoang = addNewMovie("Năm đêm kinh hoàng","https://ocwckgy6c1obj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/7/0/700x1000-5demkinhhoang.jpg"
        ,"Nhân viên bảo vệ Mike bắt đầu làm việc tại Freddy Fazbear's Pizza. Trong đêm làm việc đầu tiên, anh nhận ra mình sẽ không dễ gì vượt qua được ca đêm ở đây. Chẳng mấy chốc, anh sẽ vén màn sự thật đã xảy ra tại Freddy's.",
        "Mike Schmidt, bảo vệ ca đêm tại một quán ăn địa phương, gặp phải rắc rối sau khi đối mặt với sự thật về những đồ chơi trưng bày tại đây. Đó không chỉ là các máy móc vô tri, chúng thực ra vẫn còn sống. Liệu anh có thể sống sót qua năm đêm tại quán ăn ma ám này?"
        ,"https://17505055579741938462.googlegroups.com/attach/27b41c241b0d7/t5zCBSB5xMDKcDqe91qahCOUYVV%20(1).jpg?part=0.1&view=1&vt=ANaJVrHNyBiuZjUHoyNpq4V01PU1CkBoZOr0_8JaIj8RtyAKn59_BfIAPzeE6bpFaBNvXH275FN2lqSlQ8kWjybbW_XYkDYdIqb0ivFUvpHfS0yCPGHDNcU",
        "Emma Tammi","Matthew Lillard, Josh Hutcherson, Mary Stuart Masterson,…","Hành Động, Kinh di",
        LocalDate.parse("17/12/2023",formatter),
        149,"https://youtu.be/J7XVzwEdUNw",
        "Tiếng Anh - Phụ đề Tiếng Việt",
        "C13 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI",1);
        Movie datRungPhuongNam = addNewMovie("Đất rừng phương nam","https://ocwckgy6c1obj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/7/0/700x1000_19_.jpg"
        ,"Đất Rừng Phương Nam phiên bản điện ảnh được kế thừa và phát triển từ tiểu thuyết cùng tên của nhà văn Đoàn Giỏi.",
        "Đất Rừng Phương Nam phiên bản điện ảnh được kế thừa và phát triển từ tiểu thuyết cùng tên của nhà văn Đoàn Giỏi. Bộ phim kể về hành trình phiêu lưu của An - một cậu bé chẳng may mất mẹ trên đường đi tìm cha. Cùng với An, khán giả sẽ trải nghiệm sự trù phú của thiên nhiên và nét đẹp văn hoá đặc sắc của vùng đất Nam Kì Lục Tỉnh, sự hào hiệp của những người nông dân bám đất bám rừng và tinh thần yêunước kháng Pháp đầu thế kỉ 20. Bên cạnh đó, tình cảm gia đình, tình bạn, tình người, tình thầy trò, tình yêu nước là những cung bậc cảm xúc sâu sắc sẽ đọng lại qua mỗi bước chân của An và đồng bạn."
        ,"https://cdnimg.vietnamplus.vn/uploaded/tpuohuo/2023_10_17/drpn.jpg",
        "Nguyễn Quang Dũng","Hồng Ánh, Huỳnh Hạo Khang, Mai Tài Phến, Công Ninh, Hứa Vĩ Văn, Tuyền Mập, Tuấn Trần","Hành Động, Chinh thám",
        LocalDate.parse("17/12/2023",formatter),
        149,"https://youtu.be/d-ck5QxqgMg",
        "Tiếng Việt",
        "P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG",1);
        Movie wolfoo = addNewMovie("WOLFOO VÀ HÒN ĐẢO KỲ BÍ","https://ocwckgy6c1obj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/7/0/700x1000-wolfoo.jpg"
        ,"Wolfoo and The Mysterious Island (Wolfoo và hòn đảo kỳ bí) - câu chuyện xoanh quanh nhân vật chính là chú sói nhỏ Wolfoo 8 tuổi - một chú bé vui vẻ, tốt bụng và yêu thích sự khám phá",
        "Wolfoo and The Mysterious Island (Wolfoo và hòn đảo kỳ bí) - câu chuyện xoanh quanh nhân vật chính là chú sói nhỏ Wolfoo 8 tuổi - một chú bé vui vẻ, tốt bụng và yêu thích sự khám phá. Đồng hành cùng Wolfoo chính là cô em gái Lucy 6 tuổi tinh nghịch, hay làm nũng nhưng vô cùng yêu thương anh trai. Câu chuyện bắt đầu khi hai anh em Wolfoo và Lucy bị hút vào một chiếc dây chuyền và đến với Linh Giới - một thế giới vô cùng kỳ diệu. Tại Linh Giới, một sự cố bất ngờ đã khiến hai anh em bị chia tách. Trong hành trình tìm em gái, Wolfoo đã vô tình bị cuốn vào cuộc đấu tranh khốc liệt chống lại binh đoàn quỷ dữ - đứng đầu là Chúa Quỷ Bane - đang cai trị Đảo Thần Bí. Không chỉ là câu chuyện phiêu lưu thuần túy, bộ phim còn mang trong mình những bài học quý giá về sự sáng tạo, sự can đảm và cả tình yêu thương. Tất cả những điều đó đã tạo nên một bộ phim thỏa mãn sự giải trí nhưng cũng đầy tính giáo dục."
        ,"https://congluan-cdn.congluan.vn/files/content/2023/10/19/%E2%80%9Cwolfoo-va-hon-dao-ky-bi%E2%80%9D-ra-rap-mo-canh-cua-cho-hoat-hinh-viet-buoc-vao-%E2%80%9Ccuoc-choi%E2%80%9D-man-anh-rong-074710335.jpg",
        "Phan Thị Thơ","Sony Minh Hiếu, Đạt Phi, Như Ý","Hành Động, Hoạt hình, Phiên lưu",
        LocalDate.parse("17/12/2023",formatter),
        149,"https://youtu.be/RdW5xbBhDfk",
        "Tiếng Việt",
        "P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG",1);
        Movie mongDu = addNewMovie("MỘNG DU","https://ocwckgy6c1obj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/7/0/700x1000_16_1_.jpg"
        ,"Được Bong Joon Ho nhận xét là “phim kinh dị độc đáo nhất của thập kỷ\", ngôi vương phòng vé Hàn Quốc - MỘNG DU xoay quanh chuỗi sự kiện ma quái quấy rối giấc ngủ của một cặp vợ chồng trẻ. “Nó sẽ thức tỉnh lúc nửa đêm.",
        "Được Bong Joon Ho nhận xét là “phim kinh dị độc đáo nhất của thập kỷ\", ngôi vương phòng vé Hàn Quốc - MỘNG DU xoay quanh chuỗi sự kiện ma quái quấy rối giấc ngủ của một cặp vợ chồng trẻ. “Nó sẽ thức tỉnh lúc nửa đêm."
        ,"https://i.ytimg.com/vi/s2y-QG8Sv1I/maxresdefault.jpg",
        "Jason Yu","Jung Yu Mi, Lee Sun Kyun, Kim Gook Hee,...","Bí ẩn, Kinh Dị",
        LocalDate.parse("17/12/2023",formatter),
        149,"https://www.youtube.com/watch?v=DjByOqmqL0k",
        "Tiếng Hàn - Phụ đề tiếng Việt",
        "C13 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI",1);
        Movie conan = addNewMovie("CONAN: TÀU NGẦM SẮT MÀU ĐEN","https://ocwckgy6c1obj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/c/o/conan_movie_26_-_vietnamese_poster.jpg"
        ,"Tàu Ngầm Sắt Màu Đen lấy bối cảnh tại Pacific Buoy - một trụ sở hàng hải của Interpol có nhiệm vụ kết nối các camera an ninh trên toàn thế giới.",
        "Thám Tử Lừng Danh Conan: Tàu Ngầm Sắt Màu Đen lấy bối cảnh tại Pacific Buoy - một trụ sở hàng hải của Interpol có nhiệm vụ kết nối các camera an ninh trên toàn thế giới. Nhóm của Conan, theo lời mời của Sonoko, cũng đến đảo Hachijo để xem cá voi. Tại đây, Conan nhận được thông tin về một nhân viên Europol bị ám sát. Cùng với đó, tính mạng Haibara bị đe dọa, phải chăng thân phận của cô đã bị bại lộ trước Gin…"
        ,"https://congluan-cdn.congluan.vn/files/content/2023/10/19/%E2%80%9Cwolfoo-va-hon-dao-ky-bi%E2%80%9D-ra-rap-mo-canh-cua-cho-hoat-hinh-viet-buoc-vao-%E2%80%9Ccuoc-choi%E2%80%9D-man-anh-rong-074710335.jpg",
        "Yuzuru Tachikawa","","Hành Động, Hoạt Hình, Phiêu Lưu",
        LocalDate.parse("17/12/2023",formatter),
        149,"https://youtu.be/NwnQI9izPFc",
        "Tiếng Nhật - Phụ đề Tiếng Việt; Lồng tiếng",
        "K - PHIM ĐƯỢC PHỔ BIẾN ĐẾN NGƯỜI XEM DƯỚI 13 TUỔI VÀ CÓ NGƯỜI BẢO HỘ ĐI KÈM",1);
        // Tạo mới các chi nhánh
        List<Branch> listBranch = branchRepository.findAll();
        if(listBranch.isEmpty()){
        Branch branch1 = new Branch();
        branch1.setName("HUYCINEMA Hà Đông");
        branch1.setDiaChi("Tầng 4, Mê Linh Plaza Hà Đông, Đ. Tô Hiệu, P, Hà Đông, Hà Nội");
        branch1.setPhoneNo("0938473829");
        branch1.setImgURL("https://www.google.com/maps/vt/data=01jbed2RV46dgYPWYrkUjQ6y9E_UiFnVBsCgIdJWh4TGqJw3K1Qg_A4phqg094CBuRXesGa3QOof0UPRtY3zUWjOKScSn-0JuYoAlbcSKeYWV9wooMdNPaY7iL3Yd9PJjxicmzPKGds-zZRAZ9hqPRix1Trxq2vTQ7GZDWXjNJrqjn2tqL8zO0gSrZgSmarAH0jaD9Ux5tVTaZCwchq2_nNCrs2vjOU7FeXQsPRqfM3jgoYPRe43jeLkd4KGtweeXwUPgV2AeBFj9yTmjBgHSswDBrmGoJkjk-0uRIIO6LCZyMAsSW1p7-gLsUI5nJF6zWCNKmesZ3Jd3I-17zEAOz3AmLMuLkRgiFkICakIuG9B0DkjzVK2P4jN203i4DNkXTpoxKHTMv9dZG-ZoW1A9w7Q5rzSukE8Zdt3GMMei-w-THF-qL3znIiK3nQKq1_BRtnFTvhXduCYpHCo3ZvIiBz4WNKjovXd9ppG-OlRtFLYh8kYvlCKWkO0bmkBeQXoT4mqHQXm80zs_P2CB4xE3bbtoUPgaNo2-5eUcO1CPh6n3DKUdkgOIjRflGoWijmrhJO_45gguPAqZ7ZcXmY_isBf4PnWWJnzO2VAHVQwqwYIJ503CVbm3bmWoX3nVyqThCPj3fFsvjxCH-uYT0VXi3IFc02ktKuirKrsSo2rcgTcTqto0LlmkPAm34wOAr2KmMCfiqJrjKKMCn62v7WefBbU3VLI7Z8pLIgrG4l258FsyN7unVKWcVl3TVnBWp-acw9Y9AmM-nu8OzD7HSpMjJM3X28MJGj9LIIC1WsEdVL0Jhq8x9vBkY9F0RT_XTLQxbIJYa3v0B9x6KlkdOlWqTQTHvc5HQz8OV0JQYp5roWX5WcIx06_gkNOvisnf-J3aeMgzGVGs_-dZUXPwNseutiOPQXyy5NfzhZuJDOAmCJLXEAhmB6BFzFMbATI5zQ9v-D2lDvsjYq2U3Mt7Ctp6HlZVb4DGhzu7FYZkBQ11KkbQthBNKrZQ3kTiVQNNf13Osr9fIK4W6m6R3FtkxqnPshtlc-PYArGqZimsKnxgxxwt1spelowhnI55qFR9wa6UdJgeyGGRfVyfDpFiRKUkwuB7Vip?h=505&w=561&scale=1");
        branch1 = branchRepository.save(branch1);
        Room room1 = new Room();
        room1.setName("Phòng 101");
        room1.setBranch(branch1);
        room1.setCapacity(40);
        room1.setTotalArea(80);
        room1.setImgURL("http://hdradio.vn/upload/hinhanh/Cinema-tong-hop/cinema-thiet-ke/Cinema-kd100/cinema-hdradio.jpg");
        Room r1 = roomRepository.save(room1);
        Schedule schedule1 = new Schedule();
        schedule1.setBranch(branch1);
        schedule1.setMovie(nguoiNhen);
        schedule1.setRoom(r1);
        schedule1.setStartDate(LocalDate.parse("2023-01-05"));
        schedule1.setStartTime(LocalTime.parse("10:15"));
        schedule1.setPrice(70000);
        scheduleRepository.save(schedule1);

        Schedule schedule5 = new Schedule();
        schedule5.setBranch(branch1);
        schedule5.setMovie(wolfoo);
        schedule5.setRoom(r1);
        schedule5.setStartDate(LocalDate.parse("2023-01-05"));
        schedule5.setStartTime(LocalTime.parse("13:05"));
        schedule5.setPrice(70000);
        scheduleRepository.save(schedule5);

        Schedule schedule6 = new Schedule();
        schedule6.setBranch(branch1);
        schedule6.setMovie(doremon);
        schedule6.setRoom(r1);
        schedule6.setStartDate(LocalDate.parse("2023-01-05"));
        schedule6.setStartTime(LocalTime.parse("14:05"));
        schedule6.setPrice(70000);
        scheduleRepository.save(schedule6);

        Schedule schedule7 = new Schedule();
        schedule7.setBranch(branch1);
        schedule7.setMovie(mongDu);
        schedule7.setRoom(r1);
        schedule7.setStartDate(LocalDate.parse("2023-01-05"));
        schedule7.setStartTime(LocalTime.parse("16:20"));
        schedule7.setPrice(70000);
        scheduleRepository.save(schedule7);


        Schedule schedule8 = new Schedule();
        schedule8.setBranch(branch1);
        schedule8.setMovie(nguoiNhen);
        schedule8.setRoom(r1);
        schedule8.setStartDate(LocalDate.parse("2023-01-05"));
        schedule8.setStartTime(LocalTime.parse("16:20"));
        schedule8.setPrice(70000);
        scheduleRepository.save(schedule8);

        Schedule schedule9 = new Schedule();
        schedule9.setBranch(branch1);
        schedule9.setMovie(doremon);
        schedule9.setRoom(r1);
        schedule9.setStartDate(LocalDate.parse("2023-01-06"));
        schedule9.setStartTime(LocalTime.parse("16:20"));
        schedule9.setPrice(70000);
        scheduleRepository.save(schedule9);

        Schedule schedule10 = new Schedule();
        schedule10.setBranch(branch1);
        schedule10.setMovie(conan);
        schedule10.setRoom(r1);
        schedule10.setStartDate(LocalDate.parse("2023-01-06"));
        schedule10.setStartTime(LocalTime.parse("19:20"));
        schedule10.setPrice(70000);
        scheduleRepository.save(schedule10);

        Schedule schedule11 = new Schedule();
        schedule11.setBranch(branch1);
        schedule11.setMovie(blackPink);
        schedule11.setRoom(r1);
        schedule11.setStartDate(LocalDate.parse("2023-01-05"));
        schedule11.setStartTime(LocalTime.parse("19:15"));
        schedule11.setPrice(70000);
        scheduleRepository.save(schedule11);

        Room room2 = new Room();
        room2.setName("Phòng 202");
        room2.setBranch(branch1);
        room2.setCapacity(40);
        room2.setTotalArea(80);
        room2.setImgURL("http://hdradio.vn/upload/hinhanh/Cinema-tong-hop/cinema-thiet-ke/Cinema-kd100/cinema-hdradio.jpg");
        Room r2 = roomRepository.save(room2);
        Schedule schedule2 = new Schedule();
        schedule2.setBranch(branch1);
        schedule2.setMovie(blackPink);
        schedule2.setRoom(r2);
        schedule2.setStartDate(LocalDate.parse("2023-01-05"));
        schedule2.setStartTime(LocalTime.parse("10:15"));
        schedule2.setPrice(70000);
        scheduleRepository.save(schedule2);

        Schedule schedule77 = new Schedule();
        schedule77.setBranch(branch1);
        schedule77.setMovie(nguoiNhen);
        schedule77.setRoom(r2);
        schedule77.setStartDate(LocalDate.parse("2023-01-05"));
        schedule77.setStartTime(LocalTime.parse("16:20"));
        schedule77.setPrice(70000);
        scheduleRepository.save(schedule77);

        Schedule schedule17 = new Schedule();
        schedule17.setBranch(branch1);
        schedule17.setMovie(mongDu);
        schedule17.setRoom(r2);
        schedule17.setStartDate(LocalDate.parse("2023-11-05"));
        schedule17.setStartTime(LocalTime.parse("17:20"));
        schedule17.setPrice(70000);
        scheduleRepository.save(schedule17);

        Schedule schedule18 = new Schedule();
        schedule18.setBranch(branch1);
        schedule18.setMovie(mongDu);
        schedule18.setRoom(r2);
        schedule18.setStartDate(LocalDate.parse("2023-11-05"));
        schedule18.setStartTime(LocalTime.parse("19:20"));
        schedule18.setPrice(70000);
        scheduleRepository.save(schedule18);


        Room room3 = new Room();
        room3.setName("Phòng 303");
        room3.setBranch(branch1);
        room3.setCapacity(40);
        room3.setTotalArea(80);
        room3.setImgURL("http://hdradio.vn/upload/hinhanh/Cinema-tong-hop/cinema-thiet-ke/Cinema-kd100/cinema-hdradio.jpg");
        Room r3 = roomRepository.save(room3);
        Schedule schedule3 = new Schedule();
        schedule3.setBranch(branch1);
        schedule3.setMovie(venom);
        schedule3.setRoom(r3);
        schedule3.setStartDate(LocalDate.parse("2023-01-05"));
        schedule3.setStartTime(LocalTime.parse("10:15"));
        schedule3.setPrice(70000);
        scheduleRepository.save(schedule3);

        Schedule schedule88 = new Schedule();
        schedule88.setBranch(branch1);
        schedule88.setMovie(maTran);
        schedule88.setRoom(r3);
        schedule88.setStartDate(LocalDate.parse("2023-01-05"));
        schedule88.setStartTime(LocalTime.parse("16:20"));
        schedule88.setPrice(70000);
        scheduleRepository.save(schedule88);

        Room room4 = new Room();
        room4.setName("Phòng 404");
        room4.setBranch(branch1);
        room4.setCapacity(40);
        room4.setTotalArea(80);
        room4.setImgURL("http://hdradio.vn/upload/hinhanh/Cinema-tong-hop/cinema-thiet-ke/Cinema-kd100/cinema-hdradio.jpg");
        Room r4 = roomRepository.save(room4);

        Schedule schedule99 = new Schedule();
        schedule99.setBranch(branch1);
        schedule99.setMovie(nguoiNhen);
        schedule99.setRoom(r4);
        schedule99.setStartDate(LocalDate.parse("2023-01-05"));
        schedule99.setStartTime(LocalTime.parse("16:20"));
        schedule99.setPrice(70000);
        scheduleRepository.save(schedule99);

        Branch branch2 = new Branch();
        branch2.setName("HUYCINEMA Thủ Đức");
        branch2.setDiaChi("216 Đ. Võ Văn Ngân, Bình Thọ, Thủ Đức, Thành phố Hồ Chí Minh");
        branch2.setPhoneNo("1900 6017");
        branch2.setImgURL("https://www.google.com/maps/vt/data=TZeUNl_xwzxmDpHYWKkbDv_7amlZzoi4kaRvCEATRTtis3KKxsH0tcFvyiR7Gjt4G3NufaHQaPOcn3pMPNABNgbW2ZoipmmEo6PKNCFhm8CuQbuASrxxaRyviyUG78mD1AVOf1D2fJxIjyEmphS20Wo9dgRW8TJBXekAhiaiGu8g");
        branch2 = branchRepository.save(branch2);
        room1.setBranch(branch2);
        room2.setBranch(branch2);
        room3.setBranch(branch2);
        Room r5 = roomRepository.save(room1);
        Room r6 = roomRepository.save(room2);
        Room r7 = roomRepository.save(room3);
        Schedule schedule19 = new Schedule();
        schedule19.setBranch(branch2);
        schedule19.setMovie(datRungPhuongNam);
        schedule19.setRoom(r5);
        schedule19.setStartDate(LocalDate.parse("2023-01-05"));
        schedule19.setStartTime(LocalTime.parse("10:15"));
        schedule19.setPrice(70000);
        scheduleRepository.save(schedule19);


        Branch branch3 = new Branch();
        branch3.setName("HUYCINEMA Ba Đình");
        branch3.setDiaChi("29 P. Liễu Giai, Ngọc Khánh, Ba Đình, Hà Nội 100000");
        branch3.setPhoneNo("1900 6017");
        branch3.setImgURL("https://www.google.com/maps/vt/data=yhfVddn9tdyWNfmuCzyFU_TR8pm30CLi5oeQTFnFB7qV90WT3OL_ETKkEjQjn3j6zlMuz-VSN_AgZRDCghvF5y2JCVivnwi-sOuKKWT4bSEOf0FZ2-nwoNYSRZH--yH_VpazHsQ9huADdpfR_j3ZnNMEfU_hwJXzSef8AcxHTcqA");
        branch3 = branchRepository.save(branch3);
        room1.setBranch(branch3);
        room2.setBranch(branch3);
        room3.setBranch(branch3);
        room4.setBranch(branch3);
        Room r8= roomRepository.save(room1);
        Room r9 = roomRepository.save(room2);
        Room r10 = roomRepository.save(room3);
        Room r11 = roomRepository.save(room4);
        Schedule schedule12 = new Schedule();
        schedule12.setBranch(branch3);
        schedule12.setMovie(datRungPhuongNam);
        schedule12.setRoom(r8);
        schedule12.setStartDate(LocalDate.parse("2023-01-05"));
        schedule12.setStartTime(LocalTime.parse("10:15"));
        schedule12.setPrice(70000);
        scheduleRepository.save(schedule12);
        Schedule schedule13 = new Schedule();
        schedule13.setBranch(branch3);
        schedule13.setMovie(blackPink);
        schedule13.setRoom(r9);
        schedule13.setStartDate(LocalDate.parse("2023-01-05"));
        schedule13.setStartTime(LocalTime.parse("22:15"));
        schedule13.setPrice(70000);
        scheduleRepository.save(schedule12);

        Branch branch4 = new Branch();
        branch4.setName("HUYCINEMA Phạm Hùng");
        branch4.setDiaChi("Phạm Hùng, Mỹ Đình, Nam Từ Liêm, Hà Nội");
        branch4.setPhoneNo("1900 6017");
        branch4.setImgURL("https://www.google.com/maps/vt/data=YVeSKtAT_T4Tie7xjlIh8lVV_CPmpsr36ayQG-gTEGBZtEKRSSUuLnFbj1HBbGxrYJUS3T3ib8llvuVuiSE85HJYK54JW899mhPMP0BWDwBch-utK9g-_kUPd2rsaEpMLmwUd3R9SO67_S6eUEcY0SfqeXAfB2p9NizW8eGSgD63");
        branch4 = branchRepository.save(branch4);
        room1.setBranch(branch4);
        room2.setBranch(branch4);
        room3.setBranch(branch4);
        room4.setBranch(branch4);
        Room r12 = roomRepository.save(room1);
        roomRepository.save(room2);
        roomRepository.save(room3);
        roomRepository.save(room4);

        Schedule schedule14 = new Schedule();
        schedule14.setBranch(branch4);
        schedule14.setMovie(datRungPhuongNam);
        schedule14.setRoom(r12);
        schedule14.setStartDate(LocalDate.parse("2023-01-05"));
        schedule14.setStartTime(LocalTime.parse("10:15"));
        schedule14.setPrice(70000);
        scheduleRepository.save(schedule14);

        Schedule schedule23 = new Schedule();
        schedule23.setBranch(branch4);
        schedule23.setMovie(conan);
        schedule23.setRoom(r12);
        schedule23.setStartDate(LocalDate.parse("2023-01-05"));
        schedule23.setStartTime(LocalTime.parse("14:20"));
        schedule23.setPrice(70000);
        scheduleRepository.save(schedule23);

        Schedule schedule34 = new Schedule();
        schedule34.setBranch(branch4);
        schedule34.setMovie(maTran);
        schedule34.setRoom(r12);
        schedule34.setStartDate(LocalDate.parse("2023-01-05"));
        schedule34.setStartTime(LocalTime.parse("16:15"));
        schedule34.setPrice(70000);
        scheduleRepository.save(schedule34);

        Schedule schedule44 = new Schedule();
        schedule44.setBranch(branch4);
        schedule44.setMovie(nhocTrum);
        schedule44.setRoom(r12);
        schedule44.setStartDate(LocalDate.parse("2023-01-05"));
        schedule44.setStartTime(LocalTime.parse("19:15"));
        schedule44.setPrice(70000);
        scheduleRepository.save(schedule44);

        Schedule schedule64 = new Schedule();
        schedule64.setBranch(branch4);
        schedule64.setMovie(demKinhHoang);
        schedule64.setRoom(r12);
        schedule64.setStartDate(LocalDate.parse("2023-01-05"));
        schedule64.setStartTime(LocalTime.parse("19:15"));
        schedule64.setPrice(70000);
        scheduleRepository.save(schedule64);
        }
        }




        }

public Movie addNewMovie(
        String name,
        String smallImageURl,
        String shortDescription,
        String longDescription,
        String largeImageURL,
        String director,
        String actors,
        String categories,
        LocalDate releaseDate,
        int duration,
        String trailerURL,
        String language,
        String rated,
        int isShowing) {
        Movie movie = new Movie();
        movie.setName(name);
        movie.setSmallImageURl(smallImageURl);
        movie.setShortDescription(shortDescription);
        movie.setLongDescription(longDescription);
        movie.setLargeImageURL(largeImageURL);
        movie.setDirector(director);
        movie.setActors(actors);
        movie.setCategories(categories);
        movie.setReleaseDate(releaseDate);
        movie.setDuration(duration);
        movie.setTrailerURL(trailerURL);
        movie.setLanguage(language);
        movie.setRated(rated);
        movie.setIsShowing(isShowing);
        movie = movieRepository.save(movie);
        return movie;
        }