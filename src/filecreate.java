import java.io.File;
import java.io.IOException;
public class filecreate{
    public static void main(String[] args) throws IOException{
        File file = new File("bulbuli.txt");
        if(file.createNewFile()){
            System.out.println("File successfully created");
        }else{
            System.out.println("lost to create");
        }
    }

}