package platform.codingnomads.co.gettingstarted.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ComedyApi {
    @Autowired
    ComedyService comedyService;

    @GetMapping("/api/comedy")
    public String[] getAllJokes() {
        return comedyService.getAllJokes();

    }


}
