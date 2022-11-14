/*
Thông tin về Dự án gồm các thuộc tính (mã dự án, Tên dự án, Kiểu dự án, Tổng kinh phí) – trong
đó kiểu dự án có thể gồm: nhỏ, trung bình hoặc lớn. Mã dự án là một số nguyên có 5 chữ số, tự động
tăng.

Thông tin về Nhân viên (mã NV, Họ tên, địa chỉ, chuyên môn), mã NV là một số nguyên có 5 chữ
số, tự động tăng.

Bổ sung Bảng phân công trong đó một nhân viên có thể được gán cho một hoặc nhiều dự án một lúc
với số ngày tham gia khác nhau và vị trí công việc khác nhau.

Tự xác định các lớp cho phù hợp và Viết chương trình trên Java sử dụng giao diện Frame hoặc JFrame
(có thể dùng kéo thả) thực hiện các chức năng sau:

1. Nhập thêm dự án vào file DA.DAT. Có xử lý ngoại lệ. In ra danh sách dự án đã có trong file.
2. Nhập thêm nhân viên vào file NV.DAT. Có xử lý ngoại lệ. In ra danh sách nhân viên đã có
trong file.
3. Nhập danh sách phân công dự án cho mỗi nhân viên đã có trong file NV.DAT. Lưu vào file
PHANCONG.DAT và in danh sách ra màn hình. (chú ý: cùng một nhân viên thì không thể
tham gia cùng một dự án với hai vị trí khác nhau nhưng có thể tham gia cùng lúc vào nhiều
dự án)
4. Sắp xếp danh sách phân công đã lưu trong PHANCONG.DAT
a. Theo Họ tên nhân viên
b. Theo Số ngày tham gia (giảm dần)
5. Tìm kiếm và hiển thị danh sách phân công theo tên nhân viên
*/