package com.test;

import com.job.PlanJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;


public class TestQuartz {
    public static void main(String[] args) throws SchedulerException {
      //创建调度器
      Scheduler scheduler = new StdSchedulerFactory().getScheduler();

      //产生能够使用的job
      JobDetail jobDetail=JobBuilder.newJob(PlanJob.class)
              .withIdentity("meetting job","group1")
              .build();
      //产生能用的触发器
      Trigger trigger = TriggerBuilder.newTrigger()
              .withIdentity("trigger1", "triggerGroup1")
              .startNow()//立即生效
              .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                      .withIntervalInSeconds(1)//每隔1s执行一次
                      .withRepeatCount(2))
              .build();//一直执行
      //执行
      scheduler.scheduleJob(jobDetail, trigger);
      System.out.println("--------scheduler start ! ------------");
      scheduler.start();

    }
}