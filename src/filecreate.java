import java.io.File;
        import java.io.IOException;
public class filecreate {
    public static void main(String[] args) throws IOException{
        File file = new File("bilai.txt");

        if  (file.createNewFile()){
            System.out.println("File created successfully");
        }
        else{
            System.out.println("File not created");
        }
    }
}
