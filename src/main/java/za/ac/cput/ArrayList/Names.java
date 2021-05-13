package za.ac.cput.ArrayList;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @author : Mpumelelo Magagula
 * Student Number: 218136021
 * Date: 11 May 2021
 * Description: this progeam display multiple array  list.
 */
public class Names {


    public Collection people(){


        Collection people = new LinkedHashSet();



        return people;
    }
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

    public HashSet<String> cars()
    {
        HashSet<String> myCars = new HashSet<>();

        myCars.add("BMW");
        myCars.add("Mercedes");
        myCars.add("Volkswagen");
        myCars.add("Mercedes");
        myCars.add("BMW");



        return myCars;
    }

    public HashMap<Integer,String> cell()
    {
        HashMap<Integer,String> myPhone = new HashMap<>();
        myPhone.put(100,"Apple");
        myPhone.put(101,"Samsung");
        myPhone.put(102,"Hauwei");
        myPhone.put(103,"Nokia");
        myPhone.put(104,"Oppo");
        myPhone.put(105,"Hauwei");

        //finding an an element
        myPhone.get("105"); // return Hauwei

        //removing an object or element
        myPhone.remove(102);

        // Pull out live Collection of all the values.
        Collection<String> values = myPhone.values();
        System.out.println(values);

        //displayng elements in any order
        for (Map.Entry m: myPhone.entrySet()){
            System.out.println(m.getKey()+ ""+ m.getValue());
        }

        return myPhone;
    }

}
