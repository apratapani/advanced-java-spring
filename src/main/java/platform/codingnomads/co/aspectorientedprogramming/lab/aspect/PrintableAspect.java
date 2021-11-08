package platform.codingnomads.co.aspectorientedprogramming.lab.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Aspect
@Component
public class PrintableAspect {

    public static final Logger LOGGER = LoggerFactory.getLogger(PrintableAspect.class);

    @Pointcut("@annotation(Printable)")
    public void logPrintable() {

    }
    @AfterReturning(value = "logPrintable()",returning = "greetingContinue")
    public void logPrintableBeforeAdvice(JoinPoint joinPoint, Object greetingContinue) {
        LOGGER.info("Before Advice " + joinPoint.getSignature().getName());
        LOGGER.info("Returning " + greetingContinue);
    }

}
