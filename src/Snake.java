/**
 * Created by Lukas Aronsson
 * Date: 28/09/2020
 * Time: 13:44
 * Project: inlämningsuppgift 1
 * Copyright: MIT
 **/
public class Snake extends Animal {
    /**
     * this is the constructor for the Snakes
     *
     * @param wight this is the wight of the Animal in kg
     */
    public Snake(double wight) {

        setType(typeOfFood.snakePellets);

    }

    //polymorphism
    /**
     * an override of the method in animal that gets the foodPortion for the Animal
     *
     * @return returns the foodPortion
     */
    @Override
    public int getFoodPortion() {
        //returns 20 instead of original value
        return 20;
    }
}
