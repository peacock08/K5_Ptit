/*
ĐỀ SỐ 40: QUẢN LÝ TÍNH CÔNG THEO DOANH THU
Một công ty dịch vụ viễn thông di động thực hiện trả công cho nhân viên phòng bán hàng theo
doanh thu mà nhân viên đó mang lại trong một tháng.
Thông tin về Dịch vụ gồm các thuộc tính (mã dịch vụ, Tên dịch vụ, Nhóm dịch vụ, Chi phí, Giá
cước) – trong đó Nhóm dịch vụ có thể là: Dịch vụ thuê bao trả trước, Dịch vụ thuê bao trả sau, Dịch
vụ giá trị gia tăng. Mã dịch vụ là một số nguyên có 4 chữ số, tự động tăng.
Thông tin về Nhân viên bán hàng (mã NV, Họ tên, địa chỉ, Số ĐT), mã NV là một số nguyên có 4
chữ số, tự động tăng.

Bổ sung Bảng Danh sách bán hàng trong đó với mỗi nhân viên, nhập danh sách các dịch vụ và số
lượng mà nhân viên đó đã cung cấp trong ngày.

Tự xác định các lớp cho phù hợp và Viết chương trình trên Java sử dụng giao diện Frame hoặc
JFrame (có thể dùng kéo thả) thực hiện các chức năng sau:
1. Nhập thêm dịch vụ mới vào file DV.DAT. Có xử lý ngoại lệ. In ra danh sách các dịch vụ đã
có trong file.
2. Nhập thêm nhân viên bán hàng vào file NV.DAT. Có xử lý ngoại lệ. In ra danh sách nhân
viên đã có trong file.
3. Lập Bảng danh sách bán hàng cho từng nhân viên, lưu vào file QLBH.DAT và in danh sách
ra màn hình (chú ý: cùng một nhân viên với một dịch vụ thì không thể xuất hiện 2 lần trong
bảng này).
4. Sắp xếp danh sách Bảng danh sách bán hàng đã lưu trong QLBH.DAT
c. Theo tên nhân viên
d. Theo tên dịch vụ
5. Lập bảng tính công cho mỗi nhân viên. Giá trị tiền công được tính là 2% tổng số lợi nhuận
thu được. 
*/