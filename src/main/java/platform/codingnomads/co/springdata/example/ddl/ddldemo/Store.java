package platform.codingnomads.co.springdata.example.ddl.ddldemo;

import javax.persistence.*;

@Entity
@Table(name="Store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rtlLocId;

    @Column(name="store_name")
    String name;

    @Column(name="city")
    String location;


}
