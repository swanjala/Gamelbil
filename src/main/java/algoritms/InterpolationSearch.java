package algoritms;

import datapreprocessor.datamodel.CarModel;

import java.util.List;

public class InterpolationSearch {

    private List<CarModel> mCarModelList;
    private Integer [] keySets;
    private Integer searchValue;



    public InterpolationSearch(List<CarModel> carModelList, Integer [] keySets, Integer
                               SearchValue) {
        this.mCarModelList = carModelList;

        keySets = new Integer[keySets.length];
        this.keySets = keySets;
        this.searchValue = searchValue;
    }

    public int interpolationSearch() {
        int minimum = 0, maximum = (keySets.length - 1);

        while(minimum <= maximum && searchValue >= keySets[minimum]
                && searchValue <= keySets[maximum]){
            int position = minimum +
                    (((maximum - minimum)/(keySets[maximum] -keySets[minimum])) * (searchValue
                    - keySets[minimum]));

            if (keySets[position] == searchValue){
                return  position;
            }
            if (keySets[position] < searchValue){
                minimum = position + 1;
            }
            else
                maximum = position - 1;

        }
        return -1;
    }
}
