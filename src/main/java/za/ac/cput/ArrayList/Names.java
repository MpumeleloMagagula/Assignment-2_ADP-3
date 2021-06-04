package za.ac.cput.ArrayList;

import java.util.*;

/**
 * @author : Mpumelelo Magagula
 * Student Number: 218136021
 * Date: 11 May 2021
 * Description: this programm display multiple array  list.
 */
public class Names {

    Collection student = new LinkedHashSet();
    HashMap<Integer,String> phone = new HashMap<>();
    HashSet<String> myCars = new HashSet<>();
    ArrayList<String> fruits = new ArrayList<>();
    boolean result = false;
    String findValue;
    String findSet;
    public Collection<String> people(){

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

    public boolean findpeople(){
        people();

            if(student.contains("Nomzamo")){
                System.out.println(student);
                    result = true;
                }
            return result;
    }

    //MAP
    public HashMap<Integer,String> cell()
    {
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
    public String findMap(){

        cell();
        findValue = phone.get(101);
        System.out.println("calue for key element 101: " + findValue);
        return findValue;
    }

    //SET
    public HashSet<String> cars()
    {

        myCars.add("BMW");
        myCars.add("Corrola");
        myCars.add("Volkswagen");
        myCars.add("Mercedes");
        myCars.add("Audi");

        //finding an item element



        return myCars;
    }

    public String findSet(){
        cars();

//            for (myCars: findSet) {
//                if (myCars.contains("Audi")) {
//                    System.out.println(myCars);
//                    result = true;
//                }
//            }

        return findSet;
    }
    //LIST
    public ArrayList<String> fruits()
    {

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

        return  fruits;
    }
    public String findList(){

        fruits();
        findValue = fruits.get(2);
        System.out.println("Finds the element in index 2" + findValue);

        return findValue;
    }
}
