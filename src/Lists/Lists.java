import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        //Create a not mutable List of strings called cityNames using asList() that you populate with 3 city names:

        List<String> cityNames = Arrays.asList("Firenze","Palermo","Napoli");

        //Try to add a 4th city name at the end of the List
        //If you get an exception, try to understand why and eventually comment the faulty code
        // The command to add the 4th city shoulf be
        // cityNames.add("Genova");
        // But the list is immutable, so the new element cannot be added

        //Try to change the 2nd item of the array, entering the value Tegucigalpa print the content of cityNames:

        cityNames.set(1,"Tegucigalpa");

        //Print the content of cityNames

        System.out.println(cityNames);

        //Define a mutable empty List of strings called kingsOfRome:

        List<String> kingsOfRome = new ArrayList<>();

        //Insert the names of the 7 kings of Rome into the mutable list:

        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        //Print the content of kingsOfRome:

        System.out.println(kingsOfRome);

        //Convert kingsOfRome into an array called kingsOfRomeArray:

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        //Change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar:

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        //Print the content of kingsOfRomeArray:

        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
