package md.BackDesktop.controllers;

import md.BackDesktop.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

@RestController
public class MainCotroller {
    MainService mainService;
@Autowired
    public void setMainService(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping(value = "desktop",method = RequestMethod.GET)
  public   String mainController() throws MalformedURLException {

        return mainService.main();
    }
}
