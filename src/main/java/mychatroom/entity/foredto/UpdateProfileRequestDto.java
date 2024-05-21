package mychatroom.entity.foredto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 * 日期：2024/5/21 下午9:07
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateProfileRequestDto {
    private String username;
    private String oldPassword;
    private String newPassword;

}