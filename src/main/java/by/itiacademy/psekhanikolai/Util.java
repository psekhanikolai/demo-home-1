package by.itiacademy.psekhanikolai;

import java.util.ArrayList;

public class Util {
    public static String cityMax(ArrayList<String> city) {
        int maxLength = city.get(0).length();
        String cityMax = city.get(0);
        for (String citys : city) {
            if (citys.length() > maxLength) {
                cityMax = citys;
                maxLength = citys.length();
            }
        }
        return cityMax;
    }
    public static String cityMin(ArrayList<String> city){
        int minLength = city.get(0).length();
        String cityMin = city.get(0);
        for (String citys : city){
            if (citys.length()<minLength){
                cityMin= citys;
                minLength = citys.length();

            }
        }
        return cityMin;

    }
}
