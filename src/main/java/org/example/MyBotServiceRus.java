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

public class MyBotServiceRus {
    public SendMessage asosiyMenuRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Главное меню");
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
        button.setText("\uD83D\uDE9AУслуги");
        button1.setText("\uD83D\uDE99Авто из Китая");
        button2.setText("⏰Срок доставки");
        button3.setText("☎️Наши контакты");
        button4.setText("\uD83C\uDFDBКурсы валют");
        button5.setText("\uD83E\uDDEEКалькулятор");
        button6.setText("ℹ️О нас");
        button7.setText("\uD83D\uDCACНаписать комментарий");
        button8.setText("⚙️Настройки");
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

    public SendMessage kontaktYuborishRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDE Введите свой номер телефона для регистрации. \n" +
                " \n" +
                "Отправьте номер в виде +998***********.");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setRequestContact(true);
        button1.setText("☎️Отправить номер телефона");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);

        return sendMessage;
    }

    public SendMessage izohQoldirishRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Оставить комментарий. Ваше мнение важно для нас");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️Назад");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);

        return sendMessage;
    }

    public SendMessage izohQabulQilindiRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅Ваш комментарий был принят");
        return sendMessage;
    }

    public SendMessage kanlkulyatorRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите транспорт, который вам нужен");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        button.setText("✈️Авиаперевозки");
        button1.setText("\uD83D\uDE88Железнодорожные перевозки");
        button2.setText("\uD83D\uDE98Автоперевозки");
        button3.setText("⬅️Назад");
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
    public SendMessage xizmatlarRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип услуги");
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
        button.setText("✈️ Авиаперевозки");
        button1.setText("\uD83D\uDE98 Автоперевозки");
        button2.setText("\uD83D\uDE88 Железнодорожные перевозки");
        button3.setText("Складовые услуги в Иу и Гуанчжоу");
        button4.setText("Услуги таможеннего оформления");
        button5.setText("⬅️Назад");
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

    public SendMessage carsFromChinaRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите свой тип автомобиля");

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
        button.setText("Седан");
        button1.setText("Кросовер");
        button2.setText("Хетчбек");
        button3.setText("Минивэн");
        button4.setText("⬅️Назад");
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

    public SendMessage deliveryTimeRus(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите нужную вам категорию.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("✈️  Воздушный транспорт");
        button1.setText("\uD83D\uDE98  Транспортное средство");
        button2.setText("\uD83D\uDE88  Железнодорожный транспорт");
        button3.setText("⬅️Назад");

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


    public SendPhoto aboutUsRus(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/25/0a/0a/250a0a09147092994b1d0fa9f1b00f52.jpg"));
        sendPhoto.setCaption("""
                О НАС
                Опыт работы в сфере логистических услуг по всему миру.
                
                Мы гордимся тем, что предоставляем лучшие
                предложения по доставке и транспортировке по всему миру.
                
                ✅100 % Компенсации
                ✅Опытная команда
                ✅Поддержка 24/7
                ✅Онлайн-отслеживание
                ✅Страхование грузов
                ✅Безопасный склад
                """);
        return sendPhoto;
    }


    public SendMessage sedanRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип седана");

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

        button.setText("\uD83D\uDE97BYD Seal");
        button1.setText("\uD83D\uDE97BYD Han");
        button2.setText("\uD83D\uDE97Chevrolet Monza 1.5L Atmo");
        button3.setText("\uD83D\uDE97Chevrolet Monza 1.3L Turbo");
        button4.setText("\uD83D\uDE97Honda Crider 1.0L Turbo");
        button5.setText("\uD83D\uDE97LeapMotor C01");
        button6.setText("\uD83D\uDE97HiPhi Z");
        button7.setText("\uD83D\uDE97IM Motors L7");
        button8.setText("\uD83D\uDE97Geometry G6");
        button9.setText("\uD83D\uDE97BMW i3 eDrive40");
        button10.setText("\uD83D\uDE97BMW i4 eDrive35");
        button11.setText("\uD83D\uDE97BMW i5 eDrive40");
        button12.setText("\uD83D\uDE97Neta S");
        button13.setText("\uD83D\uDE97Neta Gt");
        button14.setText("\uD83D\uDE97Zeeker 007");
        button15.setText("⬅️ Назад");

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

    public SendMessage crossoverRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип кроссовера");

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

        button.setText("\uD83D\uDE99BYD Song Plus Champion Edition");
        button1.setText("\uD83D\uDE99BYD Tang EV");
        button2.setText("\uD83D\uDE99BYD Yuan Plus EV");
        button3.setText("\uD83D\uDE99Zeeker 001");
        button4.setText("\uD83D\uDE99Zeeker X");
        button5.setText("\uD83D\uDE99LeapMotor C11");
        button6.setText("\uD83D\uDE99Geely Geometry E");
        button7.setText("\uD83D\uDE99Denza N7");
        button8.setText("\uD83D\uDE99HiPhi Y");
        button9.setText("\uD83D\uDE99NIO ES8");
        button10.setText("\uD83D\uDE99NIO EC7");
        button11.setText("\uD83D\uDE99LI Auto L7");
        button12.setText("\uD83D\uDE99LI Auto L9");
        button13.setText("\uD83D\uDE99IM Motors LS7");
        button14.setText("\uD83D\uDE99Geometry M6");
        button15.setText("\uD83D\uDE99LI Auto L8");
        button16.setText("\uD83D\uDE99Avatr 11");
        button17.setText("\uD83D\uDE99HiPhi X");
        button18.setText("\uD83D\uDE99LI Auto One");
        button19.setText("\uD83D\uDE99Lynk&Co 09EM-P");
        button20.setText("\uD83D\uDE99Chevrolet Seeker");
        button21.setText("\uD83D\uDE99BYD Song L");
        button22.setText("\uD83D\uDE99BYD Yangwang U8");
        button23.setText("\uD83D\uDE99Jishi 01");
        button24.setText("⬅️ Назад");


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
    public SendMessage minivanRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип минивэна");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("\uD83D\uDE90Denza D9");
        button1.setText("\uD83D\uDE90Zeeker 009");
        button2.setText("⬅️ Назад");

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

    public SendMessage xetchBackRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип хэтчбека");

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

        button.setText("\uD83D\uDE97BYD Seagull");
        button1.setText("\uD83D\uDE97BYD Dolphin");
        button2.setText("\uD83D\uDE97BYD E2");
        button3.setText("\uD83D\uDE97Changan BenBen E-Star");
        button4.setText("⬅️ Назад");

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



    public SendPhoto havotransportiRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://img.freepik.com/premium-photo/airplane-in-the-sky_1013690-70.jpg"));
        sendPhoto.setCaption("""
                Компания CTRANS предлагает авиаперевозки широкого спектра товаров с большими габаритами и весом. Авиаперевозки Китай-Узбекистан выбор большинства Узбекистанцев. Мы гарантируем вам быструю, безопасную, и качественную перевозку за минимальный срок.

                Сотрудники CTRANS бережно относятся и контролируют перевозку каждого товара. С нами вы будете уверены, что ваш товар прибудет в целости и сохранности.""");
        return sendPhoto;
    }

    public SendPhoto avtomobiltransportiRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.arrowtruck.com/wp-content/uploads/2023/02/2_Arrow-Truck-Sales_Comparing-The-Different-Semi-Truck-and-Trailer-Types_IMAGE1.jpg"));
        sendPhoto.setCaption("""
                Грузоперевозки автомобильным транспортом являются важнейшей составной рынка транспортных услуг, причем именно это направление считается лидером в сфере транспортировки  грузов от отправителя к получателю

                По сравнению с другими видами транспорта, за автотранспортом сегодня остаются серьезные приоритеты. Среди достоинств, которыми обладают автотранспортные грузоперевозки

                маневренность широкие возможности для логистической компании составлять наиболее выгодные маршруты следования оперативность доставки широкий спектр перевозимых товаров
                формирование сборных автомобильных грузов, объединяющих посылки от нескольких компаний большой выбор средств передвижения с учетом таких факторов, как вес, формат и габариты поклажи, наличие легковоспламеняемых товаров и быстропортящихся продуктов
                """);
        return sendPhoto;
    }
    public SendPhoto railwayTransportationRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://media.licdn.com/dms/image/C5622AQFC11sDRuGtfw/feedshare-shrink_800/0/1648805405802?e=2147483647&v=beta&t=6ru64usETOA39N_RYAOslVNhvpIIc4r4r_BRz8Ws_SY"));
        sendPhoto.setCaption("""
                Железнодорожные перевозки — одно из главных направлений деятельности CTRANS. Компанией осуществляется транспортировка как контейнерами нужного тоннажа, так и всеми видами вагона. 
                               
                Контейнерные перевозки позволят выполнить бесперегрузочную доставку товаров. Так значительно сокращается объём и увеличивается скорость промежуточных погрузочно-разгрузочных работ.
                                
                Железнодорожные перевозки — отличный выбор, если вы цените низкую стоимость транспортировки. Невысокая стоимость в данном случае обусловлена высокой грузоподъёмностью.
                
                """);

        return sendPhoto;
    }
    public SendPhoto werehouseRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://fkplatforma.ru/wp-content/uploads/2023/05/img-7.png"));
        sendPhoto.setCaption("""

                CTRANS предлагает услуги одновременной складской логистики в Китае, а также перевозки автомобилей из Китая.
                
                В крупных городах, таких как Иу и Гуанчжоу, развита торговля.
                
                Наши склады расположены в удобных местах города, чтобы нашим клиентам было удобнее экономить на хранении и доставке товара.
                
                """);

        return sendPhoto;
    }

    public SendPhoto ccsRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://wittysparks.com/wp-content/uploads/2019/12/custom-agents-checking.jpg"));
        sendPhoto.setCaption("""

                Компания CTRANS ценит время своих клиентов и предлагает услуги по таможенному декларированию грузов. Определение кодов TIF TN.
                                
                Таможенное оформление необходимо для оформления всей информации, касающейся товара, оформления и формирования комплекта документов с достоверной информацией о нем.
                                                                
                Не хотите, чтобы ваш багаж «болтался» где-то на полпути? Нам, конечно, не хочется, поэтому мы предлагаем нашим клиентам услугу таможенного оформления.
                                                                                                                                                              
                Обратившись в Ctrans, вы можете быть уверены в нашем профессионализме и в том, что окончательная цена товара не изменится после таможенного оформления. Мы поможем Вам пройти стоимость товара дешево и быстро, без непредвиденных расходов, через таможенный контроль.
                
                """);

        return sendPhoto;
    }

    public SendMessage settingsRus (Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("⚙️Выберите настройку");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("\uD83C\uDDF7\uD83C\uDDFAИзменить язык");
        button1.setText("☎️Изменить номер телефона");
        button2.setText("⬅️Назад");
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
    public SendMessage NomerAlmashtirRus(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Изменение номера");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        ArrayList<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        button.setText("☎️ Отправить номер телефона");
        row.add(button);
        rowList.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️Назад");
        row1.add(button1);
        rowList.add(row1);
        reply.setResizeKeyboard(true);
        reply.setKeyboard(rowList);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendPhoto bydSealRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/GbnFoweKIIJ8SGRcR3X1qaBAmgizk9E8798rn536.webp"));
        sendPhoto.setCaption("""
                🏎BYD Seal
                
                ✅Емкость батареи, кВт: 82,5
                ✅Разгон 0-100 км, сек: 3,8
                ✅Мощность, кВт/л.с: 390/530        
                ✅Привод: Полный              
                ✅Запас хода (NEDC), км: 650
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
                ✅Скорость зарядки (медленная/быстрая), час: 11,8/0,5
                
                """);

        return sendPhoto;
    }

    public SendPhoto bydHanRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/G5LEALmmX7YN3h2S0ejHxggKreWq0hgj0rkNV3zI.webp"));
        sendPhoto.setCaption("""
               🏎BYD Han
                
                ✅Емкость батареи, кВт: 85,4    
                ✅Разгон 0-100 км, сек: 3,9
                ✅Мощность, кВт/л.с: 380/517     
                ✅Привод: Полный             
                ✅Запас хода (NEDC), км: 610
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 185
                ✅Скорость зарядки (медленная/быстрая), час: 12,2/0,5
                
                """);

        return sendPhoto;
    }

    public SendPhoto chevroletMonzaAtmoRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/7XZX6Aa66UBk54V6XkdOikpRj7MaSpDsfdPEecaw.webp"));
        sendPhoto.setCaption("""
                🏎Chevrolet Monza 1.5L Atmo
                
                ✅Двигатель: 1.5 л (113 л.с.)
                ✅Коробка передач: 6-AT (Робот)
                ✅Разгон (0-100 км/час): 12.9 с     
                ✅Тип топлива: Бензин               
                ✅Привод: Полный
                ✅Количество мест: 5
               
                """);

        return sendPhoto;
    }

    public SendPhoto chevroletMonzaTurboRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/b3iKeMlJtqB2tNlBX4F9UYXbWLtrXRqJiD9ht8Sm.webp"));
        sendPhoto.setCaption("""
                🏎Chevrolet Monza 1.3L Turbo
                
                ✅Двигатель: 1.3л Турбо (163 л.с.)
                ✅Коробка передач: 6-AT (Робот)
                ✅Разгон (0-100 км/час): 9.2 с      
                ✅Тип топлива: Бензин             
                ✅Привод: Полный
                ✅Количество мест: 5
               
                """);

        return sendPhoto;
    }

    public SendPhoto HondaCriderTurboRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/WWWDezhpGgYHzzR9VApgwmj9eeNyNtW7OAlYygCk.webp"));
        sendPhoto.setCaption("""
                🏎Honda Crider 1.0L Turbo
                
                ✅Объем двигателя: 1.0 л Turbo  
                ✅Тип двигателя: Бензиновый
                ✅Расход: 5.0 л  
                ✅Мощность: 122 л.с.               
                ✅Разгон до 100: 10.7 с
               
                """);

        return sendPhoto;
    }

    public SendPhoto leapMotorC01Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/gAvBM75WivxQrmjUD4oBWpXvhS0MjkTfLEvz2v5d.webp"));
        sendPhoto.setCaption("""
                🏎LeapMotor C01
                
                ✅Емкость батареи, кВт: 90
                ✅Разгон 0-100 км, сек: 3,6
                ✅Мощность, кВт/л.с: 400/544
                ✅Привод: Полный              
                ✅Запас хода (NEDC), км: 630
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
               
                """);

        return sendPhoto;
    }

    public SendPhoto HiPhiZRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/TmaFh6qeILQV09RdIovwNghxCrx9BASiaMFvgdO9.webp"));
        sendPhoto.setCaption("""
                🏎HiPhi Z
                
                ✅Емкость батареи, кВт: 120
                ✅Разгон 0-100 км, сек: 3,8
                ✅Мощность, кВт/л.с: 494/672
                ✅Привод: Полный
                ✅Запас хода (NEDC), км: 705
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 200
                ✅Скорость зарядки (медленная/быстрая), час: 12,4/0,92             
                
                """);

        return sendPhoto;
    }

    public SendPhoto imMotorsL7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/n7IgJoqfWsM0w5ljA24sr0wBGUq7lrUp3g9bb5wi.webp"));
        sendPhoto.setCaption("""
                🏎IM Motors L7
                
                ✅Емкость батареи, кВт: 90
                ✅Разгон 0-100 км, сек: 3,7
                ✅Мощность: 445кВт / 605Нм
                ✅Привод: Полный
                ✅Запас хода, км: 615
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200         

                """);

        return sendPhoto;
    }

    public SendPhoto geometryG6Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/Zl6MhKhdsf1r5CfqLELkB4DnHjaliEh4XoTU6I56.webp"));
        sendPhoto.setCaption("""
                🏎Geometry G6
                
                ✅Емкость батареи, кВт: 70
                ✅Разгон 0-100 км, сек: 6,9
                ✅Мощность: 150 кВт / 204Нм
                ✅Привод: Передний
                ✅Запас хода, км: 580
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 150

                """);

        return sendPhoto;
    }

    public SendPhoto bmwi3eDrive40Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/eQXmyVoEXPqMbHTXPKK2SrtMvKeFYs9BkaYGTs70.webp"));
        sendPhoto.setCaption("""
                🏎BMW i3 eDrive40
                
                ✅Емкость батареи, кВт: 78,92
                ✅Разгон 0-100 км, сек: 5,6
                ✅Мощность, кВт/л.с: 250/340
                ✅Привод: задний
                ✅Запас хода (NEDC), км: 592
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
                ✅Скорость зарядки (медленная/быстрая), час: 7,5/0,68
                
                """);

        return sendPhoto;
    }

    public SendPhoto bmwi4eDrive35Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/gwvcNdDemXzj2KnSzE4KnrAiEQbr722zUqpkNwsw.webp"));
        sendPhoto.setCaption("""
                🏎BMW i4 eDrive35
                
                ✅Емкость батареи, кВт: 83,9
                ✅Разгон 0-100 км, сек: 5,7
                ✅Мощность: 250кВт / 340Нм
                ✅Привод: Полный
                ✅Запас хода, км: 625
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 182

                """);

        return sendPhoto;
    }

    public SendPhoto bmwi5eDrive40Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/5Pkx8cb6yJEhEPsJdXDBzEmfVDOr361aBdZILSLb.webp"));
        sendPhoto.setCaption("""
                🏎BMW i5 eDrive40
                
                ✅Емкость батареи, кВт: 81.2
                ✅Разгон 0-100 км, сек: 6
                ✅Мощность: 340кВт / 586Нм
                ✅Привод: Полный
                ✅Запас хода, км: 582
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 193

                """);

        return sendPhoto;
    }

    public SendPhoto netaSRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/fktgieIK4VYEVFIP0uN36tNjxRymXuAX2LIluq2Q.webp"));
        sendPhoto.setCaption("""
                🏎Neta S
                
                ✅Емкость батареи, кВт: 91
                ✅Разгон 0-100 км, сек: 3,9
                ✅Мощность, кВт/л.с: 340/462
                ✅Привод: Полный
                ✅Запас хода (NEDC), км: 715
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 185
                ✅Скорость зарядки (медленная/быстрая), час: 17/0,58

                """);

        return sendPhoto;
    }

    public SendPhoto netaGtRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/7fdWbQK8rsxAid456F7zwCFsqAIcKaibwZH1rMVS.webp"));
        sendPhoto.setCaption("""
                🏎Neta GT
                
                ✅Емкость батареи, кВт: 74.5
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 190
                ✅Запас хода (NEDC), км: 650
                ✅Мощность, кВт/л.с: 170
                ✅Привод: задний
                
                """);

        return sendPhoto;
    }

    public SendPhoto zeeker007Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/o81wp9OhfwgTCIkaXwEoFqhO0Dsgxx7Mh3VDFw47.webp"));
        sendPhoto.setCaption("""
                🏎Zeeker 007
                
                ✅Емкость батареи, кВт: 70
                ✅Разгон 0-100 км, сек: 2,84
                ✅Мощность: 421кВт / 224Нм
                ✅Привод: Полный
                ✅Запас хода, км: 688
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 210

                """);

        return sendPhoto;
    }

    public SendPhoto BYDSongPlusChampionEditionRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/6xKSj76RdxhSGrindKkIbsV6J4MZJeI4bhF7SvK9.webp"));
        sendPhoto.setCaption("""
                🚙BYD Song Plus Champion Edition
                
                ✅Емкость батареи: 87,04 кВтч
                ✅Дисплей: 15,6" мультимедиа
                ✅Функция караоке: Есть        
                ✅Количество мест: 5         
                ✅Максимальная скорость, км/ч: 175
                ✅Запас хода (NEDC): 605 км
                ✅Автоматическая парковка: Есть
                ✅Разгон 0-100 км, сек: 8,5
                ✅Мощность, кВт/л.с: 160/218
                ✅Привод: Передний
                
                """);

        return sendPhoto;
    }
    public SendPhoto BYDTangEVRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/MkAX3VNbdNuNqsWJvz3KZgyK1QJVGJpxOcf6rIRP.webp"));
        sendPhoto.setCaption("""
                🚙BYD Tang EV
                
                ✅Емкость батареи, кВт: 108,8
                ✅Разгон 0-100 км, сек: 4,4
                ✅Мощность, кВт/л.с: 380/517        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 635
                ✅Количество мест: 7
                ✅Максимальная скорость, км/ч: 180
                ✅Скорость зарядки (медленная/быстрая), час: 16,5/0,5
                
                """);

        return sendPhoto;
    }
    public SendPhoto BYDYuanPlusEVRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/GkibsVTK9z55KFCWHnci3A7xZgKGMydhoHGKIdjy.webp"));
        sendPhoto.setCaption("""
                🚙BYD Yuan Plus EV
                
                ✅Емкость батареи, кВт: 60.5
                ✅Разгон 0-100 км, сек: 7,3
                ✅Мощность, кВт/л.с: 150/204        
                ✅Привод: Передний         
                ✅Запас хода (NEDC), км: 510
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 160
                ✅Скорость зарядки (медленная/быстрая), час: 8,64/0,5
                
                """);

        return sendPhoto;
    }
    public SendPhoto Zeekr001Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/SWxFK8ht6WR0bB2HfhCw1xlONX9RjAN5RuZG18fm.webp"));
        sendPhoto.setCaption("""
                🚙Zeekr 001
                
                ✅Запас хода (NEDC), км: 650
                ✅Емкость батареи, кВтч: 100
                ✅Мощность, кВт/л.с: 400/544
                ✅Привод: Полный         
                ✅Разгон 0-100 км, сек: 3,8
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200
                
                """);

        return sendPhoto;
    }
    public SendPhoto ZeekrXRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/41pwueDIG22eJtsPOvQvNm4Cx7tR9nkoSM1VAT2o.webp"));
        sendPhoto.setCaption("""
                🚙Zeekr X
                
                ✅Запас хода (NEDC), км: 500
                ✅Емкость батареи, кВтч: 66
                ✅Мощность, кВт/л.с: 315/428        
                ✅Привод: Полный        
                ✅Разгон 0-100 км, сек: 3,8
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 190
                
                """);

        return sendPhoto;
    }
    public SendPhoto LeapMotorC11Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/aucwGVtBiLRBOpBhJj3qMhb8oQ7ztlh0bvB5zI3Y.webp"));
        sendPhoto.setCaption("""
                🚙LeapMotor C11
                
                ✅Емкость батареи, кВт: 90
                ✅Разгон 0-100 км, сек: 4,5
                ✅Мощность, кВт/л.с: 400/544       
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 580
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200

                """);

        return sendPhoto;
    }
    public SendPhoto GeelyGeometryERus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/juAVI9k9BjoAUgS3eVAV5Rc0gREwuRVBFDfginS4.webp"));
        sendPhoto.setCaption("""
                🚙Geely Geometry E
                
                ✅Емкость батареи, кВт: 39,4
                ✅Разгон 0-100 км, сек: 8,8
                ✅Мощность, кВт/л.с: 60/82        
                ✅Привод: Передний         
                ✅Запас хода (NEDC), км: 401
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 102

                """);

        return sendPhoto;
    }
    public SendPhoto DenzaN7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/wvBTQdrUhyfgKY8S7xqOseeicOmtGL7wLGNnY7E6.webp"));
        sendPhoto.setCaption("""
               🚙Denza N7
                
                ✅Емкость батареи, кВт: 91,3
                ✅Разгон 0-100 км, сек: 3,9
                ✅Мощность, кВт/л.с: 390/530        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 630
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
                ✅
                
                """);

        return sendPhoto;
    }
    public SendPhoto HiPhiYRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/jbLkedyoEHmhdmhGfmWPDhee6a3jqqFgq55GYxq8.webp"));
        sendPhoto.setCaption("""
                🚙HiPhi Y
                
                ✅Емкость батареи, кВт: 115
                ✅Разгон 0-100 км, сек: 4,7
                ✅Мощность, кВт/л.с: 371/505        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 765
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 190
                
                """);

        return sendPhoto;
    }
    public SendPhoto NIOES8Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/zQV9rA6sYRm8zNgnxBdtHYdR2XczJUnxElxkOeVc.webp"));
        sendPhoto.setCaption("""
                🚙NIO ES8
                
                ✅Емкость батареи, кВт: 100
                ✅Разгон 0-100 км, сек: 4,1
                ✅Мощность, кВт/л.с: 480/653        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 605
                ✅Количество мест: 6
                ✅Максимальная скорость, км/ч: 200
                ✅Скорость зарядки (медленная/быстрая), час: 0,5
                
                """);

        return sendPhoto;
    }
    public SendPhoto NIOEC7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/xoOfzfnOEU35Da860RQf7tmwLu4tmSzHFgbGKESz.webp"));
        sendPhoto.setCaption("""
                🚙NIO EC7
                
                ✅Емкость батареи, кВт: 100
                ✅Разгон 0-100 км, сек: 3,8
                ✅Мощность, кВт/л.с: 480/653       
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 635
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200
                ✅Скорость зарядки (медленная/быстрая), час: 0,33
                
                """);

        return sendPhoto;
    }
    public SendPhoto LIAutoL7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/RNQBVoacpvXjimNtBxZfZDfJN00HVDL6N7XQAM4l.webp"));
        sendPhoto.setCaption("""
                🚙LI Auto L7
                
                ✅Емкость батареи, кВт: 42.8
                ✅Разгон 0-100 км, сек: 5.3
                ✅Мощность: 330 кВт / 620 Нм       
                ✅Запас хода, км: 1315         
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
              
                                                                                                                                                                                                                        
                                                                                                                                                                                                                        
                """);

        return sendPhoto;
    }
    public SendPhoto LIAutoL9Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/hYabLzhJzyKeKAmbXydaT5kgK7za47MAZLOQzwO6.webp"));
        sendPhoto.setCaption("""
                🚙LI Auto L9
                
                ✅Емкость батареи, кВт: 44.5
                ✅Разгон 0-100 км, сек: 5.3
                ✅Мощность: 330 кВт / 620 Нм        
                ✅Запас хода, км: 1100         
                ✅Количество мест: 6
                ✅Максимальная скорость, км/ч: 180
   
                """);

        return sendPhoto;
    }
    public SendPhoto IMMotorsLS7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/tpG5urfPNaVYhLY7sEkYmfBYIo63zuWsa88nOq4U.webp"));
        sendPhoto.setCaption("""
                🚙IM Motors LS7
                
                ✅Емкость батареи, кВт: 100
                ✅Разгон 0-100 км, сек: 4,5
                ✅Мощность: 425кВт / 578Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 625
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200
               
                """);

        return sendPhoto;
    }
    public SendPhoto GeometryM6Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/BgJZKJoWenpHEV6sbSeLRzWFmKYN2E9QcxqyFyvM.webp"));
        sendPhoto.setCaption("""
               🚙Geometry M6
                
                ✅Емкость батареи, кВт: 70
                ✅Разгон 0-100 км, сек: 6,9
                ✅Мощность: 150кВт / 204Нм        
                ✅Привод: Передний         
                ✅Запас хода, км: 580
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 150
               
                """);

        return sendPhoto;
    }
    public SendPhoto LIAutoL8Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/jGQVsR2nxeEmeBVuOd07Uo3OffAFU9Ptj5HBw4sU.webp"));
        sendPhoto.setCaption("""
                🚙LI Auto L8
                
                ✅Емкость батареи, кВт: 42.8
                ✅Разгон 0-100 км, сек: 5.5
                ✅Мощность, кВт/л.с: 449
                ✅Привод: Полный
                ✅Запас хода (NEDC), км: 1315
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
               
                """);

        return sendPhoto;
    }
    public SendPhoto Avatr11Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/feyQk6GFzkFU4u0IB9KKaVHgHdsOrUdbRLCeRFv7.webp"));
        sendPhoto.setCaption("""
                🚙Avatr 11
                
                ✅Емкость батареи, кВт: 116,79
                ✅Разгон 0-100 км, сек: 4,5
                ✅Мощность: 425кВт / 578 Нм
                ✅Привод: Полный
                ✅Запас хода, км: 680
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 200
                
                """);

        return sendPhoto;
    }
    public SendPhoto HiPhiXRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/mFaMd0SDGOiNIRMzXrbHKdyKlkoXN5zRqAVK1Obv.webp"));
        sendPhoto.setCaption("""
                🚙HiPhi X
                
                ✅Емкость батареи, кВт: 94,3
                ✅Разгон 0-100 км, сек: 4
                ✅Мощность: 440кВт / 598Нм
                ✅Привод: Полный
                ✅Запас хода, км: 550
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 200
                
                """);

        return sendPhoto;
    }
    public SendPhoto LIAutoOneRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/Rio4OVECZKtP6rATA0xAmwk66swm7pt9i5JmEPLU.webp"));
        sendPhoto.setCaption("""
                🚙LI Auto One
                
                ✅Емкость батареи, кВт: 40.5
                ✅Разгон 0-100 км, сек: 6.5
                ✅Мощность: 244кВт /552Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 890
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 172
                
                """);

        return sendPhoto;
    }
    public SendPhoto LynkCo09EMPRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/tS5di4emmprxFcaSAEvu7KeqU8nV2cJpt0WbHTB5.webp"));
        sendPhoto.setCaption("""
                🚙Lynk&Co 09EM-P
                
                ✅Емкость батареи, кВт: 40
                ✅Количество мест: 5
                ✅Привод: Полный        
                ✅Разгон 0-100 км, сек: 5.9         
                ✅Мощность, кВт/л.с: 540
              
                """);

        return sendPhoto;
    }
    public SendPhoto ChevroletSeekerRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/sh3Tmy6GCsarJzred5lUMaLxgNM6sECxsApeFUX9.webp"));
        sendPhoto.setCaption("""
                🚙Chevrolet Seeker
                
                ✅Объем: 1.5
                ✅Расход: 6.6
                ✅Мощность, кВт/л.с: 184/135        
                ✅Привод: Передний         
                ✅Коробка: Вариатор
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 205
                
                """);

        return sendPhoto;
    }
    public SendPhoto BYDSongLRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/qrSJ9LUiyqxQm3akh3668mKbbe3Z094IG7pZx8hp.webp"));
        sendPhoto.setCaption("""
                🚙BYD Song L
                
                ✅Емкость батареи, кВт: 87
                ✅Разгон 0-100 км, сек: 4,3
                ✅Мощность: 380кВт / 517 Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 602
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200
                
                """);

        return sendPhoto;
    }
    public SendPhoto BYDYangwangU8Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/WGKjCPUUUdL9MdB4AAiLMM0AXSU5TfGwTJ6bZa5F.webp"));
        sendPhoto.setCaption("""
                🚙BYD Yangwang U8
                
                ✅Емкость батареи, кВт: 49.05
                ✅Разгон 0-100 км, сек: 3.6
                ✅Мощность: 880кВт / 1280Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 405
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 280
                
                """);

        return sendPhoto;
    }

    public SendPhoto jishi01Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/KASLuRQVVa2soNQQH3qFki4MeBCemCudXyq7Mk8Q.webp"));
        sendPhoto.setCaption("""
                🚙Jishi 01
                
                ✅Емкость батареи, кВт: 56
                ✅Разгон 0-100 км, сек: 5.5
                ✅Мощность: 204кВт / 340Нм
                ✅Привод: Полный
                ✅Запас хода, км: 235
                ✅Количество мест: 6
                ✅Максимальная скорость, км/ч: 190
                
                """);

        return sendPhoto;
    }




                                        //Хетчбек

    public SendPhoto BYDSeagullRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/XZBuWOU3s2lQzubkw5PZvNlQ9hR64GhnZk1EUprF.webp"));

        sendPhoto.setCaption("""
                🚗BYD Seagull
                
                ✅Емкость батареи, кВт: 38,88
                ✅Разгон 0-100 км, сек: 9,5
                ✅Мощность, кВт/л.с: 55/75      
                ✅Привод: Передний  
                ✅Запас хода (NEDC), км: 405
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 130
                
                """);
        return sendPhoto;
    }

    public SendPhoto BYDDolphinRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/sK0hrrHnCtspCoUUmPlwubE3LzhselJYdTiYv4wu.webp"));

        sendPhoto.setCaption("""
                🚗BYD Dolphin
                
                ✅Емкость батареи, кВт: 44.9
                ✅Разгон 0-100 км, сек: 7,5
                ✅Мощность, кВт/л.с: 130/177
                ✅Привод: Передний
                ✅Запас хода (NEDC), км: 401
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 160
                ✅Скорость зарядки (медленная/быстрая), час: 6,41/0,5
                
                """);
        return sendPhoto;
    }
    public SendPhoto BYDE2Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/wTDQ0xMwIBQvDR2sba11CvPrgEVcaidi66kZuNYq.webp"));

        sendPhoto.setCaption("""
                🚗BYD E2
                
                ✅Емкость батареи, кВт: 43,2
                ✅Разгон 0-100 км, сек: 10,3
                ✅Мощность, кВт/л.с: 70/95
                ✅Привод: Передний  
                ✅Запас хода (NEDC), км: 405
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 130
                ✅Скорость зарядки (медленная/быстрая), час: 13,1/0,5
                
                """);
        return sendPhoto;
    }
    public SendPhoto ChanganBenBenEStarRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/dBUAaOFl9cQbMGsGart96nB5723xCec8KApGXTmz.webp"));

        sendPhoto.setCaption("""
                🚗Changan BenBen E-Star
                
                ✅Тип топлива: Электрический
                ✅Габариты: 3770*1650*1570
                ✅Максимальная мощность (л.с.): 75
                ✅Максимальная скорость (км / ч): 101
                ✅Диапазон NEDC (км): 310
                ✅Количество дверей: 5
                ✅Общая мощность аккумулятора кВт: 31,95
                ✅Мощность двигателя (Квт): 55
                ✅Крутящий момент: 170
                ✅Размер колес: 175/60 R15
                
                
                """);
        return sendPhoto;
    }


    //Miniven
    //yaxuuuuuuuu




    public SendPhoto DenzaD9Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/luIEwx6z593gfrDOISORICB0o3mVocArTzIhirPJ.webp "));

        sendPhoto.setCaption("""
                🚐Denza D9
                
                ✅Емкость батареи, кВт: 103,36
                ✅Разгон 0-100 км, сек: 6,9
                ✅Мощность, кВт/л.с: 275/374
                ✅Привод: Полный
                ✅Запас хода (NEDC), км: 600
                ✅Количество мест: 7
                ✅Максимальная скорость, км/ч: 190
                
                """);
        return sendPhoto;
    }
    public SendPhoto Zeekr009Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/GyyaoLBYPQ04jO39mIy4obm1fKUwvNb7zwMOrgxf.webp"));

        sendPhoto.setCaption("""
                🚐Zeekr009
                
                ✅Емкость батареи, кВт: 822
                ✅Разгон 0-100 км, сек: 140
                ✅Мощность, кВт/л.с: 400/544
                ✅Привод: Полный
                ✅Запас хода (NEDC), км: 4,5
                ✅Количество мест: 6
                ✅Максимальная скорость, км/ч: 190
               
                """);
        return sendPhoto;
    }



    public SendPhoto deliveryTimeAirRus(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/6d/a8/db/6da8db98776af35093db2051a3df992b.jpg"));
        sendPhoto.setCaption("""
                (Авиатранспорт) Ваш заказ будет доставлен в течение
                <b>5-10 дней</b>
                Для заказа свяжитесь с менеджером
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto deliveryTimeAutoRus(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/74/3d/20/743d205df123be14b4e900e5770fc1c2.jpg"));
        sendPhoto.setCaption("""
                (Автомобильный транспорт) Ваш заказ
                <b>прибудет через 15-20 дней</b>
                Для заказа свяжитесь с менеджером
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    public SendPhoto deliveryTimeRailwayRus(Long chatId){

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.pinimg.com/originals/77/ac/2e/77ac2e917940d10a9c8ca66996743eda.jpg"));
        sendPhoto.setCaption("""
                (Ж/д транспорт) Ваш заказ прибудет в течение
                <b>20-30 дней</b>
                Для заказа свяжитесь с менеджером
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendMessage contactUsRus(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("☎️Выберите способ связаться с нами");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("📞По номеру телефона");
        button1.setText("📲Связь через Telegram или по электронной почте");
        button2.setText("🏃🏼‍♂️Перейти по адресу");
        button3.setText("⬅️Назад");

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

    public SendMessage byPhoneNumberRus(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                Связаться с нами
                CTRANS – искусство логистики
                
                📞 Номер телефона: +998 (99) 110 22 22
                """);
        return sendMessage;
    }

    public SendMessage contactViaTelegramOrEmailRus(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                Связаться с нами
                CTRANS – искусство логистики
                
                📲Телеграм: <a href="https://t.me/ctrans_uz">МЕНЕДЖЕР CTRANS</a>
                📩Электронная почта: info@ctrans.uz
                """);
        sendMessage.setParseMode(ParseMode.HTML);
        return sendMessage;
    }

    public SendLocation goToAddressRus(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLongitude(69.210584);
        sendLocation.setLatitude(41.314611);

        return sendLocation;
    }
}
