package org.korea_app_backend.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KhungGioDTO {

    @Pattern(
            regexp = "^[0-9]{1,2}:[0-9]{2}-[0-9]{1,2}:[0-9]{2}$",
            message = "Khung giờ phải đúng định dạng, ví dụ: 08:00-10:00"
    )
    private String khungGio;
}
