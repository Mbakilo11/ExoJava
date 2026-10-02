import java.util.HashMap;
import java.util.Map;

public class ContactData {
    Map<String, String[]> contacts = new HashMap<>();


    public void Resgister (
            String name,
            String tel,
            String email,
            String ville
            ) {
        contacts.put(name, new String[]{
                tel,
                email,
                ville
        });
        System.out.println("Contact sauvegarder!");
    }

    public void searchName (String name) {
        for (Map.Entry<String, String[]> contact : contacts.entrySet()) {
            String nom = contact.getKey();
            String[] infos = contact.getValue();

            if (nom.equalsIgnoreCase(name)) {
                System.out.println("Nom: " + nom);
                System.out.println("Tel: " + infos[0]);
                System.out.println("Email: " + infos[1]);
                System.out.println("Ville: " + infos[2]);
                System.out.println("______________________________________");
            } else{
                System.out.println("Aucun contact trouvé.");
            }
        }
    }

    public void filterByCity (String ville){
        for (Map.Entry<String, String[]> contact : contacts.entrySet()) {
            String nom = contact.getKey();
            String[] infos = contact.getValue();

            if (infos[2].equals(ville)) {
                System.out.print("Nom: " + nom + ", ");
                return;
            }else {
                System.out.println("Contact non trouvé.");
            }
        }
    }

    public void deleteContact(String name) {
        for (Map.Entry<String, String[]> contact : contacts.entrySet()) {
            String nom = contact.getKey();
            String[] infos = contact.getValue();

            if (nom.equals(name)) {
                contacts.remove(name);
                System.out.println("Success");
                return;
            } else {
                System.out.println("Contact non trouvé.");
            }
        }
    }

    public void showAll () {
        for (Map.Entry<String, String[]> contact : contacts.entrySet()) {
            String name = contact.getKey();
            String[] infos = contact.getValue();

            System.out.println("Nom: " + name);
            System.out.println("Tel: " + infos[0]);
            System.out.println("Email: " + infos[1]);
            System.out.println("Ville: " + infos[2]);
            System.out.println("______________________________________");
        }
    }
}
