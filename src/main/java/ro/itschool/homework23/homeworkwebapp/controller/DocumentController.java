package ro.itschool.homework23.homeworkwebapp.controller;


import org.springframework.web.bind.annotation.*;
import ro.itschool.homework23.homeworkwebapp.model.Document;
import ro.itschool.homework23.homeworkwebapp.service.DocumentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping
    List<Document> getAllDocuments(@RequestParam(required = false) String name, @RequestParam(required = false) String owner) {
        System.out.println("Get all documents");
        return documentService.getAllDocuments(name, owner);
    }

    @PostMapping
    List<Document> addDocument(@RequestBody Document document) {
        return documentService.addDocuments(document);
    }

    @GetMapping("{documentId}")
    Optional<Document> getByDocumentId(@PathVariable String documentId) {
        return documentService.getDocumentById(documentId);
    }

    @PutMapping("{documentId}")
    Document updateDocument(@RequestParam String documentId, @RequestBody Document document) {
        return documentService.updateDocument(documentId, document);
    }

    @DeleteMapping("{documentId}")
    Document deleteDocument(@RequestParam String documentId) {
        return documentService.deleteDocument(documentId);
    }
}
