/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Guest
 */
public class Casilleros<T> {

    private Casillero<T> c1;
    private Casillero<T> c2;

    public Casilleros() {
        c1 = new Casillero<>();
        c2 = new Casillero<>();
    }

    public int almacenar(T producto) {
        if (c1.estaDesocupado()) {
            c1.agregar(producto);
            return 1;
        } else if (c2.estaDesocupado()) {
            c2.agregar(producto);
            return 2;
        }
        return -1;
    }

    public T despachar(int num) {
        switch (num) {
            case 1:
                return c1.despachar();
            case 2:
                return c2.despachar();
        }
        return null;
    }

    public void verProductos() {
        if (c1.darProducto() != null) {
            System.out.println("[Casillero 1] " + c1.darProducto().toString());
        } else {
            System.out.println("[Casillero 1] Vacío");
        }

        if (c2.darProducto() != null) {
            System.out.println("[Casillero 2] " + c2.darProducto().toString());
        } else {
            System.out.println("[Casillero 2] Vacío");
        }
    }
}