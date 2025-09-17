package org.korea_app_backend.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BieuMauDTO {    
    @NotNull(message = "This field is required")
    private LocalDate ngaybieumau;

    @NotBlank(message = "Họ tên không được để trống")
    @Size(max = 100, message = "Họ tên không được vượt quá 100 ký tự")
    private String hoTen;

    @NotNull(message = "Ngày sinh là bắt buộc")
    @Past(message = "Ngày sinh phải trong quá khứ")
    private LocalDate ngaySinh;

    @NotBlank(message = "Loại giấy tờ xác nhận không được để trống")
    private String loaiGiayToXN;

    @NotBlank(message = "Loại bằng cấp không được để trống")
    private String loaiBangCap;

    @NotBlank(message = "Đơn vị cấp bằng không được để trống")
    private String donViCapBang;

    @NotBlank(message = "Ngành đào tạo không được để trống")
    private String nganhDaotao;

    @NotBlank(message = "Số hiệu bằng không được để trống")
    private String soHieuBang;

    @NotNull(message = "Năm tốt nghiệp là bắt buộc")
    @Min(value = 1900, message = "Năm tốt nghiệp không hợp lệ")
    @Max(value = 2100, message = "Năm tốt nghiệp không hợp lệ")
    private Short namTotNghiep;

    @NotNull(message = "Điểm tốt nghiệp là bắt buộc")
    @DecimalMin(value = "0.0", inclusive = true, message = "Điểm phải từ 0.0 trở lên")
    @DecimalMax(value = "10.0", inclusive = true, message = "Điểm không được vượt quá 10.0")
    private Float diemTotNghiep;

    @NotNull(message = "Ngày hẹn là bắt buộc")
    @FutureOrPresent(message = "Ngày hẹn phải là hiện tại hoặc tương lai")
    private LocalDate ngayHen;

    @NotNull(message = "Khung giờ là bắt buộc")
    private Integer khungGioId;

    @NotBlank(message = "This field is required")
    private String thu;

    private LocalDate ngayXacNhan;
    private LocalDate ngayTao;

    
}
