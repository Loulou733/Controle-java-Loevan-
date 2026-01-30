// classe PokemonPlante qui herite de Pokemon
public class PokemonPlante extends Pokemon {

    // constructeur, on appelle super pour init les attributs du parent
    public PokemonPlante(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    // on redefinit attaquer pour gerer les multiplicateurs de type plante
    @Override
    public void attaquer(Pokemon p) {
        int degats = this.atk;

        // x2 contre eau
        if (p instanceof PokemonEau) {
            degats = this.atk * 2;
        // x0.5 contre plante et feu
        } else if (p instanceof PokemonPlante || p instanceof PokemonFeu) {
            degats = this.atk / 2;
        }
        // x1 contre pokemon normal, on change rien

        System.out.println(this.nom + " attaque " + p.nom + " et inflige " + degats + " degats !");
        p.hp -= degats;
        if (p.isDead()) {
            System.out.println(p.nom + " est K.O. !");
        }
    }

    // on redefinit toString pour afficher le type
    @Override
    public String toString() {
        return this.nom + " (Type: Plante, HP: " + this.hp + ", ATK: " + this.atk + ")";
    }
}
