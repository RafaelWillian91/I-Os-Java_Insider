package Path_Files_File.ListandoArqDiretorios;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListandoArqDirec {

    public static void main(String[] args) throws IOException {

        //O método close do fluxo de diretório deve ser invocado após a conclusão da iteração para
        // liberar quaisquer recursos mantidos para o diretório aberto.

      //Garantia de fechamento do directoryStream
        //Se nao parametrizar não funciona. Posso usar o tipo var como instancia para não ter que se preocupar
      try(DirectoryStream <Path> directoryStream =  Files.newDirectoryStream(Path.of(""))){
          for(Path path : directoryStream){
              //Assim posso saber se é diretorio ou nao
              System.out.println(path + " -> " + Files.isDirectory(path));
          }
      }

        System.out.println("__________________________________________________________________________");

        //Posso fazer uma filtragem com um segundo parametro em Files.newDirectoryStream(Path.of(""))
        //Esse é o poder do globbing.
        try(var directoryStream =  Files.newDirectoryStream(Path.of(""), "*.{git,idea}")){
            for(Path path : directoryStream){
                //Assim posso saber se é diretorio ou nao
                System.out.println(path + " -> " + Files.isDirectory(path));
            }
        }



    }




}
