package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/7/2024 *Time:11:39 AM
 */

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {



    public SendMessage languangeMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83C\uDDFA\uD83C\uDDFFTilni tanlang" + "\n" + "\uD83C\uDDF7\uD83C\uDDFAВыберите язык" + "\n" + "\uD83C\uDDFA\uD83C\uDDF8Choose language");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Uzbek tili\uD83C\uDDFA\uD83C\uDDFF");
        row.add(button);
        rowList.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Русский язык\uD83C\uDDF7\uD83C\uDDFA");
        row.add(button1);
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("English language\uD83C\uDDFA\uD83C\uDDF8");
        row1.add(button2);
        rowList.add(row1);
        reply.setKeyboard(rowList);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
}