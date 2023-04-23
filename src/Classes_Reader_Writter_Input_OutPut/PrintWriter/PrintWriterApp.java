package Classes_Reader_Writter_Input_OutPut.PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintWriterApp {


    public static void main(String[] args)throws IOException {

        //O sufixo de writer já fala que trabalhamos com texto. PrintWriter é bem versatil, Aceita varios construtores.
        //como Writer podendo assim ser um OutputStreamWriter, FileWriter, BufferWriter
        //Posso ter uma OutPutStream que pode ser um Array de bytes...
        //Uma String que é um nome de um arquivo.
        //Um dos construtores recebe um booleano para dar um flush automático.
        //Ao fazer o Close o auto flush é realizado automáticamente, podendo ser com tryWithResources
       try(PrintWriter pw = new PrintWriter("examples/PrintWriter.txt", StandardCharsets.UTF_8)) {//É recomendado deixar a Codificacão
           pw.println("Olá");
           pw.println("eu sou");
           pw.println("Java");
           pw.println("Trabalhar com PrintWriter é bem mais fácil");
           //PrintStream(System.out.println()) que é o retorna do Atributo static de System
           //e PrintWriter tem basicamente os mesmo métodos, como o format
           pw.format("%05d", 10);
           //pw.flush();
           //pw.close();

       }
    }
}
