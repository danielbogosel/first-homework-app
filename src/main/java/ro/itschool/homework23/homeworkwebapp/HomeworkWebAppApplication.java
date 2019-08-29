package ro.itschool.homework23.homeworkwebapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.itschool.homework23.homeworkwebapp.model.Document;
import ro.itschool.homework23.homeworkwebapp.model.Markup;
import ro.itschool.homework23.homeworkwebapp.service.DocumentService;

import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class HomeworkWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkWebAppApplication.class, args);
    }

 /*   @Bean
    CommandLineRunner atStartup(DocumentService documentService) {
        return args -> {
            documentService.addDocuments(new Document(UUID.randomUUID().toString(), "doc1", "Ana are mere", "Ana"));
            documentService.addDocuments(new Document(UUID.randomUUID().toString(), "doc2", "Alin are liniste", "Alin"));
            documentService.addDocuments(new Document(UUID.randomUUID().toString(), "doc3", "Florin are piersic", "Ana"));
            documentService.addDocuments(new Document(UUID.randomUUID().toString(), "doc4", "Hagi are minge", "Hagi"));
        };


    }

    private Markup markup(int id) {
        return new Markup("mk" + id, "doc" + id,"mk"+id,new Random().nextInt());
    }*/
}
