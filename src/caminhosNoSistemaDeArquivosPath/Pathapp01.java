package caminhosNoSistemaDeArquivosPath;

import java.nio.file.Path;

public class Pathapp01 {

    public static void main(String[] args) {

        //I/O -> Input / Output

        //Path -> Interface. Representa um arquivo no sistema de arquivos.
        //Path tem o método static que recebe duas sobrecargas. Uma URI e outra pedacos do caminho do Arquivo
        //Esses caminhos tem separadores, que dependendo do SO vai mudar. No windows é \
        //O path abstrai o separador, se preocupe com o caminho.
        //Exemplo:
        //C:\Users\rafaw\OneDrive\Documentos --> passa as partes no .of
        Path p1 = Path.of("C:", "Users", "rafaw", "OneDrive", "Documentos", "JavaIsider.txt");
        System.out.println(p1);//Saida: C:\Users\rafaw\OneDrive\Documentos\JavaIsider.txt

        //Quando voce tem o Path voce ganha alguns métodos
        Path p2 = p1.getFileName();//Retorna o nome do arquivo buscado no path, a ponta final.
        System.out.println(p2);//Saida JavaIsider.txt

        //.getRoot retorna um Path que mostra a Origem do caminho, a origem -> C:
        Path p3 = p1.getRoot();
        System.out.println(p3);//Saida: C:\
    }
}
