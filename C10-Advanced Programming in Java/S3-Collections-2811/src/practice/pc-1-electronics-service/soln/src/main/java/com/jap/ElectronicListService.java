package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        String[] splitItems = electronicsItems.split(",");
        for (String item: splitItems) {
            if(!itemList.contains(item.trim())){
                itemList.add(item);
            }
        }
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return itemList.indexOf(searchItem);
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        boolean flag = false;
        ListIterator<String> listIterator = itemList.listIterator();
        while(listIterator.hasNext() && !flag){
            String item = listIterator.next();
            if(item.equals(removeItem))
            {
                listIterator.remove();
                flag = true;
            }
        }
        return flag;
    }


}
