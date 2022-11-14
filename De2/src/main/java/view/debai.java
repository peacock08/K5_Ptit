/*
Thông tin về Môn học gồm các thuộc tính (mã môn học, Tên môn, Tổng số tiết, Loại môn học) –
trong đó Loại môn học có thể là: Đại cương, Cơ sở ngành, Chuyên ngành bắt buộc, Chuyên ngành tự
chọn. Mã môn học là một số nguyên có 3 chữ số, tự động tăng.


Thông tin về Sinh viên (mã sinh viên, Họ tên, địa chỉ, Số ĐT), mã sinh viên là một số nguyên có 5
chữ số, tự động tăng.


Bổ sung Bảng Đăng ký trong đó một sinh viên sẽ được phép đăng ký không quá 8 môn học một học
kỳ. Ghi rõ thời gian đăng ký của sinh viên.


Tự xác định các lớp cho phù hợp và Viết chương trình trên Java sử dụng giao diện Frame hoặc
JFrame (có thể dùng kéo thả) thực hiện các chức năng sau:


1. Nhập thêm môn học mới vào file MH.DAT. Có xử lý ngoại lệ. In ra danh sách các môn học
đã có trong file.
2. Nhập thêm sinh viên vào file SV.DAT. Có xử lý ngoại lệ. In ra danh sách sinh viên đã có
trong file.
3. Lập Bảng Đăng ký cho từng sinh viên bằng cách nhập các môn học cho sinh viên đó và thời
gian đăng ký (lấy từ thời gian hệ thống), lưu vào file QLDK.DAT và in danh sách ra màn
hình (chú ý: cùng một sinh viên với một môn học thì không thể xuất hiện 2 lần trong bảng
này).
4. Sắp xếp danh sách Bảng đăng ký đã lưu trong QLDK.DAT
a. Theo tên sinh viên
b. Theo thời gian đăng ký
5. Lập danh sách lớp học theo danh sách đăng ký. Mỗi lớp không quá 30 sinh viên và lấy theo
thứ tự thời gian đăng ký. 
*/