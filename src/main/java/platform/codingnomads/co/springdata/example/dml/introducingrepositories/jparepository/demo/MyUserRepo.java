package platform.codingnomads.co.springdata.example.dml.introducingrepositories.jparepository.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepo extends CrudRepository<MyUser,Long> {

}
