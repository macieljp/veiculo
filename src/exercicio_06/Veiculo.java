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
public abstract class Veiculo {

    private String Placa;
    private String Marca;
    private String Modelo;
    private String Cor;
    private int QtdRodas;
    private int VelocMax;

    private String DataCadastro;
    TstPlaca teste = new TstPlaca();
    private Motor motor = new Motor();

    public Veiculo() {
    }

    public Veiculo(String Placa, String Marca, String Modelo, String Cor, int QtdRodas, int VelocMax, Motor motor, String DataCadastro) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Cor = Cor;
        this.QtdRodas = QtdRodas;
        this.VelocMax = VelocMax;
        this.motor = motor;
        this.DataCadastro = DataCadastro;
    }

    /**
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Cor
     */
    public String getCor() {
        return Cor;
    }

    /**
     * @param Cor the Cor to set
     */
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    /**
     * @return the QtdRodas
     */
    public int getQtdRodas() {
        return QtdRodas;
    }

    /**
     * @param QtdRodas the QtdRodas to set
     */
    public void setQtdRodas(int QtdRodas) {
        this.QtdRodas = QtdRodas;
    }

    /**
     * @return the VelocMax
     */
    public int getVelocMax() {
        return VelocMax;
    }

    /**
     * @param VelocMax the VelocMax to set
     */
    public void setVelocMax(int VelocMax) {
        this.VelocMax = VelocMax;
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
        return DataCadastro;
    }

    /**
     * @param DataCadastro the DataCadastro to set
     */
    public void setDataCadastro(String DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

}
