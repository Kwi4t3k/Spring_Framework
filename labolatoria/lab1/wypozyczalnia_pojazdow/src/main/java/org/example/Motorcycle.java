package org.example;

public class Motorcycle extends Vehicle {
    private String category; // kategoria prawa jazdy

    public Motorcycle(String brand, String model, int year, float price, String id, String category) {
        super(brand, model, year, price, id);
        this.category = category;
    }

    @Override
    public String toCSV() {
        return brand + ";" + model + ";" + year + ";" + price + ";" + id + ";" + rented + ";" + category;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", category='" + category + "'}";
    }
}