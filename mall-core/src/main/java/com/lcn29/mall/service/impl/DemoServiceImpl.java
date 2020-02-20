package com.lcn29.mall.service.impl;

import com.lcn29.mall.dao.DemoDO;
import com.lcn29.mall.mapper.DemoMapper;
import com.lcn29.mall.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <pre>
 *
 * </pre>
 *
 * @author LCN
 * @date 2020-02-16 13:28
 */
@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public String sayHello(String word) {
        return "Hello" + word;
    }

    @Override
    public DemoDO selectDemo(int id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    @Override
    public DemoDO insertDemo(DemoDO demo) {
        int insert = demoMapper.insert(demo);
        int num = 9 / 0;
        log.info("结果--->{}", insert);
        return demo;
    }

}
