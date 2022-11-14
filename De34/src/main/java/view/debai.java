/*
Thông tin về Hành khách gồm các thuộc tính (mã HK, Họ tên, Địa chỉ, Loại khách) – với quy định
loại hành khách gồm: học sinh sinh viên, cán bộ trong ngành và khách thông thường. Mã HK là một
số nguyên có 5 chữ số, tự động tăng.

Thông tin về Loại vé (mã loại, mô tả, giá bán), mã loại vé là một số nguyên có 3 chữ số, tự động
tăng. Phần mô tả cho biết loại vé là riêng cho tuyến nào, một số tuyến cụ thể nào hoặc liên tuyến.

Bổ sung Bảng kê bán vé trong đó một hành khách được mua nhiều loại vé khác nhau nhưng mỗi loại
chỉ được mua một vé trong một tháng. Giả sử tổng số loại vé được mua của mỗi hành khách không
vượt quá 3.

Tự xác định các lớp cho phù hợp và Viết chương trình trên Java sử dụng giao diện Frame hoặc JFrame
(có thể dùng kéo thả) thực hiện các chức năng sau:

1. Nhập thêm Hành khách vào file HK.DAT. Có xử lý ngoại lệ. In ra danh sách hành khách đã
có trong file.
2. Nhập thêm Loại vé vào file VE.DAT. Có xử lý ngoại lệ. In ra danh sách các loại vé đã có
trong file.
3. Nhập danh sách bán vé cho mỗi hành khách đã có trong file HK.DAT; lưu vào file
BANVE.DAT và in danh sách ra màn hình .
4. Sắp xếp danh sách bán vé đã lưu trong BANVE.DAT
a. Theo Họ tên hành khách
b. Theo Loại vé
5. Lập bảng tính tổng giá tiền phải trả của mỗi hành khách. Chú ý: Học sinh sinh viên được
giảm 50%, cán bộ trong ngành được giảm 70%.
*/
