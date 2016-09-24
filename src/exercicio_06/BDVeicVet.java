package exercicio_06;
/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class BDVeicVet {
    private Passeio[] passeio;
    private Carga[] carga;

    public BDVeicVet(){
        passeio = new Passeio[50];
        carga = new Carga[50];
    }

    /*
     *1)_ Cadastrar Veículo de Passeio
     */
    public void cadastrarVeiculoPasseio(Passeio passeio){
        this.passeio[getPosicaoPasseio()] = passeio;
    }

    /*
     *2)_ Cadastrar Veículo de Carga
     */
    public void cadastrarVeiculoCarga(Carga carga){
        this.carga[getPosicaoCarga()] = carga;
    }

    /*
     *3)_ Imprimir Todos os Veículos de Passeio
     */
    public Passeio[] procurarTodosPasseio(){
        int max = getPosicaoPasseio();
        Passeio[] result = new Passeio[max];
        for (int i = 0; i < max ; i++ ) {
            result[i] = passeio[i];
        }
        return result;
    }

    /*
     *4)_ Imprimir Todos os Veículos de Carga
     */
    public Carga[] procurarTodosCarga(){
        int max = getPosicaoCarga();
        Carga[] result = new Carga[max];
        for (int i = 0; i < max ; i++ ) {
            result[i] = carga[i];
        }
        return result;
    }

    /*
     *5)_ Imprimir Veículo de Passeio pela Placa
     */
    public Passeio procurarPasseioPorPlaca(String placa){
        placa = placa.trim();
        for (int i = 0, max = getPosicaoPasseio(); i < max; i++) {
            if (passeio[i].getPlaca().equals(placa)) {
                return passeio[i];
            }
        }
        return null;
    }

    /*
     *6)_ Imprimir Veículo de Carga pela Placa
     */
    public Carga procurarCargaPorPlaca(String placa){
        placa = placa.trim();
        for (int i = 0, max = getPosicaoCarga(); i < max; i++) {
            if(carga[i].getPlaca().equals(placa)){
                return carga[i];
            }
        }
        return null;
    }

    /*
     *7)_ Alterar dados do Veículo de Passeio pela Placa
     */
    public void alterarDadosPasseio(Passeio passeio, String placa){
        Passeio temp = procurarPasseioPorPlaca(placa);
        if(temp != null){
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
    }

    /*
     *8)_ Alterar dados do Veículo de Carga pela Placa
     */
    public void alterarDadosCarga(Carga carga, String placa){
        Carga temp = procurarCargaPorPlaca(placa);
        if(temp != null){
            temp.setPlaca(carga.getPlaca());
            temp.setMarca(carga.getMarca());
            temp.setModelo(carga.getModelo());
            temp.setCor(carga.getCor());
            temp.setMotor(carga.getMotor());
            temp.setQtdRodas(carga.getQtdRodas());
            temp.setVelocMax(carga.getVelocMax());
            temp.setDataCadastro(carga.getDataCadastro());
        }
    }

    /****** Utilitários ******/

    /*
     *Retorna a posição da próxima inserção
     */
    private int getPosicaoPasseio(){
        int i = 0;
        for (Passeio passV : passeio ) {
            if(passV == null) return i;
            i++;
        }
        return i;
    }

    /*
     *Retorna a posição da próxima inserção
     */
    private int getPosicaoCarga(){
        int i = 0;
        for(Carga cargV : carga){
            if(cargV == null) return i;
            i++;
        }
        return i;
    }

}
