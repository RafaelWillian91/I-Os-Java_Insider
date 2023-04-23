package Classes_Reader_Writter_Input_OutPut.LendoDadosConsole;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsoleReadapp {

    public static void main(String[] args) throws IOException {

        //Para fazer os dados serem impressos na tela, usamos o System.out para ler os dados usamos o System.in que é uma InputStream
        //new InputStreamReader(System.in); dessa forma temos a leitura de caracter por caracter, mas seria mais interessante a leitura
        //da linha completa, então foi usado a classe BUffer
//       try(BufferedReader bf = new BufferedReader (new InputStreamReader(System.in)) {
//           String bfGerator = bf.readLine();
//       }

        //Uma outra estratégia seria usar um scanner
        try(Scanner sc1 = new Scanner(System.in)) {
            String scGerada = sc1.nextLine();//O método nextLine trava o sistema esperando o System.in receber a informação
        }

     try(PrintWriter pf = new PrintWriter("examples/arqGerado.txt", StandardCharsets.UTF_8)) {
        //Quando Ocorre o fechamento do tryWithResorces voce perde o acesso as variáveis. Podemos colocar dentro de um unico Try.
        //pf.println(bfGerator);
        //pf.println(scGerada);
        //pf.close();Fechamento automático ao usar tryWithResorces
     }
        //É muito importante usar o TryWithResource para garantir o fechamento do canal de comunicacao. Para não usar recurso do SO
        //E deixar que outras aplicaçoes que estão trabalhando com o mesmo arquivo possam manipula-lo sem problemas.

        //O método close fecha o canal de saida, então o proximo println não aparece na tela
        System.out.close();
        System.out.println("Não vai mostrar");
    }

}
