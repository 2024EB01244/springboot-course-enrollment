@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int duration;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
