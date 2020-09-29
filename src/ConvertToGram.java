/**
 * Created by Lukas Aronsson
 * Date: 28/09/2020
 * Time: 13:59
 * Project: inlämningsuppgift 1
 * Copyright: MIT
 **/
interface ConvertToGram {

    /**
     * converts kg to gram
     *
     * @param wight wight in kg
     * @return wight in gram
     */
    default double convertGram(double wight) {

        //returns the wight in grams instead of
        return (wight * 1000);
    }

}
