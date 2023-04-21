package Classes_Reader_Writter_Input_OutPut.InputOutputStream;

import java.io.*;

public class InputStreamandOutputStream {

    //Quando usamos outputStream e InputStream podemos estamos trabalhando com bytes que é o nível mais básico de dados.
    //Isso significa que podemos trafegar qualquer tipo de dados de qualquer tipo, como .exe .mp4
    //Diferante quando trabalhamos com Readers e Writters estão trafegando texto.
    public static void main(String[] args) throws IOException {

        //Classe para ler dados de um Arquivo. entrada de dados
      try(FileInputStream fileInputStream = new FileInputStream("examples/FileWriter/arq02.txt");
        OutputStream outputStream = new FileOutputStream("examples/FileWriter/arq03.txt"))
      {
          //Informaçoes que estão na mémoria atraves do fileInputStream são passsadas ao InputStream.
          byte[] bytes = IOoperation03.read(fileInputStream);

          //É passado um outputStream que contem o local do arquivo ou o local de criacao junto com os dados lidos
          //pelo InputStream do método IOoperation04.read(fileInputStream);
          IOoperation03.writer(outputStream, bytes);

      }



    }
}
