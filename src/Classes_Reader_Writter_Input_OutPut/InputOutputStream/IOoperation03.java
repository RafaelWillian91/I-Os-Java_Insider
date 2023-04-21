package Classes_Reader_Writter_Input_OutPut.InputOutputStream;

import java.io.*;

public class IOoperation03 {
    public static byte[] read(InputStream in) throws IOException {
        return  in.readAllBytes();
    }

    public static void writer(OutputStream out, byte[] bytes) throws IOException{
        out.write(bytes);
        out.flush();
    }


}



