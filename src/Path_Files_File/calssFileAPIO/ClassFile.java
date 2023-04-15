package Path_Files_File.calssFileAPIO;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

public class ClassFile {

    public static void main(String[] args) {

        File file = new File("examples", "file01.txt");

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());


        //Listar aquivos de um diretório com File
        System.out.println(Arrays.toString(file.list()));

        //A preferencia é usar Path, mas ainda existem sistemas legados que usam File
        //Projetistas do Java tiveram que fazer a conversão de um para o outro
        //File => Path
        Path path = file.toPath();
        System.out.println(path.toAbsolutePath());

        //Path => File
        File file2 =  path.toFile();
        System.out.println(file2.getAbsoluteFile());
    }
}
