package checandoExistenciaDeArquivos;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class PAthapp3 {
    //Determinado se diretório existe ou não.
    //A sua função (Class File) está relacionada com o caminho / diretório / endereço dos arquivos ou
    // diretório que desejarmos manipular.
    //consiste exclusivamente em métodos estáticos que operam em arquivos,
    //diretórios ou outros tipos de arquivos.
    public static void main(String[] args) {


        // Path p1 = Path.of("examples/file01.txt");
        Path p1 = Path.of("examples", "file01.txt"); // Caminho relativo

        //toAbsolutePath() retorna o caminho completo do arquivo
        System.out.println(p1.toAbsolutePath());//Absoluto: C:\Users\rafaw\IdeaProjects\I-Os-Java_Insider\examples\file01.txt

        //Classe File tem uma serie de métodos staticos e um deles é o exist
        System.out.println(Files.exists(p1));
        //Quando chamamos o .exists o java transforma isso em um caminho absoluto para verificar se o arquivo existe
        //ou não.



        //.isDirectory(p1) verifica se é um diretório
        System.out.println(Files.isDirectory(p1));


        //É um arquivo ou diretorio
        System.out.println(Files.isRegularFile(p1));

        //Verifica se dois arquivos são os mesmo
       // System.out.println(Files.isSameFile());

        // Verifica se arquivo é um link para um diretório do sistema
        System.out.println(Files.isSymbolicLink(p1));

        //Se o arquivo é execultavel
        System.out.println(Files.isExecutable(p1));

        //A classe File rece um objeto de Tipo Path e isso é um objeto conversando com o outro. ->Orientacao Objetos <-


    }
}
