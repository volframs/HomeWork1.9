package com.company;


public class Book {
    private String nameOfBook;
    private int yearOfPublish;
    private Author author;

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

}


