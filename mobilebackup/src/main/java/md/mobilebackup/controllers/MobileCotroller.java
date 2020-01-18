package md.mobilebackup.controllers;

import md.mobilebackup.services.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

@RestController
public class MobileCotroller {
    MobileService mobileService;



    @Autowired
    public void setMobileService(MobileService mobileService) {
        this.mobileService = mobileService;
    }
    @RequestMapping(value = "mobile",method = RequestMethod.GET)
  public   String mainController() throws MalformedURLException {

        return mobileService.main();
    }
}
