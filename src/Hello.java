//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Hello {

    public static void moyenne (){
        String name;
        float pNote;
        float dNote;
        float moyenne;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Votre Nom: ");
        name = scanner.nextLine();

        System.out.println("Bonjour " + name + " ! \n je m'appelle Invictus, je Suis la pour t'aider a trouver ta moyenne \n Done moi ta premiere note" );
        pNote = scanner.nextFloat();

        System.out.println("Ok! Maintenant donne-moi la deuxieme note");
        dNote = scanner.nextFloat();

        moyenne = (pNote + dNote) / 2;

        if (moyenne >= 10) {
            System.out.println("Felicitation ! \n Tu es Trop fort :)");
        } else {
            System.out.println("Ah ! \n Tu dois beaucoup Travaillé :(");
        }
        scanner.close();
    }

    public static void knowAge() {
        String name;
        int age;
        boolean isAdult;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour, Comment tu t'appelles ?");
        name = scanner.nextLine();

        System.out.println("Bien, " + name + " t'as quel age ?");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println(name + " Tu es majeur");
        } else {
            System.out.println(name + " tu es mineur");
        }

        scanner.close();

    }

    public static void temp () {
        /*
        * algorithme temp
        *
        * variable c: reel
        * variable ft
        *
        * ecrire ("Bonjour, done moi la temperature en celcius:")
        * lire(c)
        *
        * ft <- c * 9 / 5 + 35
        *
        * ecrire ("La temperature en Fahrenheit est: ", ft))
        * fin
        * */
        Scanner scanner = new Scanner(System.in);
        int celcius;
        int ft;

        System.out.println("Bonjour, done moi la temperature en celcius: ");
        celcius = scanner.nextInt();

        ft = celcius * 9 / 5 + 35;

        System.out.println("La temperature en Fahrenheit est: " + ft);

        scanner.close();
    }

    public static void ttc() {
        Scanner scanner = new Scanner (System.in);
        float prixHt;
        float tva;
        float remise;
        float mountRemise;
        float ttc;
        float tvaMount;
        float finalPrix;

        System.out.println("écris le prix HT :");
        prixHt = scanner.nextFloat();

        System.out.println("écris le taux de TVA :");
        tva = scanner.nextFloat();

        System.out.println("De combien de pourcent est la remise :");
        remise = scanner.nextFloat();

        ttc = prixHt * (1 + tva / 100);
        mountRemise = ttc * (remise / 100);
        finalPrix = ttc - mountRemise;
        tvaMount = prixHt * (tva / 100);


        System.out.println("Prix Final -> " + finalPrix + "\nremise -> " + mountRemise + "\nTTC -> " + ttc + "\nTVA -> " + tvaMount);
        scanner.close();
    }

    public  static void manegerVar () {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("valeur 1: ");
        a = scanner.nextInt();

        System.out.println("valeur 2: ");
        b = scanner.nextInt();

        c = b;
        b = a;
        a = c;

        System.out.println("a -> " + a + "\n b -> " + b  );

        scanner.close();
    }

    public  static void varManager () {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("1: ");
        a = scanner.nextInt();

        System.out.println("2: ");
        b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a -> " + a + "\n b -> " + b  );

        scanner.close();
    }

    public static void imc () {
        Scanner scanner = new Scanner(System.in);
        double kg;
        double taille;
        double puissance;
        double result;
        double resultFinal;

        System.out.println("Done moi le poids :) :");
        kg = scanner.nextDouble();

        System.out.println("Ok, maintenant donne moi la taille :) :");
        taille = scanner.nextDouble();

        puissance = Math.pow(taille, 2);
        result = kg / puissance ;

        resultFinal = Math.round(result * 10.0) / 10.0;

        if (result < 18.5) {
            System.out.println("Insuffisance \nIMC -> " + resultFinal );
        } else if (result > 18.5 && result < 24.9) {
            System.out.println("Poids normal \nIMC -> " + resultFinal);
        } else if (result > 25.0 && result < 29.9) {
            System.out.println("Surpoids \nIMC -> " + resultFinal);
        } else if (result >= 30.0) {
            System.out.println("Obesite \nIMC -> " + resultFinal);
        }

        scanner.close();
    }

    public static void devisPeiture () {
        Scanner scanner = new Scanner(System.in);

        double longeur;
        double largeur;
        double hauteur;
        double value;
        double pots;
        double prix;
        double surface;

        System.out.println("Done moi la longeur :) :");
        longeur = scanner.nextDouble();

        System.out.println("Done moi la largeur :) :");
        largeur = scanner.nextDouble();

        System.out.println("Done moi la hauteur :) :");
        hauteur = scanner.nextDouble();

        value = (longeur * hauteur) * 2 + (largeur * hauteur) * 2;
        surface = value - (value / 5);

        pots = Math.round(surface / 10);
        prix = 29.90 * pots;

        System.out.println("la surface nette -> " + surface + " carre\n pots -> " + pots + "\n Prix -> " + prix + "€");

        scanner.close();

    }

    public static  void onvertisseur () {

    }

    public static void main (String[] args) {

    }
}
