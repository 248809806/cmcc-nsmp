package com.ultrapower.web;

import org.junit.jupiter.api.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

public class App_CronTrigger {

    @Test
    public void testDemo() throws Exception {

        // 创建JobDetail对象，指定对象的任务名称、组名
        JobDetail job =
                JobBuilder.newJob(PrintTimeJob.class)
                        .withIdentity("job1", "group1").build();

        CronScheduleBuilder schedule = CronScheduleBuilder
                .cronSchedule("0/10 * * * * ?");
        CronTrigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1","group1")
                .withSchedule(schedule).build();
        // 创建任务管理器Scheduler对象
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler scheduler = sf.getScheduler();
        scheduler.scheduleJob(job,trigger);
        scheduler.start();

        // 主线程睡眠1分钟
        Thread.sleep(60L * 1000L);
        // 关闭定时任务管理器
        scheduler.shutdown(true);

    }


}
