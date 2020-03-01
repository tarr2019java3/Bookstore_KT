

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {

        Author edgarAlanPoe =  new Author("Edgar Allan Poe");
        Author arthurConanDoyle = new Author("Atrhur Conan Doyle");
        Author robertEHoward = new Author("Robert E. Howard");


        Categories fantasyNovel = new Categories("fantasy novel");
        Categories poetry = new Categories("poetry");
        Categories detectiveNovel = new Categories("detective novel");

    Book tamerlaneAndOtherPoems = new Book("Tamerlane and Other Poems", edgarAlanPoe, poetry);
    Book alAaraafTamerlaneAndMinorPoems = new Book("Al Aaraaf, Tamerlane and Minor Poems (1829)", edgarAlanPoe, poetry);
    Book poems = new Book("poetry",  edgarAlanPoe, poetry);

    Book conanTheInvincible = new Book("Conan the Invincible", robertEHoward, fantasyNovel);
    Book conanTheDefender = new Book("Conan the Defender", robertEHoward, fantasyNovel);
    Book conanTheDestroyer = new Book("Conan the Destroyer", robertEHoward, fantasyNovel);

    Book theValleyOfFear = new Book("The Valley of Fear", arthurConanDoyle, detectiveNovel);
    Book theHoundOfTheBaskervilles = new Book("The Hound of the Baskervilles", arthurConanDoyle, detectiveNovel);
    Book theSignOfFour = new Book("The Sign of Four", arthurConanDoyle, detectiveNovel);

    ObjectMapper mapper =  new ObjectMapper();

    List<Book> bookList = new ArrayList<>();
    bookList.add(conanTheDestroyer);
    bookList.add(theHoundOfTheBaskervilles);
    bookList.add(tamerlaneAndOtherPoems);
    bookList.add(theSignOfFour);
    bookList.add(conanTheInvincible);
    bookList.add(theValleyOfFear);bookList.add(conanTheDefender);
    bookList.add(alAaraafTamerlaneAndMinorPoems);
    bookList.add(poems);




        try {
            mapper.writeValue(new File("Book.json"), bookList);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
