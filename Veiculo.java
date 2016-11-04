/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public abstract class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    private String dataCadastro;

    private Motor motor;

    public Veiculo() {
        motor = new Motor();
    }

    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        this.velocMax = velocMax;
        this.motor = motor;
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the Placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the Cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param Cor the Cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the QtdRodas
     */
    public int getQtdRodas() {
        return qtdRodas;
    }

    /**
     * @param QtdRodas the QtdRodas to set
     */
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    /**
     * @return the VelocMax
     */
    public int getVelocMax() {
        return velocMax;
    }

    /**
     * @param VelocMax the VelocMax to set
     */
    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * @return the DataCadastro
     */
    public String getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param DataCadastro the DataCadastro to set
     */
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public abstract int calcVel();

}
