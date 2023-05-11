import java.util.*;
import java.io.*;

public class GamesList
{
    public static void main(String[] args)
    {
	Game[] games = new Game[115];

	readFile("Games.csv",games);

	Game[] gamesSorted = sortArray(games);

	writeFile(gamesSorted,"SortedList.csv");
    }




    public static void readFile(String pData01, Game[] pArray)
    {
	FileInputStream fileStream = null;
        InputStreamReader isr;
	BufferedReader bufRdr;
	int lineNum;
	String line;
	try
	{
	    fileStream = new FileInputStream(pData01);
	    isr = new InputStreamReader(fileStream);
	    bufRdr = new BufferedReader(isr);

	    lineNum = -1;
	    //bufRdr.readLine();
	    line = bufRdr.readLine();
	    while(line != null)
	    {
		lineNum++;
		populateArray(line, pArray, lineNum); //Call method to populate the array with the current line from the csv
		line = bufRdr.readLine();
	    }
	    fileStream.close();
    	}
	catch(IOException errorDetails)
	{
	    if(fileStream != null)
	    {
		try
		{
		    fileStream.close();
		}
		catch(IOException ex2)
		{ }
	    }
	    System.out.println("Error in file processing");
	}
    }//End RedFile method

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Method:     populateArray                                                                     *
 * Import:     csvRow (String), pArray (CovidRecord array), lineNum (Integer)                    *
 * Export:     none                                                                              *
 * Assertion:  Parse each line from the csv file and create objects in an array from that data   *
 * Created:    13/5/2022                                                                         *
 * Modified:   15/5/2022                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    public static void populateArray(String csvRow, Game[] pArray, int pLineNum)
    {
		//Declare and initialise variables which the data from the csv will be allocated to. Initialising them here means I won't have to do it in the if statements further down
		String name = ""; 
		double plat = 0.0;
			
		String[] splitLine;// Array for the csv data to initially occupy

		splitLine = csvRow.split(",");

		name = splitLine[0];
		plat = Double.parseDouble(splitLine[1]);

		pArray[pLineNum] = new Game();

		pArray[pLineNum].setName(name);
		pArray[pLineNum].setPlat(plat);
    }


    public static Game[] sortArray(Game[] pArray)
    {
		for(int p = 0; p < pArray.length-1; p++)
		{
			for(int i = 0; i < pArray.length-1; i++)
			{
				if(pArray[i].getPlat() < pArray[i+1].getPlat())
				{
					Game temp = pArray[i];
					pArray[i] = pArray[i+1];
					pArray[i+1] = temp;
				}
			}
	}
	return pArray;
    }

    public static void writeFile(Game[] pArray, String pFileName)
    {
    	FileOutputStream fileStrm = null;
    	PrintWriter pw;

    	try
    	{
    		fileStrm = new FileOutputStream(pFileName);
    		pw = new PrintWriter(fileStrm);

    		for(int i = 0; i < pArray.length; i++) //Run through each sub array
    		{
		    pw.println(pArray[i].getName() + "," + pArray[i].getPlat()); //Print results to file
    		}
    		pw.close(); //Close PrintWriter

    	}
	catch(IOException error)
    	{
    		System.out.println("Error in writing to file");
    	}
    }
} 
