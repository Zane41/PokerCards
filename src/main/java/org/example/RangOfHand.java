package org.example;

public class RangOfHand implements Comparable<RangOfHand>{

    Rank rankOfHand;


    @Override
    public int compareTo(RangOfHand o) {
        return Integer.compare(this.rankOfHand.ordinal(), o.rankOfHand.ordinal());
    }

    public  enum Rank {
         Kicker ,Pair, TwoPairs ,Set,
        Straight, Flash, FullHouse, Quad, StraightFlash
    }

    public RangOfHand(Rank rank) {
        this.rankOfHand=rank;
    }


}
