package cn.huangxiutao.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author huangxiutao
 * @date 2020/2/29
 */
public class MyServletFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //做一些初始化的事
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //记得要"放行"请求
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
    }
}
