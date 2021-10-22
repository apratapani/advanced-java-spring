package platform.codingnomads.co.springdata.example.ddl.onetomanyprac;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "teacher_name", nullable = false)
    private String teacherName;

    @Column(nullable = false)
    private String sex;

}
