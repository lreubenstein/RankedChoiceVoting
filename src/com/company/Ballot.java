package com.company;

import java.util.ArrayList;

public class Ballot {
    private int numCandidates;
    private ArrayList<String> orderedNames;

    public Ballot(String [] names){
        orderedNames = new ArrayList<String>();
        for (String n: names){
            orderedNames.add(n);
        }
    }
    public String getFirstChoice(){
        return orderedNames.get(0);
    }
    public String getNextChoice(String name){
        int ind = orderedNames.indexOf(name);
        if(ind < numCandidates)
            return orderedNames.get(ind+1);
        return null;
    }
}
