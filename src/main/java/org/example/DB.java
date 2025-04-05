package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/11/2024 *Time:12:23 PM
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DB {
    static HashMap<String, Set<String>> codes = new HashMap<>();

    static ArrayList<User> users = new ArrayList<>(); //[name, curr_pos, curr_language]

    static int IdFinder(String targetName) {
        int l = 0, r = users.size() - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int comparisonResult = users.get(mid).getFirstName().compareToIgnoreCase(targetName);

            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }//4589475847 573489579403 74398570834

    static void addUser(String name) {
        User newUser = new User(name, "uz", Positions.START, "-1", 0, 0, "", 0, "", "");
        int index = 0;
        int l = 0, r = users.size() - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int comparisonResult = users.get(mid).getFirstName().compareToIgnoreCase(name);

            if (comparisonResult < 0) {
                l = mid + 1;
                index = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        users.add(index, newUser);
    }

    static void getUser() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    static void fillCodes() {
        Set<String> uzb = new HashSet<>();
        uzb.add("33");
        uzb.add("55");
        uzb.add("88");
        uzb.add("90");
        uzb.add("91");
        uzb.add("93");
        uzb.add("94");
        uzb.add("95");
        uzb.add("97");
        uzb.add("98");
        uzb.add("99");
        codes.put("998", uzb);

        Set<String> rus = new HashSet<>();
        rus.add("495");
        rus.add("499");
        rus.add("812");
        rus.add("952");
        rus.add("383");
        rus.add("395");
        rus.add("913");
        codes.put("7", rus);

        Set<String> usa = new HashSet<>();
        usa.add("212");
        usa.add("718");
        usa.add("312");
        usa.add("313");
        usa.add("404");
        usa.add("713");
        usa.add("415");
        usa.add("206");
        codes.put("1", usa);

    }
    public static String isValidPhoneNumber(String phoneNumber, String lan, int id) {
        try {
            String number = phoneNumber.substring(1);
            long k = Long.parseLong(number);
            if (phoneNumber.contains("+998")) {
                String countryCode = phoneNumber.substring(4, 6);
                if (phoneNumber.length() == 13) {
                    if (codes.get("998").contains(countryCode)) {
                        users.get(id).setPhoneNumber(phoneNumber);
                        users.get(id).setCurrentPosition(Positions.MENU);
                        return Massages.CorrectNumber(lan);
                    }
                    return Massages.NoTypeOfCodeNumber(lan);
                }
                return Massages.ExmNumber(lan);
            }
            if (phoneNumber.contains("+7")) {
                String counrtyCode = phoneNumber.substring(2, 5);
                if (phoneNumber.length() == 11) {
                    if (codes.get("7").contains(counrtyCode)) {
                        users.get(id).setPhoneNumber(phoneNumber);
                        users.get(id).setCurrentPosition(Positions.MENU);
                        return Massages.CorrectNumber(lan);
                    }
                    return Massages.NoTypeOfCodeNumber(lan);
                }
                return Massages.ExmNumber(lan);
            }
            if (phoneNumber.contains("+1")) {
                String counrtyCode = phoneNumber.substring(2, 5);
                if (phoneNumber.length() == 12) {
                    if (codes.get("1").contains(counrtyCode)) {
                        users.get(id).setPhoneNumber(phoneNumber);
                        users.get(id).setCurrentPosition(Positions.MENU);
                        return Massages.CorrectNumber(lan);
                    }
                    return Massages.NoTypeOfCodeNumber(lan);
                }
                return Massages.ExmNumber(lan);
            }
        } catch (Exception e) {
            return Massages.OnlyNumber(lan);
        }
        return Massages.ExmNumber(lan);
    }
}

