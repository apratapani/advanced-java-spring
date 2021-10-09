package platform.codingnomads.co.springdata.lab;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import platform.codingnomads.co.springdata.lab.domain.Route;
import platform.codingnomads.co.springdata.lab.domain.Area;
import platform.codingnomads.co.springdata.lab.repository.AreaRepository;
import platform.codingnomads.co.springdata.lab.repository.RouteRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringDataLab implements CommandLineRunner {

    private final AreaRepository areaRepository;
    private final RouteRepository routeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataLab.class);
    }

    @Override
    public void run(String... args) throws Exception {

        if(areaRepository.findAll().isEmpty())
        {
        final List<Area> areas = areaRepository.saveAll(
                Arrays.asList(
                        Area.builder().code("G").build(),
                        Area.builder().code("H").build(),
                        Area.builder().code("Y").build(),
                        Area.builder().code("Z").build()
                )
        );
        }

        if(routeRepository.findAll().isEmpty())
        {
            final List<Route> routes = routeRepository.saveAll(
                    Arrays.asList(
                            Route.builder().origin(areaRepository.findByCode("G")).destination(areaRepository.findByCode("H")).build(),
                            Route.builder().origin(areaRepository.findByCode("Y")).destination(areaRepository.findByCode("Z")).build(),
                            Route.builder().origin(areaRepository.findByCode("G")).destination(areaRepository.findByCode("Y")).build(),
                            Route.builder().origin(areaRepository.findByCode("H")).destination(areaRepository.findByCode("Z")).build()
                            )
            );
        }


        System.out.println(areaRepository.findByCode("Y"));

        System.out.println(routeRepository.findByOrigin_code("G"));

        System.out.println(routeRepository.findByDestination_Code("H"));

        System.out.println(routeRepository.findByCode("H"));

    }
}
