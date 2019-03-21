package algoritms.lists.search;

import datapreprocessor.datamodel.CarModel;

import javax.swing.*;
import java.util.List;

/**
 *Implements a linear search on an array
 *
 * */
public class LinearSearch {

    /**
     * @param carList : List of cars of type CarModel, provides
     *               a readable name for search results.
     * @param loadedKeySets : An array of integer keys on which the linear
     *                      search is applied.
     * @param key: the candidate value associated with a specific car.
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
        * Iterates through the key set sequentially using an incremental index
        * (by 1) and either returns a pop up message with the name of the car
        * that's associated with the index in the list when the item is found
        * or pops up the car not found message if the key
        * being searched for is not associated with any of the cars in the list
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

