import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("VANBAN.txt"));
        String s = "what the fuck";
        a.reset();
        a.write(s.getBytes());
        //a.writeObject(s+"\n");
        a.close();
    }
}