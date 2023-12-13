package com.example.rand.Model;

public class Data {
    public int id;
    public double value;

    public Data() {
        this.id = 0;
        this.value = 0.0;
    }
    public Data(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return this.id;
    }

    public double getValue() {
        return this.value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String toString() {
        return "Data(name=" + this.getId() + ", value=" + this.getValue() + ")";
    }
}
