package com.orb.domain;

import com.orb.domain.proxy.RedisTemplateProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DomainApplicationTests {
    @Autowired
    RedisTemplateProxy redisTemplateProxy;

    @Test
    public void contextLoads() {
      String result =  redisTemplateProxy.opsForValue().get("test");

      System.out.println(result);
    }

}
