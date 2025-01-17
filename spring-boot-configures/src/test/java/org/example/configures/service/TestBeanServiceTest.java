package org.example.configures.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class TestBeanServiceTest {
    //注入Spring上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    public void testLoadService(){
        //测试Spring上下问环境是否有testBeanService这样一个bean，有的话表示xml配置文件生效

       TestBeanService testBeanService = (TestBeanService)ioc.getBean("testBeanService");
        System.out.println(testBeanService.getName());
//        boolean flag = ioc.containsBean("testBeanService");
//        assertTrue(flag);
//        TestBeanService testBeanService = (TestBeanService) ioc.getBean("testBeanService");
//        log.info(String.valueOf(testBeanService));
//        assertEquals("SpringBoot", testBeanService.getName());
    }

}