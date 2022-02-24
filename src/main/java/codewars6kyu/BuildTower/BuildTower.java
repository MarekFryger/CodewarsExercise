package codewars6kyu.BuildTower;

public class BuildTower {
    public static String[] TowerBuilder(int nFloors) {
        String[] strings = new String[nFloors];
        String temp = "";
        for (int i = 1; i <= nFloors; i++) {
            for (int j = 0; j < (i * 2) - 1; j++) {
                temp = temp + "*";
            }
            strings[i - 1] = temp;
            temp = "";
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = strings.length - i; j > 1; j--) {
                strings[i] = " " + strings[i] + " ";
            }
        }
        return strings;
    }
}

