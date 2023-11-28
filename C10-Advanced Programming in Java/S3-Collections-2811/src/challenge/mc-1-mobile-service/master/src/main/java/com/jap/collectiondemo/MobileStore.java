package com.jap.collectiondemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MobileStore {





    //Iterate the List given as method parameter and retrieve the bandName
    //Return the List with specific Mobile having brandName coming from method parameter
    public List<Mobile> findPhoneByBrand(String brandName,List<Mobile> allMobiles)
    {
        List<Mobile> mobilesByBrand = new ArrayList<>();

        return mobilesByBrand;
    }

    //Iterate through the List given as the method parameter
    //Return the List of Mobile whose cost is more than $500
    public List<Mobile> findPhoneCostMoreThan$500(List<Mobile> allMobiles)
    {
        List<Mobile> mobilesMoreThan500 = new ArrayList<>();

        return mobilesMoreThan500;
    }

    //Iterate through the List given as the method parameter
    //Return the List of Mobile whose Pixel is more than 12MP
    public List<Mobile> findPhonePixelMoreThan12MP(List<Mobile> allMobiles)
    {
        List<Mobile> mobilesMoreThan12MP = new ArrayList<>();

        return mobilesMoreThan12MP;
    }


}

