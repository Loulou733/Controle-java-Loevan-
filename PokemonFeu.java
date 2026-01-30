// classe PokemonFeu qui herite de Pokemon
public class PokemonFeu extends Pokemon {

    // constructeur, on appelle super pour init les attributs du parent
    public PokemonFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    // on redefinit attaquer pour gerer les multiplicateurs de type feu
    @Override
    public void attaquer(Pokemon p) {
        int degats = this.atk;

        // x2 contre plante
        if (p instanceof PokemonPlante) {
            degats = this.atk * 2;
        // x0.5 contre eau et feu
        } else if (p instanceof PokemonEau || p instanceof PokemonFeu) {
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
        return this.nom + " (Type: Feu, HP: " + this.hp + ", ATK: " + this.atk + ")";
    }
}
