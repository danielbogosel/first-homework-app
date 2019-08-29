package ro.itschool.homework23.homeworkwebapp.controller;

import org.springframework.web.bind.annotation.*;
import ro.itschool.homework23.homeworkwebapp.model.Markup;
import ro.itschool.homework23.homeworkwebapp.service.MarkupService;

import java.util.List;

@RestController
@RequestMapping("/documents/{documentId}/markups")
public class MarkupController {
    private final MarkupService markupService;

    public MarkupController(MarkupService markupService) {
        this.markupService = markupService;
    }

    @GetMapping
    public List<Markup> getMarkups(@RequestParam String docId) {
        System.out.println("Get markups");
        return markupService.getMarkups(docId);
    }

    @PostMapping
    public Markup addMarkup(@PathVariable String docId, @RequestBody Markup markup) {
        return markupService.addMarkup(docId, markup);
    }


    @GetMapping("{markupId}")
    Markup getMarkupById(@PathVariable String documentId, @PathVariable String markupId) {
        return markupService.getMarkupById(documentId, markupId);
    }

    @PutMapping("{markupId}")
    Markup updateMarkup(@PathVariable String documentId, @PathVariable String markupId, @RequestBody Markup markup) {
        return markupService.updateMarkup(documentId, markupId, markup);
    }

    @DeleteMapping("{markupId}")
    Markup deleteMarkup(@PathVariable String documentId, @PathVariable String markupId) {
        return markupService.deleteMarkup(documentId, markupId);
    }

}
