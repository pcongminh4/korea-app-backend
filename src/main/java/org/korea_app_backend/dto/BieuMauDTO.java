package org.korea_app_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank(message = "This field is required")
    private String hoTen;

    @NotNull(message = "This field is required")
    private LocalDate ngaySinh;

    @NotBlank(message = "This field is required")
    private String loaiGiayToXN;

    @NotBlank(message = "This field is required")
    private String loaiBangCap;

    @NotBlank(message = "This field is required")
    private String donViCapBang;

    @NotBlank(message = "This field is required")
    private String nganhDaotao;

    @NotBlank(message = "This field is required")
    private String soHieuBang;

    @NotNull(message = "This field is required")
    private Short namTotNghiep;

    @NotNull(message = "This field is required")
    private float diemTotNghiep;

    @NotNull(message = "This field is required")
    private LocalDate ngayHen;

    @NotNull(message = "This field is required")
    private Integer khungGioId;

    @NotBlank(message = "This field is required")
    private String thu;

    private LocalDate ngayXacNhan;
    private LocalDate ngayTao;

    
}
