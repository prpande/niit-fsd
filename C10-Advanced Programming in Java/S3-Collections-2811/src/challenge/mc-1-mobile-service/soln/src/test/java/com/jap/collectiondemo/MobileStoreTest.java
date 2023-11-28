package com.jap.collectiondemo;

import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;


public class MobileStoreTest {

    MobileStore mobileStore;
    List<Mobile> list;


    @Before
    public void setUp() {
        mobileStore = new MobileStore();

        Mobile m1 = new Mobile("Samsung", "Samsung galaxy A72", 424.98, "6.7 inches", "Li-Ion 5000 mAh", "128GB 6GB RAM", 10);
        Mobile m2 = new Mobile("Samsung", "Samsung Galaxy S21 Ultra 5G", 949, "6.8 inches", "Li-Ion 5000 mAh", "128GB 12GB RAM", 14);
        Mobile m3 = new Mobile("Samsung", "Samsung Galaxy A51", 424, "6.7 inches", "Li-Ion 5000 mAh", "64GB 4GB RAM", 13);
        Mobile m4 = new Mobile("Samsung", "Samsung Galaxy A32", 239, "6.4 inches", "Li-Ion 5000 mAh", "64GB 4GB RAM", 14);
        Mobile m5 = new Mobile("Sony", "Sony Xperia 1 III", 456, "6.2 inches", "Li-Ion 5000mAh", "64GB 4GB RAM", 11);
        Mobile m6 = new Mobile("Sony", "Sony Xperia 10 III", 456, "6.4 inches", "Li-Po 3600 mAh", "64GB 4GB RAM", 14);
        Mobile m7 = new Mobile(
                "Sony", "Sony Xperia 5 III", 456, "6.1 inches", "Li-Po 4500 mAh", "64GB 4GB RAM", 12);
        Mobile m8 = new Mobile("Apple", "Apple iPhone 12 Pro Max", 1059, "6.7 inches", "Li-Ion 3687 mAh", "128GB 6GB RAM", 12);
        Mobile m9 = new Mobile("Apple", "Apple iPhone 12", 779, "6.1 inches", "Li-Ion 2815 mAh", "64GB 4GB RAM", 12);
        Mobile m10 = new Mobile("Apple", "Apple iPhone X", 278, "5.8 inches", "Li-Ion 2716 mAh", "64GB 3GB RAM", 14);

        list = List.of(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10);


    }

    @Test
    public void tearDown(){
        mobileStore = null;
        list = null;
    }
    @Test
    public void givenInputSamsumgShouldReturnAllSamsungMobile()
    {

        List brand = mobileStore.findPhoneByBrand("Samsung",list);
        assertEquals(4,brand.size());

    }
    @Test
    public void givenInputAppleShouldReturnAllAppleMobile()
    {

        List brand = mobileStore.findPhoneByBrand("Apple",list);
        assertEquals(3,brand.size());

    }
    @Test
    public void givenInputCostMoreThan500ShouldReturnMobile()
    {

        List brand = mobileStore.findPhoneCostMoreThan$500(list);
        assertEquals(3,brand.size());

    }
    @Test
    public void givenInputPixelMoreThan12ShouldReturnMobile()
    {
        List brand = mobileStore.findPhonePixelMoreThan12MP(list);
        assertEquals(5,brand.size());

    }




}