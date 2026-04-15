import java.io.File;

public class delete {
    public static void main(String[] args) {
        try{
            File file=new File("test.txt");
            if(file.delete())
            {
                System.out.println("File deleted successfully");
            }
            else
            {
                System.out.println("Failed to delete the file");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
