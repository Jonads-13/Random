import java.io.*;
import java.util.*;

public class FileReading 
{
    public static void main(String[] args)
    {
        List<String> fileText = readFile("markgrade.java");

        for (String string : fileText) 
        {
            System.out.println(string);    
        }
    }

    public static List<String> readFile(String filename)
    {
        List<String> fileText = new LinkedList<>();
        int lineNum = 1;
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            line = br.readLine();
            while(line != null)
            {
                fileText.add(lineNum + " " + line);
                lineNum++;
                line = br.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println("file reading failed");
        }

        return fileText;
    }
}
