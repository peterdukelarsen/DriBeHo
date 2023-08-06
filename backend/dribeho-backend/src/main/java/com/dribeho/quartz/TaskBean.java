package com.dribeho.quartz;

import io.quarkus.runtime.StartupEvent;
import org.quartz.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class TaskBean {
    @Inject
    org.quartz.Scheduler quartz;

    void onStart(@Observes StartupEvent event) throws SchedulerException {
        JobDetail job = JobBuilder.newJob(Searchjob.class)
                .withIdentity("SearchJob", "SearchGroup")
                .build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("myTrigger", "myGroup")
                .startNow()
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(10)
                                .repeatForever()).build();
        quartz.scheduleJob(job, trigger);
    }

    void performTask() {
        System.out.println("Hello task!");
    }

    public static class Searchjob implements Job {
        @Inject
        TaskBean taskBean;

        @Override
        public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
            taskBean.performTask();
        }
    }
}
