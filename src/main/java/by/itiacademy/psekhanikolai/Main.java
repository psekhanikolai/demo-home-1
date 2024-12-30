package by.itiacademy.psekhanikolai;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Wien");
        city.add("Rom");
        city.add("Madrid");
        city.add("Munchen");
        city.add("Salzburg");
        System.out.println(city);
        city.set(2,"Linz");
        System.out.println(city);
        System.out.println(Util.cityMax(city));
        System.out.println(Util.cityMin(city));
    }
}
