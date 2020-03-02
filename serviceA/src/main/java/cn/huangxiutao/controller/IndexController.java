package cn.huangxiutao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangxiutao
 * @date 2020/2/28
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "hello";
    }
}
