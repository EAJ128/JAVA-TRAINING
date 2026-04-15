import java.io.*;

class Write
{
    public static void main(String[] args)
    {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Writing using File Writer");
            writer.newLine();
            writer.write("Hi I am Joel");
            writer.newLine();
            writer.write("Writing Complete");
            writer.close();

        }
        catch(java.io.IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}