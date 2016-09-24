/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_06;

/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class  Carga extends Veiculo implements Calc{
    private int tara;
    private int cargaMax;

    public int calcular(){
    	return qtdRodas + velocMax;
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
