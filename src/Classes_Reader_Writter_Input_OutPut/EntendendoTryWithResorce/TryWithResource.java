package Classes_Reader_Writter_Input_OutPut.EntendendoTryWithResorce;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResource {

    public static void main(String[] args) {

        //Antes do TryWithResource
        try {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter("ArqOUT.txt", StandardCharsets.UTF_8);
                fileWriter.write("OLA");
                //Se der uma excecao antes do método close, o fluxo não será fechado.
                int a = 0;
            }finally {//Para isso colocavamos o fechamento do fluxo em um finally
                //pode ser que o close seja chamado em uma referencia nula
                if(fileWriter != null) {
                    fileWriter.close();//Aqui eu tenho que inicilizar o fileWriter, para o finally ter acesso
                    //O método close não consegue lancar a exceção acima dele, então precisavamos de um try dentro do outro
                }
            }
        }catch (IOException e){//Esse bloco pega o erro que close tambem pode lancar
            e.printStackTrace();
        }

        System.out.println("------------------------------------------");
        //Com Try With Resources
        try(FileWriter fileWriter = new FileWriter("Arq2.txt", StandardCharsets.UTF_8))     {

          }catch (IOException e){
              e.printStackTrace();
        }
        //O close é chamado automáticamente, todas as classes que implementam a interface AutoCloseable tem que
        //implementar o método close. Ou implementam Closeable que é uma outra interface que extend AutoCloseable.
        //Todas os elementos que trabalham com canais Implementam Closeable e podem usar try with resources e o close
        //é chamado automáticamente.





    }
}
