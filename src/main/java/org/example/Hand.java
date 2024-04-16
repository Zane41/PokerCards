package org.example;


import java.util.HashMap;

import static org.example.RangOfHand.Rank.*;

public class Hand implements Comparable <Hand> {

   public static int compareTo (Focus hand1, Focus  hand2) {
       HashMap<Object, RangOfHand.Rank> values = new HashMap<>();
       values.put(null,Kicker);
       values.put(null,Pair);
       values.put(null,TwoPairs);
       values.put(null,Set);
       values.put(null,Straight);
       values.put(null,Flash);
       values.put(null,FullHouse);
       values.put(null,Quad);
       values.put(null,StraightFlash);
       for (Card x: hand1)
           for (Card y: hand1)

   }

    @Override
    public  int compareTo(Hand o) {
        return 0;
    }
}
