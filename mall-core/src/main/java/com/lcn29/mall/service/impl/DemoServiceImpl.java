package com.lcn29.mall.service.impl;

import com.lcn29.mall.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * <pre>
 *
 * </pre>
 *
 * @author LCN
 * @date 2020-02-16 13:28
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
