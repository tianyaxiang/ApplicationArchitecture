package com.tiny.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * TaskFactoryImpl
 *
 * @author tianya
 * @date 2020/11/29
 */
public class TaskFactoryImpl implements TaskFactory {
    private static final Map<String, Class<BaseTask>> taskMap = new HashMap(2);


    public BaseTask getTask(String type) {
        if ("day".equals(type)) {
            return new DayTask();
        }
        if ("week".equals(type)) {
            return new WeekTask();
        }

        throw new IllegalArgumentException("task type not found");
    }
}
