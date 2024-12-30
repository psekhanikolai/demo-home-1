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
}
