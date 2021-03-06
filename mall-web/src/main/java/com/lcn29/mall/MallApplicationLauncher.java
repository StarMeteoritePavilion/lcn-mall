package com.lcn29.mall;

import com.lcn29.kit.web.listener.LoggerListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <pre>
 * Application Launcher
 * </pre>
 *
 * @author LCN
 * @date 2020-02-16 09:54
 */

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.lcn29.mall.mapper")
public class MallApplicationLauncher {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(MallApplicationLauncher.class);
        springApplication.addListeners(new LoggerListener());
        springApplication.run(args);
    }
}
