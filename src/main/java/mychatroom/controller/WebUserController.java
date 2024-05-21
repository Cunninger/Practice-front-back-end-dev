package mychatroom.controller;

import mychatroom.entity.pojo.User;
import mychatroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String first() {
        return "first";
    }

    @GetMapping("/prelogin")
    public String prelogin() {
        return "prelogin";
    }

    @GetMapping("/preregister")
    public String preregister() {
        return "preregister";
    }

    @PostMapping("/login")
    @ResponseBody
        // 接收json格式的参数注解是   @RequestBody
    ResponseEntity<Map<String, Integer>> login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        // 查redis数据库中所有的键
        Map<String, Integer> response = new HashMap<>();
        User user1 = userService.login(username, password);
        if (user1 != null) {
            response.put("code", 200);
        } else {
            response.put("code", 500);
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    @ResponseBody
    ResponseEntity<Map<String, Integer>> register(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();

        Map<String, Integer> response = new HashMap<>();
        userService.register(username, password);

        // 返回注册成功
        response.put("code", 200);
        return ResponseEntity.ok(response);
    }

}