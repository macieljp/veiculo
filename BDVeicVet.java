import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class BDVeicVet {
    private List<Passeio> passeio;
    private List<Carga> carga;

    public BDVeicVet(){
        passeio = new ArrayList<Passeio>();
        carga = new ArrayList<Carga>();
    }

    /*
     *1)_ Cadastrar Veículo de Passeio
     */
    public void cadastrarVeiculoPasseio(Passeio passeio){
        this.passeio.add(passeio);
    }

    /*
     *2)_ Cadastrar Veículo de Carga
     */
    public void cadastrarVeiculoCarga(Carga carga){
        this.carga.add(carga);
    }

    /*
     *3)_ Imprimir Todos os Veículos de Passeio
     */
    public List<Passeio> procurarTodosPasseio(){
        return passeio;
    }

    /*
     *4)_ Imprimir Todos os Veículos de Carga
     */
    public List<Carga> procurarTodosCarga(){
        return carga;
    }

    /*
     *5)_ Imprimir Veículo de Passeio pela Placa
     */
    public Passeio procurarPasseioPorPlaca(String placa){
        for (Passeio pass : passeio) {
        	if(pass.equals(placa)) return pass;
        }
        return null;
    }

    /*
     *6)_ Imprimir Veículo de Carga pela Placa
     */
    public Carga procurarCargaPorPlaca(String placa){
        for (Carga temp : carga) {
        	if(temp.equals(placa)) return temp;
        }
        return null;
    }

    /*
     *7)_ Alterar dados do Veículo de Passeio pela Placa
     */
    public void alterarDadosPasseio(Passeio passeio){
        Passeio temp = procurarPasseioPorPlaca(passeio.getPlaca());
        if(temp != null){
            temp.setQtdePassageiro(passeio.getQtdePassageiro());
            temp.setMarca(passeio.getMarca());
            temp.setModelo(passeio.getModelo());
            temp.setCor(passeio.getCor());
            temp.setMotor(passeio.getMotor());
            temp.setQtdRodas(passeio.getQtdRodas());
            temp.setVelocMax(passeio.getVelocMax());
            temp.setQtdePassageiro(passeio.getQtdePassageiro());
        }
    }

    /*
     *8)_ Alterar dados do Veículo de Carga pela Placa
     */
    public void alterarDadosCarga(Carga carga){
        Carga temp = procurarCargaPorPlaca(carga.getPlaca());
        if(temp != null){
            temp.setPlaca(carga.getPlaca());
            temp.setMarca(carga.getMarca());
            temp.setModelo(carga.getModelo());
            temp.setCor(carga.getCor());
            temp.setMotor(carga.getMotor());
            temp.setQtdRodas(carga.getQtdRodas());
            temp.setVelocMax(carga.getVelocMax());
            temp.setTara(carga.getTara());
            temp.setCargaMax(carga.getCargaMax());
        }
    }

}
