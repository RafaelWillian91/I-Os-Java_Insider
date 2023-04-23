package Classes_Reader_Writter_Input_OutPut.PonteEntreInputStreamWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class InputOutStreamReaderWrtiterapp02 {

    //Cada numero representa uma letra da consificacao UTF-8
    private static final byte[] BYTES= {106, 97, 118, 97, 32, 114, 111, 99, 107, 33, 32, 92, 111, 47};
    public static void main(String[] args) throws IOException {

       // ***********  Ponte entre uma InPutStream e um Reader  ****************************

        String text;

        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new ByteArrayInputStream(BYTES), StandardCharsets.UTF_8)


        )){
            text = bufferedReader.readLine();

        }

        System.out.println(text);

        //    ***********  Ponte entre uma OutPutStream e um Writer  ****************************

        //Para ler eu usei um InputStreamReader para escrevere podemos usar o OutputStreamWriter que é que faz a ponte
        //entre uma OutputStream e um Writer que é um local para escrever texto
        //Preciso criar um array de bytes que é para onde eu vou jogar os dados ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream bts = new ByteArrayOutputStream();
       try(OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bts)){
           //Com outputStreamWriter não é preciso um Buffer... pq ele já tem métodos para escrita completa como appen, writer
           outputStreamWriter.write(text);
       }

       byte [] bytes = bts.toByteArray();
        System.out.println(Arrays.toString(BYTES));
        System.out.println(Arrays.toString(bytes));

        //Uma ponte entre uma InputStream e um Reader é necessária em algumas situações porque eles operam em diferentes níveis de abstração.
        //O InputStream é usado para ler dados binários (bytes) de uma fonte, como um arquivo ou uma conexão de rede.
        // Por outro lado, o Reader é usado para ler caracteres a partir de uma fonte de texto.
        //Em alguns casos, pode ser necessário ler caracteres de uma fonte que fornece apenas uma InputStream.
        // É aí que entra a ponte entre InputStream e Reader. Ela atua como uma camada intermediária que converte os bytes lidos do InputStream em caracteres que podem ser lidos pelo Reader.
       // Por exemplo, se você tiver um arquivo de texto codificado em UTF-8, pode usar uma InputStream para ler os bytes do arquivo e,
        // em seguida, usar uma ponte InputStreamReader para converter esses bytes em caracteres legíveis pelo Reader.
        // Isso permitirá que você leia o arquivo como texto, em vez de apenas uma sequência de bytes.
    }

}

