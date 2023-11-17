package Teclado;

/**
 * Fábrica concreta de 1 das variantes do produto
 */
public class TecladoRedDragon implements Teclado {
    @Override
    public void create() {
        System.out.println("Você fabricou um teclado da marca Red Dragon!");
    }
}
