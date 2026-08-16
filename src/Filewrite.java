import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) throws IOException {

        FileWriter write = new FileWriter("bilai.txt");

        write.write("Hello everyone");
        write.close();

        System.out.println("Data written successfully");
    }
}