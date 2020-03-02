package cn.huangxiutao.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author huangxiutao
 * @date 2020/2/29
 */
@Component
public class MyPreZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //数字越小 优先级越高
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否过滤请求
        return true;
    }

    @Override
    public Object run() {
        System.out.println("pre 过滤器执行");
        return null;
    }
}
