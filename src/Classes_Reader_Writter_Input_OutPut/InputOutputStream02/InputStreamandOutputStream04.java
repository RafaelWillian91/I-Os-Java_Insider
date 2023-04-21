package Classes_Reader_Writter_Input_OutPut.InputOutputStream02;

import Classes_Reader_Writter_Input_OutPut.InputOutputStream.IOoperation03;

import java.io.*;

public class InputStreamandOutputStream04 {

    public static void main(String[] args) throws IOException {

        //Exemplo de copia de foto do arquivo de diretório local de forma otimizada
      try(FileInputStream fileInputStream = new FileInputStream("C:/Users/rafaw/OneDrive/Documentos/001.png");
          FileOutputStream outputStream = new FileOutputStream("examples/FileWriter/arqPNG.png"))
      {

          IOoperation04.transfer(fileInputStream, outputStream);

      }



    }
}
