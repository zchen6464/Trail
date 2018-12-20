package com.company;

public class Main {

    public static void main(String[] args) {
        int[] markers = {100,150,105,120,90,80,50,75,75,70,80,90,100};
        Trail x = new Trail(markers);

        System.out.println(x.isDifficult());

        System.out.println(x.isLevelTrailSegment(1,5));
        System.out.println(x.isLevelTrailSegment(2,3));
    }
}
