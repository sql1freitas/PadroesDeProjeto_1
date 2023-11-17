package Fabricas;

import Mouse.Mouse;
import Teclado.Teclado;
import Teclado.TecladoRedDragon;
import Mouse.MouseRedDragon;

/**
 * Fábrica concreta variante dos produtos
 */


public class FabricaRedDragon implements FabricaPerifericos{
    @Override
    public Mouse createMouse() {
        return new MouseRedDragon();
    }

    @Override
    public Teclado createTeclado() {
        return new TecladoRedDragon();
    }
}
