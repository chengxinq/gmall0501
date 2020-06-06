package com.cx.gmall.user;

import org.junit.jupiter.api.Test;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallUserApplicationTests {

    Logger g = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        g.trace("这是一个日志文件");
        g.debug("这是一个Debug信息");
        g.info("info");
    }

}
