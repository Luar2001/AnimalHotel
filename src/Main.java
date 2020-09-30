import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        //Creates instances of all the current animal guests
        Dog Sixten = new Dog(5);
        Dog Dogge = new Dog(10);
        Cat Venus = new Cat(5);
        Cat Ove = new Cat(3);
        Snake Hypno = new Snake(1);

        //A list with all the guests
        // TODO: 29/09/2020 figure out a better way to make a list
        List<Animal> guests = new ArrayList<>();

        guests.add(Sixten);
        guests.add(Dogge);
        guests.add(Venus);
        guests.add(Ove);
        guests.add(Hypno);

        //User inputs the name of the animal that should be fed
        String input = JOptionPane.showInputDialog("Input Animals name: ");

        System.out.println(input);

        //calls for the class userInput
        UserInput.ifInputInList(input, guests);

    }
}
