package Vlad1679_Telegram_Bot;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new HelloWorldBot());
            System.out.println("Бот запущений локально!");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
