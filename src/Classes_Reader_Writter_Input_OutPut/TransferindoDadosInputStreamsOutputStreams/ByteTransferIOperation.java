package Classes_Reader_Writter_Input_OutPut.TransferindoDadosInputStreamsOutputStreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTransferIOperation {
    public static byte[] read(InputStream in) throws IOException {
        return  in.readAllBytes();
    }

    public static void writer(OutputStream out, byte[] bytes) throws IOException{
        out.write(bytes);
        out.flush();
    }
    //**********Transferencai de Arquivos de forma mais otimizada*********************

    //O método readAllBytes(); é um método perigoso, devido ao método ler todos os dados do arquivo, suponhamos que seja
    //um arquivo com 1 Tera de informaçoes, ele vai demorar.
    //Esse código é bem otimizado, devido a leitura de 2k em 2k e não de tudo de uma vez. Um buffer ideal tem que ser encontrado.
    public static void transfer(InputStream in, OutputStream out) throws IOException{
        //Em uma transferencia não sabemos o tamanho do arquivo de entrada. Podemos chamar o método read que recebe um
        //array de bytes que posso denominar um buffer ou uma area de memoria temporaria
        byte[] buffer = new byte[2048];
        //A segunda informacao é o off que é a partir da onde eu comeco a informacao e depois até onde vai a leitura
        while (true) {//Para uma transferencia completa e não só de 2048 bytes é necessario um while
           int a =  in.read(buffer, 0, buffer.length);//Metodo read joga a informacao para dentro da variavel buffer (byte[])
            System.out.println(a);
            if(a < 0){
                break;// int resp = in.read(buffer); Isso é o mesmo que o código acima
            }
            out.write(buffer, 0, a);//Grava do 0 até a última interacao do método read
        }
    }


}



