package com.example.demo;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

   // @Before("execution(* ScheduledTaskService.printMessage())")
    @Before("execution(* com.example.demo.ScheduledTaskService.printMessage())")

    public void logBeforePrintMessage() {
        System.out.println("About to print a scheduled message");
    }
}
