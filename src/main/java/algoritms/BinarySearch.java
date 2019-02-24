package algoritms;

import datapreprocessor.datamodel.CarModel;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BinarySearch {

    private int candidateData;
    private int keyMin;
    private int keyMax;
    private Integer [] keySets;
    /* Data is linear tagged therefore
    * no need to sort*/
    private HashMap<Integer,List<CarModel>> carData = new HashMap<>();

    public BinarySearch (HashMap<Integer, List<CarModel>> carData, Integer [] keySets) {
        this.carData = carData;
        this.keySets = keySets;
        this.keyMin = keySets[0];
        this.keyMax = keySets[keySets.length -1];

    }

    public boolean search(int key) {

        while(keyMin <= keyMax){
            int mid = (keyMin+keyMax)/2;
            if (keySets[mid] < key){
                keyMin = mid + 1;
            } else if (keySets[mid]> key){
                keyMax = mid - 1;
            } else if (keySets[mid] == key){

                JOptionPane.showMessageDialog(null, "Car found "
                        + carData.get(keySets[mid]).get(0).getBodyType());
                return true;
            }
        }
        JOptionPane.showMessageDialog(null,"Number not found");
        return false;
    }


}
