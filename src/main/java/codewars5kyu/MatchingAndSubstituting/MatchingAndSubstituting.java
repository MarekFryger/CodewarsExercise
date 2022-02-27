package codewars5kyu.MatchingAndSubstituting;

public class MatchingAndSubstituting {
    public static String change(String s, String prog, String version) {
        String[] split = s.split("\n");
        String result = "";
        boolean b = split[5].split("\\.").length != 2;
        String[] s1 = split[5].split(" ");
        boolean c = s1[1].startsWith(".") || s1[1].startsWith(",");
        String[] phoneSplit = split[3].split("-");
        try {
            for (int i = 1; i < phoneSplit.length; i++) {
                Integer.parseInt(phoneSplit[i]);
            }
        } catch (Exception e) {
            return "ERROR: VERSION or PHONE";
        }

        if (phoneSplit[3].length() != 4 || version.startsWith(",") || version.startsWith(".") || !phoneSplit[0].endsWith("1")
                || b || c) {
            return "ERROR: VERSION or PHONE";
        }
        split[0] = split[0].replace(split[0], "Program: ") + prog;
        split[1] = " Author: g964 ";
        split[3] = split[3].replace(split[3], "Phone: +1-503-555-0090 ");
        split[4] = split[4].replace(split[4], "Date: 2019-01-01 ");
        if (split[5].equals("Version: 2.0")) {
            version = "2.0";
        }
        split[6] = split[6].replace(split[6], "Version: ") + version;
        result = split[0] + split[1] + split[3] + split[4] + split[6];
        return result;
    }
}
