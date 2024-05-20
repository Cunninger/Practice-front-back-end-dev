package mychatroom.controller;

import mychatroom.pojo.User;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能：
 * 日期：2024/5/20 下午5:12
 */
@Controller
public class WebUserController {

    @GetMapping("/")
    public String first() {
        return "first";
    }

    @PostMapping("/login")
    @ResponseBody
        // 接收json格式的参数注解是   @RequestBody
    ResponseEntity<Map<String, Integer>> login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        // 查redis数据库中所有的键
        Map<String, Integer> response = new HashMap<>();

            return null;

    }

}