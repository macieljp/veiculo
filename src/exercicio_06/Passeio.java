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
public class Passeio extends Veiculo implements Calc{

    public int calcular(){
    	return Placa.replace(" ", "").trim().length() + 
	    	Marca.replace(" ", "").trim().length() +
	    	Modelo.replace(" ", "").trim().length() + 
	    	Cor.replace(" ", "").trim().length();
    }

}
