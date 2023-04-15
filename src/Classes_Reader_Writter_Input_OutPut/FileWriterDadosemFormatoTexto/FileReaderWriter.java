package Classes_Reader_Writter_Input_OutPut.FileWriterDadosemFormatoTexto;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileReaderWriter {

    public static void main(String[] args) throws IOException {

        /*A primeira informação é onde eu quero escrever, a proxima é o append que não é necessario (true -> indica que se o
        arquivo ja existir e tiver algo escrito eu quero escrever no fim dele a informação)(false -> substitui a informacao).
        Charset é a codificação do Arquivo. Para ler a codificação deve ser a mesma da escrita para não dar problema com acentos
            FileWriter writer = new FileWriter("examples/FileWriter/arq.txt", StandardCharsets.UTF_8);
        Operacoes de I/O devem ter os canais de comunicaçao fechados no final
            writer.close();*/

        //O mais recomendado é usar o tryWithResource que chama automáticamento o método Close
        try(FileWriter writer2 = new FileWriter("examples/FileWriter/arq.txt", StandardCharsets.UTF_8)){
            writer2.write("A Love I/O");
            //Temos uma operaçao que vai escrever o texto Hello em examples/FileWriter/arq.txt
            //Operaçao não cria os diretórios, só os arquivos
        }



    }


}
