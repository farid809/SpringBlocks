package com.example.demo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTaskService {

    @Scheduled(fixedRate = 5000)
    public void printMessage() {
        System.out.println("Hello, this message prints every 5 seconds");
    }
}
