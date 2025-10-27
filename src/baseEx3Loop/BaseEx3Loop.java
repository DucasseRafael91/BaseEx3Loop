package baseEx3Loop;
import java.util.Scanner;

public class BaseEx3Loop {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Entrez un nombre entier : ");

	        // Vérifie si la saisie est bien un entier
	        if (scanner.hasNextInt()) {
	            int nombre = scanner.nextInt();

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
	        } else {
	            System.out.println("La valeur n'est pas un entier");
	        }

	        scanner.close();
	    }

}
