import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Joao Paulo Bernardino Maciel
 * @author Josiel Faleiros Alves
 */
public class Leitura {

    /*
    - receberá uma String @entrada como parâmetro: esta será impressa na tela como informação ao usuário de que
        dado do veiculo ele está informando ao sistema;
    - retornará uma String: valor informado pelo usuário para aquele dado.
    */
    public String inDados(String entrada){
        System.out.println(entrada);

        String info = "";
        BufferedReader memoria = new BufferedReader(new InputStreamReader(System.in));
        try{
            info = memoria.readLine();
        }
        catch(IOException objIO){
            System.out.println("\n erro de sistema");
        }
        return info;
    }

}
