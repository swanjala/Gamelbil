package algoritms.search;

import datapreprocessor.datamodel.CarModel;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

public class BinarySearch {

    private int candidateData;
    private int keyMinimum;
    private int keyMaximum;
    private Integer [] keySets;

    private HashMap<Integer,List<CarModel>> carData = new HashMap<>();

    public BinarySearch (HashMap<Integer, List<CarModel>> carData, Integer [] keySets) {
        this.carData = carData;
        this.keySets = keySets;
        this.keyMinimum = keySets[0];
        this.keyMaximum = keySets[keySets.length -1];

    }

    public boolean search(int key) {

        while(keyMinimum <= keyMaximum){
            int keyMiddle= (keyMinimum+keyMaximum)/2;
            if (keySets[keyMiddle] < key){
                keyMinimum = keyMiddle + 1;
            } else if (keySets[keyMiddle]> key){
                keyMaximum = keyMiddle - 1;
            } else if (keySets[keyMiddle] == key){

                JOptionPane.showMessageDialog(null, "Car found "
                        + carData.get(keySets[keyMiddle]).get(0).getBodyType());
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"Number not found");
        return false;
    }


}
