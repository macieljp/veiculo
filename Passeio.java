/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class Passeio extends Veiculo{
    private int qtdePassageiro;

    public int calcular(){
    	return getPlaca().replace(" ", "").trim().length() +
	    	getMarca().replace(" ", "").trim().length() +
	    	getModelo().replace(" ", "").trim().length() +
	    	getCor().replace(" ", "").trim().length();
    }

    /*
    Embora as velocidades sempre sejam armazenadas em Km/h, porém, apenas para efeito de
exibição, por
meio da classe Teste:
- a velocidade do carro de passeio deverá ser calculada e exibida em M/h (metros por hora);
- a velocidade do caminhão deverá ser calculada e exibida em Cm/h (centímetros por hora);
    */
    @Override
    public int calcVel(){
        return getVelocMax() * 1000;
    }

    public void setQtdePassageiro(int qtdePassageiro){
        this.qtdePassageiro = qtdePassageiro;
    }

    public int getQtdePassageiro(){
        return qtdePassageiro;
    }

}
