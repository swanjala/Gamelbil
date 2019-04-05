package algoritms.lists.search;

import datapreprocessor.datamodel.CarModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Class implements a binary lists:
 */
public class BinarySearch {
    /**
     * @param keyMinimum : The key to the first element in the candidate
     *                   data which also coincides with the lowest value
     *                   in an ordered/sorted list at any point during
     *                   the lists.
     * @param keyMaximum : The key to the last element in the candidate
     *                   data which also coincides with the highest value
     *                   in an ordered/sorted list at any point during
     *                   the lists.
     * @param keySet: candidate data to be searched.
     * @param carData: Hashmap containing data associated with the searched key
     *               which provides a meaningful output after a lists
     */
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

        /*Run the loop while the last value is not
        * the functioning minimum at any point during
        * the lists*/

        while(keyMinimum <= keyMaximum){

            // find the mid point of the list during an iteration.
            int keyMiddle= (keyMinimum+keyMaximum)/2;

            /*If the current middle point of the key set
             * is less than the key, make the first value after the
             * middle the first value(minimum value) of the next iteration
             * this will allow the iteration to run for the values that are above the
             * middle level , this is because the value in an ordered list then can
             * only be found above the mid point in the direction towards the end of the list*/

            if (keySets[keyMiddle] < key){
                keyMinimum = keyMiddle + 1;
            }
            /*
            * If the middle value of the key set is larger than the
            * value being searched for, set the value before the mid to be
            * the new maximum for the next iteration, as the minimum remains the same
            * given that if the value being searched exists, it should be in the
            * linear space between the minimum value and the middle.*/
            else if (keySets[keyMiddle]> key){
                keyMaximum = keyMiddle - 1;
            }
            /*
            * If the middle value is the same as the candidate key then the value
            * being searched for has been found.
            * The pop up will display the car associated with the key
            * found in the keyset.
             */

            else if (keySets[keyMiddle] == key){

                JOptionPane.showMessageDialog(null, "Car found "
                        + carData.get(keySets[keyMiddle]).get(0).getBodyType());
                return true;
            }
        }
        /*
        * If the number being searched for is not in the list, a pop up with
        * will show up notifying the user that the car associated with the key
        * is not found
         */
        JOptionPane.showMessageDialog(null,"Car not found");
        return false;
    }


}
