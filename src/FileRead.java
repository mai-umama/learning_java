import java.io.FileReader;
import java.io.IOException;

public class FileRead{
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("bilai.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
    }
}