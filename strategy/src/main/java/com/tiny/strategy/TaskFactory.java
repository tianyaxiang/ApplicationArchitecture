package com.tiny.strategy;

/**
 * TaskFactory
 *
 * @author tianya
 * @date 2020/11/29
 */
public interface TaskFactory {
    /**
     * 获取Task
     *
     * @param type
     * @return
     */
    BaseTask getTask(String type);
}
