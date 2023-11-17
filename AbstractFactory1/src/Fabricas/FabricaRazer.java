package Fabricas;

import Mouse.Mouse;
import Teclado.Teclado;
import Teclado.TecladoRazer;
import Mouse.MouseRazer;

/**
 * Fábrica concreta variante dos produtos
 */
public class FabricaRazer implements FabricaPerifericos{
    @Override
    public Mouse createMouse() {
        return new MouseRazer();
    }

    @Override
    public Teclado createTeclado() {
        return new TecladoRazer();
    }
}
