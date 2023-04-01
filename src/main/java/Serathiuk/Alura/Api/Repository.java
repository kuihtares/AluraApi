package Serathiuk.Alura.Api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Language, String> {
}
