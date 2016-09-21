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
public class Motor {
    
    private int qtdPitsao;
    private int potencia;

    public Motor(int qtdPitsao, int potencia) {
        this.qtdPitsao = qtdPitsao;
        this.potencia = potencia;
    }

    public Motor() {
    }
    
    

    /**
     * @return the qtdPitsao
     */
    public int getQtdPitsao() {
        return qtdPitsao;
    }

    /**
     * @param qtdPitsao the qtdPitsao to set
     */
    public void setQtdPitsao(int qtdPitsao) {
        this.qtdPitsao = qtdPitsao;
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
