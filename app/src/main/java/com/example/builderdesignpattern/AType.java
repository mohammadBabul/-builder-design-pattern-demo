package com.example.builderdesignpattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class AType {
    private List<Packing> items=new ArrayList<Packing>();

    public void addItem(Packing packs) {
        items.add(packs);
    }

    public void removeItemA(int position){
        items.remove(position);
    }
    public void showItems(){
        for (Packing packing : items){
            Log.e("A name : ",   packing.name()+"");
            Log.e("A color :", packing.color()+"");
        }
    }
}
