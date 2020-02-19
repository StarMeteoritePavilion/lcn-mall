package com.lcn29.mall.api;

import com.lcn29.mall.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import javax.annotation.Resource;

/**
 * <pre>
 * DemoControllerTest
 * </pre>
 *
 * @author LCN
 * @date 2020-02-19 17:27
 */
@Slf4j
public class DemoControllerTest extends BaseTest {

    @Resource
    private MockMvc mockMvc;

    @Before
    public void before() {
        log.info("start test");
    }

    @Test
    public void sayHelloTest() throws Exception {

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello/Java"))
            .andDo(MockMvcResultHandlers.print())
            .andReturn();

        log.info("Mock结果是---->{}", mvcResult.getResponse().getContentAsString());
    }

    @After
    public void after() {
        log.info("test finish");
    }

}
