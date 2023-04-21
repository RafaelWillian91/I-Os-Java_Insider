package Classes_Reader_Writter_Input_OutPut.FileWriter03;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderWriterFile03 {

    public static void main(String[] args) throws IOException {

        //Posso mudar a classe instanciada para StringWriter ao invés de FileWriter que continua funcionando, Pq StringWriter e FileWriter são um Writer
        //Essa é uma grande capacidade do Polimorfismo, que é o no caso aqui o método se comportando de diversas formas, dependendo do objeto em memória
        try(Writer writer2 = new StringWriter()){
            IOoperation03.write(writer2, "Helooooo!! Usando a classe IOoperation04");
        }

        //Posso mudar a classe instanciada para StringReader ao invés de FileWriter que continua funcionando, Pq StringReader e FileWriter sãao um Reader
        try(Reader fileReader = new StringReader("Uma String Qualquer")){
           String text = IOoperation03.read(fileReader);
            System.out.println(text);

        }

        //O fato da Classe IOoperatioon ter métodos que não dependem de um objeto de uma classe específica, torna a operacao chamada
        //mais genérica.

    }
}
