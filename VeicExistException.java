/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class VeicExistException extends Exception {
    public VeicExistException(){
        System.out.println("\n Exceção lançada por VeicExistException");
    }

	public void printException() {
		System.out.println("\n Já existe um veículo com esta placa. \n");
	}
    
}
