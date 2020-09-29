import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukas Aronsson
 * Date: 29/09/2020
 * Time: 13:41
 * Project: inlämningsuppgift 1
 * Copyright: MIT
 **/
public class UserInput {

    /**
     * Checks if the user inputted
     *
     * @param input  user input (hopefully the name of one of the guests)
     * @param guests list with the names of the guests
     */
    public static void ifInputInList(String input, List<Animal> guests) {

        // TODO: 29/09/2020 change this entire thing to a toString version of guests
        List<String> guestsString = new ArrayList<>();

        guestsString.add("sixten");
        guestsString.add("dogge");
        guestsString.add("venus");
        guestsString.add("ove");
        guestsString.add("hypno");

        try {
            boolean q = false;
            for (int i = 0; (i <= guestsString.size() || q); i++) {
                if (guestsString.get(i).equals(input.toLowerCase())) {

                    q = true;

                    JOptionPane.showMessageDialog(null, guestsString.get(i) + " Should eat " +
                            guests.get(i).getFoodPortion() + "g of " + guests.get(i).getFoodType());
                } else if (guestsString.size() == i) {

                    JOptionPane.showMessageDialog(null, "ERROR: We currently have no guest by that name. ");

                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR: We currently have no guest by that name. ");

        }


    }


}
