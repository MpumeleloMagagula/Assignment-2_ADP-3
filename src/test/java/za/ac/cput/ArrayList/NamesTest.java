package za.ac.cput.ArrayList;

import com.sun.source.doctree.SeeTree;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;


import static org.junit.jupiter.api.Assertions.*;


class NamesTest {

    static  Names list = new Names();

    @Test
    void people() {
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
    void findMap(){

        String phone ="Apple";
        assertEquals(phone, list.findMap());

    }

    @Test
    void cars() {
        Set<String> result = list.cars();
        assertEquals(3,result.size());

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

