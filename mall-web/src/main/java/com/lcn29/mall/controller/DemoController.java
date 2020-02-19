package com.lcn29.mall.controller;

import com.lcn29.mall.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <pre>
 *
 * </pre>
 *
 * @author LCN
 * @date 2020-02-16 13:29
 */
@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/hello/{word}")
    public String sayHello(@PathVariable("word") String word) {
        return demoService.sayHello(word);
    }
}
