/**
 * Created by Lukas Aronsson
 * Date: 28/09/2020
 * Time: 13:44
 * Project: inlämningsuppgift 1
 * Copyright: MIT
 **/
public class Snake extends Animal {

    public Snake(double wight) {

        setType(typeOfFood.snakePellets);

    }
    //polymorphism
    @Override
    public int getFoodPortion() {
        //returns 20 instead of original value
        return 20;
    }
}
