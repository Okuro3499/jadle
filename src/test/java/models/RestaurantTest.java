package models;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RestaurantTest{

    public Restaurant setupAltRestaurant (){
        return new Restaurant("Mama Njuguna", "Kitale", "30200", "0720140486");
    }
    public Restaurant setupRestaurant (){
        return new Restaurant("Mama Njuguna", "Kitale", "30200", "0720140486", "http://mamanjuguna.com", "mamanjuguna.com");
    }
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void getNameReturnsCorrectName() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("Mama Njuguna", testRestaurant.getName());
    }
    @Test
    public void getAddressReturnsCorrectAddress() throws Exception{
        Restaurant testRestaurant =setupRestaurant();
        assertEquals("Kitale",testRestaurant.getAddress());

    }
    @Test
    public void getZipcodeReturnsCorrectZipcode() throws Exception{
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("30200",testRestaurant.getZipcode());
    }
    @Test
    public void getPhoneReturnsCorrectPhone() throws Exception{
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("0720140486",testRestaurant.getPhone());
    }
    @Test
    public void getWebsiteReturnsCorrectWebsite() throws Exception {
        Restaurant testRestaurant = setupAltRestaurant();
        assertEquals("no website listed", testRestaurant.getWebsite());
    }

    @Test
    public void getEmailReturnsCorrectEmail() throws Exception {
        Restaurant testRestaurant = setupAltRestaurant();
        assertEquals("no email available", testRestaurant.getEmail());
    }
    @Test
    public void setNameSetsCorrectName() throws Exception{
        Restaurant testRestaurant =setupRestaurant();
        testRestaurant.setName("Lilians");
        assertNotEquals("Mama Njuguna", testRestaurant.getName());
    }
    @Test
    public void setAddressSetsCorrectAddress() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setAddress("Eldoret");
        assertNotEquals("Kitale", testRestaurant.getAddress());
    }

    @Test
    public void setZipSetsCorrectZip() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setZipcode("01000");
        assertNotEquals("30200", testRestaurant.getZipcode());
    }
    @Test
    public void setPhoneSetsCorrectPhone() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setPhone("0790943918");
        assertNotEquals("0720140486", testRestaurant.getPhone());
    }

    @Test
    public void setWebsiteSetsCorrectWebsite() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setWebsite("http://lilians.com");
        assertNotEquals("http://mamanjuguna.com", testRestaurant.getWebsite());
    }

    @Test
    public void setEmailSetsCorrectEmail() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setEmail("lilians.com");
        assertNotEquals("mamanjuguna.com", testRestaurant.getEmail());
    }

}