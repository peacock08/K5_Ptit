/*

Thông tin về Mặt hàng trong kho gồm các thuộc tính (mã hàng, Tên hàng, Nhóm hàng, Giá bán,
Số lượng) – trong đó Nhóm hàng có thể là: Điện tử, Điện lạnh, Máy tính, Thiết bị văn phòng. Mã
hàng là một số nguyên có 4 chữ số, tự động tăng.


Thông tin về Nhân viên bán hàng (mã NV, Họ tên, địa chỉ, Số ĐT), mã NV là một số nguyên có 4
chữ số, tự động tăng.


Bổ sung Bảng Danh sách bán hàng (trong một ngày) trong đó với mỗi nhân viên, nhập danh sách
các mặt hàng mà nhân viên đó đã bán được. Giả sử mỗi nhân viên chỉ tham gia bán tối đa 5 mặt hàng
khác nhau.


Tự xác định các lớp cho phù hợp và Viết chương trình trên Java sử dụng giao diện Frame hoặc
JFrame (có thể dùng kéo thả) thực hiện các chức năng sau:


1. Nhập thêm mặt hàng mới vào file MH.DAT. Có xử lý ngoại lệ. In ra danh sách các mặt hàng
đã có trong file.
2. Nhập thêm nhân viên vào file NV.DAT. Có xử lý ngoại lệ. In ra danh sách nhân viên đã có
trong file.
3. Lập Bảng danh sách bán hàng cho từng nhân viên, lưu vào file QLBH.DAT và in danh sách
ra màn hình (chú ý: cùng một nhân viên với một mặt hàng thì không thể xuất hiện 2 lần trong
bảng này).
4. Sắp xếp danh sách Bảng danh sách bán hàng đã lưu trong QLBH.DAT
a. Theo tên nhân viên
b. Theo nhóm mặt hàng
5. Lập bảng kê doanh thu cho mỗi nhân viên.
*/