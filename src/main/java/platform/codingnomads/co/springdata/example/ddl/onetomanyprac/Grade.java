package platform.codingnomads.co.springdata.example.ddl.onetomanyprac;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Grade {
    @Id
    private Long id;

    @Column(nullable = false,name = "grade_name")
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "grade_id")
    private List<Student> students;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name="grade_id")
    private List<Teacher> teachers;


}
