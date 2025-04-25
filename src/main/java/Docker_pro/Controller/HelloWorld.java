package Docker_pro.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/message")
public class HelloWorld {
    @GetMapping("/Message")
    public String getmessage(){
        return "Hello_message";
    }
}

