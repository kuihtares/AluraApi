package Serathiuk.Alura.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {
    private List<Language> languages =
            List.of(
                    new Language("Java","https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 2 ),
                    new Language("PhP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 2)
            );

    @GetMapping(value="/preferred-language")
    public String processLanguage () {
        return "Hello,java!";
    }
    @GetMapping("/languages")
    public List<Language> obtainLanguage(){
        return  languages;
    }


}
