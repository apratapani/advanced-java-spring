package platform.codingnomads.co.springsecurity.authorization.custompermissions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import platform.codingnomads.co.springsecurity.authorization.custompermissions.models.MyGrantedAuthority;
import platform.codingnomads.co.springsecurity.authorization.custompermissions.models.User;
import platform.codingnomads.co.springsecurity.authorization.custompermissions.repositories.AuthRepository;
import platform.codingnomads.co.springsecurity.authorization.custompermissions.repositories.UserRepository;

import java.util.Arrays;

@SpringBootApplication
public class PermissionsDemo implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthRepository authRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(PermissionsDemo.class);
    }

    @Override
    public void run(String... args) throws Exception {

        User user1;
        User user2;


        if (userRepository.findAll().isEmpty()) {
            user1 = new User("user1@email.com", passwordEncoder.encode("12345678"));
            user2 = new User("user2@email.com", passwordEncoder.encode("12345678"));
            userRepository.saveAll(Arrays.asList(user1, user2));
        } else {
            user1 = userRepository.findByEmail("user1@email.com");
            user2 = userRepository.findByEmail("user2@email.com");
        }
      //  System.out.println("User1 getClass is " + user1.getClass());
     //   System.out.println("User1 getType is " + user1.getClass().getTypeName());

        if(!userRepository.existsUserByEmail("apratapani@gmail.com")) {
            User user3 = new User("apratapani@gmail.com", passwordEncoder.encode("1234"));
            userRepository.save(user3);
            authRepository.save(new MyGrantedAuthority(user3.getClass().getTypeName(), user3.getId(), "READ"));
        }

        if (authRepository.findAll().isEmpty()) {
            authRepository.save(new MyGrantedAuthority(user1.getClass().getTypeName(), user1.getId(), "READ"));
            authRepository.save(new MyGrantedAuthority(user1.getClass().getTypeName(), user1.getId(), "DELETE"));
            authRepository.save(new MyGrantedAuthority(user2.getClass().getTypeName(), user2.getId(), "READ"));
            authRepository.save(new MyGrantedAuthority(user2.getClass().getTypeName(), user2.getId(), "DELETE"));
        }
    }
}

