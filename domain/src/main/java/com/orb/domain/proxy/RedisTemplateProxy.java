package com.orb.domain.proxy;

import org.springframework.stereotype.Service;

/**
 * RedisTemplateProxy
 *
 * @author tianya
 * @date 2021/7/16
 */
@Service
public class RedisTemplateProxy {
    public RedisTemplateProxy opsForValue() {
        return this;
    }

    public String get(String key) {
        return key;
    }
}
