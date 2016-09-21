/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_04;

/**
 *
 * @author JoaoPaulo
 */
public class Teste {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        veiculo.getMotor().setPotencia(12);

        System.out.println(veiculo.getMotor().getPotencia());

    }

}
