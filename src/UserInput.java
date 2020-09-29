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

        guestsString.add("Sixten");
        guestsString.add("Dogge");
        guestsString.add("Venus");
        guestsString.add("Ove");
        guestsString.add("Hypno");

        try {
            boolean foundMatch = false;
            for (int i = 0; (i < guestsString.size()); i++) {
                if (guestsString.get(i).toLowerCase().equals(input.toLowerCase())) {

                    foundMatch = true;

                    JOptionPane.showMessageDialog(null, guestsString.get(i) + " should eat " +
                            guests.get(i).getFoodPortion() + "g of " + guests.get(i).getFoodType());
                } else if (guestsString.size() - 1 == i && !foundMatch) {

                    JOptionPane.showMessageDialog(null, "ERROR: We currently have no guest by that name. ");

                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR: We currently have no guest by that name. " + e.getMessage());

        }


    }


}
