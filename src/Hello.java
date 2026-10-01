//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
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

    public static  void convertisseur () {
        Scanner scanner = new Scanner(System.in);

        int second;
        int time;
        int min;
        int newSecond;

        System.out.println("Donne moi le nombre de seconde : ");
        second = scanner.nextInt();

        time = second / 3600;
        min = (second % 3600) / 60;
        newSecond = second % 60;

        System.out.println(time + "h : " + min + "min : " + newSecond + "s" );

        scanner.close();
    }

    public  static void calc () {
        Scanner scanner = new Scanner(System.in);
        float n1 ;
        float n2 ;
        String op;
        float result;

        System.out.println("N1: ");
        n1 = scanner.nextInt();

        System.out.println("N2: ");
        n2 = scanner.nextInt();

        System.out.println("Quel operation tu souhaite faire: ");
        op = scanner.nextLine();

        switch (op) {
            case "+":
                result = n1 + n2;
                System.out.println(n1 +" + " + n2 + " = " + result );
                break;
            case "*":
                result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result );
                break;
            case "-":
                result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result );
                break;
            case "/":
                if(n1 == 0 || n2 == 0) {
                    System.out.println("Erreur : division par zero");
                    return;
                }
                result = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + result );
                break;
            default:
                System.out.println("Erreur : operateur inconnu");
        }

        scanner.close();

    }

    public static void findNumber () {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int numberRandom = random.nextInt(100);
        int numberUser;
        int essaies =0;

        System.out.println("Donne moi un numero");
        numberUser = console.nextInt();

        System.out.println(numberRandom);

        do {

            if (numberUser > numberRandom){
                System.out.println("Plus petit !");
                numberUser = console.nextInt();
                essaies++;
            } else if (numberUser < numberRandom) {
                System.out.println("Plus Grand !");
                numberUser = console.nextInt();
                essaies++;
            }
        }
        while (numberUser != numberRandom);

        if (numberUser == numberRandom) {
            System.out.println("Bravo Tas Trouver :) en " + essaies + "essaies");
        }

        console.close();
    }

    public  static void fizzBuzz () {
        Scanner console = new Scanner(System.in);
        int numberCount = 21;

        for (int i = 1; i < numberCount; i ++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Wazz");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void mdpVerify() {
        Scanner console = new Scanner(System.in);
        String mdp;
        String[] symbol = {"@","&", "!", "§", "%", "$", "*", "€", "£", "="};
        boolean hasSymbol = false;
        boolean isUppercase = false;
        boolean isLowercase = false;
        boolean hasNumber = false;

        System.out.println("donne moi le mot de passe et je vais te dire s'il est valide :)");
        mdp = console.nextLine();

        isUppercase = Character.isUpperCase(mdp.charAt(0));


        for (int i = 0; i < mdp.length(); i ++) {
            if (Character.isDigit(mdp.charAt(i))) {
                hasNumber = true;
            }
            if(Character.isLowerCase(mdp.charAt(i))){
                isLowercase = true;
            }
            if(Character.isLowerCase(mdp.charAt(i))){
                isLowercase = true;
            }
        }

        for (int i = 0; i < symbol.length; i ++) {
            if (mdp.indexOf(symbol[i]) != -1) {
                hasSymbol = true;
            }
        }

        if (hasSymbol && hasNumber && isLowercase && isUppercase) {
            System.out.println("mdp valide :)");
        } else {
            System.out.println("mdp invalide :(");
        }

    }

    public static void table() {
        Scanner console = new Scanner(System.in);
        int nombre = 10;
        ArrayList<String> arrayNumber = new ArrayList<String>();
        ArrayList<String> arrayT = new ArrayList<String>();
        String nJoined;
        String tJoined;
        int [][] matrices = new int[nombre][nombre];
        ArrayList<Integer> colomnOne = new ArrayList<Integer>();

        for (int i = 0; i < nombre + 2; i++) {
            arrayT.add("-");
        }
        tJoined = String.join(" ", arrayT);

        for (int i = 1; i < nombre + 1; i++) {
            arrayNumber.add(Integer.toString(i));
        }
        nJoined = String.join(" ", arrayNumber);

        System.out.println("    " + nJoined);
        System.out.println(tJoined);

        for (int i = 1; i < nombre ; i++) {
            for (int j = 1; j < nombre; j++) {
                matrices[i][j] = i * j;
            }
        }

        for (int i = 1; i < nombre ; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < nombre; j++) {
                System.out.print(matrices[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void etoile () {
        Scanner console = new Scanner(System.in);
        int n;
        String etoile = "*";
        int largeur = 50;
        int spaces = (largeur - etoile.length()) / 2;

        System.out.println("donne moi un numero et tu vera la magie :)");
        n = console.nextInt();

        /* tous les exo d'affichage de pyramide son la
        System.out.println(etoile);


        for (int i = 1; i < n + 1 ; i++) {
            etoile += "*";
            System.out.println(etoile);
        }
         fin Du premier */


        /* deuxième
        for (int i = 1; i < n + 1; i++) {

            etoile += "*";
        }
        System.out.println(etoile);
        for (int i = 1; i < n + 1; i++) {
            etoile = etoile.substring(0, etoile.length() - 1);
            System.out.println(etoile);
        }
        Fin du deuxième */

        //System.out.println(etoile);

        /* le troisième
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        } */


        // Bonus
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n-2; i >=0 ; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // -------------------------------

    public static int verifyRomain (char value){
        switch (value) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void convRomain () {
        Scanner console = new Scanner(System.in);
        String value;
        int result = 0;

        System.out.println("Donne moi un numero");
        value = console.nextLine();

        for (int i = 0; i < value.length(); i++) {
            char v = value.charAt(i);
            int valor = verifyRomain(v);

            if (i + 1 < value.length()) {

                char suivant = value.charAt(i + 1);
                int valeurSuivante = verifyRomain(suivant);


                if (valor < valeurSuivante) {
                    result -= valor;
                } else {
                    result += valor;
                }

            } else {
                result += valor;
            }
        }
        System.out.println("Le résultat est : " + result);
    }

    // ------------------------------

    public static int max(int[] value) {
        int maxValue = value[0];

        for (int i = 0; i < value.length; i++) {
            if ( value[i] > maxValue) {
                maxValue = value[i];
            }
        }
        return maxValue;
    }

    public static int min(int[] value) {
        int minValue = value[0];

        for (int i = 0; i < value.length; i++) {
            if ( value[i] < minValue) {
                minValue = value[i];
            }
        }
        return minValue;
    }

    public static int moyenne(int[] value) {

        Arrays.sort(value);

        int index = value.length / 2;
        int m = value[index];

        return m;
    }

    public static double ecartType (int[] value ) {
        double ecart = 0;
        double moyenne = Arrays.stream(value).average().orElse(0);

        for (int i = 0; i < value.length; i++) {
            ecart += Math.pow(value[i] - moyenne, 2);
        }
        return Math.sqrt(ecart / value.length);
    }

    public static void checkArray() {
        int[] numbers = {10, 20, 30, 40, 50};
        int max = max(numbers);
        int min = min(numbers);
        int moyenne = moyenne(numbers);
        double et = ecartType(numbers);

        System.out.println("max -> " + max + "\nmin -> " + min + "\nmoyenne -> " + moyenne + "\necart -> " + et);
    }

    //------------------------------------

    public static void main (String[] args) {

    }
}
