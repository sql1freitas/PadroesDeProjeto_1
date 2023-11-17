package Fabricas;

import Mouse.Mouse;
import Teclado.Teclado;

/**
 * Fábrica abstrata que abriga os 2 tipos de produtos
 */

public interface FabricaPerifericos {
    Mouse createMouse();
    Teclado createTeclado();


}
