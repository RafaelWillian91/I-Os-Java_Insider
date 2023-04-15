package Classes_Reader_Writter_Input_OutPut.FileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReaderFile {

    public static void main(String[] args) throws IOException {


        try(FileWriter writer2 = new FileWriter("examples/FileWriter/arq.txt", StandardCharsets.UTF_8)){
            writer2.write("Hello Java");
        }

        try(FileReader fileReader = new FileReader("examples/FileWriter/arq.txt", StandardCharsets.UTF_8)){
           int a = fileReader.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (a > -1){
                stringBuilder.append((char)a);
                a = fileReader.read();
            }
            System.out.println(stringBuilder);

        }



    }
}
