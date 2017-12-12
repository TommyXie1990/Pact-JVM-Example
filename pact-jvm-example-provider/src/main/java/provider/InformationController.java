package provider;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

@RestController
public class InformationController {

    private Information information = new Information();

    @RequestMapping("/information")
    public Information information(@RequestParam(value="name", defaultValue="Miku") String name) {
        if (name.equals("Miku")) {
            HashMap contact = new HashMap<String, String>();
            contact.put("Email", "hatsune.miku@ariman.com");
            contact.put("Phone Number", "9090950");
            information.setContact(contact);
            information.setName("Hatsune Miku");
            information.setSalary(45000);
        } else {
            information.setContact(null);
            information.setName(name);
            information.setSalary(0);
        }

        return information;
    }
}
