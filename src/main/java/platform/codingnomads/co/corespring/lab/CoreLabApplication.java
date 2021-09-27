package platform.codingnomads.co.corespring.lab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoreLabApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CoreLabConfiguration.class);
        ctx.refresh();
        Cricket cricket = ctx.getBean(Cricket.class);
        Volleyball volleyball = ctx.getBean(Volleyball.class);
         ctx.close();

    }

}
