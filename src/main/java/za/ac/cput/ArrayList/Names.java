package za.ac.cput.ArrayList;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author : Mpumelelo Magagula
 * Student Number: 218136021
 * Date: 11 May 2021
 * Description: this programm display multiple array  list.
 */
public class Names {


    public Collection<String> people(){

        Collection student = new LinkedHashSet();

        student.add("Nomzamo");
        student.add("Mpumelelo");
        student.add(5.5);
        student.add("Smith");
        student.add(56);
        student.add("Bruce");


        //removing an element
        student.remove("Bruce");
        student.remove(5.5);


        return student;
    }

    //MAP
    public HashMap<Integer,String> cell()
    {
        HashMap<Integer,String> phone = new HashMap<>();
        phone.put(100,"Apple");
        phone.put(101,"Samsung");
        phone.put(102,"Hauwei");
        phone.put(103,"Nokia");
        phone.put(104,"Oppo");
        phone.put(105,"Hauwei");

        //finding an an element
        phone.get("105"); // return Hauwei

        //removing an object or element
        phone.remove(102);

        // Pull out live Collection of all the values.
        Collection<String> values = phone.values();
        System.out.println(values);

        //displayng elements in any order
        for (Map.Entry m: phone.entrySet()){
            System.out.println(m.getKey()+ ""+ m.getValue());
        }

        return phone;
    }

    //SET
    public HashSet<String> cars()
    {
        HashSet<String> cars = new HashSet<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volkswagen");
        cars.add("Mercedes");
        cars.add("BMW");

        //finding an item element



        return cars;
    }

    //LIST
    public ArrayList<String> fruits()
    {
        //List<String> fruits = new ArrayList<String>();
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Orange");

        //finding specific word using indexing
        fruits.get(0); //return Apple
        fruits.get(1); //returns Banana
        fruits.get(3); //returns Orange

        //removing an element
        fruits.remove(2); // remove Watermelon


        for (int i=0; i<fruits.size(); i++) {
            String str = fruits.get(i);
        }

        return  fruits;
    }
}
