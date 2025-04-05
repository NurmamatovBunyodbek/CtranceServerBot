package org.example;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotServiceEng {
    public SendMessage asosiyMenuEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Main menu");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();
        KeyboardButton button7 = new KeyboardButton();
        KeyboardButton button8 = new KeyboardButton();
        button.setText("\uD83D\uDE9AServices");
        button1.setText("\uD83D\uDE99Cars from China");
        button2.setText("⏰Delivery time");
        button3.setText("☎️Contact us");
        button4.setText("\uD83C\uDFDBCurrency rates");
        button5.setText("\uD83E\uDDEECalculator");
        button6.setText("ℹ️About Us");
        button7.setText("\uD83D\uDCACLeave a comment");
        button8.setText("⚙️Settings");
        row.add(button);
        row1.add(button1);
        row2.add(button2);
        row2.add(button3);
        row3.add(button4);
        row3.add(button5);
        row4.add(button6);
        row4.add(button7);
        row5.add(button8);
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        replyKeyboardMarkUp.setKeyboard(rowList);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);
        return sendMessage;
    }

    public SendMessage kontaktYuborishEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDE Enter your phone number to register. \n" +
                " \n" +
                " Send the number as +998***********.");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setRequestContact(true);
        button1.setText("☎️\uFE0FSend phone number");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);

        return sendMessage;
    }

    public SendMessage izohQoldirishEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Leave a comment. Your opinion is important to us");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️Back");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);

        return sendMessage;
    }

    public SendMessage izohQabulQilindiEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅Your comment has been accepted");
        return sendMessage;
    }

    public SendMessage kanlkulyatorEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the transport you need");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        button.setText("✈️Air transport");
        button1.setText("\uD83D\uDE88Railway transport");
        button2.setText("\uD83D\uDE98Auto transport");
        button3.setText("⬅️Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row2.add(button3);

        rows.add(row);
        rows.add(row1);
        rows.add(row2);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);
        return sendMessage;
    }

    public SendMessage servicesEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select the type of service.");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();

        button.setText("✈️ Air transportation");
        button1.setText("\uD83D\uDE98 Auto transportation");
        button2.setText("\uD83D\uDE88 Railway transportation");
        button3.setText("Werehouse services in Yiwu and Gungzhou");
        button4.setText("Customs Clearance services");
        button5.setText("⬅️Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);
        row3.add(button5);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage carsFromChinaEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("choose your type car");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();

        button.setText("Sedąn");
        button1.setText("Crossover");
        button2.setText("Hatchback");
        button3.setText("Minivan");
        button4.setText("⬅️Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage deliveryTimeEng(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the category you need.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("✈️  Air transport");
        button1.setText("\uD83D\uDE98  Auto transportation");
        button2.setText("\uD83D\uDE88  Railway transportation");
        button3.setText("⬅️Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row2.add(button3);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendPhoto aboutUsEng(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/5c/e3/b9/5ce3b9d4ec0468f7fac20377e82dae09.jpg"));
        sendPhoto.setCaption("""
        ABOUT US
        
        Experience in the field of logistics services around the world.
        
        We pride ourselves on providing the best shipping and transportation deals around the world.
        
        ✅100% Compensation
        ✅Online tracking
        ✅Experienced Team
        ✅Cargo insurance
        ✅Safe warehouse
        ✅Support 24/7
        """);

        return sendPhoto;
    }

    public SendMessage minivanEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("select the minivan type");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("🚐 Denza D9");
        button1.setText("🚐 Zeeker 009");
        button2.setText("⬅️ Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);

        rowList.add(row);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage hatchBackEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("select the hatchback type");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();

        button.setText("🚗 BYD Seagull");
        button1.setText("🚗 BYD Dolphin");
        button2.setText("🚗 BYD E2");
        button3.setText("🚗 Changan BenBen E-Star");
        button4.setText("⬅️ Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage sedanEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("select the sedan type");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6 = new KeyboardRow();
        KeyboardRow row7 = new KeyboardRow();
        KeyboardRow row8 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();
        KeyboardButton button7 = new KeyboardButton();
        KeyboardButton button8 = new KeyboardButton();
        KeyboardButton button9 = new KeyboardButton();
        KeyboardButton button10 = new KeyboardButton();
        KeyboardButton button11 = new KeyboardButton();
        KeyboardButton button12 = new KeyboardButton();
        KeyboardButton button13 = new KeyboardButton();
        KeyboardButton button14 = new KeyboardButton();
        KeyboardButton button15 = new KeyboardButton();

        button.setText("🏎 BYD Seal");
        button1.setText("🏎 BYD Han");
        button2.setText("🏎 Chevrolet Monza 1.5L Atmo");
        button3.setText("🏎 Chevrolet Monza 1.3L Turbo");
        button4.setText("🏎 Honda Crider 1.0L Turbo");
        button5.setText("🏎 LeapMotor C01");
        button6.setText("🏎 HiPhi Z");
        button7.setText("🏎 IM Motors L7");
        button8.setText("🏎 Geometry G6");
        button9.setText("🏎 BMW i3 eDrive40");
        button10.setText("🏎 BMW i4 eDrive35");
        button11.setText("🏎 BMW i5 eDrive40");
        button12.setText("🏎 Neta S");
        button13.setText("🏎 Neta Gt");
        button14.setText("🏎 Zeeker 007");
        button15.setText("⬅️ Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);
        row2.add(button5);
        row3.add(button6);
        row3.add(button7);
        row4.add(button8);
        row4.add(button9);
        row5.add(button10);
        row5.add(button11);
        row6.add(button12);
        row6.add(button13);
        row7.add(button14);
        row8.add(button15);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage crossoverEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("select the crossover type");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6 = new KeyboardRow();
        KeyboardRow row7 = new KeyboardRow();
        KeyboardRow row8 = new KeyboardRow();
        KeyboardRow row9 = new KeyboardRow();
        KeyboardRow row10 = new KeyboardRow();
        KeyboardRow row11 = new KeyboardRow();
        KeyboardRow row12 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();
        KeyboardButton button7 = new KeyboardButton();
        KeyboardButton button8 = new KeyboardButton();
        KeyboardButton button9 = new KeyboardButton();
        KeyboardButton button10 = new KeyboardButton();
        KeyboardButton button11 = new KeyboardButton();
        KeyboardButton button12 = new KeyboardButton();
        KeyboardButton button13 = new KeyboardButton();
        KeyboardButton button14 = new KeyboardButton();
        KeyboardButton button15 = new KeyboardButton();
        KeyboardButton button16 = new KeyboardButton();
        KeyboardButton button17 = new KeyboardButton();
        KeyboardButton button18 = new KeyboardButton();
        KeyboardButton button19 = new KeyboardButton();
        KeyboardButton button20 = new KeyboardButton();
        KeyboardButton button21 = new KeyboardButton();
        KeyboardButton button22 = new KeyboardButton();
        KeyboardButton button23 = new KeyboardButton();
        KeyboardButton button24 = new KeyboardButton();

        button.setText("🚙 BYD Song Plus Champion Edition");
        button1.setText("🚙 BYD Tang EV");
        button2.setText("🚙 BYD Yuan Plus EV");
        button3.setText("🚙 Zeeker 001");
        button4.setText("🚙 Zeeker X");
        button5.setText("🚙 LeapMotor C11");
        button6.setText("🚙 Geely Geometry E");
        button7.setText("🚙 Denza N7");
        button8.setText("🚙 HiPhi Y");
        button9.setText("🚙 NIO ES8");
        button10.setText("🚙 NIO EC7");
        button11.setText("🚙 LI Auto L7");
        button12.setText("🚙 LI Auto L9");
        button13.setText("🚙 IM Motors LS7");
        button14.setText("🚙 Geometry M6");
        button15.setText("🚙 LI Auto L8");
        button16.setText("🚙 Avatr 11");
        button17.setText("🚙 HiPhi X");
        button18.setText("🚙 LI Auto One");
        button19.setText("🚙 Lynk&Co 09EM-P");
        button20.setText("🚙 Chevrolet Seeker");
        button21.setText("🚙 BYD Song L");
        button22.setText("🚙 BYD Yangwang U8");
        button23.setText("🚙 Jishi 01");
        button24.setText("⬅️ Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);
        row2.add(button5);
        row3.add(button6);
        row3.add(button7);
        row4.add(button8);
        row4.add(button9);
        row5.add(button10);
        row5.add(button11);
        row6.add(button12);
        row6.add(button13);
        row7.add(button14);
        row7.add(button15);
        row8.add(button16);
        row8.add(button17);
        row9.add(button18);
        row9.add(button19);
        row10.add(button20);
        row10.add(button21);
        row11.add(button22);
        row11.add(button23);
        row12.add(button24);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        rowList.add(row8);
        rowList.add(row9);
        rowList.add(row10);
        rowList.add(row11);
        rowList.add(row12);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }





    public SendMessage settingsEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("⚙️Choose a setting");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("\uD83C\uDDFA\uD83C\uDDF8Change language");
        button1.setText("☎️change phone number");
        button2.setText("⬅️Back");
        row.add(button);
        row.add(button1);
        row1.add(button2);
        rowList.add(row);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage NomerAlmashtirEng(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Number change");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        ArrayList<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        button.setText("☎️ Send phone number");
        row.add(button);
        rowList.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️Back");
        row1.add(button1);
        rowList.add(row1);
        reply.setResizeKeyboard(true);
        reply.setKeyboard(rowList);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    //---Sedan boshlanish---\\

    public SendPhoto bydSeal(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/GbnFoweKIIJ8SGRcR3X1qaBAmgizk9E8798rn536.webp"));
        sendPhoto.setCaption("""
                BYD Seal
                                
                ✅Battery capacity, kW: 82,5       
                ✅Acceleration 0-100 km, sec: 3,8  
                ✅Power, kW/hp: 390/530            
                ✅Drive unit: Full                 
                ✅Range (NEDC), km: 650
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180
                ✅Charging speed (slow / fast), hour: 11,8/0,5
                                
                """);

        return sendPhoto;
    }

    public SendPhoto bydHan(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/G5LEALmmX7YN3h2S0ejHxggKreWq0hgj0rkNV3zI.webp"));
        sendPhoto.setCaption("""
                BYD Han
                                
                ✅Battery capacity, kW: 85,4    
                ✅Acceleration 0-100 km, sec: 3,9
                ✅Power, kW/hp: 380/517         
                ✅Drive unit: Full                 
                ✅Range (NEDC), km: 610
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 185
                ✅Charging speed (slow / fast), hour: 12,2/0,5
                                
                """);

        return sendPhoto;
    }

    public SendPhoto chevroletMonzaAtmo(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/7XZX6Aa66UBk54V6XkdOikpRj7MaSpDsfdPEecaw.webp"));
        sendPhoto.setCaption("""
                Chevrolet Monza 1.5L Atmo
                                
                ✅Engine: 1.5 L (113 hp)    
                ✅Transmission: 6-AT (Robot)
                ✅Acceleration (0-100 km/h): 12.9 s         
                ✅Fuel type: Petrol                 
                ✅Drive unit: Full
                ✅Number of seats: 5
                               
                """);

        return sendPhoto;
    }

    public SendPhoto chevroletMonzaTurbo(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/b3iKeMlJtqB2tNlBX4F9UYXbWLtrXRqJiD9ht8Sm.webp"));
        sendPhoto.setCaption("""
                Chevrolet Monza 1.3L Turbo
                                
                ✅Engine: 1.3L Tubro (163 hp)    
                ✅Transmission: 6-AT (Robot)
                ✅Acceleration (0-100 km/h): 9.2 s         
                ✅Fuel type: Petrol                 
                ✅Drive unit: Full
                ✅Drive unit: Full
                               
                """);

        return sendPhoto;
    }

    public SendPhoto HondaCriderTurbo(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/WWWDezhpGgYHzzR9VApgwmj9eeNyNtW7OAlYygCk.webp"));
        sendPhoto.setCaption("""
                Honda Crider 1.0L Turbo
                                
                ✅Engine capacity: 1.0 L Turbo   
                ✅Engine's type: Petrol
                ✅Consumption: 5.0 L     
                ✅Power: 122 HP                 
                ✅Acceleration to 100: 10.7 s
                               
                """);

        return sendPhoto;
    }

    public SendPhoto leapMotorC01(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/gAvBM75WivxQrmjUD4oBWpXvhS0MjkTfLEvz2v5d.webp"));
        sendPhoto.setCaption("""
                LeapMotor C01
                                
                ✅Battery capacity, kW: 90   
                ✅Acceleration 0-100 km, sec: 3,6
                ✅Power, kW/hp: 400/544     
                ✅Drive unit: Full                 
                ✅Range (NEDC), km: 630
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180
                               
                """);

        return sendPhoto;
    }

    public SendPhoto HiPhiZ(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/TmaFh6qeILQV09RdIovwNghxCrx9BASiaMFvgdO9.webp"));
        sendPhoto.setCaption("""
                HiPhi Z
                                
                ✅Battery capacity, kW: 120
                ✅Acceleration 0-100 km, sec: 3,8
                ✅Power, kW/hp: 494/672
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 705
                ✅Number of seats: 4
                ✅Maximum speed, km/h: 200
                ✅Charging speed (slow / fast), hour: 12,4/0,92               
                                
                """);

        return sendPhoto;
    }

    public SendPhoto imMotorsL7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/n7IgJoqfWsM0w5ljA24sr0wBGUq7lrUp3g9bb5wi.webp"));
        sendPhoto.setCaption("""
                IM Motors L7
                                
                ✅Battery capacity, kW: 90
                ✅Acceleration 0-100 km, sec: 3,7
                ✅Power: 445kW / 605Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 615
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 200             

                """);

        return sendPhoto;
    }

    public SendPhoto geometryG6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/Zl6MhKhdsf1r5CfqLELkB4DnHjaliEh4XoTU6I56.webp"));
        sendPhoto.setCaption("""
                Geometry G6
                                
                ✅Battery capacity, kW: 70
                ✅Acceleration 0-100 km, sec: 6,9
                ✅Power: 150kW / 204Nm
                ✅Drive unit: Front
                ✅Power reserve, km: 580
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 150

                """);

        return sendPhoto;
    }

    public SendPhoto bmwi3eDrive40(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/eQXmyVoEXPqMbHTXPKK2SrtMvKeFYs9BkaYGTs70.webp"));
        sendPhoto.setCaption("""
                BMW i3 eDrive40
                                
                ✅Battery capacity, kW: 78,92
                ✅Acceleration 0-100 km, sec: 5,6
                ✅Power, kW/hp: 250/340
                ✅Drive unit: rear
                ✅Power reserve (NEDC), km: 592
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180
                ✅Charging speed (slow / fast), hour: 7,5/0,68
                                
                """);

        return sendPhoto;
    }

    public SendPhoto bmwi4eDrive35(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/gwvcNdDemXzj2KnSzE4KnrAiEQbr722zUqpkNwsw.webp"));
        sendPhoto.setCaption("""
                BMW i4 eDrive35
                                
                ✅Battery capacity, kW: 83,9
                ✅Acceleration 0-100 km, sec: 5,7
                ✅Power: 250kW / 340Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 625
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 182

                """);

        return sendPhoto;
    }

    public SendPhoto bmwi5eDrive40(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/5Pkx8cb6yJEhEPsJdXDBzEmfVDOr361aBdZILSLb.webp"));
        sendPhoto.setCaption("""
                BMW i5 eDrive40
                                
                ✅Battery capacity, kW: 81.2
                ✅Acceleration 0-100 km, sec: 6
                ✅Power: 340kW / 586Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 582
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 193

                """);

        return sendPhoto;
    }

    public SendPhoto netaS(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/fktgieIK4VYEVFIP0uN36tNjxRymXuAX2LIluq2Q.webp"));
        sendPhoto.setCaption("""
                Neta S
                                
                ✅Battery capacity, kW: 91
                ✅Acceleration 0-100 km, sec: 3,9
                ✅Power, kW/hp: 340/462
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 715
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 185
                ✅Charging speed (slow / fast), hour: 17/0,58

                """);

        return sendPhoto;
    }

    public SendPhoto netaGt(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/7fdWbQK8rsxAid456F7zwCFsqAIcKaibwZH1rMVS.webp"));
        sendPhoto.setCaption("""
                Neta GT
                                
                ✅Battery capacity, kW: 74.5
                ✅Number of seats: 4
                ✅Maximum speed, km/h: 190
                ✅Power reserve (NEDC), km: 650
                ✅Power, kW/hp: 170
                ✅Drive unit: rear
                                
                """);

        return sendPhoto;
    }

    public SendPhoto zeeker007(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/o81wp9OhfwgTCIkaXwEoFqhO0Dsgxx7Mh3VDFw47.webp"));
        sendPhoto.setCaption("""
                Zeeker 007
                                
                ✅Battery capacity, kW: 70
                ✅Acceleration 0-100 km, sec: 2,84
                ✅Power: 421kW / 224Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 688
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 210

                """);

        return sendPhoto;
    }

    //---Sedan yakunlanish---\\

    //---Krossover boshlanish---\\

    public SendPhoto bydSongPlusChampionEdition(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/6xKSj76RdxhSGrindKkIbsV6J4MZJeI4bhF7SvK9.webp"));
        sendPhoto.setCaption("""
                BYD Song Plus Champion Edition
                                
                ✅Batareya quvvati: 87,04 kVt/soat
                ✅Displey: 15,6" multimedia
                ✅Karaoke funksiyasi: Bor
                ✅Joylar soni: 5
                ✅Maksimal tezlik, km/soat: 175
                ✅Quvvat zaxirasi (NEDC): 605 km
                ✅Avtomatik to'xtash: Bor
                ✅Tezlashuv 0-100 km, sek: 8,5
                ✅Quvvat, kVt/hp: 160/218
                ✅Haydovchi blok: Old

                """);

        return sendPhoto;
    }

    public SendPhoto bydTengEV(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/MkAX3VNbdNuNqsWJvz3KZgyK1QJVGJpxOcf6rIRP.webp"));
        sendPhoto.setCaption("""
                BYD Teng EV
                                
                ✅Battery capacity, kW: 108,8
                ✅Acceleration 0-100 km, sec: 4,4
                ✅Power, kW/hp: 380/517
                ✅Drive unit: Full
                ✅Range (NEDC), km: 635
                ✅Number of seats: 7
                ✅Maximum speed, km/h: 180
                ✅Charging speed (slow / fast), hour: 16,5/0,5
                
                """);

        return sendPhoto;
    }

    public SendPhoto bydYuanPlusEV(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/GkibsVTK9z55KFCWHnci3A7xZgKGMydhoHGKIdjy.webp"));
        sendPhoto.setCaption("""
                BYD Yuan Plus EV
                                
                ✅Battery capacity, kW: 60.5
                ✅Acceleration 0-100 km, sec: 7,3
                ✅Power, kW/hp: 150/204
                ✅Drive unit: Front
                ✅Range (NEDC), km: 510
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 160
                ✅Charging speed (slow / fast), hour: 8,64/0,5
                
                """);

        return sendPhoto;
    }

    public SendPhoto zeekr001(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/SWxFK8ht6WR0bB2HfhCw1xlONX9RjAN5RuZG18fm.webp"));
        sendPhoto.setCaption("""
                Zeekr 001
                                
                ✅Power reserve (NEDC), km: 650
                ✅Battery capacity, kWh: 100
                ✅Power, kW/hp: 400/544
                ✅Drive unit: Full
                ✅Acceleration 0-100 km, sec: 3,8
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 200
                
                """);

        return sendPhoto;
    }

    public SendPhoto zeekrX(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/41pwueDIG22eJtsPOvQvNm4Cx7tR9nkoSM1VAT2o.webp"));
        sendPhoto.setCaption("""
                Zeekr X
                                
                ✅Power reserve (NEDC), km: 500
                ✅Battery capacity, kWh: 66
                ✅Power, kW/hp: 315/428
                ✅Drive unit: Full
                ✅Acceleration 0-100 km, sec: 3,8
                ✅Number of seats: 4
                ✅Maximum speed, km/h: 190
                
                """);

        return sendPhoto;
    }

    public SendPhoto leapMotorC11(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/aucwGVtBiLRBOpBhJj3qMhb8oQ7ztlh0bvB5zI3Y.webp"));
        sendPhoto.setCaption("""
                Leap Motor C11
                                
                ✅Battery capacity, kW: 90
                ✅Acceleration 0-100 km, sec: 4,5
                ✅Power, kW/hp: 400/544
                ✅Drive unit: Full
                ✅Range (NEDC), km: 580
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 200
                
                """);

        return sendPhoto;
    }


    public SendPhoto GeelyGeometryE(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/juAVI9k9BjoAUgS3eVAV5Rc0gREwuRVBFDfginS4.webp"));
        sendPhoto.setCaption("""
                Geely Geometry E
                                
                ✅Battery capacity, kW: 39,4
                ✅Acceleration 0-100 km, sec: 8,8
                ✅Power, kW/hp: 60/82
                ✅Drive unit: Full
                ✅Range (NEDC), km: 401
                ✅Number of seats: 4
                ✅Maximum speed, km/h: 102
                
                """);

        return sendPhoto;
    }

    public SendPhoto denzaN7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/wvBTQdrUhyfgKY8S7xqOseeicOmtGL7wLGNnY7E6.webp"));
        sendPhoto.setCaption("""
                Denza N7
                
                ✅Battery capacity, kW: 91,3
                ✅Acceleration 0-100 km, sec: 3,9
                ✅Power, kW/hp: 390/530
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 630
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180
                
                """);

        return sendPhoto;
    }

    public SendPhoto hiPhiY(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/jbLkedyoEHmhdmhGfmWPDhee6a3jqqFgq55GYxq8.webp"));
        sendPhoto.setCaption("""
                HiPhi Y
                                
                ✅Battery capacity, kW: 115
                ✅Acceleration 0-100 km, sec: 4,7
                ✅Power, kW/hp: 371/505
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 765
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 190
                
                """);

        return sendPhoto;
    }

    public SendPhoto nioES8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/zQV9rA6sYRm8zNgnxBdtHYdR2XczJUnxElxkOeVc.webp"));
        sendPhoto.setCaption("""
                NIO ES8
                                
                ✅Battery capacity, kW: 100
                ✅Acceleration 0-100 km, sec: 4,1
                ✅Power, kW/hp: 480/653
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 605
                ✅Number of seats: 6
                ✅Maximum speed, km/h: 200
                ✅Charging speed (slow / fast), hour: 0,5
                          
                """);

        return sendPhoto;
    }

    public SendPhoto nioEC7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/xoOfzfnOEU35Da860RQf7tmwLu4tmSzHFgbGKESz.webp"));
        sendPhoto.setCaption("""
                NIO EC7
                                
                ✅Battery capacity, kW: 100
                ✅Acceleration 0-100 km, sec: 3,8
                ✅Power, kW/hp: 480/653
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 635
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 200
                ✅Charging speed (slow / fast), hour: 0,33
                                
                """);

        return sendPhoto;
    }


    public SendPhoto liAutoL7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/RNQBVoacpvXjimNtBxZfZDfJN00HVDL6N7XQAM4l.webp"));
        sendPhoto.setCaption("""
                LI Auto L7
                                
                ✅Battery capacity, kW: 42.8
                ✅Acceleration 0-100 km, sec: 5.3
                ✅Power: 330 kW / 620 Nm
                ✅Power reserve, km: 1315
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180
                         
                """);

        return sendPhoto;
    }

    public SendPhoto liAutoL9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/hYabLzhJzyKeKAmbXydaT5kgK7za47MAZLOQzwO6.webp"));
        sendPhoto.setCaption("""
                LI Auto L9
                                
                ✅Battery capacity, kW: 44.5
                ✅Acceleration 0-100 km, sec: 5.3
                ✅Power: 330 kW / 620 Nm
                ✅Power reserve, km: 1100
                ✅Number of seats: 6
                ✅Maximum speed, km/h: 180
                
                """);
        return sendPhoto;
    }

    public SendPhoto IMMotorsLS7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/tpG5urfPNaVYhLY7sEkYmfBYIo63zuWsa88nOq4U.webp"));
        sendPhoto.setCaption("""
                IM Motors LS7
                                
                ✅Battery capacity, kW: 100
                ✅Acceleration 0-100 km, sec: 4,5
                ✅Power: 425kW / 578Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 625
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 200
                
                """);

        return sendPhoto;
    }

    public SendPhoto geometryM6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/BgJZKJoWenpHEV6sbSeLRzWFmKYN2E9QcxqyFyvM.webp"));
        sendPhoto.setCaption("""
                Geometry M6
                                
                ✅Battery capacity, kW: 70
                ✅Acceleration 0-100 km, sec: 6,9
                ✅Power: 150kW / 204Nm
                ✅Drive unit: Front
                ✅Power reserve, km: 580
                ✅Power reserve, km: 580
                ✅Maximum speed, km/h: 150

                """);

        return sendPhoto;
    }

    public SendPhoto lIAutoL8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/jGQVsR2nxeEmeBVuOd07Uo3OffAFU9Ptj5HBw4sU.webp"));
        sendPhoto.setCaption("""
                LI Auto L8
                                
                ✅Battery capacity, kW: 42.8
                ✅Acceleration 0-100 km, sec: 5.5
                ✅Power, kW/hp: 449
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 1315
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180

                """);

        return sendPhoto;
    }

    public SendPhoto avatr11(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/feyQk6GFzkFU4u0IB9KKaVHgHdsOrUdbRLCeRFv7.webp"));
        sendPhoto.setCaption("""
                Avatr 11
                                
                ✅Battery capacity, kW: 116,79
                ✅Acceleration 0-100 km, sec: 4,5
                ✅Power: 425kW / 578 Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 680
                ✅Number of seats: 4
                ✅Maximum speed, km/h: 200

                """);

        return sendPhoto;
    }

    public SendPhoto hiPhiX(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/mFaMd0SDGOiNIRMzXrbHKdyKlkoXN5zRqAVK1Obv.webp"));
        sendPhoto.setCaption("""
                HiPhi X
                                
                ✅Battery capacity, kW: 94,3
                ✅Acceleration 0-100 km, sec: 4
                ✅Power: 440kW / 598Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 550
                ✅Number of seats: 4
                ✅Maximum speed, km/h: 200

                """);

        return sendPhoto;
    }

    public SendPhoto lIAutoOne(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/Rio4OVECZKtP6rATA0xAmwk66swm7pt9i5JmEPLU.webp"));
        sendPhoto.setCaption("""
                LI Auto One
                                
                ✅Battery capacity, kW: 40.5
                ✅Acceleration 0-100 km, sec: 6.5
                ✅Power: 244kW / 552Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 890
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 172

                """);

        return sendPhoto;
    }

    public SendPhoto lynkCo09EMP(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/tS5di4emmprxFcaSAEvu7KeqU8nV2cJpt0WbHTB5.webp"));
        sendPhoto.setCaption("""
                Lynk&Co 09EM-P
                                
                ✅Battery capacity, kW: 40
                ✅Number of seats: 5
                ✅Drive unit: Full
                ✅Acceleration 0-100 km, sec: 5.9
                ✅Power, kW/hp: 540

                """);

        return sendPhoto;
    }

    public SendPhoto chevroletSeeker(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/sh3Tmy6GCsarJzred5lUMaLxgNM6sECxsApeFUX9.webp"));
        sendPhoto.setCaption("""
                Chevrolet Seeker
                                
                ✅Volume: 1.5
                ✅Consumption: 6.6
                ✅Power, kW/hp: 184/135
                ✅Drive unit: Front
                ✅Box: Variable speed drive
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 205
                
                """);

        return sendPhoto;
    }

    public SendPhoto bydSongL(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/qrSJ9LUiyqxQm3akh3668mKbbe3Z094IG7pZx8hp.webp"));
        sendPhoto.setCaption("""
                BYD Song L
                                
                ✅Battery capacity, kW: 87
                ✅Acceleration 0-100 km, sec: 4,3
                ✅Power: 380kW / 517Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 602
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 200
                
                """);

        return sendPhoto;
    }

    public SendPhoto bydYangwangU8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/qrSJ9LUiyqxQm3akh3668mKbbe3Z094IG7pZx8hp.webp"));
        sendPhoto.setCaption("""
                BYD Yangwang U8
                                
                ✅Battery capacity, kW: 49.05
                ✅Acceleration 0-100 km, sec: 3.6
                ✅Power: 880kW / 1280Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 405
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 280
                
                """);

        return sendPhoto;
    }

    public SendPhoto jishi01Eng(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/KASLuRQVVa2soNQQH3qFki4MeBCemCudXyq7Mk8Q.webp"));
        sendPhoto.setCaption("""
                🚙Jishi 01
                
                ✅Battery capacity, kW: 56
                ✅Acceleration 0-100 km, sec: 5.5
                ✅Power: 204kW / 340Nm
                ✅Drive: Full
                ✅Power reserve, km: 235
                ✅Number of seats: 6
                ✅Maximum speed, km/h: 190
                
                """);

        return sendPhoto;
    }


    //---Krossover yakunlanish---\\

    //---Hatchback boshlanish---\\

    public SendPhoto bydSeagull(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/XZBuWOU3s2lQzubkw5PZvNlQ9hR64GhnZk1EUprF.webp"));
        sendPhoto.setCaption("""
                BYD Seagull
                                
                ✅Battery capacity, kW: 38,88
                ✅Acceleration 0-100 km, sec: 9,5
                ✅Power, kW/hp: 55/75
                ✅Drive unit: Front
                ✅Range (NEDC), km: 405
                ✅Number of seats: 4
                ✅Maximum speed, km/h: 130
                
                """);

        return sendPhoto;
    }

    public SendPhoto bydDolphin(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/sK0hrrHnCtspCoUUmPlwubE3LzhselJYdTiYv4wu.webp"));
        sendPhoto.setCaption("""
                BYD Dolphin
                                
                ✅Battery capacity, kW: 44.9
                ✅Acceleration 0-100 km, sec: 7,5
                ✅Power, kW/hp: 130/177
                ✅Drive unit: Front
                ✅Range (NEDC), km: 401
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 160
                ✅Charging speed (slow / fast), hour: 6,41/0,5
                
                """);

        return sendPhoto;
    }

    public SendPhoto bydE2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/wTDQ0xMwIBQvDR2sba11CvPrgEVcaidi66kZuNYq.webp"));
        sendPhoto.setCaption("""
                BYD E2
                
                ✅Battery capacity, kW: 43,2
                ✅Acceleration 0-100 km, sec: 10,3
                ✅Power, kW/hp: 70/95
                ✅Drive unit: Front
                ✅Range (NEDC), km: 405
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 130
                ✅Charging speed (slow / fast), hour: 13,1/0,5
                
                """);

        return sendPhoto;
    }

    public SendPhoto changanBenBenEStar(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/dBUAaOFl9cQbMGsGart96nB5723xCec8KApGXTmz.webp"));
        sendPhoto.setCaption("""
                Changan BenBen E-Star
                                
                ✅Fuel type: Electric
                ✅Dimensions: 3770*1650*1570
                ✅Maximum power (hp): 75
                ✅Max speed (km/h): 101
                ✅NEDC range (km): 310
                ✅Number of doors: 5
                ✅Total battery power kW: 31,95
                ✅Motor power (kw): 55
                ✅Torque: 170
                ✅Wheel size: 175/60 R15
                
                """);

        return sendPhoto;
    }

    //---Hatchback yakunlanish---\\


    //---Minivan boshlanish---\\

    public SendPhoto denzaD9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/luIEwx6z593gfrDOISORICB0o3mVocArTzIhirPJ.webp"));
        sendPhoto.setCaption("""
                Denza D9
                                
                ✅Battery capacity, kW: 103,36
                ✅Acceleration 0-100 km, sec: 6,9
                ✅Power, kW/hp: 275/374
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 600
                ✅Number of seats: 7
                ✅Maximum speed, km/h: 190
                
                """);

        return sendPhoto;
    }

    public SendPhoto zeekr009(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/GyyaoLBYPQ04jO39mIy4obm1fKUwvNb7zwMOrgxf.webp"));
        sendPhoto.setCaption("""
                Zeekr 009
                                
                ✅Battery capacity, kW: 822
                ✅Acceleration 0-100 km, sec: 140
                ✅Power, kW/hp: 400/544
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 4,5
                ✅Number of seats: 6
                ✅Maximum speed, km/h: 190
                
                """);

        return sendPhoto;
    }

    public SendPhoto havotransportiEng(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://img.freepik.com/premium-photo/airplane-in-the-sky_1013690-70.jpg"));
        sendPhoto.setCaption("CTRANS offers air transportation of a wide range of goods with large dimensions and weight. Air transportation China-Uzbekistan is the choice of most Uzbeks. We guarantee you fast, safe, and high-quality transportation in the shortest possible time.\n" +
                "\n" +
                "CTRANS employees carefully treat and control the transportation of each product. With us, you can be sure that your goods will arrive safe and sound.");
        return sendPhoto;
    }




    public SendPhoto autoTransportationEng(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.arrowtruck.com/wp-content/uploads/2023/02/2_Arrow-Truck-Sales_Comparing-The-Different-Semi-Truck-and-Trailer-Types_IMAGE1.jpg"));
        sendPhoto.setCaption("""
                Cargo transportation by road is the most important component of the transport services market, and it is this direction that is considered the leader in the field of transportation of goods from the sender to the recipient.
                
                Compared to other modes of transport, motor transport today remains a serious priority. Among the advantages that road transport cargo has:
                
                ⊚Maneuverability;
                ⊚ample opportunities for the logistics company to make the most profitable routes;
                ⊚speed of delivery;
                ⊚a wide range of transported goods;
                ⊚formation of groupage road cargo, combining parcels from several companies;
                ⊚a large selection of vehicles, taking into account factors such as weight, format and dimensions of luggage, the presence of flammable goods and perishable products;
                
                """);

        return sendPhoto;
    }

    public SendPhoto railwayTransportation(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://media.licdn.com/dms/image/C5622AQFC11sDRuGtfw/feedshare-shrink_800/0/1648805405802?e=2147483647&v=beta&t=6ru64usETOA39N_RYAOslVNhvpIIc4r4r_BRz8Ws_SY"));
        sendPhoto.setCaption("""

                Rail transportation is one of the main activities of CTRANS. The company carries out transportation both in containers of the required tonnage and in all types of wagons.                    
                
                Container transportation will allow to carry out non-reloading delivery of goods. This significantly reduces the volume and increases the speed of intermediate loading and unloading operations.
                
                Rail transportation is a great choice if you value low transportation costs. The low cost in this case is due to the high load capacity.
                
                """);

        return sendPhoto;
    }


    public SendPhoto werehouseEng(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://fkplatforma.ru/wp-content/uploads/2023/05/img-7.png"));
        sendPhoto.setCaption("""

                The CTRANS company, in addition to transporting goods by vehicles from China, offers to use warehouse logistics services in China at the same time.
                
                Big cities like Yiwu and Guangzhou have a lot of trade.
                
                To make it more convenient for our customers to store goods and save on delivery, our warehouses are located in convenient locations in the city.
                
                """);

        return sendPhoto;
    }

    public SendPhoto ccsEng(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://wittysparks.com/wp-content/uploads/2019/12/custom-agents-checking.jpg"));
        sendPhoto.setCaption("""

                CTRANS values the time of its customers and offers services for customs declaration of goods. Definition of HS code.
                
                Customs clearance is necessary in order to register, register all information related to the goods, and form a package of documents with reliable information about it.
                                
                Don't want your cargo to "hang" somewhere halfway? We definitely do not want to, therefore we offer our customers a customs clearance service.
                
                Turning to Ctrans, you can be sure of our professionalism and that the final cost of the goods will not change after customs clearance. We will help you keep the cost of production low and quickly, without unforeseen expenses, pass through customs control.
                
                """);

        return sendPhoto;
    }

    //---Servis yakunlanish---\\

    //---Delivery Time---\\

    public SendPhoto deliveryTimeAirEng(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/736x/e8/c2/83/e8c283070fa6524e9c9bf3b300ca566c.jpg"));
        sendPhoto.setCaption("""
                (Air Transport) Your order will
                <b>arrive in 5-10 days</b>
                Contact the manager to place an order
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto deliveryTimeAutoEng(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/e5/6b/7e/e56b7e1a1cbcea821b22c9f523a39b05.jpg"));
        sendPhoto.setCaption("""
                (Auto Transport) Your order will
                <b>arrive in 15-20 days</b>
                Contact the manager to place an order
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto deliveryTimeRailwayEng(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/14/e4/bc/14e4bc59ff10e12459557d8c373acb13.jpg"));
        sendPhoto.setCaption("""
                (Railway Transport) Your order will
                <b>arrive in 20-30 days</b>
                Contact the manager to place an order
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    //---Delivery Time---\\

    //---Contact Us---\\

    public SendMessage contactUsEng(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("choose a way to contact us");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("📞By phone number");
        button1.setText("📲Contact via Telegram or email");
        button2.setText("🏃🏼‍♂️Go to address");
        button3.setText("⬅️Back");

        row.add(button);
        row.add(button1);
        row.add(button2);
        row1.add(button3);

        rowList.add(row);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage byPhoneNumberEng(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                Contact us
                CTRANS is the art of logistics
                
                📞 Phone number: +998 (99) 110 22 22
                """);
        return sendMessage;
    }

    public SendMessage contactViaTelegramOrEmailEng(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                Contact us
                CTRANS is the art of logistics
                
                📲Manager's Telegram: <a href="https://t.me/ctrans_uz">CTRANS MANAGER</a>
                📩Email: info@ctrans.uz
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        return sendMessage;
    }

    public SendLocation goToAddressEng(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLongitude(69.210584);
        sendLocation.setLatitude(41.314611);

        return sendLocation;
    }
    //---Contact Us---\\
    }