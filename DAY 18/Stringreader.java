import java.io.*;
import java.io.BufferedReader;

public class Stringreader
{

    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
