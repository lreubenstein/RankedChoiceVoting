package com.company;

import java.util.ArrayList;

public class Candidate {
    private String name;
    private int numVotes;
    private ArrayList<Ballot> blist;

    public Candidate(String n){
        name = n;
        numVotes = 0;
        blist = new ArrayList<Ballot>();
    }
    public void addVote(Ballot b){
        blist.add(b);
        numVotes++;
    }

    public int getNumVotes(){
        return numVotes;
    }
}
