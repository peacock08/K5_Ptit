/*
Thông tin về Thiết bị gồm các thuộc tính (mã TB, Tên, Xuất xứ, Năm sản xuất) – trong đó Xuất xứ
có thể là: Nhập khẩu, Nội địa, Liên doanh. Mã TB là một số nguyên có 5 chữ số, tự động tăng.

Thông tin về Phòng học (mã PH, tên phòng, số ghế), mã PH là một số nguyên có 5 chữ số, tự
động tăng.

Bổ sung Bảng QL Thiết bị trong đó một phòng học sẽ được nhận nhiều loại thiết bị, mỗi loại có số
lượng khác nhau và ghi rõ tình trạng hiện thời.

Tự xác định các lớp cho phù hợp và Viết chương trình trên Java sử dụng giao diện Frame hoặc
JFrame (có thể dùng kéo thả) thực hiện các chức năng sau:

1. Nhập thêm thiết bị vào file TB.DAT. Có xử lý ngoại lệ. In ra danh sách thiết bị đã có trong
file.
2. Nhập thêm phòng học vào file PH.DAT. Có xử lý ngoại lệ. In ra danh sách phòng học đã có
trong file.
3. Lập Bảng QL Thiết bị cho các phòng học bằng cách nhập các loại thiết bị cho mỗi phòng
cùng số lượng và tình trạng tương ứng tương ứng; lưu vào file QLTB.DAT và in danh sách
ra màn hình (chú ý: cùng một loại thiết bị trong một phòng học thì không thể xuất hiện 2 lần).
4. Sắp xếp danh sách Quản lý thiết bị đã lưu trong QLTB.DAT
a. Theo tên phòng học
b. Theo Số lượng thiết bị mỗi loại (giảm dần)
5. Tìm kiếm và hiển thị danh sách thiết bị trong các phòng theo tên thiết bị
*/
