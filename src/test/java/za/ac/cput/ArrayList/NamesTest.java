package za.ac.cput.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Mpumelelo Magagula
 * Student Number: 218136021
 * Date: 11 May 2021
 * Description: this progeam diaplay number of name list.
 */
class NamesTest {

    @BeforeEach
    void setUp() {

    }
    @Test
    void test(){

       List<Names> namesList = new ArrayList<>();
       Set<Names> namesSet = new HashSet<>();
       Map<String, Names> namesMap = new HashMap<>();
       Collection n = new LinkedHashSet();


        for (int i = 0; i <50; i++){
            String firstNAme = "m" + 1;
            Names n = new Names(firstNAme);
            namesList.add(n);
            namesSet.add(n);
            namesMap.put("Pollo", n);
        }
        assertEquals(50, namesList.size());
      //  assertEquals(50, namesSet.size());
        assertEquals(50, namesMap.size());

    }

}