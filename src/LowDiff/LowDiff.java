package LowDiff;

import com.company.Author;
import com.company.Book;

public class LowDiff {
    public static void main(String[] args) {
        // write your code here
        Author king = new Author("Stiven","King");
        Author prof = new Author("J.R.R","Tolkien");

        Book lOTR = new Book(prof,"Lord of the ring",1954);
        Book it = new Book(king,"IT",1984);

        System.out.println(lOTR);
        System.out.println(it);

        System.out.println("lOTR.getNameOfBook() = " + lOTR.getNameOfBook());
        System.out.println("it.getNameOfBook() = " + it.getNameOfBook());

        it.setYearOfPublish(1986);
        System.out.println("Меняем год издания");
        System.out.println(it);

    }
}
