package mychatroom.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 功能：
 * 日期：2024/5/21 下午4:17
 */
@Controller
public class BaseApi {

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

    @GetMapping("/home")
    public String home() {
        return "home";
    }


    @GetMapping("/home/uploadform")
    public String index() {
        return "uploadForm";
    }

    @GetMapping("/home/profile")
    public String profile() {
        return "profile";
    }
}