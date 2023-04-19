package Classes_Reader_Writter_Input_OutPut.FileWriter03;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//Criacao de dois métodos Genericos de conseguem Ler de qualquer Writer e Reader!!!!!!
public class IOoperation03 {
    //Todas as classes que tem writer no nome herdam de Writer, então posso colocar Writer Como classe no nivel mais genérico
    //suas implementacoes podem entrar com parâmetro do método
    public static void write(Writer out, String text) throws IOException {
        //Writer
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



