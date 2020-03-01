

import Books.Book;
import Books.Books;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {

        Books books = new Books();
        ObjectMapper mapper =  new ObjectMapper();


        List<Book> bookList = new ArrayList<>();
        bookList.add(books.getTheSignOfFour());
        bookList.add(books.getTheValleyOfFear());
        bookList.add(books.getTheHoundOfTheBaskervilles());
        bookList.add(books.getConanTheInvincible());
        bookList.add(books.getConanTheDestroyer());
        bookList.add(books.getConanTheDefender());
        bookList.add(books.getTamerlaneAndOtherPoems());
        bookList.add(books.getPoems());
        bookList.add(books.getAlAaraafTamerlaneAndMinorPoems());


        try {
            mapper.writeValue(new File("Book.json"), bookList);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
