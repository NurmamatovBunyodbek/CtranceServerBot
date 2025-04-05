package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/27/2024 *Time:7:33 PM
 */

public class Massages {
    public static String CorrectNumber(String lan){
        switch (lan) {
            case "uz" -> {
                return "Muvaffaqiyatli o'zgardi";
            }
            case "ru" -> {
                return "Успешно изменено";
            }
            case "en" -> {
                return "successfully changed";
            }
        }
        return "";
    }

    public static String ExmNumber(String lan){
        switch (lan) {
            case "uz" -> {
                return "Raqam ko'rinishi +DavlatRaqami*********";
            }
            case "ru" -> {
                return "Отображение номера +КодCтраны***********";
            }
            case "en" -> {
                return "Autobrajenie number +CountryCode*********";
            }
        }
        return "";
    }

    public static String NoTypeOfCodeNumber(String lan){
        switch (lan) {
            case "uz" -> {
                return "Bunday kod yo'q";
            }
            case "ru" -> {
                return "Нет такого кода";
            }
            case "en" -> {
                return "There is no such code";
            }
        }
        return "";
    }

    public static String OnlyNumber(String lan){
        switch (lan) {
            case "uz" -> {
                return "Raqam faqat sonlardan tashkil topgan bo'lishi kerak";
            }
            case "ru" -> {
                return "Номер должен состоять только из цифр";
            }
            case "en" -> {
                return "The number must consist of numbers only";
            }
        }
        return "";
    }
}
