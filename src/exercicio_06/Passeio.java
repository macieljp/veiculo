package exercicio_06;
/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class Passeio extends Veiculo implements Calc{
    private int qtdePassageiro;

    public int calcular(){
    	return getPlaca().replace(" ", "").trim().length() +
	    	getMarca().replace(" ", "").trim().length() +
	    	getModelo().replace(" ", "").trim().length() +
	    	getCor().replace(" ", "").trim().length();
    }

    @Override
    public int calcVel(){
        //TODO
        return 0;
    }

    public void setQtdePassageiro(int qtdePassageiro){
        this.qtdePassageiro = qtdePassageiro;
    }

    public int getQtdePassageiro(){
        return qtdePassageiro;
    }

}
