package Middle;

import com.company.Author;
import com.company.Book;

public class middleDiff {

    public static void main(String[] args) {
        Author lukas = new Author("George","Lukas");

        Book[] books = new Book[10];

        addBook(books,new Book(lukas,"Скрытая угроза",1999));
        addBook(books,new Book(lukas,"Война клонов",2001));
        addBook(books,new Book(lukas,"Месть ситхов",2005));
        addBook(books,new Book(lukas,"Новая надежда",1974));
        addBook(books,new Book(lukas,"Империя наносит ответный удар",1977));
        addBook(books,new Book(lukas,"Возвращение джедая",1981));

        for (Book book : books) {
            if (book != null){
                printBook(book);
            }
        }



    }

    public static boolean addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    public static void printBook(Book book) {
        System.out.println(String.join(": ",
//                book.getAuthorName()),
                book.getAuthorName() + " " + book.getAuthorName(),
                book.getNameOfBook(),
                String.valueOf(book.getYearOfPublish())
        ));
    }
}
