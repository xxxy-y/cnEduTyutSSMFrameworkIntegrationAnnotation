package cn.edu.tyut.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import javax.sql.DataSource;

/**
 * @Author 羊羊
 * @ClassName JdbcConfig
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:02
 * @Package_Name cn.edu.tyut.config
 */
@PropertySources({
        @PropertySource("classpath:jdbc.properties")
})
public class JdbcConfig {
    // @PropertySources该配置类相当于 <context:property-placeholder location="classpath*:db.properties"/>
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean("dataSource")
    public DataSource getDataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}