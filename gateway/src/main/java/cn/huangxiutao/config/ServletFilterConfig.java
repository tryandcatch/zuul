package cn.huangxiutao.config;

/**
 * 用于配置Servlet Filter
 * @author huangxiutao
 * @date 2020/2/29
 */

import cn.huangxiutao.filter.MyServletFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletFilterConfig {
    @Bean
    public FilterRegistrationBean myServletFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyServletFilter());
        //在这里可以添加过滤器不拦截的路径，在过滤器中获取该属性值
//        registrationBean.addInitParameter("","");
        registrationBean.addUrlPatterns("/*");
        //设置过滤器的优先级，数字越小，优先级越高
        registrationBean.setOrder(1); // 过滤器的优先级
        registrationBean.setName("myServletFilter");
        return registrationBean;
    }
}
