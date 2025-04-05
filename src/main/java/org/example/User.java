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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Positions getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Positions currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getCurrentLanguage() {
        return currentLanguage;
    }

    public void setCurrentLanguage(String currentLanguage) {
        this.currentLanguage = currentLanguage;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getFromCurr() {
        return fromCurr;
    }

    public void setFromCurr(String fromCurr) {
        this.fromCurr = fromCurr;
    }

    public String getToCurr() {
        return toCurr;
    }

    public void setToCurr(String toCurr) {
        this.toCurr = toCurr;
    }

    @Override
    public String toString() {
        return firstName + " " + phoneNumber + " " + currentLanguage + " " + currentPosition;
    }
}
