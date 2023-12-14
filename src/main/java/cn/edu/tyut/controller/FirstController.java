package cn.edu.tyut.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 羊羊
 * @ClassName FirstController
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:45
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class FirstController {
    @RequestMapping("/test")
    public void test() {
        System.out.println("yes");
    }
}
