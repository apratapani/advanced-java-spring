package platform.codingnomads.co.springdata.lab.complete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import platform.codingnomads.co.springdata.lab.complete.domain.Area;

public interface AreaRepository extends JpaRepository<Area,Long> {

    public Area findByCode(String code);
}
