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
public class Vestuario extends Producto{
	
	public enum Talla{
		
		XS, S, M, L, XL, XXL, XXXL
	}
	
	protected Talla talla;
	
	public Vestuario(Talla pTalla, double pPrecio)
	{
		super(pPrecio);
		talla = pTalla;
		
	}

}