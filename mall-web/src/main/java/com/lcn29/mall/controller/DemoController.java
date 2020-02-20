package com.lcn29.mall.controller;

import com.lcn29.mall.dao.DemoDO;
import com.lcn29.mall.service.DemoService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/demo/{id}")
    public DemoDO queryDemo(@PathVariable("id")Integer id) {
        return demoService.selectDemo(id);
    }

    @PostMapping("/demo")
    public DemoDO addDemo(@RequestBody DemoDO demoDO) {
        return demoService.insertDemo(demoDO);
    }

}
