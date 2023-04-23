package Classes_Reader_Writter_Input_OutPut.PonteEntreInputStreamReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputOutStreamReaderWrtiterapp {

    //Cada numero representa uma letra da consificacao UTF-8
    private static final byte[] BYTES= {106, 97, 118, 97, 32, 114, 111, 99, 107, 33, 32, 92, 111, 47};
    public static void main(String[] args) throws IOException {

        //geralmente quando trabalhamos com bytes usamos um inputStream. como os dados estão em um array de bytes
        //posso usar um ByteArrayInputStream que suporta um array de bytes
        InputStream in = new ByteArrayInputStream(BYTES);

        //Classes Reader consegue faz leitura de dados em forma de texto e inputStream Trabalha com qualquer coisa, bytes.
        //Precisamos de uma ponte entre InputStream e um Reader

        //Com essa classe InputStreamReader temos um Reader que consegue ler Texto e a fonte que virá esse texto em um InputStream.
        InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(BYTES), StandardCharsets.UTF_8);
        //StandardCharsets.UTF_8 mostra qual foi a codificação para transforma esse byte em um texto. Tenho que usar a mesma
        //para decodificar.

        // Temos um padrão chamado decorator, onde temos um InputStreamReader que é decorado por um ByteArrayInputStream
        //ou seja, ele rcebe um ByteArrayInputStream como parâmetro no construtor e adiciona mais algumas funcionalidades.
        System.out.println((char)inputStreamReader.read());
        System.out.println((char)inputStreamReader.read());

        //O ideal é ler toda a linha do texto, para isso usamos um BufferedReader. que lê toda a linha. No construtor ele
        //aceita um Reader que será a minha ponte inputStreamReader que extend um Reader, ou seja, é um Reader com o padrao
        // decorator InputStreamReader decorado com um ByteArrayInputStream.
       try(BufferedReader bufferedReader = new BufferedReader(
               new InputStreamReader(
                       new ByteArrayInputStream(BYTES), StandardCharsets.UTF_8))){

           System.out.println(bufferedReader.readLine());

       }

        //É uma composicao de chamadas. Quando é chamado o readLine() ele vai até o InputStreamReader que na verdade
        //é um ByteArrayInputStream que tem carregado os arrays de bytes. os bytes são extraidos.
        //ByteArrayInputStream -> transforma os bytes em uma Stream
        //InputStreamReader -> faz a ponte transformando o array de bytes em uma sequencia de caracteres
        //BufferedReader -> faz a leitura dos caracteres de uma forma continua e entrega uma linha inteira.



    }

}

