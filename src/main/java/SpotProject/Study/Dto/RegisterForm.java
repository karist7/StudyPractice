package SpotProject.Study.Dto;

import SpotProject.Study.Entity.Register;
import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString

public class RegisterForm {
    private String login_id;

    private String password;

    private String email;

    private String university;
    public Register toEntity(){
        return new Register(null,login_id,password,email,university);
    }
}
