/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class Motor {
    private int qtdPistoes;
    private int potencia;

    public Motor() {
    }

    public Motor(int qtdPistoes, int potencia) {
        this.qtdPistoes = qtdPistoes;
        this.potencia = potencia;
    }

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
