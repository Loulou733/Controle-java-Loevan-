// classe de base pokemon
public class Pokemon {
    // attributs en protected pour que les classes enfants puissent y acceder
    protected String nom;
    protected int hp;
    protected int atk;

    // constructeur qui init les attributs
    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    // retourne true si le pokemon est mort (hp <= 0)
    public boolean isDead() {
        return this.hp <= 0;
    }

    // le pokemon attaque un autre pokemon et lui enleve des hp
    public void attaquer(Pokemon p) {
        System.out.println(this.nom + " attaque " + p.nom + " et inflige " + this.atk + " degats !");
        p.hp -= this.atk;
        if (p.isDead()) {
            System.out.println(p.nom + " est K.O. !");
        }
    }

    // affiche les infos du pokemon
    public String toString() {
        return this.nom + " (HP: " + this.hp + ", ATK: " + this.atk + ")";
    }
}
