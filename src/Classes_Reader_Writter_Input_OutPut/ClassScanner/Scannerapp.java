package Classes_Reader_Writter_Input_OutPut.ClassScanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Scannerapp {

    //Para Leitura temos a classe Bem Versátil que é a classe Scanner
    public static void main(String[] args) throws IOException {

        //Ele pode receber File ou Path, então posso receber representação de arquivos
        //Uma String diretamente que é o dado em si que vai ser lido
        //Readable é uma interface que todos os Readers implementam, então eu posso passar um Reader, FileReader, InputStreamReader
        try(Scanner sc = new Scanner(Path.of("examples/scanner.txt"))){//Para fazer a leitura do arquivo scanner.txt eu posso usar um Path, um File, FileReader... tem várias opçoes
            //A classe scanner vai mais alem do que ler dados de uma fonte, ela pode usar delimitatores
            sc.useDelimiter("\\|");
//            while (sc.hasNextLine()){
//                String s1 = sc.nextLine();
//                System.out.println(s1);//De forma muito fácil os dados do arquivo foram lidos
//            }

            while (sc.hasNext()){
                //Levando em conta o delimitador, agora o | é a quebra de Linha. Já separa na leitura da informacão
                //Por esse motivo a Classe scanner é bem utilizada quando trabalhamos com Input no Java
                System.out.print(sc.next());
            }



            }


    }

}
