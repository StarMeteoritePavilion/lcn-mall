package com.lcn29.mall.service;

import com.lcn29.mall.dao.DemoDO;

/**
 * <pre>
 *
 * </pre>
 *
 * @author LCN
 * @date 2020-02-16 13:28
 */
public interface DemoService {

    String sayHello(String word);

    DemoDO selectDemo(int id);

    DemoDO insertDemo(DemoDO demo);
}
