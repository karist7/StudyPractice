package SpotProject.Study.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String login_id;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String university;

    public Register() {
    }

    public Register(Long id, String login_id, String password, String email, String university) {
        this.id = id;
        this.login_id = login_id;
        this.password = password;
        this.email = email;
        this.university = university;
    }

}
