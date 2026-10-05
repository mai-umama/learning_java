import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("bulbuli.txt");
        writer.write("Hello ammu");
        writer.close();
        System.out.println("Data written successfully");
    }
}