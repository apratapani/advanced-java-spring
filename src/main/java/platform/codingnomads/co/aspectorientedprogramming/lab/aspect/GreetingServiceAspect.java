package platform.codingnomads.co.aspectorientedprogramming.lab.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import platform.codingnomads.co.aspectorientedprogramming.aop.aspect.LoggingAspect;

import org.slf4j.Logger;

@Aspect
@Component
public class GreetingServiceAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingServiceAspect.class);
    @Before(value = "execution(* platform.codingnomads.co.aspectorientedprogramming.lab.service.GreetingService.greeting())")
    public void logBeforeAdviceGreeting(JoinPoint joinPoint) {
        LOGGER.info("Before " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* platform.codingnomads.co.aspectorientedprogramming.lab.service.GreetingService.greeting())",returning = "greeting")
    public void logAfterAdviceGreeting(JoinPoint joinPoint,Object greeting) {
        LOGGER.info("After Returning " + joinPoint.getSignature().getName());
        LOGGER.info("Result = " + greeting);
    }

    @Pointcut(value = "execution(* platform.codingnomads.co.aspectorientedprogramming.lab.service.GreetingService.greetingContinue())")
    public void logGreetingContinue() {

    }
    @After("logGreetingContinue()")
    public void logAfterGreetingContinue(JoinPoint joinPoint) {
        LOGGER.info("After Advice " + joinPoint.getSignature().getName());
    }





}
