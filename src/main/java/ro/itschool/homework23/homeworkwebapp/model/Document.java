package ro.itschool.homework23.homeworkwebapp.model;


import java.util.Objects;

public class Document {
    private String docId;
    private String name;
    private String  content;
    private String owner;

    public Document(String docId, String name, String content, String owner) {
        this.docId = docId;
        this.name = name;
        this.content = content;
        this.owner = owner;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(docId, document.docId) &&
                Objects.equals(name, document.name) &&
                Objects.equals(content, document.content) &&
                Objects.equals(owner, document.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docId, name, content, owner);
    }

    @Override
    public String toString() {
        return "Document{" +
                "docId='" + docId + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
