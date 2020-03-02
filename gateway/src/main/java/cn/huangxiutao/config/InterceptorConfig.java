package cn.huangxiutao.config;

import cn.huangxiutao.interceptor.MyInterceptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;
import org.springframework.context.annotation.Configuration;

/**
 * 拦截器配置类
 * @author huangxiutao
 * @date 2020/3/2
 */
@Configuration
public class InterceptorConfig extends InstantiationAwareBeanPostProcessorAdapter {
    private final MyInterceptor myInterceptor = new MyInterceptor();

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (bean instanceof ZuulHandlerMapping){
            ZuulHandlerMapping zuulHandlerMapping = (ZuulHandlerMapping) bean;
            zuulHandlerMapping.setInterceptors(myInterceptor);
        }
        return super.postProcessAfterInstantiation(bean, beanName);
    }
}
