package sprint1.enums;

public enum Form {
    GUBBE ("gubbe", 1),
    GUMMA ("gumma", 2),
    GRIS ("gris", 3);

    public final String shape;
    public final int order;

    Form(String s, int o){
        shape = s;
        order = o;
    }
}
