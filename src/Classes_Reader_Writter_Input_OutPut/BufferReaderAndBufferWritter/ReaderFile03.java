package Classes_Reader_Writter_Input_OutPut.BufferReaderAndBufferWritter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderFile03
{

    public static void main(String[] args) throws IOException {

        //Classe do Java que lê dados de qualquer lugar. Buffered é um agurpamento de dados. Uma ponte entre o dado e a aplicação
        //BufferedWriter vai armazenando a informação e depois jogo totalmente no arquivo com .flush() a vantagem disso
        //É que voce não precisa ficar escrevendo toda hora no arquivo, isso é uma operação custosa.
        try(BufferedWriter writer2 = new BufferedWriter(new FileWriter("examples/FileWriter/arq02.txt", StandardCharsets.UTF_8))){
            IOoperation03.write(writer2, "Helooooo!! Usando a classe IOoperation Com BufferedReader "+ "\n" + "Multiplas Linhas" + "\n"
            + "E tambem a classe BufferedWriter para escrever");
            writer2.flush();
        }

        //BufferedReader recebe no seu construtor outro Reader, ou seja, ele agrupa as informaçoes para fazer a leitura.

        try(BufferedReader fileReader = new BufferedReader(new FileReader("examples/FileWriter/arq02.txt", StandardCharsets.UTF_8))){
            //BufferedReader já prepara toda a informacao para uso.
           String text = IOoperation03.read(fileReader);
            System.out.println(text);

        }


    }

}
//Esse padrão que um BufferedReader e BufferedWriter recebe nos construtores um FileReader ou um FileWriter é conhecido
//como decorator. é um design Pattern Decorator que tem a primiça de adicionar comportamentos a objetos.
//O FileWritter por si só tem um comportamento, mas se eu coloco ele dentro de um BufferedWriter esse BufferedWriter
//ele adiciona comportamentos extras como agrupar informacoes antes de mandar para o arquivo, o BufferedReader idem.
//O FileReader tem o comportamento de ler caracter a caracter, quando começam a decorar um BufferedReader o
//BufferedReader tem capacidade de agrupar as informaçoes que vem de um FileReader.

//Api de I/O do JAVA está repleta de Polimorfismo e o design Pattern Decorator