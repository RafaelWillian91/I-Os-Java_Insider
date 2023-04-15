package Path_Files_File.excluindoArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFile01 {

    public static void main(String[] args) throws IOException {

        Path p1 = Path.of("src", "excluindoArquivo", "myFileTestExclusao.txt");
    //        System.out.println(p1);
    //        Files.createFile(p1);

        //Files.delete(p1);//Se eu chamar esse método e o arquivo não existir, ele lanca uma exceção -NoSuchFileException

        //Para evitar a exceção podemos usar o método .deleteIfExists e passar o arquivo que será feita uma verificacao
        Files.deleteIfExists(p1);

        //Existe um detalhe. Isso não vale para diretórios.
        Files.deleteIfExists(Path.of("examples"));
        //É lancada uma excecao DirectoryNotEmptyException, voce não pode deletar um diretório que não está vazio





    }
}
