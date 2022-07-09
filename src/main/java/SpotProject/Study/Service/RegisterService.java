package SpotProject.Study.Service;



import SpotProject.Study.Entity.Register;
import SpotProject.Study.Repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    public void newRegister(Register reg){
        registerRepository.save(reg);
    }
}
