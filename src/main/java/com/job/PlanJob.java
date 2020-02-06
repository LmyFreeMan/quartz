package com.job;

import com.service.MeetService;
import org.quartz.*;

public class PlanJob implements Job {
    MeetService meetService=new MeetService();
    //存放计划执行的任务
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        TriggerKey key=jobExecutionContext.getTrigger().getKey();
//        JobKey jobKey=jobExecutionContext.getJobDetail().getKey();
//        String info= (String) jobExecutionContext.getJobDetail().getJobDataMap().get("info");
//        System.out.println("key---");
//        System.out.println(key);
//        System.out.println("jobKey---");
//        System.out.println(jobKey);
//        System.out.println("---");
//        System.out.println(info);
      meetService.calClassMeeting();
    }
}