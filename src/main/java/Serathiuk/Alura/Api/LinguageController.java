package Serathiuk.Alura.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguageController {

    @GetMapping(value="/preferred-language")
    public String processLanguage () {
        return "Oi,java!";
    }
}
