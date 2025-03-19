package org.example;

public class Produs {
    private int id;
    Produs(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "id=" + id +
                '}';
    }
}
