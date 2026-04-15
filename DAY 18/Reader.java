import java.io.FileReader;
class Reader
{
    public static void main(String[] args)
    {
        try{
            FileReader reader=new FileReader("test.txt");
            int character;
            while((character=reader.read())!=-1)
            {
                System.out.print((char)character);
            }
        }
        catch(java.io.IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}