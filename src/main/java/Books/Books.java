package Books;

import Authors.*;

import Categories.*;



public class Books {

    public Books(){}

    Authors authors = new Authors();
    Categories categories = new Categories();




    Book tamerlaneAndOtherPoems = new Book("Tamerlane and Other Poems", authors.getEdgarAlanPoe(), categories.getPoetry());

    Book alAaraafTamerlaneAndMinorPoems = new Book("Al Aaraaf, Tamerlane and Minor Poems (1829)", authors.getEdgarAlanPoe(), categories.getPoetry());

    Book poems = new Book("poetry",  authors.getEdgarAlanPoe(), categories.getPoetry());


    Book conanTheInvincible = new Book("Conan the Invincible", authors.getRobertEHoward(), categories.getFantasyNovel());

    Book conanTheDefender = new Book("Conan the Defender", authors.getRobertEHoward(), categories.getFantasyNovel());

    Book conanTheDestroyer = new Book("Conan the Destroyer", authors.getRobertEHoward(), categories.getFantasyNovel());

    Book theValleyOfFear = new Book("The Valley of Fear", authors.getArthurConanDoyle(), categories.getDetectiveNovel());

    Book theHoundOfTheBaskervilles = new Book("The Hound of the Baskervilles", authors.getArthurConanDoyle(), categories.getDetectiveNovel());

    Book theSignOfFour = new Book("The Sign of Four", authors.getArthurConanDoyle(), categories.getDetectiveNovel());

    public Book getTamerlaneAndOtherPoems() {
        return tamerlaneAndOtherPoems;
    }

    public void setTamerlaneAndOtherPoems(Book tamerlaneAndOtherPoems) {
        this.tamerlaneAndOtherPoems = tamerlaneAndOtherPoems;
    }

    public Book getAlAaraafTamerlaneAndMinorPoems() {
        return alAaraafTamerlaneAndMinorPoems;
    }

    public void setAlAaraafTamerlaneAndMinorPoems(Book alAaraafTamerlaneAndMinorPoems) {
        this.alAaraafTamerlaneAndMinorPoems = alAaraafTamerlaneAndMinorPoems;
    }

    public Book getPoems() {
        return poems;
    }

    public void setPoems(Book poems) {
        this.poems = poems;
    }

    public Book getConanTheInvincible() {
        return conanTheInvincible;
    }

    public void setConanTheInvincible(Book conanTheInvincible) {
        this.conanTheInvincible = conanTheInvincible;
    }

    public Book getConanTheDefender() {
        return conanTheDefender;
    }

    public void setConanTheDefender(Book conanTheDefender) {
        this.conanTheDefender = conanTheDefender;
    }

    public Book getConanTheDestroyer() {
        return conanTheDestroyer;
    }

    public void setConanTheDestroyer(Book conanTheDestroyer) {
        this.conanTheDestroyer = conanTheDestroyer;
    }

    public Book getTheValleyOfFear() {
        return theValleyOfFear;
    }

    public void setTheValleyOfFear(Book theValleyOfFear) {
        this.theValleyOfFear = theValleyOfFear;
    }

    public Book getTheHoundOfTheBaskervilles() {
        return theHoundOfTheBaskervilles;
    }

    public void setTheHoundOfTheBaskervilles(Book theHoundOfTheBaskervilles) {
        this.theHoundOfTheBaskervilles = theHoundOfTheBaskervilles;
    }

    public Book getTheSignOfFour() {
        return theSignOfFour;
    }

    public void setTheSignOfFour(Book theSignOfFour) {
        this.theSignOfFour = theSignOfFour;
    }
}
