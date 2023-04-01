package Serathiuk.Alura.Api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Document(collection = "Alura.mainLanguages\n")

public class Language {
    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    public Language(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId(){
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getRanking() {
        return ranking;
    }
}
