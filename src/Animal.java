/**
 * Created by Lukas Aronsson
 * Date: 28/09/2020
 * Time: 13:40
 * Project: inlämningsuppgift 1
 * Copyright: MIT
 **/
public abstract class Animal implements ConvertToGram {

    //inkapsling private public och protected

    public typeOfFood foodType;
    //wight of the animal in kg
    private double wight;
    //the number to divide the wight by to figure out the portion of food the animal should eat
    private int portion;
    //the portion of food the animal should get in grams
    private double foodPortion;

    /**
     * Sets the wight of the animal in grams
     *
     * @param wight the wight of the animal
     */
    public void setWight(double wight) {
        this.wight = wight;
    }

    /**
     * Sets the number to divide the animals wight by to figure out the portion of food it should eat in grams
     *
     * @param portion the number that this specific type of animal needs its wight divided by to calculate food portion
     */
    public void setPortion(int portion) {
        this.portion = portion;
    }

    /**
     * sets foodType for this Animal
     *
     * @param foodType the type of food this animal should eat
     */
    public void setType(typeOfFood foodType) {
        this.foodType = foodType;
    }

    /**
     * Calculates the amount of food this specific animal should eat based on its wight and its portion
     */
    protected void foodPortionCalculation() {

        //Calculates the portion of animal food the animal should get
        double foodPortion = (convertGram(this.wight) / this.portion);

        //calls the setFoodPortion method in Animal
        setFoodPortion(foodPortion);

    }

    /**
     * Returns the amount of food this animal should eat in grams
     *
     * @return Returns the value of FoodPortion as an int
     */
    public int getFoodPortion() {
        return (int) foodPortion;
    }

    /**
     * sets foodPortion
     *
     * @param foodPortion the portion of food in gram this animal should get/eat
     */
    private void setFoodPortion(double foodPortion) {
        this.foodPortion = foodPortion;
    }

    /**
     * @return returns the animals foodType
     */
    public typeOfFood getFoodType() {
        return foodType;
    }

    //enum for type of food!
    protected enum typeOfFood {catFood, dogFood, snakePellets}
}

