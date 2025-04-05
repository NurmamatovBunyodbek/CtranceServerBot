package org.example;

import lombok.*;

/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/11/2024 *Time:12:06 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User {
    private String firstName;
    private String phoneNumber;
    private Positions currentPosition;
    private String currentLanguage;
    private double kg;
    private double volume;
    private String sendType;
    private double moneyAmount;
    private String fromCurr;
    private String toCurr;

    @Override
    public String toString() {
        return firstName + " " + phoneNumber + " " + currentLanguage + " " + currentPosition;
    }
}
