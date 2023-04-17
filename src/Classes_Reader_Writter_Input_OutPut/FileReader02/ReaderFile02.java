package Classes_Reader_Writter_Input_OutPut.FileReader02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReaderFile02 {

    public static void main(String[] args) throws IOException {


        try(FileWriter writer2 = new FileWriter("examples/FileWriter/arq02.txt", StandardCharsets.UTF_8)){
            IOoperation.write(writer2, "Helooooo!! Usando a classe IOoperation");
        }

        try(FileReader fileReader = new FileReader("examples/FileWriter/arq02.txt", StandardCharsets.UTF_8)){
           String text = IOoperation.read(fileReader);
            System.out.println(text);

        }



    }
}
