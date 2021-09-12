package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

    private final StatusService statusService;

    public DemoController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/arrival")
    public String sayHello() {
       // return "springfundamentals/hello";
        return statusService.processStatus(true);
    }

    @GetMapping("/departure")
    public String sayGoodbye() {
     //   return "springfundamentals/goodbye";

        return statusService.processStatus(false);

    }


}
