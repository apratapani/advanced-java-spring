package platform.codingnomads.co.ioc.lab.initial;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("platform.codingnomads.co.ioc.lab.initial")
public class CodingNomadConfiguration {
    @Bean
    public Framework framework() {
        return Framework.builder().name("Spring boot").version("2.5").build();
    }

    @Bean
    public IDE ide() {
        return IDE.builder().name("IntelliJ IDEA").version("2021.1").build();
    }

    @Bean
    public JDK jdk() {
        return JDK.builder().name("OpenJDK").version("11").build();
    }

    @Bean
    public OperatingSystem operatingSystem() {
        return OperatingSystem.builder().name("mac OS BigSur").version("11").build();
    }

    @Bean
    public Computer computer() {
        return Computer.builder().name("Mac").version("M1").build();
    }

}
