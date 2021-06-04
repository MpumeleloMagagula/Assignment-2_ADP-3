package za.ac.cput.ArrayList;

import com.sun.source.doctree.SeeTree;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;


import static org.junit.jupiter.api.Assertions.*;


class NamesTest {

    static  Names list = new Names();

    @Test
    void people() {
        Collection student = new LinkedHashSet();

        student.add("Mpumelelo");
        student.add("Nomzamo");
    }
    @Test
    void findpeople(){

        assertEquals(true, list.findpeople());   //checking if Nomzamo exist
    }

    @Test
    void cell() {
        Map<Integer, String> result= list.cell();
       // assertThat(result.size(), is(4));
    }
    @Test
    void add(){
        HashSet<String> myCars = new HashSet<>();
        myCars.add("BMW");
        myCars.add("Corrola");
        assertEquals(2,myCars.size());

    }

    @Test
    void remove(){
        HashSet<String> myCars = new HashSet<>();
        myCars.add("BMW");
        myCars.add("Corrola");
        myCars.remove("Volkswagen");
        System.out.println(myCars);
        assertEquals(1, myCars.size());

    }
    @Test void RemoveList(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        fruits.remove("Apple");
        System.out.println(fruits);
        assertEquals(1, fruits.size());
    }

    @Test
    void removeMap() {
        HashMap<Integer,String> phone = new HashMap<>();

        phone.put( 100,"Apple");
        phone.put( 101,"Samsung");

        phone.remove(5);
        System.out.println(phone);
        assertEquals(1, phone.size());

    }
    @Test
    void findMap(){

        String phone ="Apple";
        assertEquals(phone, list.findMap());

    }

    @Test
    void carsSet() {
        HashSet<String> myCars = new HashSet<>();
        myCars.add("BMW");
        myCars.add("Corrola");
        myCars.add("Volkswagen");


        assertEquals(3,myCars.size());

    }
    @Test
    void findSet(){

        assertEquals(true, list.findSet());
    }

    @Test
    void fruits() {
        List<String> result = list.fruits();
        assertEquals(Arrays.asList("Apple","Banana","Watermelon","Orange"),result);
    }

    @Test
    void findList(){
        String fruits = "Banana";
        assertEquals(fruits, list.findList()); // finds banana
    }
}

