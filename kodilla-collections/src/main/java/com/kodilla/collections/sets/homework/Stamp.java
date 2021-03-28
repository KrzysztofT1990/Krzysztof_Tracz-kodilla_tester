package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampleName;
    private double stampSizeX;
    private double stampSizeY;
    private boolean stampMarked;

    public Stamp(String stampleName, double stampSizeX, double stampSizeY, boolean stampMarked) {
        this.stampleName = stampleName;
        this.stampSizeX = stampSizeX;
        this.stampSizeY = stampSizeY;
        this.stampMarked = stampMarked;
    }

    public String getStampleName() {
        return stampleName;
    }

    public double getStampSizeX() {
        return stampSizeX;
    }

    public double getStampSizeY() {
        return stampSizeY;
    }

    public boolean isStampMarked() {
        return stampMarked;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampleName='" + stampleName + '\'' +
                ", stampSizeX=" + stampSizeX +
                ", stampSizeY=" + stampSizeY +
                ", stampMarked=" + stampMarked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSizeX, stampSizeX) == 0 && Double.compare(stamp.stampSizeY, stampSizeY) == 0 && stampMarked == stamp.stampMarked && Objects.equals(stampleName, stamp.stampleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampleName, stampSizeX, stampSizeY, stampMarked);
    }

}
