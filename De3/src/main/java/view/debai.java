/*
Thông tin về Mặt hàng gồm các thuộc tính (mã hàng, Tên hàng, Nhóm hàng, Giá bán) – trong đó
Nhóm hàng có thể là: Hàng thời trang, Hàng tiêu dùng, Hàng điện máy, Hàng gia dụng. Mã hàng là
một số nguyên có 4 chữ số, tự động tăng.

Thông tin về Khách hàng (mã KH, Họ tên, địa chỉ, Số ĐT), mã KH là một số nguyên có 5 chữ số,
tự động tăng.

Bổ sung Bảng Danh sách mua hàng trong đó với mỗi khách hàng, nhập danh sách các mặt hàng và
số lượng mà khách hàng đó mua. Giả sử mỗi khách hàng không mua quá 10 loại mặt hàng một lần.

Tự xác định các lớp cho phù hợp và Viết chương trình trên Java sử dụng giao diện Frame hoặc
JFrame (có thể dùng kéo thả) thực hiện các chức năng sau:

1. Nhập thêm mặt hàng mới vào file MH.DAT. Có xử lý ngoại lệ. In ra danh sách các mặt hàng
đã có trong file.
2. Nhập thêm khách hàng vào file KH.DAT. Có xử lý ngoại lệ. In ra danh sách khách hàng đã
có trong file.
3. Lập Bảng danh sách mua hàng cho từng khách hàng, lưu vào file QLBH.DAT và in danh
sách ra màn hình (chú ý: cùng một khách hàng với một mặt hàng thì không thể xuất hiện 2
lần trong bảng này).
4. Sắp xếp danh sách Bảng danh sách mua hàng đã lưu trong QLBH.DAT
a. Theo tên khách hàng
b. Theo tên mặt hàng
5. Lập hóa đơn cho mỗi khách hàng.
*/