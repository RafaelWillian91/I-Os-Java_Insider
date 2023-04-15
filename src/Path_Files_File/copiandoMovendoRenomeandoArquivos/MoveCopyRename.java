package Path_Files_File.copiandoMovendoRenomeandoArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveCopyRename {

    public static void main(String[] args) throws IOException {

        //Copiando arquivos
        Path from = Path.of("src", "copiandoMovendoRenomeandoArquivos", "hello.txt");//Onde esta
        Path p1 = from.getParent().resolve("ArqCopiado").resolve("Hello2.txt");//Para onde vai e o Nome
       // Path p1 = from.getParent().resolve(Path.of("ArqCopiado").resolve("AqrCopiado.txt"));
      //  Files.copy(from, p1);//Metodo para copia

        //O java não deixa eu copiar o mesmo arquivo para um destino onde ele já existe, mas um enum pode ser
        //passado para sobrescrever o arquivo existente se no ato da copia ele existir
        Files.copy(from, p1, StandardCopyOption.REPLACE_EXISTING);

        //Para mover é o mesmo, só que ele pega as informacoes do arquivo e passa para o novo local com o nome que voce
        //precisa dar
        Files.move(from, p1, StandardCopyOption.REPLACE_EXISTING);



    }

}
