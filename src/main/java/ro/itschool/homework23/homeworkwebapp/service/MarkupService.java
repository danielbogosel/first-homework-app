package ro.itschool.homework23.homeworkwebapp.service;

import org.springframework.stereotype.Service;
import ro.itschool.homework23.homeworkwebapp.model.Document;
import ro.itschool.homework23.homeworkwebapp.model.Markup;

import java.util.ArrayList;
import java.util.List;


import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

@Service
public class MarkupService {
    private List<Markup> markups = new ArrayList<>();

    public List<Markup> getMarkups(String docId) {
        return ofNullable(docId)
                .map(this::getByDocumentId)
                .orElse(markups);

    }

    private List<Markup> getByDocumentId(String docId) {
        return markups.stream()
                .filter(markup -> markup.getDocId().equals(docId))
                .collect(toList());
    }

    public Markup addMarkup(String docId, Markup markup) {
        markup.setDocId(docId);
        markups.add(markup);
        return markup;

    }

    public Markup getMarkupById(String documentId, String markupId) {
        return getMarkups(documentId).stream()
                .filter(markup -> markup.getMarkupId().equals(markupId))
                .findFirst()
                .orElse(null);
    }

    public Markup updateMarkup(String documentId, String markupId, Markup markup) {
        final Markup existingMarkup = getMarkupById(documentId, markupId);
        if (existingMarkup != null) {
            markups.remove(existingMarkup);
            markups.add(markup);
            return existingMarkup;
        } else {
            return null;
        }
    }

    public Markup deleteMarkup(String documentId, String markupId) {
        final Markup markup = getMarkupById(documentId, markupId);
        if (markups.remove(markup)) {
            return markup;
        } else {
            return null;
        }
    }

}
