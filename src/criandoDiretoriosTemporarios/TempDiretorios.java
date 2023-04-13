package criandoDiretoriosTemporarios;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempDiretorios {

    public static void main(String[] args) throws IOException {

        Path p1 = Files.createTempDirectory("R");
        System.out.println(p1);
        //diretorios temporarios sao criados dentro de TEMP do SO
        //MUitas vezes voce apenas deseja de modo temporario o arquivo como durante a execucao da aplicacao

        //A classe tem a capacidade de sempre gerar diretorios temporarios
        //Gerando na raiz do projeto
        Files.createTempDirectory(Path.of("examples"), "app");//sem nada no Path "" ele gera na raiz

        //Prefixo é o nome do arquivo em temp, depois uma serie de numeros e no fim o suffix
        Path p3 = Files.createTempFile("fff", "arq.txt");

        //Path.of("") nesse método informo onde sera criado o arquivo temporario
        Path p4 = Files.createTempFile(Path.of("C:","Users", "rafaw", "OneDrive"), "myArquiv", null);//null que dizer que o final vai ser tmp

        System.out.println(p3.toAbsolutePath());

    }

}
