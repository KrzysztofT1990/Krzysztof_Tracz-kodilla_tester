package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {

    private String type;
    BadCodeExample badCodeExample2 = new BadCodeExample();

    public static double getPi() {
        return Math.PI;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        badCodeExample2 = (BadCodeExample) o;

        return type != null ? type.equals(badCodeExample2.type) : badCodeExample2.type == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}