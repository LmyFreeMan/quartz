package com.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

public class Spring {
    public static void main(String[] args) throws SchedulerException {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        StdScheduler scheduler= (StdScheduler) ctx.getBean("schedulerFactoryBean");
        scheduler.start();

    }
}