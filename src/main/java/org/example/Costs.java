package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/13/2024 *Time:5:40 PM
 */

import java.util.HashMap;

public class Costs {

    public static HashMap<Integer,Integer> RailWaySmallAmount = new HashMap<>();
    public static HashMap<Integer,Double> RailWayBigAmount = new HashMap<>();
    public static HashMap<Integer,Integer> CarSmallAmount = new HashMap<>();
    public static HashMap<Integer,Double> CarBigAmount = new HashMap<>();

    public static HashMap<Integer,Integer> AirWaySmallAmount = new HashMap<>();
    public static HashMap<Integer,Double> AirWayBigAmount = new HashMap<>();
    public static void fill(){
        RailWaySmallAmount.put(150,170);
        RailWaySmallAmount.put(200,180);
        RailWaySmallAmount.put(300,200);
        RailWaySmallAmount.put(400,210);
        RailWaySmallAmount.put(500,240);
        RailWaySmallAmount.put(700,260);
        RailWaySmallAmount.put(900,310);
        RailWaySmallAmount.put(1000,360);
        int kg = 1500;
        double RailWayPrice = 0.35;
        for(int i = 0; i < 18; i++){
            RailWayBigAmount.put(kg, RailWayPrice);
            kg += 500;
            RailWayPrice += 0.05;
        }

        CarSmallAmount.put(150,140);
        CarSmallAmount.put(200,160);
        CarSmallAmount.put(300,180);
        CarSmallAmount.put(400,200);
        CarSmallAmount.put(500,220);
        CarSmallAmount.put(700,250);
        CarSmallAmount.put(900,280);
        CarSmallAmount.put(1000,320);
        kg = 1500;
        double CarPrice = 0.52;
        for(int i = 0; i < 18; i++){
            CarBigAmount.put(kg, CarPrice);
            kg += 500;
            CarPrice += 0.05;
        }

        AirWaySmallAmount.put(160,180);
        AirWaySmallAmount.put(210,190);
        AirWaySmallAmount.put(310,210);
        AirWaySmallAmount.put(410,220);
        AirWaySmallAmount.put(510,250);
        AirWaySmallAmount.put(710,270);
        AirWaySmallAmount.put(910,320);
        AirWaySmallAmount.put(1000,370);
        kg = 1500;
        double AirPrice = 0.85;
        for(int i = 0; i < 18; i++){
            AirWayBigAmount.put(kg, AirPrice);
            kg += 500;
            RailWayPrice += 0.05;
        }
    }

    public static double priceAir(double kg, double volume){
        if(kg <= 1000){
            for (int key : AirWaySmallAmount.keySet()) {
                if(kg < key){
                    return AirWaySmallAmount.get(key) * volume;
                }
            }
        }else{
            for(int key : AirWayBigAmount.keySet()){
                if(kg < key){
                    return AirWayBigAmount.get(key) * kg;
                }
            }
        }
        return 0;
    }

    public static double priceRailWay(double kg, double volume){

        if(kg <= 1000){

            for (int key : RailWaySmallAmount.keySet()) {
                if(kg < key){
                    System.out.println(RailWaySmallAmount.get(key) * volume);
                    return RailWaySmallAmount.get(key) * volume;
                }
            }
        }else{
            for(int key : RailWayBigAmount.keySet()){
                if(kg < key){
                    return RailWayBigAmount.get(key) * kg;
                }
            }
        }
        return 0;
    }
    public static double priceCar(double kg, double volume){
        if(kg <= 1000){
            for (int key : CarSmallAmount.keySet()) {
                if(kg < key){
                    return CarSmallAmount.get(key) * volume;
                }
            }
        }else{
            for(int key : CarBigAmount.keySet()){
                if(kg < key){
                    return CarBigAmount.get(key) * kg;
                }
            }
        }
        return 0;
    }
}