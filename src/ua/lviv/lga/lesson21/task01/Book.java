package ua.lviv.lga.lesson21.task01;

import java.lang.annotation.Retention;

public class Book {
    @BookAnnotation(param = "This is title of book")
    private String title;
    @BookAnnotation(param = "This is name of autor")
    private String autor;
    @BookAnnotation(param = "This is count of page")
    private int page;
    @BookAnnotation(param = "This is year of publication")
    private int year;

    public Book(String title, String autor, int page, int year) {
        this.title = title;
        this.autor = autor;
        this.page = page;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getPage() {
        return page;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", page=" + page +
                ", year=" + year +
                '}';
    }
}
