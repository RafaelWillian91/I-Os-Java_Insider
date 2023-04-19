package BufferReaderAndBufferWritter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//Criacao de dois métodos Genericos de conseguem Ler de qualquer Writer e Reader!!!!!!
public class IOoperation03
{
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

    //Objeto que está vindo um memória é um BufferReader, ele agrupa informações e já retorna tudo em uma informacao pronta.
    //Esse BufferedReader tem um método chamado readerLine que lê a linha inteira. Dentre outras vantagens.
    //BufferedReader já faz a leitura caracter a caracter, só que ele agrupa tudo em uma linha.
    public static String read(BufferedReader reader) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + "\n");//Pulando as linhas em cada interacao
        }
        return stringBuilder.toString();
    }



}



