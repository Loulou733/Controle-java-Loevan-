// classe principale pour tester les combats pokemon
public class main {
    public static void main(String[] args) {

        // on cree des pokemon de chaque type
        PokemonFeu salameche = new PokemonFeu("Salameche", 100, 20);
        PokemonEau carapuce = new PokemonEau("Carapuce", 100, 20);
        PokemonPlante bulbizarre = new PokemonPlante("Bulbizarre", 100, 20);
        Pokemon pikachu = new Pokemon("Pikachu", 100, 20);

        // on affiche l'etat de chaque pokemon avant le combat
        System.out.println("=== Etat initial ===");
        System.out.println(salameche);
        System.out.println(carapuce);
        System.out.println(bulbizarre);
        System.out.println(pikachu);

        // combat 1 : feu contre eau (x0.5 pour feu, x2 pour eau)
        System.out.println("\n=== Combat 1 : Salameche vs Carapuce ===");
        salameche.attaquer(carapuce);
        System.out.println(carapuce);
        carapuce.attaquer(salameche);
        System.out.println(salameche);

        // combat 2 : feu contre plante (x2 pour feu)
        System.out.println("\n=== Combat 2 : Salameche vs Bulbizarre ===");
        salameche.attaquer(bulbizarre);
        System.out.println(bulbizarre);

        // combat 3 : plante contre eau (x2 pour plante)
        System.out.println("\n=== Combat 3 : Bulbizarre vs Carapuce ===");
        bulbizarre.attaquer(carapuce);
        System.out.println(carapuce);

        // combat 4 : type normal contre type feu (x1, pas de bonus)
        System.out.println("\n=== Combat 4 : Pikachu vs Salameche ===");
        pikachu.attaquer(salameche);
        System.out.println(salameche);

        // simulation d'un combat jusqu'a K.O. entre carapuce et salameche
        System.out.println("\n=== Combat final : Carapuce vs Salameche (jusqu'au K.O.) ===");

        // on remet les hp pour le combat final
        PokemonFeu sala = new PokemonFeu("Salameche", 100, 20);
        PokemonEau cara = new PokemonEau("Carapuce", 100, 20);

        // boucle tant que les deux sont en vie
        while (!sala.isDead() && !cara.isDead()) {
            cara.attaquer(sala);
            if (sala.isDead()) {
                break;
            }
            sala.attaquer(cara);
        }

        // on affiche le vainqueur
        System.out.println("\n=== Resultat ===");
        System.out.println(sala);
        System.out.println(cara);

        if (sala.isDead()) {
            System.out.println(cara.toString().split(" ")[0] + " a gagne !");
        } else {
            System.out.println(sala.toString().split(" ")[0] + " a gagne !");
        }
    }
}
