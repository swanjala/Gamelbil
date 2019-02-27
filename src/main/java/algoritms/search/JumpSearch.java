package algoritms.search;

import datapreprocessor.datamodel.CarModel;

import java.util.List;

/**
 *Time Complexity : O(√n)
 * Auxiliary Space : O(1)
 */
public class JumpSearch {

    private List<CarModel> carModelList;
    private static  Integer [] keySets;
    private static Integer searchKey;

    public JumpSearch(List<CarModel> carModelList, Integer [] keySets,
            Integer searchKey){
        this.carModelList = carModelList;
        this.keySets = keySets;
        this.searchKey = searchKey;
    }

    public static int search() {
        int keySetSize  = keySets.length;
        int step = (int)Math.floor(Math.sqrt(keySetSize));

        int previous = 0;
        while (keySets[Math.min(step, keySetSize) - 1] < searchKey){
            previous = step;
            step += (int)Math.floor(Math.sqrt(keySetSize));
            if (previous >= keySetSize)
                return -1;
            }

        while(keySets[previous] < searchKey){
            previous++;
            if (previous == Math.min(step, keySetSize))
                return -1;
        }

        if(keySets[previous]== searchKey)
            return previous;

        return -1;
    }

}
