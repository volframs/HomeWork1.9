package com.company;


import java.util.Objects;

public class Book {
    final private String nameOfBook;
    private int yearOfPublish;
    final private Author author;

    public Book(Author author,String nameOfBook,int yearOfPublish){
        this.author=author;
        this.nameOfBook= nameOfBook;
        this.yearOfPublish=yearOfPublish;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public String getAuthorName() {
        return author.getName()+author.getSecondName();
    }

    public void setYearOfPublish(int yearOfPublish){
        this.yearOfPublish=yearOfPublish;
    }

    @Override
    public String toString() {
        return  author + ": " + nameOfBook +" " + yearOfPublish + " year";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameOfBook.equals(book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook);
    }
}


