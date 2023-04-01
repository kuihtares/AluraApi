package Serathiuk.Alura.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    private Repository repository;

    @GetMapping(value="/preferred-language")
    public String processLanguage () {
        return "Hello,java!";
    }
    @GetMapping("/languages")
    public List<Language> obtainLanguage(){
        List<Language> languages = repository.findAll();
        return  languages;
    }


}
