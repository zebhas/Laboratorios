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
public class Computador extends Electronico {
    public enum Sistema
    {
    WINDOWS,LINUX,MAC,UNIX,SOLARIS;
    }
    private Sistema sistemas;
    public Computador(Gama pGama, double pPrecio, Sistema sistema )
    {
    super(pGama, pPrecio);
		sistemas = sistema;
    
    }
    public String toString()
	{
		return "Computador "+sistemas.name()+" - "+"Gama "+gama + " ($ " + precio + ")";
	}
    
}
