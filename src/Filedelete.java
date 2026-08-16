import java.io.File;
public class Filedelete {
    public static void main(String[] args) {
        File file = new File("bilai.txt");

        if  (file.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("File not found");
        }
    }
}
