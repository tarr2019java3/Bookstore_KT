package Authors;

public class Authors {
    public Authors(){}

    Author edgarAlanPoe =  new Author("Edgar Allan Poe");
    Author arthurConanDoyle = new Author("Atrhur Conan Doyle");
    Author robertEHoward = new Author("Robert E. Howard");

    public Author getEdgarAlanPoe() {
        return edgarAlanPoe;
    }

    public void setEdgarAlanPoe(Author edgarAlanPoe) {
        this.edgarAlanPoe = edgarAlanPoe;
    }

    public Author getArthurConanDoyle() {
        return arthurConanDoyle;
    }

    public void setArthurConanDoyle(Author arthurConanDoyle) {
        this.arthurConanDoyle = arthurConanDoyle;
    }

    public Author getRobertEHoward() {
        return robertEHoward;
    }

    public void setRobertEHoward(Author robertEHoward) {
        this.robertEHoward = robertEHoward;
    }
}
