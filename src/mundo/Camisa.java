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
public class Camisa extends Vestuario {

    public enum Marca {
        GEF, POLO, NAUTICA
    }

    private Marca marca;

    public Camisa(Marca pMarca, Talla pTalla, double pPrecio) {
        super(pTalla, pPrecio);
        marca = pMarca;
    }

    @Override
    public String toString() {
        return "Camisa " + marca + " Talla " + talla + " ($ " + precio + ")";
    }
}


