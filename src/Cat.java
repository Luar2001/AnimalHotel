/**
 * Created by Lukas Aronsson
 * Date: 28/09/2020
 * Time: 13:44
 * Project: inlämningsuppgift 1
 * Copyright: MIT
 **/
public class Cat extends Animal {

    public Cat(double wight) {

        setWight(wight);

        setPortion(150);

        setType(typeOfFood.catFood);

        foodPortionCalculation();
    }
}
