package platform.codingnomads.co.ioc.lab.completed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class IDE {
    private String name;
    private String version;


    public IDE() {
        name = "Anil";
        version = "11";
    }
}
