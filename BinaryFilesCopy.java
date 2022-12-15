/*This program runs very slow because it copies exactly one byte at a time*/
import java.io.*;

public class CopyFiles
{
    public static void main(String[] args) 
    {
 
        if (args.length < 2) 
        {
            System.out.println("Please provide input and output files");
            System.exit(0);
        }
 
        String inputFile = args[0];
        String outputFile = args[1];
 
        try ( 
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
            ) 
        {
            int byteRead = -1;
 
            while ((byteRead = inputStream.read()) != -1) 
            {
                outputStream.write(byteRead);
            }
 
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
