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
public class Casillero<T> {

    private T producto;

    public Casillero() {
        producto = null;
    }

    public boolean agregar(T pProducto) {
        if (producto == null) {
            producto = pProducto;
            return true;
        }
        return false;
    }

    public T darProducto() {
        return producto;
    }

    public T despachar() {
        T nObjeto = producto;
        producto = null;
        return nObjeto;
    }

    public boolean estaDesocupado() {
        return producto == null;
    }
}