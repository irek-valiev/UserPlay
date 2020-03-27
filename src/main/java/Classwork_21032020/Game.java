package Classwork_21032020;

import java.util.Random;
import java.util.Scanner;

public class Game extends UserRegistration{
    public static void choiceGame() {
        String game;
        do {
            game = new Scanner(System.in).nextLine();
            switch (game) {
                case "Угадать число":
                    guessNumber();
                    break;
                case "Загадать число":
                    makeNumber();
                    break;
                default:
                    System.out.println("Игра не выбрана! Попробуйте еще раз");
                    break;
            }
        } while (!(game.equals("Угадать число") || game.equals("Загадать число")));
           }

    public static void guessNumber() {
        System.out.println("Игра <Угадать число> активирована!");
        Random rand = new Random();
       int randnum1 = rand.nextInt(101);
        int x;
        do {
            System.out.println("Введите число от 0 до 100");
            x = new Scanner(System.in).nextInt();
            if (x < randnum1) System.out.println("меньше");
            if (x > randnum1) System.out.println("больше");
                  } while (!(x == randnum1));
        System.out.println("Поздравляем!!!! Вы выигали!!!");
        System.out.println("Хотите ли Вы сыграть в игру<Загадать число>?");
        String b = new Scanner(System.in).nextLine();
        if (b.equals("да")) {
            makeNumber();
        }
        else System.out.println("Jumanji прощается с Вами!");
        }
   public static void makeNumber(){
       System.out.println("Игра <Загадать число> активирована!");
       System.out.println();
       String word;
        do {
           System.out.println("Загадайте число от 0 до 100. После этого введите слово <загадал>!");
           word = new Scanner(System.in).nextLine();
          } while (!word.equals("загадал"));
       String test;
       int max = 100;
       int min = 1;
       int range = max - min + 1;
       int randnum2 = 0;
       for (int i = 0; i < 100; i++) {
           randnum2 = (int) (Math.random() * range) + min;
       }
       do {
           System.out.println("Это число " + randnum2 + "?");
           System.out.println("Если Jumanji выводит число меньшее загаданного, то введите <меньше>," +"\n" +
                   " если больше, то введите <больше>!");
           test = new Scanner(System.in).nextLine();
           switch (test) {
               case "меньше":
                   for (int i = randnum2; i < 100; i++) {
                       randnum2 = (int) (Math.random() * range) + min;
                   }
                   break;
               case "больше":
                   for (int i = 0; i < randnum2; i++) {
                       randnum2 = (int) (Math.random() * range) + min;
                   }
                   break;
               case "правильно":
                   System.out.println("Ура, победа!!");
               case "выйти":
                   break;
               default:
                   break;
           }
       }while (!(test.equals("правильно") || test.equals("выйти")));
            System.out.println("Игра <Загадть число> завершена");
       System.out.println("Хотите ли Вы сыграть в игру <Угадать число>?");
       String c = new Scanner(System.in).nextLine();
       if (c.equals("да")) {
           guessNumber();
       }
       else System.out.println("Jumanji прощается с Вами!");
   }
   }

