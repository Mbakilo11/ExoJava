public class Cartes {
    static final int valet = 11;
    static final int dame = 12;
    static final int roi = 13;
    static final int as = 14;

    static final int trefle = 1;
    static final int carreau = 2;
    static final int coeuer = 3;
    static final int pique = 4;

    int couleur;
    int valeur;

    Cartes(int valeur, int couleur) {
        this.valeur = valeur;
        this.couleur =  couleur;
    }
}
