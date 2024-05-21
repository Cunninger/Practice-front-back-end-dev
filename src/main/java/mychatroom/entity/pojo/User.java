package mychatroom.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

/**
 * 功能：
 * 日期：2024/5/20 下午5:14
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private String username;
    private String password;
    // 添加加入时间的字段
    private String joinTime;
    // 添加最后登录时间的字段
    private String lastLoginTime;
}