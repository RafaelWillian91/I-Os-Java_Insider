package Classes_Reader_Writter_Input_OutPut.TransferindoDadosInputStreamsOutputStreams;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteTransfer {

    public static void main(String[] args) throws IOException {

        //Um ByteArrayInputStream recebe no construtor um array de bytes que é retornado pelo método da String
        //O algoritmo pega dados que é uma String, transforma em um array byte, usando um InputStream e uma OutputStream para gerar um
        //Arquivo de dados
      try(
              //InputStream in =  new ByteArrayInputStream("Java = sensacional".getBytes(StandardCharsets.UTF_8));
              //OutputStream out = new FileOutputStream("examples/file001.txt")

              InputStream in =  new FileInputStream("examples/file01.txt");
              OutputStream out = new ByteArrayOutputStream();

              //Com o poder do polimorfismo do java, nos podemos ter comportamentos diferentes de acordo com
              //os objetos que estão na mémoria em momentos diferentes.
              //Usando um Polimorfismo podemos mudar a entrada de uma InputStream e a saida de uma OutputStream.
              //Conseguimos fazer os dados trafegarem de uma forma eficiente
      ){

          ByteTransferIOperation.transfer(in, out);
          System.out.println(out.toString());

      }

        
    }
}
