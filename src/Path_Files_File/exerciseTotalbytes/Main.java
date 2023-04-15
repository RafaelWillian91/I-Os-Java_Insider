package Path_Files_File.exerciseTotalbytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException{

        long size = searchCalc("C:\\Users\\rafaw\\OneDrive\\Documentos");
        System.out.println(size);
    }

     private static long searchCalc (String of) throws IOException {
        long amount = 0;

       try (var searchDirectory = Files.newDirectoryStream(Path.of(of))){
           for (Path path : searchDirectory) {

               if (!Files.isDirectory(path)){
                   System.out.println(path);
                   amount += Files.size(path);

               }else {
                   amount += searchCalc(path.toString());
               }
           }

         }

         return amount;
     }

}
