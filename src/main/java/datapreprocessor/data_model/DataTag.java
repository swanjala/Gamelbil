package datapreprocessor.data_model;


import java.util.List;
import java.util.Map;

public class DataTag {

    List<CarModel> mCarData;
    private int dataTagValue = 0;
    Map<List<CarModel>, Integer> taggedData;

    private DataTag(List<CarModel> carData){
        this.mCarData = carData;
    }

    private Map<List<CarModel>, Integer> TagData() {

        for (int index = 0; index < mCarData.size(); index++) {
            taggedData.put(mCarData,dataTagValue);
            dataTagValue = dataTagValue + index;
        }
        return taggedData;
    }
}
