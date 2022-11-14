/*
Thông tin về Khách hàng gồm (mã KH, Tên khách hàng, Địa chỉ, SDT, Loại KH). Trong đó
mã khách hàng là một số nguyên có 5 chữ số, tự động tăng. Loại khách hàng được chọn từ
danh sách gồm: Sinh viên, Hộ gia đình, Doanh nghiệp.

Thông tin về Phòng (mã phòng, tên phòng, loại phòng). Trong đó, mã phòng là một số nguyên
có 3 chữ số, tự động tăng. Loại phòng có thể là Phòng VIP, Phòng chất lượng cao, Phòng
Thường.

Bổ sung Danh sách thuê phòng trong đó mỗi khách hàng cho biết đang ở phòng nào và ngày
bắt đầu thuê.

Viết chương trình trên Java sử dụng giao diện Frame hoặc JFrame (có thể dùng kéo thả) thực
hiện các chức năng sau:

1. Nhập thêm khách hàng vào file KH.DAT. Có xử lý ngoại lệ. In ra danh sách khách hàng đã
có trong file.
2. Nhập thêm phòng vào file PHONG.DAT. Có xử lý ngoại lệ. In ra danh sách các phòng đã có
trong file.
3. Nhập danh sách thuê phòng lưu vào file DSTP.DAT. Chú ý: một khách hàng có thể thuê
nhiều phòng khác nhau nhưng thời gian khác nhau.
4. Sắp xếp danh sách sinh viên ký túc xá đã lưu trong DSKTX.DAT
a. Theo Họ tên sinh viên
b. Theo Tên phòng
5. Giả sử mức tiền thuê phòng hàng tháng theo thứ tự loại phòng lần lượt là 4000, 3000 và 2000
(nghìn đồng). Tính tiền thuê đến thời điểm hiện tại cho mỗi khách hàng (chú ý làm tròn tháng
và tính tất cả các phòng khách hàng đã thuê)
*/