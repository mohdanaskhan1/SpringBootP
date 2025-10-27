package com.mainapp10;

public class Author {

    private String author1;
    private String author2;

    public Author() {
    }

    public Author(String author1, String author2) {
        this.author1 = author1;
        this.author2 = author2;
    }

    public String getAuthor1() {
        return author1;
    }

    public void setAuthor1(String author1) {
        this.author1 = author1;
    }

    public String getAuthor2() {
        return author2;
    }

    public void setAuthor2(String author2) {
        this.author2 = author2;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author1='" + author1 + '\'' +
                ", author2='" + author2 + '\'' +
                '}';
    }
}
