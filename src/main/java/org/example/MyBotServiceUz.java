package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/9/2024 *Time:9:24 AM
 */

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

public class MyBotServiceUz {
    public SendMessage asosiyMenuUz(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Asosiy Menu");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDE9AXizmatlar");
        row.add(button);
        rowList.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDE99Xitoydan mashinalar");
        row1.add(button1);
        rowList.add(row1);
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⏰Yetkazib berish muddati");
        row2.add(button2);
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("☎️Biz bilan bog'lanish");
        row2.add(button3);
        rowList.add(row2);
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83C\uDFDBValyuta kursi");
        row3.add(button4);
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83E\uDDEEKalkulyator");
        row3.add(button5);
        rowList.add(row3);
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("ℹ️Biz haqimizda");
        row4.add(button6);
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDCACIzoh qoldirish");
        row4.add(button7);
        rowList.add(row4);
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⚙️Sozlamalar");
        row5.add(button8);
        rowList.add(row5);
        reply.setKeyboard(rowList);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage kontaktYuborishUz(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDE Ro'yxatdan o'tish uchun telefon raqamingizni kiriting. \n" +
                " \n" +
                " Raqamni +998********* shaklida yuboring.");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();

        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setRequestContact(true);
        button1.setText("☎️ Telefon raqamni yuborish");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage izohQoldirishUz(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Izoh qoldiring. Sizning fikringiz biz uchun muhim");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️Orqaga");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage izohQabulQilindiUz(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅Izohingiz qabul qilindi");
        return sendMessage;
    }

    public SendMessage kankulator(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga kerakli transportni tanglang");

        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("✈️Havo transporti");
        button1.setText("\uD83D\uDE88Temir yo'l transporti");
        button2.setText("\uD83D\uDE98Avtomobil transporti");
        button3.setText("⬅️Orqaga");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row2.add(button3);

        rows.add(row);
        rows.add(row1);
        rows.add(row2);

        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage xizmatlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xizmat turini tanlang");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();

        button1.setText("✈️ Havo transporti");
        button2.setText("\uD83D\uDE98 Avtomobil transporti");
        button3.setText("\uD83D\uDE88 Temir yo'l transporti");
        button4.setText("Yivu va Guanchjou da ombor xizmatlari");
        button5.setText("Bojxona rasmiylashtiruvi xizmatlari");
        button6.setText("⬅️Orqaga");

        row.add(button1);
        row.add(button2);
        row1.add(button3);
        row1.add(button4);
        row2.add(button5);
        row3.add(button6);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage xitoydanmashinalar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Mashina turini tanlang");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        button1.setText("Sedan");
        button2.setText("Krossover");
        button3.setText("Xetchbek");
        button4.setText("Mikroavtobus");
        button5.setText("⬅️Orqaga");

        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage deliveryTimeUz(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sizga kerak bo'lgan toifani tanlang.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("✈️  Havo transporti");
        button1.setText("\uD83D\uDE98  Avto transport");
        button2.setText("\uD83D\uDE88  Temir yo'l transporti");
        button3.setText("⬅️Orqaga");

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

    public SendPhoto aboutUsUz(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/57/a7/42/57a742497032f27e3d7d3d1312d5ab9c.jpg"));
        sendPhoto.setCaption("""
                BIZ HAQIMIZDA
                                
                Butun dunyo bo'ylab logistika xizmatlari sohasida tajriba biz butun dunyo bo'ylab eng yaxshi yuk tashish va transport bitimlarini taqdim etishdan faxrlanamiz.
                
                ✅100%Kompensatsiya
                ✅Tajribali jamoa
                ✅24/7 qo'llab-quvvatlash
                ✅Onlayn kuzatish
                ✅Yuklarni sug'urta qilish
                ✅Xavfsiz omborxona
                """);

        return sendPhoto;
    }

    public SendPhoto havotransporti(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://img.freepik.com/premium-photo/airplane-in-the-sky_1013690-70.jpg"));
        sendPhoto.setCaption("CTRANS katta o'lchamlari va og'irligi bo'lgan keng turdagi tovarlarni havo orqali tashishni taklif qiladi. Xitoy-O'zbekiston bilan havo transporti ko'pchilik o'zbekistonliklarning tanlovidir. Biz sizga eng qisqa vaqt ichida tez, xavfsiz va sifatli tashishni kafolatlaymiz.\n" +
                "\n" +
                "CTRANS xodimlari har bir mahsulotga ehtiyotkorlik bilan munosabatda bo'lishadi va tashishni nazorat qilishadi. Biz bilan mahsulotlaringiz xavfsiz va sog'lom yetib kelishiga amin bo'lishingiz mumkin.");
        return sendPhoto;
    }

    public SendPhoto avtomobiltransporti(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.arrowtruck.com/wp-content/uploads/2023/02/2_Arrow-Truck-Sales_Comparing-The-Different-Semi-Truck-and-Trailer-Types_IMAGE1.jpg"));
        sendPhoto.setCaption("""
                                
                Avtomobil transportida yuk tashish transport xizmatlari bozorining eng muhim tarkibiy qismi bo'lib, aynan shu yo'nalish yuklarni jo'natuvchidan oluvchiga tashish sohasida yetakchi hisoblanadi.

                Boshqa transport turlari bilan taqqoslaganda, bugungi kunda avtotransport jiddiy ustuvor yo'nalish bo'lib qolmoqda. Avtotransport yuklarining afzalliklari orasida:

                •manevr qobiliyati;
                •logistika kompaniyasi uchun eng foydali marshrutlarni amalga oshirish uchun keng imkoniyatlar;
                •yetkazib berish tezligi;
                •tashiladigan tovarlarning keng assortimenti;
                •bir nechta kompaniyalarning posilkalarini birlashtirgan holda, guruhli yo'l yuklarini shakllantirish;
                •yukning og'irligi, formati va o'lchamlari, yonuvchan tovarlar va tez buziladigan mahsulotlarning mavjudligi kabi omillarni hisobga olgan holda transport vositalarining katta tanlovi;""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto railwayTransportationUz(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://media.licdn.com/dms/image/C5622AQFC11sDRuGtfw/feedshare-shrink_800/0/1648805405802?e=2147483647&v=beta&t=6ru64usETOA39N_RYAOslVNhvpIIc4r4r_BRz8Ws_SY"));
        sendPhoto.setCaption("""

                Temir yo'l transporti CTRANS kompaniyasining asosiy faoliyat yo'nalishlaridan biridir. Kompaniya kerakli tonnajdagi konteynerlarda ham, barcha turdagi vagonlarda ham yuk tashishni amalga oshiradi.     
                                
                Konteynerda tashish yuklarni qayta yuklamasdan yetkazib berish imkonini beradi. Bu hajmni sezilarli darajada kamaytiradi va oraliq yuklash va tushirish operatsiyalari tezligini oshiradi.
                                
                Agar siz past transport xarajatlarini qadrlasangiz, temir yo'l transporti ajoyib tanlovdir. Bu holatda past narx yuqori yuk ko'tarish qobiliyatiga bog'liq.
                                
                """);

        return sendPhoto;
    }

    public SendPhoto havotransportiUz(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1x25EB5oIG4yV1-ygGPif8pM3GYg0NshxnU4iw8mWRt7CWM5M"));
        sendPhoto.setCaption("""
                                
                CTRANS katta o'lchamlari va og'irligi bo'lgan keng turdagi tovarlarni havo orqali tashishni taklif qiladi. Xitoy-O'zbekiston bilan havo transporti ko'pchilik o'zbekistonliklarning tanlovidir. Biz sizga eng qisqa vaqt ichida tez, xavfsiz va sifatli tashishni kafolatlaymiz.

                CTRANS xodimlari har bir mahsulotga ehtiyotkorlik bilan munosabatda bo'lishadi va tashishni nazorat qilishadi. Biz bilan mahsulotlaringiz xavfsiz va sog'lom yetib kelishiga amin bo'lishingiz mumkin.""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto temiryoltransportiUz(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://img.freepik.com/premium-photo/large-containers-with-cargo-delivered-by-cargo-train-railway-station_124507-35363.jpg"));
        sendPhoto.setCaption("""
                                
                Temir yo'l transporti CTRANS kompaniyasining asosiy faoliyat yo'nalishlaridan biridir. Kompaniya kerakli tonnajdagi konteynerlarda ham, barcha turdagi vagonlarda ham yuk tashishni amalga oshiradi.

                Konteynerda tashish yuklarni qayta yuklamasdan yetkazib berish imkonini beradi. Bu hajmni sezilarli darajada kamaytiradi va oraliq yuklash va tushirish operatsiyalari tezligini oshiradi.

                Agar siz past transport xarajatlarini qadrlasangiz, temir yo'l transporti ajoyib tanlovdir. Bu holatda past narx yuqori yuk ko'tarish qobiliyatiga bog'liq.""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto werehouseUz(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://fkplatforma.ru/wp-content/uploads/2023/05/img-7.png"));
        sendPhoto.setCaption("""

                CTRANS kompaniyasi Xitoydan transport vositalarida yuk tashishdan tashqari, Xitoyda bir vaqtning o'zida ombor logistikasi xizmatlaridan foydalanishni taklif qiladi.
                                
                Yivu va Guanchjou kabi yirik shaharlarda savdo koʻp.
                                
                Mijozlarimiz uchun tovarlarni saqlash va yetkazib berishda tejashni yanada qulay qilish uchun omborlarimiz shaharning qulay joylarida joylashgan.
                                
                """);

        return sendPhoto;
    }

    public SendPhoto ccsUz(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://wittysparks.com/wp-content/uploads/2019/12/custom-agents-checking.jpg"));
        sendPhoto.setCaption("""
                CTRANS o'z mijozlarining vaqtini qadrlaydi va yuklarni bojxona deklaratsiyasi xizmatlarini taklif qiladi. TIF TN kodlarining ta'rifi.
                                                
                Bojxona rasmiylashtiruvi tovarlarga tegishli barcha ma'lumotlarni ro'yxatdan o'tkazish, ro'yxatdan o'tkazish va u haqida ishonchli ma'lumotga ega bo'lgan hujjatlar to'plamini shakllantirish uchun zarurdir.
                                                                
                Yukingiz yarim yo‘lda qayergadir “osilib qolishini” xohlamaysizmi? Biz, albatta, xohlamaymiz, shuning uchun biz mijozlarimizga bojxona rasmiylashtiruvi xizmatini taklif qilamiz.
                                
                Ctransga murojaat qilib, siz bizning professionalligimiz va bojxona rasmiylashtiruvidan keyin tovarlarning yakuniy narxi o'zgarmasligiga amin bo'lishingiz mumkin. Biz sizga mahsulot tannarxini arzon va tez, kutilmagan xarajatlarsiz, bojxona nazoratidan o‘tkazishingizga yordam beramiz.
                """);

        return sendPhoto;
    }
    public SendMessage NomerAlmashtirUz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Nomer almashtirish");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        ArrayList<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        button.setText("☎️ Telefon raqamni yuborish");
        row.add(button);
        rowList.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️Orqaga");
        row1.add(button1);
        rowList.add(row1);
        reply.setResizeKeyboard(true);
        reply.setKeyboard(rowList);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage sozlamalar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("⚙️Sozlamani tanlang");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button1.setText("\uD83C\uDDFA\uD83C\uDDFFTilni almashtirish");
        button2.setText("☎️Telefon raqamini alashtirish");
        button3.setText("⬅️Orqaga");

        row1.add(button1);
        row1.add(button2);
        row2.add(button3);

        rowList.add(row1);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage sedanUz(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sedanni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6 = new KeyboardRow();
        KeyboardRow row7 = new KeyboardRow();
        KeyboardRow row8 = new KeyboardRow();
        KeyboardRow row9 = new KeyboardRow();

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

        button1.setText("BYD Seal");
        button2.setText("BYD Han");
        button3.setText("Chevrolet Monza 1.5L Atmo");
        button4.setText("Chevrolet Monza 1.3L Turbo");
        button5.setText("Honda Crider 1.0L Turbo");
        button6.setText("LeapMotor C01");
        button7.setText("HiPhi Z");
        button8.setText("IM Motors L7");
        button9.setText("Geometry G6");
        button10.setText("BMW i3 eDrive40");
        button11.setText("BMW i4 eDrive35");
        button12.setText("BMW i5 eDrive40");
        button13.setText("Neta S");
        button14.setText("Neta Gt");
        button15.setText("Zeeker 007");
        button16.setText("⬅️ Orqaga");

        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button4);
        row3.add(button5);
        row3.add(button6);
        row4.add(button7);
        row4.add(button8);
        row5.add(button9);
        row5.add(button10);
        row6.add(button11);
        row6.add(button12);
        row7.add(button13);
        row7.add(button14);
        row8.add(button15);
        row9.add(button16);

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        rowList.add(row8);
        rowList.add(row9);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage crossoverUz(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Krossoverni tanlang");

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

        button.setText("BYD Song Plus Champion Edition");
        button1.setText("BYD Tang EV");
        button2.setText("BYD Yuan Plus EV");
        button3.setText("Zeeker 001");
        button4.setText("Zeeker X");
        button5.setText("LeapMotor C11");
        button6.setText("Geely Geometry E");
        button7.setText("Denza N7");
        button8.setText("HiPhi Y");
        button9.setText("NIO ES8");
        button10.setText("NIO EC7");
        button11.setText("LI Auto L7");
        button12.setText("LI Auto L9");
        button13.setText("IM Motors LS7");
        button14.setText("Geometry M6");
        button15.setText("LI Auto L8");
        button16.setText("Avatr 11");
        button17.setText("HiPhi X");
        button18.setText("LI Auto One");
        button19.setText("Lynk&Co 09EM-P");
        button20.setText("Chevrolet Seeker");
        button21.setText("BYD Song L");
        button22.setText("BYD Yangwang U8");
        button23.setText("Jishi 01");
        button24.setText("⬅️ Orqaga");

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

    public SendMessage hatchBackUz(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xetchbekni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();

        button1.setText("BYD Seagull");
        button2.setText("BYD Dolphin");
        button3.setText("BYD E2");
        button4.setText("Changan BenBen E-Star");
        button5.setText("⬅️ Orqaga");

        row1.add(button1);
        row1.add(button2);
        row2.add(button3);
        row2.add(button3);
        row3.add(button5);

        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage minivanUz(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Mikroavtobusni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button1.setText("Denza D9");
        button2.setText("Zeeker 009");
        button3.setText("⬅️ Orqaga");

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

    public SendPhoto BYD_SEAL(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/GbnFoweKIIJ8SGRcR3X1qaBAmgizk9E8798rn536.webp"));
        sendPhoto.setCaption("""
                BYD Seal
                                        
                ✅Batareya quvvati, kVt: 82,5
                ✅Quvvat zahirasi (NEDC), km: 650
                ✅Tezlashuv 0-100 km, sek: 3,8
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 390/530
                ✅Maksimal tezlik, km/soat: 180
                ✅Haydovchi blok: To'liq
                ✅Zaryadlash tezligi (sekin/tez), soat: 11,8/0,5""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BYD_HAN(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/G5LEALmmX7YN3h2S0ejHxggKreWq0hgj0rkNV3zI.webp"));
        sendPhoto.setCaption("""
                BYD Han

                ✅Batareya quvvati, kVt: 85,4
                ✅Quvvat zahirasi (NEDC), km: 610
                ✅Tezlashuv 0-100 km, sek: 3,9
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 380/517
                ✅Maksimal tezlik, km/soat: 185
                ✅Haydovchi blok: To'liq
                ✅Zaryadlash tezligi (sekin / tez), soat: 12,2/0,5
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Chevrolet_Monza15(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/7XZX6Aa66UBk54V6XkdOikpRj7MaSpDsfdPEecaw.webp"));
        sendPhoto.setCaption("""
                Chevrolet Monza 1.5L Atmo
                                
                ✅Dvigatel: 1.5 L (113 ot kuchi)
                ✅Yoqilg'i turi: Benzin
                ✅Uzatish qutisi: 6-AT (robot)
                ✅Haydovchi blok: To'liq
                ✅Tezlashuv (0-100 km/soat): 12.9 s
                ✅Joylar soni: 5""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Chevrolet_Monza13(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/7XZX6Aa66UBk54V6XkdOikpRj7MaSpDsfdPEecaw.webp"));
        sendPhoto.setCaption("""
                Chevrolet Monza 1.3L Turbo
                                
                ✅Dvigatel: 1.3L Turbo (163 ot kuchi)
                ✅Yoqilg'i turi: Benzin
                ✅Uzatish qutisi: 6-AT (robot)
                ✅Haydovchi blok: To'liq
                ✅Tezlashuv (0-100 km/soat): 9.2 s
                ✅Joylar soni: 5""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Honda_Crider10_Turo(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/WWWDezhpGgYHzzR9VApgwmj9eeNyNtW7OAlYygCk.webp"));
        sendPhoto.setCaption("""
                Honda Crider 1.0L Turbo
                                
                ✅Dvigatel hajmi: 1.0 L Turbo
                ✅Quvvat: 122 ot kuchi
                ✅Dvigatel turi: Benzin
                ✅100 ga tezlashtirish: 10.7 s
                ✅Iste'mol: 5.0 L""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto LeapMotor_C01(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/gAvBM75WivxQrmjUD4oBWpXvhS0MjkTfLEvz2v5d.webp"));
        sendPhoto.setCaption("""
                LeapMotor C01
                                
                ✅Batareya quvvati, kVt: 90
                ✅Quvvat zahirasi (NEDC), km: 630
                ✅Tezlashuv 0-100 km, sek: 3,6
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 400/544
                ✅Maksimal tezlik, km/soat: 180
                ✅Haydovchi blok: To'liq""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto HiPhi_Z(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/TmaFh6qeILQV09RdIovwNghxCrx9BASiaMFvgdO9.webp"));
        sendPhoto.setCaption("""
                hiPhi Z
                                
                ✅Batareya quvvati, kVt: 120
                ✅Quvvat zahirasi (NEDC), km: 705
                ✅Tezlashuv 0-100 km, sek: 3,8
                ✅Joylar soni: 4
                ✅Quvvat, kVt/hp: 494/672
                ✅Maksimal tezlik, km/soat: 200
                ✅Haydovchi blok: To'liq
                ✅Zaryadlash tezligi (sekin / tez), soat: 12,4/0,92""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto IM_Motors_L7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/n7IgJoqfWsM0w5ljA24sr0wBGUq7lrUp3g9bb5wi.webp"));
        sendPhoto.setCaption("""
                IM Motors L7
                                
                ✅Batareya quvvati, kVt: 90
                ✅Zaxira quvvati, km: 615
                ✅Tezlashuv 0-100 km, sek: 3,7
                ✅Joylar soni: 5
                ✅Quvvat: 445kVt / 605Nm
                ✅Maksimal tezlik, km/soat: 200
                ✅Haydovchi blok: Toʻliq""");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Geometry_G6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/Zl6MhKhdsf1r5CfqLELkB4DnHjaliEh4XoTU6I56.webp"));
        sendPhoto.setCaption("""
                Geometry G6

                ✅Batareya quvvati, kVt: 70
                ✅Zaxira quvvati, km: 580
                ✅Tezlashuv 0-100 km, sek: 6,9
                ✅Joylar soni: 5
                ✅Quvvat: 150 kVt / 204Nm
                ✅Maksimal tezlik, km/soat: 150
                ✅Haydovchi blok: Old"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BMW_i3_eDrive40(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/eQXmyVoEXPqMbHTXPKK2SrtMvKeFYs9BkaYGTs70.webp"));
        sendPhoto.setCaption("""
                BMW i3 eDrive40
                                
                ✅Batareya quvvati, kVt: 78,92
                ✅Quvvat zahirasi (NEDC), km: 592
                ✅Tezlashuv 0-100 km, sek: 5,6
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 250/340
                ✅Maksimal tezlik, km/soat: 180
                ✅Haydovchi blok: orqa
                ✅Zaryadlash tezligi (sekin / tez), soat: 7,5/0,68
                """
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BMW_i4_eDrive35(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/gwvcNdDemXzj2KnSzE4KnrAiEQbr722zUqpkNwsw.webp"));
        sendPhoto.setCaption("""
                BMW i4 eDrive35
                                
                ✅Batareya quvvati, kVt: 83,9
                ✅Zaxira quvvati, km: 625
                ✅Tezlashuv 0-100 km, sek: 5,7
                ✅Joylar soni: 5
                ✅Quvvat: 250kVt / 340Nm
                ✅Maksimal tezlik, km/soat: 182
                ✅Haydovchi blok: Toʻliq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BMW_i5_eDrive40(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/5Pkx8cb6yJEhEPsJdXDBzEmfVDOr361aBdZILSLb.webp"));
        sendPhoto.setCaption("""
                BMW i5 eDrive40
                                
                ✅Batareya quvvati, kVt: 81.2
                ✅Zaxira quvvati, km: 582
                ✅Tezlashuv 0-100 km, sek: 6
                ✅Joylar soni: 5
                ✅Quvvat: 340kVt / 586Nm
                ✅Maksimal tezlik, km/soat: 193
                ✅Haydovchi blok: Toʻliq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Neta_S(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/fktgieIK4VYEVFIP0uN36tNjxRymXuAX2LIluq2Q.webp"));
        sendPhoto.setCaption("""
                Neta S
                                
                ✅Batareya quvvati, kVt: 91
                ✅Quvvat zahirasi (NEDC), km: 715
                ✅Tezlashuv 0-100 km, sek: 3,9
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 340/462
                ✅Maksimal tezlik, km/soat: 185
                ✅Haydovchi blok: To'liq
                ✅Zaryadlash tezligi (sekin / tez), soat: 17/0,58"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Neta_Gt(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/7fdWbQK8rsxAid456F7zwCFsqAIcKaibwZH1rMVS.webp"));
        sendPhoto.setCaption("""
                Neta Gt
                                
                ✅Batareya quvvati, kVt: 74.5
                ✅Quvvat zahirasi (NEDC), km: 650
                ✅Joylar soni: 4
                ✅Quvvat, kVt/hp: 170
                ✅Maksimal tezlik, km/soat: 190
                ✅Haydovchi blok: orqa"""
        );
        return sendPhoto;
    }

    public SendPhoto Zeekr_007(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/o81wp9OhfwgTCIkaXwEoFqhO0Dsgxx7Mh3VDFw47.webp"));
        sendPhoto.setCaption("""
                Zeeker 007
                                
                ✅Batareya quvvati, kVt: 70
                ✅Zaxira quvvati, km: 688
                ✅Tezlashuv 0-100 km, sek: 2,84
                ✅Joylar soni: 5
                ✅Quvvat: 421kVt / 224Nm
                ✅Maksimal tezlik, km/soat: 210
                ✅Haydovchi blok: Toʻliq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BYD_Song_Plus_Champion_Edition(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/6xKSj76RdxhSGrindKkIbsV6J4MZJeI4bhF7SvK9.webp"));
        sendPhoto.setCaption("""
                BYD Song Plus Champion Edition
                                
                ✅Batareya quvvati: 87,04 kVt/soat
                ✅Quvvat zaxirasi (NEDC): 605 km
                ✅Displey: 15,6" multimedia
                ✅Avtomatik to'xtash: Bor
                ✅Karaoke funksiyasi: Bor
                ✅Tezlashuv 0-100 km, sek: 8,5
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 160/218
                ✅Maksimal tezlik, km/soat: 175
                ✅Haydovchi blok: Old"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BYD_Tang_EV(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/R1V88PAOtN8eavpv5oHORRTnjp8bIGDeTMBYmyli.webp"));
        sendPhoto.setCaption("""
                BYD Teng EV
                                
                ✅Batareya quvvati, kVt: 108,8
                ✅Quvvat zahirasi (NEDC), km: 635
                ✅Tezlashuv 0-100 km, sek: 4,4
                ✅Joylar soni: 7
                ✅Quvvat, kVt/hp: 380/517
                ✅Maksimal tezlik, km/soat: 180
                ✅Haydovchi blok: To'liq
                ✅Zaryadlash tezligi (sekin / tez), soat: 16,5/0,5"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BYD_Yuan_Plus_EV(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/GkibsVTK9z55KFCWHnci3A7xZgKGMydhoHGKIdjy.webp"));
        sendPhoto.setCaption("""
                BYD Yuan Plus
                                
                ✅Batareya quvvati, kVt: 60.5
                ✅Quvvat zahirasi (NEDC), km: 510
                ✅Tezlashuv 0-100 km, sek: 7,3
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 150/204
                ✅Maksimal tezlik, km/soat: 160
                ✅Haydovchi blok: Old
                ✅Zaryadlash tezligi (sekin / tez), soat: 8,64/0,5
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Zeekr_001(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/SWxFK8ht6WR0bB2HfhCw1xlONX9RjAN5RuZG18fm.webp"));
        sendPhoto.setCaption("""
                Zeeker 001
                                
                ✅Quvvat zahirasi (NEDC), km: 650
                ✅Tezlashuv 0-100 km, sek: 3,8
                ✅Batareya quvvati, kVt/soat: 100
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 400/544
                ✅Maksimal tezlik, km/soat: 200
                ✅Haydovchi blok: Toʻliq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Zeekr_X(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/41pwueDIG22eJtsPOvQvNm4Cx7tR9nkoSM1VAT2o.webp"));
        sendPhoto.setCaption("""
                Zeeker X
                                
                ✅Quvvat zahirasi (NEDC), km: 500
                ✅Tezlashuv 0-100 km, sek: 3,8
                ✅Batareya quvvati, kVt/soat: 66
                ✅Joylar soni: 4
                ✅Quvvat, kVt/hp: 315/428
                ✅Maksimal tezlik, km/soat: 190
                ✅Haydovchi blok: To'liq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto LeapMotor_C11(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/aucwGVtBiLRBOpBhJj3qMhb8oQ7ztlh0bvB5zI3Y.webp"));
        sendPhoto.setCaption("""
                LeapMotor C11
                                
                ✅Batareya quvvati, kVt: 90
                ✅Quvvat zahirasi (NEDC), km: 580
                ✅0-100 km tezlashuv, sek: 4,5
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 400/544
                ✅Maksimal tezlik, km/soat: 200
                ✅Haydovchi blok: To'liq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Geely_Geometry_E(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/juAVI9k9BjoAUgS3eVAV5Rc0gREwuRVBFDfginS4.webp"));
        sendPhoto.setCaption("""
                Geely Geometry E
                                
                ✅Batareya quvvati, kVt: 39,4
                ✅Quvvat zahirasi (NEDC), km: 401
                ✅Tezlashuv 0-100 km, sek: 8,8
                ✅Joylar soni: 4
                ✅Quvvat, kVt/hp: 60/82
                ✅Maksimal tezlik, km/soat: 102
                ✅Haydovchi blok: To'liq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Denza_N7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/wvBTQdrUhyfgKY8S7xqOseeicOmtGL7wLGNnY7E6.webp"));
        sendPhoto.setCaption("""
                Denza N7
                                
                ✅Batareya quvvati, kVt: 91,3
                ✅Quvvat zahirasi (NEDC), km: 630
                ✅Tezlashuv 0-100 km, sek: 3,9
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 390/530
                ✅Maksimal tezlik, km/soat: 180
                ✅Haydovchi blok: To'liq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto HiPhi_Y(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/jbLkedyoEHmhdmhGfmWPDhee6a3jqqFgq55GYxq8.webp"));
        sendPhoto.setCaption("""
                HiPhi Y
                                
                ✅Batareya quvvati, kVt: 115
                ✅Quvvat zahirasi (NEDC), km: 765
                ✅Tezlashuv 0-100 km, sek: 4,7
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 371/505
                ✅Maksimal tezlik, km/soat: 190
                ✅Haydovchi blok: To'liq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto NIO_ES8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/zQV9rA6sYRm8zNgnxBdtHYdR2XczJUnxElxkOeVc.webp"));
        sendPhoto.setCaption("""
                NIO ES8
                                
                ✅Batareya quvvati, kVt: 100
                ✅Quvvat zahirasi (NEDC), km: 605
                ✅Tezlashuv 0-100 km, sek: 4,1
                ✅Joylar soni: 6
                ✅Quvvat, kVt/hp: 480/653
                ✅Maksimal tezlik, km/soat: 200
                ✅Haydovchi blok: To'liq
                ✅Zaryadlash tezligi (sekin / tez), soat: 0,5"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto NIO_EC7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/xoOfzfnOEU35Da860RQf7tmwLu4tmSzHFgbGKESz.webp"));
        sendPhoto.setCaption("""
                NEO EC7
                                
                ✅Batareya quvvati, kVt: 100
                ✅Quvvat zahirasi (NEDC), km: 635
                ✅Tezlashuv 0-100 km, sek: 3,8
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 480/653
                ✅Maksimal tezlik, km/soat: 200
                ✅Haydovchi blok: To'liq
                ✅Zaryadlash tezligi (sekin / tez), soat: 0,33"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto LI_Auto_L7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/RNQBVoacpvXjimNtBxZfZDfJN00HVDL6N7XQAM4l.webp"));
        sendPhoto.setCaption("""
                Li Auto L7
                                
                ✅Batareya quvvati, kVt: 42.8
                ✅Quvvat zahirasi, km: 1315
                ✅Tezlashuv 0-100 km, sek: 5.3
                ✅Joylar soni: 5
                ✅Quvvat: 330 kVt / 620 Nm
                ✅Maksimal tezlik, km/soat: 180"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Li_Auto_L9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/hYabLzhJzyKeKAmbXydaT5kgK7za47MAZLOQzwO6.webp"));
        sendPhoto.setCaption("""
                Li Auto L9

                ✅Batareya quvvati, kVt: 44.5
                ✅Zaxira quvvati, km: 1100
                ✅Tezlashuv 0-100 km, sek: 5.3
                ✅Joylar soni: 6
                ✅Quvvat: 330 kVt / 620 Nm
                ✅Maksimal tezlik, km/soat: 180"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto IM_Motors_LS7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/tpG5urfPNaVYhLY7sEkYmfBYIo63zuWsa88nOq4U.webp"));
        sendPhoto.setCaption("""
                IM Motors LS7
                              
                ✅Batareya quvvati, kVt: 100
                ✅Zaxira quvvati, km: 625
                ✅Tezlashuv 0-100 km, sek: 4,5
                ✅Joylar soni: 5
                ✅Quvvat: 425kVt / 578Nm
                ✅Maksimal tezlik, km/soat: 200
                ✅Haydovchi blok: Toʻliq"""
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Geometry_M6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/BgJZKJoWenpHEV6sbSeLRzWFmKYN2E9QcxqyFyvM.webp"));
        sendPhoto.setCaption("""
                Geometry M6
                                
                ✅Batareya quvvati, kVt: 70
                ✅Zaxira quvvati, km: 580
                ✅Tezlashuv 0-100 km, sek: 6,9
                ✅Joylar soni: 5
                ✅Quvvat: 150kVt / 204Nm
                ✅Maksimal tezlik, km/soat: 150
                ✅Haydovchi blok: Old
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Li_Auto_L8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/jGQVsR2nxeEmeBVuOd07Uo3OffAFU9Ptj5HBw4sU.webp"));
        sendPhoto.setCaption("""
                        Li Auto L8
                        
                        ✅Batareya quvvati, kVt: 42.8
                        ✅Quvvat zahirasi (NEDC), km: 1315
                        ✅Tezlashuv 0-100 km, sek: 5.5
                        ✅Joylar soni: 5
                        ✅Quvvat, kVt/hp: 449
                        ✅Maksimal tezlik, km/soat: 180
                        ✅Haydovchi blok: To'liq
                        """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Avatr_11(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/s49VX9zJ9P2TKBPShY707aDH2GGDP2cwFZHmmXtL.webp"));
        sendPhoto.setCaption("""
                        Avatr 11
                        
                        ✅Batareya quvvati, kVt: 116,79
                        ✅Zaxira quvvati, km: 680
                        ✅Tezlashuv 0-100 km, sek: 4,5
                        ✅Joylar soni: 4
                        ✅Quvvat: 425kVt / 578 Nm
                        ✅Maksimal tezlik, km/soat: 200
                        ✅Haydovchi blok: Toʻliq"
                        """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto HiPhi_X(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/mFaMd0SDGOiNIRMzXrbHKdyKlkoXN5zRqAVK1Obv.webp"));
        sendPhoto.setCaption("""
                        HiPhi X
                        
                        ✅Batareya quvvati, kVt: 94,3
                        ✅Zaxira quvvati, km: 550
                        ✅Tezlashuv 0-100 km, sek: 4
                        ✅Joylar soni: 4
                        ✅Quvvat: 440kVt / 598Nm
                        ✅Maksimal tezlik, km/soat: 200
                        ✅Haydovchi blok: Toʻliq"
                        """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Li_Auto_One(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/Rio4OVECZKtP6rATA0xAmwk66swm7pt9i5JmEPLU.webp"));
        sendPhoto.setCaption("""
                        Li Auto One
                        
                        ✅Batareya quvvati, kVt: 40.5
                        ✅Zaxira quvvati, km: 890
                        ✅Tezlashuv 0-100 km, sek: 6.5
                        ✅Joylar soni: 5
                        ✅Quvvat: 244kVt / 552Nm
                        ✅Maksimal tezlik, km/soat: 172
                        ✅Haydovchi blok: Toʻliq"
                        """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Lynk_Co_09EMP(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/tS5di4emmprxFcaSAEvu7KeqU8nV2cJpt0WbHTB5.webp"));
        sendPhoto.setCaption("""
                Lynk&Co 09EM-P
                                
                ✅Batareya quvvati, kVt: 40
                ✅Tezlashuv 0-100 km, sek: 5.9
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 540
                ✅Haydovchi blok: To'liq
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto Chevrolet_Seeker(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/sh3Tmy6GCsarJzred5lUMaLxgNM6sECxsApeFUX9.webp"));
        sendPhoto.setCaption("""
                Chevrolet Seeker
                                
                ✅Ovoz balandligi: 1.5
                ✅Quti: O'zgaruvchan tezlikli haydovchi
                ✅Iste'mol: 6.6
                ✅Joylar soni: 5
                ✅Quvvat, kVt/hp: 184/135
                ✅Maksimal tezlik, km/soat: 205
                ✅Haydovchi blok: Old
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BYD_Song_L(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/qrSJ9LUiyqxQm3akh3668mKbbe3Z094IG7pZx8hp.webp"));
        sendPhoto.setCaption("""
                BYD Song L
                                
                ✅Batareya quvvati, kVt: 87
                ✅Zaxira quvvati, km: 602
                ✅Tezlashuv 0-100 km, sek: 4,3
                ✅Joylar soni: 5
                ✅Quvvat: 380kVt / 517Nm
                ✅Maksimal tezlik, km/soat: 200
                ✅Haydovchi blok: Toʻliq
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto BYD_Yangwang_U8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/WGKjCPUUUdL9MdB4AAiLMM0AXSU5TfGwTJ6bZa5F.webp"));
        sendPhoto.setCaption("""
                BYD Yangwang U8
                                
                ✅Batareya quvvati, kVt: 49.05
                ✅Zaxira quvvati, km: 405
                ✅Tezlashuv 0-100 km, sek: 3.6
                ✅Joylar soni: 5
                ✅Quvvat: 880kVt / 1280Nm
                ✅Maksimal tezlik, km/soat: 280
                ✅Haydovchi blok: Toʻliq
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto jishi01Uz(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/KASLuRQVVa2soNQQH3qFki4MeBCemCudXyq7Mk8Q.webp"));
        sendPhoto.setCaption("""
                🚙Jishi 01
                
                ✅Batareya quvvati, kVt: 56
                ✅Tezlashuv 0-100 km, sek: 5.5
                ✅Quvvat: 204kVt / 340Nm
                ✅Haydovchi: To'liq
                ✅Quvvat zahirasi, km: 235
                ✅O'rinlar soni: 6 ta
                ✅Maksimal tezlik, km/soat: 190
                
                """);

        return sendPhoto;
    }

    //hechbek

    public SendPhoto BYD_Segaull(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/XZBuWOU3s2lQzubkw5PZvNlQ9hR64GhnZk1EUprF.webp"));
        sendPhoto.setCaption("""
                BYD Segaull
                                
                ✅Batareya quvvati, kVt: 38,88
                ✅Tezlashuv 0-100 km, sek: 9,5
                ✅Quvvat, kVt/hp: 55/75
                ✅Haydovchi blok: Old
                ✅Quvvat zahirasi (NEDC), km: 405
                ✅Joylar soni: 4
                ✅Maksimal tezlik, km/soat: 130
                """);
        return sendPhoto;
    }

    public SendPhoto BYD_Dolphin(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/sK0hrrHnCtspCoUUmPlwubE3LzhselJYdTiYv4wu.webp"));
        sendPhoto.setCaption("""
                BYD Dolphin
                                
                ✅Batareya quvvati, kVt: 44.9
                ✅Tezlashuv 0-100 km, sek: 7,5
                ✅Quvvat, kVt/hp: 130/177
                ✅Haydovchi blok: Old
                ✅Quvvat zahirasi (NEDC), km: 401
                ✅Joylar soni: 5
                ✅Maksimal tezlik, km/soat: 160
                ✅Zaryadlash tezligi (sekin / tez), soat: 6,41/0,5
                """);
        return sendPhoto;
    }

    public SendPhoto BYD_E2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/wTDQ0xMwIBQvDR2sba11CvPrgEVcaidi66kZuNYq.webp"));
        sendPhoto.setCaption("""
                BYD E2
                                
                ✅Batareya quvvati, kVt: 43,2
                ✅Tezlashuv 0-100 km, sek: 10,3
                ✅Quvvat, kVt/hp: 70/95
                ✅Haydovchi blok: Old
                ✅Quvvat zahirasi (NEDC), km: 405
                ✅Joylar soni: 5
                ✅Maksimal tezlik, km/soat: 130
                ✅Zaryadlash tezligi (sekin / tez), soat: 13,1/0,5
                """);
        return sendPhoto;
    }

    public SendPhoto Changan_BenBen_E_Star(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/dBUAaOFl9cQbMGsGart96nB5723xCec8KApGXTmz.webp"));
        sendPhoto.setCaption("""
                Changan BenBen E-Star
                                
                ✅Yoqilg'i turi: Elektr
                ✅O'lchamlari: 3770*1650*1570
                ✅Maksimal quvvat (hp): 75
                ✅Maksimal tezlik (km/soat): 101
                ✅NEDC diapazoni (km): 310
                ✅Eshiklar soni: 5
                ✅Umumiy batareya quvvati kVt: 31,95
                ✅Dvigatel quvvati (kVt): 55
                ✅Moment: 170
                ✅G'ildirak o'lchami: 175/60 R15
                """);
        return sendPhoto;
    }

    //hechbek yakun

    //minivan

    public SendPhoto Denza_D9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/luIEwx6z593gfrDOISORICB0o3mVocArTzIhirPJ.webp"));
        sendPhoto.setCaption("""
                Denza D9
                                
                ✅Batareya quvvati, kVt: 103,36
                ✅Tezlashuv 0-100 km, sek: 6,9
                ✅Quvvat, kVt/hp: 275/374
                ✅Haydovchi blok: To'liq
                ✅Quvvat zahirasi (NEDC), km: 600
                ✅Joylar soni: 7
                ✅Maksimal tezlik, km/soat: 190
                """);
        return sendPhoto;
    }

    public SendPhoto Zeekr_009(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/GyyaoLBYPQ04jO39mIy4obm1fKUwvNb7zwMOrgxf.webp"));
        sendPhoto.setCaption("""
                Zeekr 009
                                
                ✅Batareya quvvati, kVt: 822
                ✅Tezlashuv 0-100 km, sek: 140
                ✅Quvvat, kVt/hp: 400/544
                ✅Haydovchi blok: To'liq
                ✅Quvvat zahirasi (NEDC), km: 4,5
                ✅Joylar soni: 6
                ✅Maksimal tezlik, km/soat: 190
                """);
        return sendPhoto;
    }

    //minivan yakun

    public SendPhoto deliveryTimeAirUz(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/50/92/84/509284a7a4d625127ac2494435f25be3.jpg"));
        sendPhoto.setCaption("""
                (Havo transporti) Buyurtmangiz
                <b>5-10 kun ichida yetib keladi</b>
                Buyurtma berish uchun menejer bilan bog'laning
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto deliveryTimeAutoUz(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/52/1f/a9/521fa9413c8184e0639e48e0aba8e5da.jpg"));
        sendPhoto.setCaption("""
                (Avtomobil transporti) Buyurtmangiz
                <b>15-20 kun ichida yetib keladi</b>
                Buyurtma berish uchun menejer bilan bog'laning
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto deliveryTimeRailwayUz(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/e3/36/9d/e3369d0d0482dae1f457c3f8e88a992e.jpg"));
        sendPhoto.setCaption("""
                (Temir yo'l transporti) Buyurtmangiz
                <b>20-30 kun ichida keladi</b>
                Buyurtma berish uchun menejer bilan bog'laning
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendMessage contactUsUz(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("☎️biz bilan bog'lanish usulini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("📞Telefon raqam orqali");
        button1.setText("📲Telegram yoki elektron pochta orqali bog'laning");
        button2.setText("🏃🏼‍♂️Manzilga borish");
        button3.setText("⬅️Orqaga");

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
    public SendMessage byPhoneNumberUz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                Biz bilan bog'lanish
                CTRANS - logistika san'ati
                
                📞 Telefon raqami: +998 (99) 110 22 22
                """);
        return sendMessage;
    }

    public SendMessage contactViaTelegramOrEmailUz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                Biz bilan bog'lanish
                CTRANS - logistika san'ati
                
                📲Telegram: <a href="https://t.me/ctrans_uz">CTRANS MENEJER</a>
                📩Elektron pochta: info@ctrans.uz
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        return sendMessage;
    }

    public SendLocation goToAddressUz(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLongitude(69.210584);
        sendLocation.setLatitude(41.314611);

        return sendLocation;
    }
}