package SpotProject.Study.Controller;

import SpotProject.Study.Dto.RegisterForm;
import SpotProject.Study.Entity.Register;
import SpotProject.Study.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/join")
    public String join(RegisterForm form, Model model)throws Exception{
        Register register = form.toEntity();

        registerService.newRegister(register);

        model.addAttribute("message","회원 가입이 완료되었습니다.");
        model.addAttribute("searchUrl","/");
        return "message";
    }
}
