/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_06;

/**
 *
 * @author JoaoPaulo
 */
public class Motor {

    public Motor() {
    }

    public Motor(int qtdPistoes, int potencia) {
        this.qtdPistoes = qtdPistoes;
        this.potencia = potencia;
    }
    
    

    private int qtdPistoes;
    private int potencia;

    /**
     * @return the qtdPistoes
     */
    public int getQtdPistoes() {
        return qtdPistoes;
    }

    /**
     * @param qtdPistoes the qtdPistoes to set
     */
    public void setQtdPistoes(int qtdPistoes) {
        this.qtdPistoes = qtdPistoes;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
