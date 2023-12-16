package cn.edu.tyut.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

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
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {
    @Bean
    public TransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}