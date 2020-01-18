package md.webbackup.controllers;


import md.webbackup.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

@RestController
public class WebController {
    WebService  webService;



    @Autowired
    public void setWebService(WebService webService) {
        this.webService = webService;
    }

    @RequestMapping(value = "web",method = RequestMethod.GET)
  public   String mainController() throws MalformedURLException {

        return webService.main();
    }
}
