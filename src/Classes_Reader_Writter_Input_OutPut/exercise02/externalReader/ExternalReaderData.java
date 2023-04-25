package Classes_Reader_Writter_Input_OutPut.exercise02.externalReader;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class ExternalReaderData {

    public static void main(String[] args) throws IOException {

//      try(
//              Scanner sc = new Scanner(Path.of("examples/FileWriter/dataIn.txt"));
//              PrintWriter pt = new PrintWriter("examples/FileWriter/dataOut.txt")) {
//
//          sc.useDelimiter("\\.");
//
//          while (sc.hasNext()) {
//              pt.println(sc.next().trim());
//          }
//      }

      try(
              var in = new BufferedReader(new FileReader("examples/FileWriter/dataIn.txt"));
              var out = new BufferedWriter(new FileWriter("examples/FileWriter/dataOut.txt"))
              ){

          String line;
          while ((line = in.readLine()) != null){

              line = line.replace(". ", "\n");
              out.write(line);
          }

      }


    }

}
