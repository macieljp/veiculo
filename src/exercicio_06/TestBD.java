//TODO REMOVER CLASSE FORA DO PROJETO
public class TestBD{
    public static void main(String[] args) {
        BDVeicVet db = new BDVeicVet();

        for (int i = 0; i < 10;i++ ) {
            Carga veic1 = new Carga();
            veic1.setPlaca(i+"2344321");
            veic1.setMarca("BMW");
            veic1.setModelo("a234");
            veic1.setCor("Prata");
            veic1.setQtdRodas(i);
            veic1.setVelocMax(430);
            veic1.setDataCadastro("24/09");
//            veic1.setQtdePassageiro(4);

            db.cadastrarVeiculoCarga(veic1);
        }

        Carga veic = db.procurarCargaPorPlaca("12344321");
//        System.out.println("passageiro = " + veic.getQtdePassageiro());
        veic.setCor("Azul");
        Carga[] vetorP = db.procurarTodosCarga();
        for(Carga carga: vetorP){
            System.out.println("result = " + carga.getCor());
        }
        Carga veic1 = new Carga();
        veic1.setPlaca("2344321");
        veic1.setMarca("BMW");
        veic1.setModelo("a234");
        veic1.setCor("Roxo");
        veic1.setQtdRodas(9);
        veic1.setVelocMax(430);
        veic1.setDataCadastro("24/09");
//            veic1.setQtdePassageiro(4);
        db.cadastrarVeiculoCarga(veic1);


        vetorP = db.procurarTodosCarga();
        for(Carga carga: vetorP){
            System.out.println("result = " + carga.getCor());
        }

    }
}
