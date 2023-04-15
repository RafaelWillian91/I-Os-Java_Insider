package Path_Files_File.criandoHierarquiaDiretorio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hierarquiaapp1 {

    public static void main(String[] args) throws IOException {

       //Criacao de Diretório
        Path p1 = Path.of("examples");//Vou criar dentro desse diretório

        //é a mesma coisa que juntar dois Path com o método resolve de Files
        //Se já existir o diretório ele lanca uma excecao, para isso não ocorrer foi criado o método exist
        if(!Files.exists(p1)) {
            Files.createDirectory(p1.resolve("d1"));
        }else {
            System.out.println("Diretório já existe");
        }

        //Posso criar vários diretórios com createDirectories, esse método verifica os que não existem e cria
        //A vantagem do createDirectories é que dispensa a checagem se o diretório existe ou não
        Path p3 = Files.createDirectories(p1.resolve(Path.of("d1","d2", "d3")));

        System.out.println(p3);

        //Criando um arquivo
       // Files.createFile(p3.resolve("file.txt"));

        //O método getParent retorna um nível na hieraquia diretórios e assim posso criar arquivos em pastas acima
      //  Files.createFile(p3.getParent().resolve("File2.txt"));

        //Para ir até o diretorio d1
        Files.createFile(p3.getParent().getParent().resolve("File1.txt"));
    }
}
