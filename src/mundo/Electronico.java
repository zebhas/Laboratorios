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
public class Electronico extends Producto{
	
	public enum  Gama {
		ALTA, MEDIA, BAJA
	}
	
	protected Gama gama;
	
	public Electronico(Gama pGama,double pPrecio)
	{
		super(pPrecio);
		gama = pGama;
	}

}