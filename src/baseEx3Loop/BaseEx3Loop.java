package baseEx3Loop;
import java.util.Scanner;

public class BaseEx3Loop {

    public static void main(String[] args) {
        int nombre = 0;
        boolean saisieValide = false;

        // --- Lecture à partir des arguments ---
        if (args.length > 0) {
            // On parcourt tous les arguments (au cas où il y en aurait plusieurs)
            for (String arg : args) {
                try {
                    nombre = Integer.parseInt(arg);
                    saisieValide = true;
                    break; // On prend le premier entier valide et on sort
                } catch (NumberFormatException e) {
                    System.out.println("Erreur : l'argument \"" + arg + "\" n'est pas un entier !");
                }
            }
        }

        // --- Si aucun argument valide, on demande à l'utilisateur ---
        if (!saisieValide) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un nombre entier : ");

            if (scanner.hasNextInt()) {
                nombre = scanner.nextInt();
                saisieValide = true;
            } else {
                System.out.println("Erreur : la valeur saisie n'est pas un entier !");
            }

            scanner.close();
        }

        // --- Affichage du résultat ---
        if (saisieValide) {
            if (nombre > 0) {
                System.out.println("Le nombre est positif.");
            } else if (nombre < 0) {
                System.out.println("Le nombre est négatif.");
            } else {
                System.out.println("Le nombre est nul.");
            }

            if (nombre % 2 == 0) {
                System.out.println("Le nombre est pair.");
            } else {
                System.out.println("Le nombre est impair.");
            }
        }
    }
}
