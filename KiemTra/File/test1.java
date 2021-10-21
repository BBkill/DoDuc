import java.io.IOException;
import java.io.*;
public class test1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("VD.txt"));
        String s = "what the fuck 1";
        a.reset();
        a.writeObject(s+"\n");
        a.close();
    }
}
