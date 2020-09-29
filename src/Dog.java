/**
 * Created by Lukas Aronsson
 * Date: 28/09/2020
 * Time: 13:44
 * Project: inlämningsuppgift 1
 * Copyright: MIT
 **/
public class Dog extends Animal {
    /**
     * This is the constructor for the dogs
     *
     * @param wight The wight of the Animal in kg
     */
    public Dog(double wight) {

        //sets the dogs wight
        setWight(wight);

        //sets the dogs portion
        setPortion(100);

        setType(typeOfFood.dogFood);

        //calculates the food portion for this dog
        foodPortionCalculation();
    }

}
