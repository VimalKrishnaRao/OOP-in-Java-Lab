import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample 
{
  public static void main(String args[]) 
  {
    // The name of the file to open
    String fileName = "temp.txt";

    // This will reference one line at a time
    String line = null;

    try 
    {
      // FileReader reads text files in the default encoding
      FileReader fileReader = new FileReader(fileName);

      // Always wrap FileReader in BufferedReader
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      int lineNumber = 1;
      while((line = bufferedReader.readLine()) != null) 
      {
        System.out.println(lineNumber + ": " + line);
        lineNumber++;
      }

      // Always close files
      bufferedReader.close();
    }
    catch(IOException ex) 
    {
      System.out.println("Error reading file '" + fileName + "'");
      // Or we could just do this:
      // ex.printStackTrace();
    }
  }
}
