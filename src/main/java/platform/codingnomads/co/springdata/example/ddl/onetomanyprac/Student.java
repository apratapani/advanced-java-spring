package platform.codingnomads.co.springdata.example.ddl.onetomanyprac;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "student_name")
    private String studentName;

    @Column(nullable = false)
    private String sex;
}
