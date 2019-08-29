package ro.itschool.homework23.homeworkwebapp.model;

import java.util.Objects;

public class Markup {
    private String markupId;
    private  String docId;
    private String content;
    private  int position;

    public Markup(String markupId, String docId, String content, int position) {
        this.markupId = markupId;
        this.docId = docId;
        this.content = content;
        this.position = position;
    }

    public String getMarkupId() {
        return markupId;
    }

    public void setMarkupId(String markupId) {
        this.markupId = markupId;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Markup markup = (Markup) o;
        return position == markup.position &&
                Objects.equals(markupId, markup.markupId) &&
                Objects.equals(docId, markup.docId) &&
                Objects.equals(content, markup.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupId, docId, content, position);
    }

    @Override
    public String toString() {
        return "Markup{" +
                "markupId='" + markupId + '\'' +
                ", docId='" + docId + '\'' +
                ", content='" + content + '\'' +
                ", position=" + position +
                '}';
    }
}
