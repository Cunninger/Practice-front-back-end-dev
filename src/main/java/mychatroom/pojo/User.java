package mychatroom.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能：
 * 日期：2024/5/20 下午5:14
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String username;
    private String password;
}