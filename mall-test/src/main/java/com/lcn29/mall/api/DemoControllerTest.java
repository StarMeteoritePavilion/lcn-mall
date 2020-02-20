package com.lcn29.mall.api;

import com.alibaba.fastjson.JSONObject;
import com.lcn29.mall.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

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

    @After
    public void after() {
        log.info("test finish");
    }

    @Test
    public void sayHelloTest() throws Exception {

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello/Java"))
            .andDo(MockMvcResultHandlers.print())
            .andReturn();
        log.info("Mock结果是---->{}", mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void queryDemoTest() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/demo/1")
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print())
            .andReturn();
        log.info("Mock结果是---->{}", mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void addDemoTest() throws Exception {

        Map<String, String> map = new HashMap<>(16);
        map.put("name","测试");

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/demo")
            .contentType(MediaType.APPLICATION_JSON)
            .content(JSONObject.toJSONString(map))
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print())
            .andReturn();
        log.info("Mock结果是---->{}", mvcResult.getResponse().getContentAsString(StandardCharsets.UTF_8));
    }
}
