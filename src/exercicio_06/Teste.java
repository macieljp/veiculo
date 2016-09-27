package exercicio_06;
/**
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class Teste{
    public static void main(String[] args) {
        Leitura input = new Leitura();
        int opcao = 10;
        BDVeicVet bd = new BDVeicVet();
        Passeio passeio;
        Carga carga;
        do {
            String entr = input.inDados(
                "\n\t+---------------------------------------------------------------+" +
                "\n\t|\tSistema de Gestão de Veículos - Menu Inicial            |" +
                "\n\t+---------------------------------------------------------------+" +
                "\n\t|\t1)_ Cadastrar Veículo de Passeio                        |" +
                "\n\t|\t2)_ Cadastrar Veículo de Carga                          |" +
                "\n\t|\t3)_ Imprimir Todos os Veículos de Passeio               |" +
                "\n\t|\t4)_ Imprimir Todos os Veículos de Carga                 |" +
                "\n\t|\t5)_ Imprimir Veículo de Passeio pela Placa              |" +
                "\n\t|\t6)_ Imprimir Veículo de Carga pela Placa                |" +
                "\n\t|\t7)_ Alterar dados do Veículo de Passeio pela Placa      |" +
                "\n\t|\t8)_ Alterar dados do Veículo de Carga pela Placa        |" +
                "\n\t|\t9)_ Sair do Sistema                                     |" +
                "\n\t|                                                               |" +
                "\n\t|                                                               |" +
                "\n\t|\tEscolha uma opção:                                      |"
                );
            opcao = Integer.valueOf(entr);
            int result;
            switch (opcao) {
                case 1:
                    passeio = new Passeio();
                    String placa = input.inDados("\nInforme a Placa: ");
                    result = checarVeiculoNaoExistePlaca(bd, placa);
                    if(result == 1){
                        Passeio tempPass = bd.procurarPasseioPorPlaca(placa);
                        tempPass.setMarca(input.inDados("Informe a Marca: "));
                        tempPass.setModelo(input.inDados("Informe o Modelo: "));
                        tempPass.setDataCadastro(input.inDados("Informe a Data do cadastro: "));
                        tempPass.setCor(input.inDados("Informe a cor: "));
                        tempPass.setPlaca(placa);
                        tempPass.setQtdRodas(Integer.parseInt(input.inDados("Informe a Quantidade de rodas: ")));
                        tempPass.setVelocMax(Integer.valueOf(input.inDados("Informar Velocidade Maxima:")));
                        tempPass.setQtdePassageiro(Integer.parseInt(input.inDados("Informe a quantidade de passageiros: ")));
                    }else if(result == 3){
                        passeio.setMarca(input.inDados("Informe a Marca: "));
                        paaseio.setModelo(input.inDados("Informe o Modelo: "));
                        passeio.setDataCadastro(input.inDados("Informe a Data do cadastro: "));
                        passeio.setCor(input.inDados("Informe a cor: "));
                        passeio.setPlaca(placa);
                        passeio.setQtdRodas(Integer.parseInt(input.inDados("Informe a Quantidade de rodas: ")));
                        passeio.setVelocMax(Integer.valueOf(input.inDados("Informar Velocidade Maxima:")));
                        passeio.setQtdePassageiro(Integer.parseInt(input.inDados("Informe a quantidade de passageiros: ")));
                        bd.cadastrarVeiculoPasseio(passeio);
                    }
                    break;

                case 2:
                    carga = new Carga();
                    String placa = input.inDados("\nInforme a Placa: ");
                    result = checarVeiculoNaoExistePlaca(bd, placa);
                    if(result == 2){
                        Carga tempCarg = bd.procurarCargaPorPlaca(placa);
                        tempCarg.setMarca(input.inDados("Informe a Marca: "));
                        tempCarg.setModelo(input.inDados("Informe o Modelo: "));
                        tempCarg.setDataCadastro(input.inDados("Informe a Data do cadastro: "));
                        tempCarg.setCor(input.inDados("Informe a cor: "));
                        tempCarg.setQtdRodas(Integer.parseInt(input.inDados("Informe a Quantidade de rodas: ")));
                        tempCarg.setTara(Integer.parseInt(input.inDados("Informar Valor da Tara:")));
                        tempCarg.setCargaMax(Integer.valueOf(input.inDados("Informar Carga Máxima:")));
                        tempCarg.setVelocMax(Integer.valueOf(input.inDados("Informar Velocidade Maxima:")));
                    }else if(result == 3){
                        carga.setMarca(input.inDados("Informe Marca:"));
                        carga.setModelo(input.inDados("Informe o Modelo: "));
                        carga.setDataCadastro(input.inDados("Informe Data do Cadastro:"));
                        carga.setCor(input.inDados("Informe a Cor:"));
                        carga.setPlaca(placa);
                        carga.setQtdRodas(Integer.parseInt(input.inDados("Informar Quantidade de rodas:")));
                        carga.setTara(Integer.parseInt(input.inDados("Informar Valor da Tara:")));
                        carga.setCargaMax(Integer.valueOf(input.inDados("Informar Carga Máxima:")));
                        carga.setVelocMax(Integer.valueOf(input.inDados("Informar Velocidade Maxima:")));
                        bd.cadastrarVeiculoCarga(carga);
                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    passeio = new Passeio();
                    passeio.setMarca(input.inDados("Informe a Marca do veiculo: "));
                    passeio.setDataCadastro(input.inDados("Informe a Data do cadastro do veiculo: "));
                    passeio.setCor(input.inDados("Informe a cor do veiculo: "));
                    passeio.setPlaca(input.inDados("Informe a Placa do veiculo: "));
                    passeio.setQtdRodas(Integer.parseInt(input.inDados("Informe a Quantidade de rodas do veiculo: ")));
                    passeio.setQtdePassageiro(Integer.parseInt(input.inDados("Informe a quantidade de passageiros do veiculo: ")));
                    bd.alterarDadosPasseio(passeio, valor);
                    break;

                case 8:
                    carga = new Carga();
                    carga.setCargaMax(Integer.valueOf(input.inDados("Informar Carga Máxima ")));
                    carga.setCor(input.inDados("Informar Cor do Vaiculo de Carga"));
                    carga.setDataCadastro(input.inDados("Informar Data do Cadastro do Vaiculo de Carga"));
                    carga.setMarca(input.inDados("Informar Marca do Vaiculo de Carga"));
                    carga.setPlaca(input.inDados("Informar a Placa do Vaiculo de Carga"));
                    carga.setQtdRodas(Integer.parseInt(input.inDados("Informar Quantidade de rodas do Vaiculo de Carga")));
                    carga.setTara(Integer.parseInt(input.inDados("Informar Valor da Tara do Vaiculo de Carga")));
                    carga.setVelocMax(Integer.valueOf(input.inDados("Informar Velocidade Maxima do Vaiculo de Carga")));
                    bd.alterarDadosCarga(carga, valor);
                    break;

                case 9:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (opcao < 9);
    }

    /*
    Retorna 0 se houver algum veículo com a placa, 1 se puder sobrescrever Passeio ou 2 para Carga, 3 se puder adicionar um novo
    e imprime o veículo juntamente com a pergunta se dejesa sobrescrever caso exista.
    */
    private int checarVeiculoNaoExistePlaca(BDVeicVet bd, String placa){
        int sobrescrever = 3;
        Passeio tempPass = bd.procurarPasseioPorPlaca(placa);
        Carga tempCarg = bd.procurarCargaPorPlaca(placa);
        if(tempPass != null){
            sobrescrever = Integer.valueOf( input.inDados("\nPasseio existente com esta placa:"+ tempPass.getPlaca() +
                            "\nMarca: " + tempPass.getMarca() +
                            "\nModelo: " + tempPass.getModelo() +
                            "\nDataCadastro: " + tempPass.getDataCadastro() +
                            "\nCor: " + tempPass.getCor() +
                            "\nQuantidade rodas: " + String.valueOf( tempPass.getQtdRodas() ) +
                            "\nVelocidade máxima: " + String.valueOf( tempPass.getVelocMax() ) +
                            "\nQuantidade passageiros: " + String.valueOf( tempPass.getQtdePassageiro() ) +
                            "\nsobrescrever o veiculo?\n 1 para sim ou 0 para não"
                            ) );
        }else
        if(tempCarg != null){
            sobrescrever = Integer.valueOf( input.inDados("\nCarga existente com esta placa:" + tempCarg.getPlaca() +
                        "\nMarca: " + tempCarg.getMarca() +
                        "\nModelo: " + tempCarg.getModelo() +
                        "\nDataCadastro: " + tempCarg.getDataCadastro() +
                        "\nCor: " + tempCarg.getCor() +
                        "\nQuantidade rodas: " + String.valueOf( tempCarg.getQtdRodas() ) +
                        "\nVelocidade máxima: " + String.valueOf( tempCarg.getVelocMax() ) +
                        "\nTara: " + String.valueOf( tempCarg.getTara() ) +
                        "\nCarga máxima: " + String.valueOf( tempCarg.getCargaMax() ) +
                        "\nsobrescrever o veiculo?\n 1 para sim ou 0 para não"
                    ) );
            if(sobrescrever > 0) sobrescrever = 2;
        }
        return sobrescrever;
    }
}
