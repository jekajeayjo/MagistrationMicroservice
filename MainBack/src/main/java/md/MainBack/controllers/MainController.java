package md.MainBack.controllers;

import md.MainBack.enteties.UserEntety;
import md.MainBack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    UserRepository userRepository;
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "main",method = RequestMethod.GET)
    public Iterable<UserEntety> mainController()
    {

        System.out.println("sdf");
        return userRepository.findAll();
    }
}
