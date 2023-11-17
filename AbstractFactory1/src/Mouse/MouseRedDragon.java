package Mouse;
/**
 * Fábrica concreta de 1 das variantes do produto
 */
public class MouseRedDragon implements Mouse{
    @Override
    public void create() {
        System.out.println("Você fabricou um mouse da marca Red Dragon!");
    }
}
