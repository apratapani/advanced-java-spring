package platform.codingnomads.co.springdata.example.dml.introducingrepositories.jparepository.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import platform.codingnomads.co.springdata.example.dml.introducingrepositories.jparepository.Application;
@SpringBootApplication
public class MyApplication implements CommandLineRunner {

    @Autowired
    MyUserRepo myuserRepo;

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class);
    }

    public void run(String... args) throws Exception {
        MyUser myUser1 = new MyUser(null,"Anil","Pratapani","apratapani@gmail.com");
        MyUser myUser2 = new MyUser(null,"Ryan","Desmond","ryan.desmon@gmail.com");

        myuserRepo.save(myUser1);
        myuserRepo.save(myUser2);


        Iterable<MyUser> users = myuserRepo.findAll();

        for(MyUser user : users) {
            System.out.println(user.toString());
        }

    }

}
