package Categories;

public class Categories {
    public Categories(){}

    Category fantasyNovel = new Category("fantasy novel");
    Category poetry = new Category("poetry");
    Category detectiveNovel = new Category("detective novel");

    public Category getFantasyNovel() {
        return fantasyNovel;
    }

    public void setFantasyNovel(Category fantasyNovel) {
        this.fantasyNovel = fantasyNovel;
    }

    public Category getPoetry() {
        return poetry;
    }

    public void setPoetry(Category poetry) {
        this.poetry = poetry;
    }

    public Category getDetectiveNovel() {
        return detectiveNovel;
    }

    public void setDetectiveNovel(Category detectiveNovel) {
        this.detectiveNovel = detectiveNovel;
    }
}
