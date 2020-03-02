package cn.huangxiutao.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 参考：https://stackoverflow.com/questions/39801282/handlerinterceptoradapter-and-zuul-filter
 * @author huangxiutao
 * @date 2020/2/29
 */
public class MyInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器 preHandle 执行");
        //注意这里如果返回false，请求不会往下走了
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器 postHandle 执行");
    }
}
