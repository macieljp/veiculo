package exercicio_06;
/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class  Carga extends Veiculo implements Calc{
    private int tara;
    private int cargaMax;

    /*
    Embora as velocidades sempre sejam armazenadas em Km/h, porém, apenas para efeito de
exibição, por
meio da classe Teste:
- a velocidade do carro de passeio deverá ser calculada e exibida em M/h (metros por hora);
- a velocidade do caminhão deverá ser calculada e exibida em Cm/h (centímetros por hora);
    */
    @Override
    public int calcVel(){
        return velocMax * 100000;
    }

    public int calcular(){
    	return getQtdRodas() + getVelocMax();
    }

    public void setTara(int tara){
        this.tara = tara;
    }

    public int getTara(){
        return tara;
    }

    public void setCargaMax(int cargaMax){
        this.cargaMax = cargaMax;
    }

    public int getCargaMax(){
        return cargaMax;
    }

}
