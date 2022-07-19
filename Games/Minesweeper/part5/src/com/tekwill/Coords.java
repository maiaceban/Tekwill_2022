package com.tekwill;

import java.util.Objects;

public class Coords {
    private final int i;
    private final int j;

    public Coords(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coords coords = (Coords) o;
        return i == coords.i && j == coords.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}