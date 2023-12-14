package cn.edu.tyut.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author 羊羊
 * @ClassName ServletContainersInitConfig
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:38
 * @Package_Name cn.edu.tyut.config
 */
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 加载Spring配置类中的信息，初始化Spring容器
     *
     * @return dad
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * 加载Spring Mvc配置类中的信息，初始化 SpringMvc 容器
     *
     * @return daw
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /**
     * 配置DispatcherServlet的映射路径
     *
     * @return daw
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
