package exercicio_06;

/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class BDVeicVet {
    private Passeio[] passeio = new Passeio[50];
    private Carga[] carga = new Carga[50];

    /*
     *1)_ Cadastrar Veículo de Passeio
     */
    public void cadastrarVeiculoPasseio(Passeio passeio){
        this.passeio[this.passeio.length()] = passeio;
    }

    /*
     *2)_ Cadastrar Veículo de Carga
     */
    public void cadastrarVeiculoCarga(Carga carga){
        this.carga[this.carga.length()] = carga;
    }

    /*
     *3)_ Imprimir Todos os Veículos de Passeio
     */
    public Passeio[] procurarTodosPasseio(){
        return passeio;
    }

    /*
     *4)_ Imprimir Todos os Veículos de Carga
     */
    public Carga[] procurarTodosCarga(){
        return carga;
    }

    /*
     *5)_ Imprimir Veículo de Passeio pela Placa
     */
    public Passeio procurarPasseioPorPlaca(String placa){
        placa = placa.trim();
        for (Passeio passV : passeio) {
            if (passV.getPlaca().equals(placa)) {
                return passV;
            }
        }
        return null;
    }

    /*
     *6)_ Imprimir Veículo de Carga pela Placa
     */
    public Carga procurarCargaPorPlaca(String placa){
        placa = placa.trim();
        for (Carga cargV: carga ) {
            if(cargV.getPlaca().equals(placa)){
                return cargV;
            }
        }
        return null;
    }

    /*
     *7)_ Alterar dados do Veículo de Passeio pela Placa
     */
    public void alterarDadosPasseio(Passeio passeio, String placa){
        if(Passeio temp = procurarPasseioPorPlaca(placa)){
            temp.setQtdePassageiro(passeio.getQtdePassageiro());
            temp.setPlaca(passeio.getPlaca());
            temp.setMarca(passeio.getMarca());
            temp.setModelo(passeio.getModelo());
            temp.setCor(passeio.getCor());
            temp.setMotor(passeio.getMotor());
            temp.setQtdRodas(passeio.getQtdRodas());
            temp.setVelocMax(passeio.getVelocMax());
            temp.setDataCadastro(passeio.getDataCadastro());
        }
        return null;
    }

    /*
     *8)_ Alterar dados do Veículo de Carga pela Placa
     */
    public void alterarDadosCarga(Carga carga, String placa){
        if(Carga temp = procurarCargaPorPlaca(placa)){
            temp.setPlaca(carga.getPlaca());
            temp.setMarca(carga.getMarca());
            temp.setModelo(carga.getModelo());
            temp.setCor(carga.getCor());
            temp.setMotor(carga.getMotor());
            temp.setQtdRodas(carga.getQtdRodas());
            temp.setVelocMax(carga.getVelocMax());
            temp.setDataCadastro(carga.getDataCadastro());
        }
        return null;
    }
}
