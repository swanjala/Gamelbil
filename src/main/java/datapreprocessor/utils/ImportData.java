package datapreprocessor.utils;

import datapreprocessor.datamodel.CarModel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImportData {

    public static void dataCollection(){

        List<CarModel> dataCollection = new ArrayList<>();
        String csvInput = "/Users/sam/Desktop/ISO3166-Sheet1.csv";
        BufferedReader bufferedReader = null;
        String entry = "";
       String delimiter = ",";

        try {
            bufferedReader = new BufferedReader(new FileReader(csvInput));

            HashMap<String, String> data = new HashMap<>();
;
            while ((entry = bufferedReader.readLine()) != null) {

                String[] dataInCollumn = entry.trim().split(delimiter);


                data.put(dataInCollumn[0], dataInCollumn[1]);


                System.out.println("data.put(\""+dataInCollumn[1]+ "\",\""+dataInCollumn[0]+"\");");

            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main (String [] args){
         dataCollection();
    }

}
