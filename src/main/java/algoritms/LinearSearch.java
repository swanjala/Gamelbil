package algoritms;

import datapreprocessor.datamodel.CarModel;

import javax.swing.*;
import java.util.List;

public class LinearSearch {
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

        for (int i = 0; i < keySets.length; i++) {
            if (keySets[i] == searchKey){
                JOptionPane.showMessageDialog(null,
                        "Car found " + carList.get(keySets[i]).getMake());
            }
        }
        JOptionPane.showMessageDialog(null,"Car not found ");
    }
}

