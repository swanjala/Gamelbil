package datapreprocessor;

import datapreprocessor.data_model.CarModel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImportData {

    public <T> void dataCollection(){
        List<CarModel> dataCollection = new ArrayList<>();

        String csvInput = "/Users/sam/Documents/SimpleData.csv";

        BufferedReader bufferedReader = null;
        String entry = "";
       String delimiter = ",";

        try {
            bufferedReader = new BufferedReader(new FileReader(csvInput));

            while ((entry = bufferedReader.readLine()) != null) {

                String[] dataInCollumn = entry.trim().split(delimiter);

                CarModel carModel = new CarModel(dataInCollumn[0], dataInCollumn[1],
                        dataInCollumn[2], dataInCollumn[3],dataInCollumn[4],
                        dataInCollumn[5],dataInCollumn[6],
                        dataInCollumn[7], dataInCollumn[8], dataInCollumn[9],dataInCollumn[10],
                        dataInCollumn[11],
                        dataInCollumn[12], dataInCollumn[13]);

                dataCollection.add(carModel);

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

}
