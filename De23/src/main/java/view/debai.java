/*
Thông tin về Mặt hàng gồm các thuộc tính (mã hàng, Tên hàng, Nhóm hàng, Giá mua, Giá bán)
– trong đó Nhóm hàng có thể là: Hàng thời trang, Hàng tiêu dùng, Hàng điện máy, Hàng gia dụng.
Mã hàng là một số nguyên có 4 chữ số, tự động tăng.


Thông tin về Nhân viên bán hàng (mã NV, Họ tên, địa chỉ, Số ĐT), mã NV là một số nguyên có 4
chữ số, tự động tăng.


Bổ sung Bảng Danh sách bán hàng trong đó với mỗi nhân viên, nhập danh sách các mặt hàng và số
lượng mà nhân viên đó đã bán ra trong ngày.


Tự xác định các lớp cho phù hợp và Viết chương trình trên Java sử dụng giao diện Frame hoặc
JFrame (có thể dùng kéo thả) thực hiện các chức năng sau:


1. Nhập thêm mặt hàng mới vào file MH.DAT. Có xử lý ngoại lệ. In ra danh sách các mặt hàng
đã có trong file.
2. Nhập thêm nhân viên bán hàng vào file NV.DAT. Có xử lý ngoại lệ. In ra danh sách nhân
viên đã có trong file.
3. Lập Bảng danh sách bán hàng cho từng nhân viên, lưu vào file QLBH.DAT và in danh sách
ra màn hình (chú ý: cùng một nhân viên với một mặt hàng thì không thể xuất hiện 2 lần trong
bảng này).
4. Sắp xếp danh sách Bảng danh sách bán hàng đã lưu trong QLBH.DAT
a. Theo tên nhân viên
b. Theo tên mặt hàng
5. Lập bảng tính công cho mỗi nhân viên. Giá trị tiền công được tính là 2% tổng số lợi nhuận
thu được.
*/