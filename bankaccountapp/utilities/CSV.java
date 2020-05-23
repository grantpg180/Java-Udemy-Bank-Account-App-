package bankaccountapp.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CSV {

        //this method will read data from CSV file and return as a list
    public static List<String[]> read(String file){
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine()) != null);{
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
            
        }
        catch (FileNotFoundException e){
            //To auto-generate a catch block
            System.out.println("COUND NOT FIND FILE");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("COUND NOT READ FILE");
            e.printStackTrace();
        }
        return data;
            }
    
    
}