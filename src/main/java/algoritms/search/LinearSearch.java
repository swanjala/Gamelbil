package algoritms.search;

import datapreprocessor.datamodel.CarModel;

import javax.swing.*;
import java.util.List;

/**
 *Implements a linear search
 */
public class LinearSearch {

    /**
     * @param carList : List of cars of type CarModel, this is
     *                used to provide a readable name for search results
     * @param loadedKeySets : An array of interger keys on which the binary
     *                      search is applied.
     * @param key: the candidate value for the binary search
     */

    private List<CarModel> carList;
    private Integer searchKey;
    private Integer [] keySets;


    public LinearSearch(List<CarModel> carList, Integer [] loadedKeySets, Integer key) {
        this.carList = carList;
        this.searchKey = key;
        keySets = new Integer[loadedKeySets.length];
        this.keySets = loadedKeySets;
    }

    public void searchCar() {
        /*
        * Iterates through the key set sequentially with an incremental index
        * (by 1) and either returns a pop up message with the name of the car
        * that's associated with the car in the list when the item is found
        * and and also pops up the car not found message if the key
        * being searched for is not found or none of the cars in the list
        * are associated with the key.
        * */
        for (int i = 0; i < keySets.length; i++) {
            if (keySets[i] == searchKey){
                JOptionPane.showMessageDialog(null,
                        "Car found " + carList.get(keySets[i]).getMake());
            }
        }
        JOptionPane.showMessageDialog(null,"Car not found ");
    }
}

