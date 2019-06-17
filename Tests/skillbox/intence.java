package skillbox;

import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.image.BufferedImage;

class Ideone {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("===============================================");
        System.out.println("Кофе-машина.");
        System.out.println("===============================================");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Какой суммой денег вы располагаете? Введите с клавиатуры число.");
        int moneyAmount = 0;
        try {
            moneyAmount = Integer.parseInt(reader.readLine()); // тут вводим с консоли бабло
        } catch (NumberFormatException e) {
            System.err.println("Ошибка ввода числа!");
        }
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -  ");

        int[] drinkPrices = {120, 80, 20};
        String[] drinkNames = {"капучино", "эспрессо", "водичку"};
        if (moneyAmount >= 20) {
            for (int i = 0; i < drinkNames.length; i++) {
                if (moneyAmount >= drinkPrices[i])
                    System.out.println("Вы можете купить " + drinkNames[i]);
                else
                    System.out.println("Вы не можете купить " + drinkNames[i]);
            }
        } else {
            System.out.println("Не достаточно средств для покупки напитка.");
        }

        System.out.println("===============================================");
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
        System.out.println("Вывод даты в формате.");
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -  ");
        System.out.println(format.format(new Date()));
        System.out.println("===============================================");

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        System.out.println("Вывод разрешения скриншота.");
        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -  ");
        System.out.println("Ширина - " + image.getWidth());
        System.out.println("Высота - " + image.getHeight());
        System.out.println("===============================================");
    }
}