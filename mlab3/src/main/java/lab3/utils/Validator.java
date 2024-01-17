package lab3.utils;

import lab3.entity.Shot;


public class Validator {

    public static boolean isValid(Shot aShot) {
        double x = aShot.getX();
        double y = aShot.getY();
        double r = aShot.getR();
        return (x >= -2 && x <= 1.5 && y >= -3 && y <= 3 && r >= 1 && r <= 5 && r % 0.5 == 0.);
    }
}
