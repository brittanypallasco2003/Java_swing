package interfaz_grafica;

public class Pokemon {
    //atributos
    private int ataque;
    private int vida;

    public Pokemon(int ataque, int vida) {
        this.ataque = ataque;
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(Pokemon pokemonRival){
        // el pokemon  al atacar le quita vida al pokemon rival, en base al nivel de ataque si el ataque es 10, le resta 10 de vida al pokemon rival
        int danio=pokemonRival.getVida()-getAtaque();
        pokemonRival.setVida(danio);

        //esto permite que la vida que se muestre en pantalla si al final pierde no muestre numeros negativos
        if (pokemonRival.getVida()<=0){
            pokemonRival.setVida(0);
        }
    }

}
