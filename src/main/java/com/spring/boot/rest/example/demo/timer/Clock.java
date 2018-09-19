package com.spring.boot.rest.example.demo.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Clock {


    @Scheduled(fixedRate = 1 * 60 * 1000)// 1 minutes
//    @Scheduled(fixedRate = 30 * 1000)
    public void clock() {
//        log.info("The time is now {}", dateFormat.format(new Date()));
        System.err.print("#");
    }


}
