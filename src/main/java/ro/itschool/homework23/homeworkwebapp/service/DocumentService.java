package ro.itschool.homework23.homeworkwebapp.service;

import org.springframework.stereotype.Service;
import ro.itschool.homework23.homeworkwebapp.model.Document;

import static java.util.Optional.ofNullable;

import java.util.Optional;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class DocumentService {
    private ArrayList<Document> documents = new ArrayList<>();
//            new Document(UUID.randomUUID().toString(), "doc1", "Ana are mere", "Ana"),
//            new Document(UUID.randomUUID().toString(), "doc2", "Alin are liniste", "Alin"),
//            new Document(UUID.randomUUID().toString(), "doc3", "Florin are piersic", "Ana"),
//            new Document(UUID.randomUUID().toString(), "doc4", "Hagi are minge", "Hagi")



    public List<Document> getAllDocumentss(String name, String owner) {
        return documents.stream()
                .filter(document -> document == null || document.getName().equals(name))
                .filter(document -> document == null || document.getOwner().equals(owner))
                .collect(Collectors.toList());
    }
    public List<Document> getAllDocuments(String name, String owner) {
        return documents.stream()
                .collect(Collectors.toList());
    }

    public Optional<Document> getDocumentById(String docId) {
        return Optional.ofNullable(documents.stream()
                .filter(document -> document.getDocId().equals(docId))
                .findFirst()
                .orElse(null));
    }

    public List<Document> addDocuments(Document document) {
        documents.add(document);
        return documents;
    }



    public Document updateDocument(String documentId, Document document) {
        return getDocumentById(documentId)
                .map(old -> updateExistingDocument(old, document))
                .orElse(null);


    }

    private Document updateExistingDocument(Object old, Document document) {
        documents.remove(old);
        documents.add(document);
        return document;
    }

    public Document deleteDocument(String docId) {
        Optional<Document> existDocument = getDocumentById(docId);
        existDocument.ifPresent(documents::remove);
        return existDocument.orElse(null);

    }
}