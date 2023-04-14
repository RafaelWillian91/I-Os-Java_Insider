package exerciseTotalbytes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException{

        searchCalc("C:\\Users\\rafaw\\OneDrive\\Documentos");

    }

     private static void searchCalc (String of) throws IOException {
        long amount = 0;
         System.out.println(of);
       try (var searchDirectory = Files.newDirectoryStream(Path.of(of))){
           for (Path path : searchDirectory) {

               if (!Files.isDirectory(path)){
                   amount += Files.size(path);
               }else {
                   searchCalc(path.toString());
               }
           }
       }         System.out.println(amount);
     }

}
