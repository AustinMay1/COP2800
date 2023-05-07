package org.example;

public class Book {
    private Integer id;
    private String title;
    private Integer year;
    private Integer authorId;

    public Book(Integer id, String title, Integer year, Integer authorId) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.authorId = authorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
