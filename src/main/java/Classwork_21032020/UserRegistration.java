package Classwork_21032020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean chekName (String name) {
        if (name.equals("")) {
            System.out.println("Имя не введено, попробуйте еще раз");
            return false;
        } else {
            String[] subStr;
            String delimeter = " "; // Разделитель
            subStr = name.split(delimeter);
            int i = subStr.length;
            if (i > 1) {
                System.out.println("Имя содержит больше одного слова! Недопустимо!");
                return false;
            } else {
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(name);
                int start = 0;
                while (matcher.find(start)) {
                    String value = name.substring(matcher.start(), matcher.end());
                    int result = Integer.parseInt(value);
                    start = matcher.end();
                }
                if (start > 0) {
                    System.out.println("В имени использованы цифры! Недопустимо!");
                    return false;
                } else {
                    System.out.println("Имя введено корректно");
                    return true;
                }
            }
                }
            }
            public static String regName () {
                System.out.println("Введите Ваше имя. Имя должно состоять из одного слова и не содержать цифр");
                return new Scanner(System.in).nextLine();

            }
        }
