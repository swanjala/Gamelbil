package algoritms;

import datapreprocessor.datamodel.CarModel;

import java.util.Arrays;
import java.util.List;

public class ExponentialSearch {


    private List<CarModel> mCarModelList;
    private Integer [] keySets;
    private Integer searchValue;



    public ExponentialSearch(List<CarModel> carModelList, Integer [] keySets, Integer
            SearchValue) {
        this.mCarModelList = carModelList;

        keySets = new Integer[keySets.length];
        this.keySets = keySets;
        this.searchValue = searchValue;
    }

    public int exponentialSearch(){
        if (keySets[0] == searchValue){
            return 0;
        }
        int i = 1;
        while (i < keySets.length && keySets[i] <= searchValue){
            i = i * 2;
        }
        return Arrays.binarySearch(keySets, i/2,
                Math.min(i, keySets.length), searchValue);
    }

}
