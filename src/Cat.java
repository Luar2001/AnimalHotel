/**
 * Created by Lukas Aronsson
 * Date: 28/09/2020
 * Time: 13:44
 * Project: inlämningsuppgift 1
 * Copyright: MIT
 **/
public class Cat extends Animal {
    /**
     * This is the constructor for the cats
     *
     * @param wight The wight of the Animal in kg
     */
    public Cat(double wight) {

        setWight(wight);

        setPortion(150);

        setType(typeOfFood.catFood);

        foodPortionCalculation();
    }
}
