/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class VelocException extends Exception {
	public VelocException(){
		System.out.println("\n VelocException");
	}
	
	public void printException(){
		System.out.println("\n A velocidade máxima está fora dos limites brasileiros");
	}
}
