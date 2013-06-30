/***********************************************************************************
 * Date:                                                         Name: Amel Hodzic
 *
 *
 * Program Description:
 *
 *
 **********************************************************************************/

import java.util.*;
import javax.swing.*;
import java.io.*;




public class FreeMem
{
    public static void main(String[] args)
                              throws FileNotFoundException
    {


      //Code for data manipulation
      
      int totalMem, freeMem, bufferMem, cachedMem;
        
      String memTotal;
      String memFree;
      String buffers;
      String cached;


      Scanner inFile = new Scanner(new FileReader("/proc/meminfo"));

      PrintWriter outFile = new PrintWriter("meminfo.out");
      

      memTotal = inFile.next();
      memFree = inFile.next();
      buffers = inFile.next();
      cached = inFile.next();

      totalMem = inFile.nextInt();
      freeMem = inFile.nextInt();
      bufferMem = inFile.nextInt();
      cachedMem = inFile.nextInt();

      outFile.printf(memTotal + " :" + totalMem + "\n"
          + memFree + " :" + freeMem + "\n"
          + buffers + " :" + bufferMem + "\n"
          + cached + " :" + cachedMem);

          //Close file
      inFile.close();
      outFile.close();

      System.exit(0);
    }
}



