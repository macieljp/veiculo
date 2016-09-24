package exercicio_06;
/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class  Carga extends Veiculo implements Calc{
    private int tara;
    private int cargaMax;

    @Override
    public int calcVel(){
        //TODO
        return 0;
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
