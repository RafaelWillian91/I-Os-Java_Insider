package resolvendoCaminhosPAth;

import java.nio.file.Path;

public class Pathapp2 {

    public static void main(String[] args) {
        //raiz do caminho
        Path p1 = Path.of("home");

        //parte do diretório
        Path p2 = Path.of("rafaw");

        //Arquivo para ser encontrado
        Path p3 = Path.of("log.out");

        //Como montar usamo o método .resolve para juntar os caminhos. São imutáveis. Gera um novo Objeto.
        Path p4 = p1.resolve(p2);
        System.out.println(p4);//Saida: home\rafaw

        //Com metodos que retornam novos objetos eu posso Encadear as Chamadas
        Path p5 = p1.resolve(p2).resolve(p3);
        System.out.println(p5);

        //Caminho absoluto depende de alguns detalhes de implementacao do SO
        //Metodo quando precisamos do caminho completo para Abrir um arquivo que existe, por exemplo.
        Path p6 = p5.toAbsolutePath();
        System.out.println(p6);// saida: C:\Users\rafaw\IdeaProjects\I-Os-Java_Insider\home\rafaw\log.out

        //Se eu colocar / antes do Home ele considera que é um diretório absoluto já sai direto do C:
        //C:\home\rafaw\log.out












    }
}
