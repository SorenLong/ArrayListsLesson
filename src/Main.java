import javax.lang.model.type.ArrayType;
import java.util.ArrayList; //import the arrayList class

public class Main {

    static ArrayList<String> trucks = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tesla");

        trucks.add("Ford F-150");
        trucks.add("Dodge Ram Warlock");
        trucks.add("Nissan");
        trucks.add("GMC Sierra");

        System.out.println(cars.get(4)); //This will output Tesla
        System.out.println(trucks.get(1)); //output dodge

        //If I want to change an item, I can just set it...
        cars.set(0,"Mercedes-Benz"); //changes volvo to mercedes...
        System.out.println(cars.get(0)); //outputs the mercedes

        System.out.println("The size of the cars array list is " + cars.size());
//
//        //remove from the array list
//        cars.remove(4); //this will remove the tesla and change the size
//        System.out.println("The size of the cars array list is " + cars.size());
//
//        //clear the array list with clear
//        cars.clear();
//        System.out.println("The size of the cars array list is " + cars.size());

        //How to output the whole array list
        for(int i = 0; i<cars.size(); i++){
            System.out.println("The car in spot "+i+" is "+cars.get(i));
        }
    }
}