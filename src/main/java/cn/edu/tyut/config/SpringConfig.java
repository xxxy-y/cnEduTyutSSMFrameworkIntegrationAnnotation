package cn.edu.tyut.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName SpringConfig
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:35
 * @Package_Name cn.edu.tyut.config
 */
@Configuration
@Import({
        MybatisConfig.class,
        JdbcConfig.class
})
@ComponentScans({
        @ComponentScan("cn.edu.tyut.service")
})
@MapperScans({
        @MapperScan("cn.edu.tyut.mapper")
})
public class SpringConfig {
}