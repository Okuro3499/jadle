package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FoodtypeTest  {

    public Foodtype setupFoodtype() {return new Foodtype("Githeri");}
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void getNameReturnCorrectName(){
        Foodtype testFoodtype = setupFoodtype();
        assertEquals("Githeri",testFoodtype.getName());
    }
    @Test
    public void setNameReturnCorectName(){
        Foodtype testFoodtype = setupFoodtype();
        testFoodtype.setName("rice");
        assertNotEquals("Githeri", testFoodtype.getName());
    }
}