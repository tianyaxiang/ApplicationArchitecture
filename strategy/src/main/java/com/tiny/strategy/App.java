package com.tiny.strategy;

/**
 * App
 *
 * @author tianya
 * @date 2020/11/29
 */
public class App {
    public static void main(String[] args) {
        TaskFactory taskFactory = new TaskFactoryImpl();
        BaseTask task = taskFactory.getTask("day");
        task.run();

        task = taskFactory.getTask("week");
        task.run();
    }
}
