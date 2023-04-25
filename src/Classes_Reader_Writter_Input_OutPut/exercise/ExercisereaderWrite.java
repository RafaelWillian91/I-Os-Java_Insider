package Classes_Reader_Writter_Input_OutPut.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercisereaderWrite {

    public static void main(String[] args) throws IOException {

        try( Scanner sc = new Scanner(System.in); PrintWriter pt = new PrintWriter("examples/FileWriter/arqExercise.txt")){

           while (true) {
               System.out.print(">>");
               String resp = sc.nextLine();
               if (resp.isEmpty()) {
                   break;
               }
               pt.println(resp);
           }
       }








    }




}
