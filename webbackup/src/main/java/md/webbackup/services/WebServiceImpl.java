package md.webbackup.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;

@Service
public class WebServiceImpl implements WebService {
    @Value("${main.uri}")
    private String uri;
    private  void getEmployees() throws MalformedURLException {
System.out.println(uri);

        final RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }
    @Override
    public String main() throws MalformedURLException {
        getEmployees();

        return null;
    }
}
