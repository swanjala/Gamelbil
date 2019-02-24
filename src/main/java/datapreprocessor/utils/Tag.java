package datapreprocessor.utils;


import datapreprocessor.datamodel.CarModel;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tag {

    List<CarModel> mCarData;
    private Integer [] dataTagValues;

    HashMap<Integer, List<CarModel>> taggedData = new HashMap<>();

    public Tag(List<CarModel> carData){
        this.mCarData = carData;
        this.dataTagValues = new Integer[carData.size()];
    }

    public HashMap<Integer, List<CarModel>> TagData() {

        for (int index = 0; index < mCarData.size(); index++) {
            taggedData.put(index, mCarData);
            dataTagValues[index] = index;
        }

        return taggedData;
    }

    public Integer [] keyData() {

        for (int i = 0; i <dataTagValues.length ; i++) {
            System.out.println(dataTagValues[i]);
        }
        return dataTagValues;
    }
}
