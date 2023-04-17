package Classes_Reader_Writter_Input_OutPut.FileReader02;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//Criacao de dois métodos Genericos de conseguem Ler de qualquer Writer e Reader!!!!!!
public class IOoperation {
    //Todas as classes que tem writer no nome heram de Writer, então posso colocar Writer Como classe no nivel mais genérico
    public static void write(Writer out, String text) throws IOException {
        out.write(text);
    }

    public static String read(Reader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int textRead = reader.read();
        while (textRead != -1) {
            stringBuilder.append((char) textRead);
            textRead = reader.read();
        }
        return stringBuilder.toString();
    }

}



