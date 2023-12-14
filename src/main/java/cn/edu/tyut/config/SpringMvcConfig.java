package cn.edu.tyut.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 羊羊
 * @ClassName SpringMvcConfig
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:37
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@ComponentScans({
        @ComponentScan("cn.edu.tyut.controller")
})
@EnableWebMvc

public class SpringMvcConfig implements WebMvcConfigurer {
}
