package Client;
import java.util.Scanner;
import Fabricas.FabricaPerifericos;
import Fabricas.FabricaRazer;
import Fabricas.FabricaRedDragon;
import Mouse.Mouse;
import Teclado.Teclado;


/**
 * Classe Client que utiliza a aplicação
 */
public class Client {
    private Mouse mouse;

    private Teclado teclado;




    public Client (FabricaPerifericos fabricaPerifericos) {
        mouse = fabricaPerifericos.createMouse();
        teclado = fabricaPerifericos.createTeclado();
    }

    public void create() {
        mouse.create();
        teclado.create();
    }




}
