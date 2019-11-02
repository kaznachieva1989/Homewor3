package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Zair";
        names[1] = "Nura";
        names[2] = "Agahan";
        String[] newNames = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
        }
        newNames[names.length] = "Kanykei";
        names = newNames;
        for (String elements : names) {
            System.out.println(elements);
        }

        for (String hi : newNames) {
            switch (hi) {
                case "Zair":
                    System.out.println(newNames[0] + "," + " " + "Доброе утро");
                    break;
                case "Nura":
                    System.out.println(newNames[1] + "," + " " + "Добрый день");
                    break;
                case "Agahan":
                    System.out.println(newNames[2] + "," + " " + "Добрый вечер");
                    break;
                case "Kanykei":
                    System.out.println(newNames[3] + "," + " " + "Счастливого дня");
                    break;
                default:
                    System.out.println("Nothing to say");
            }
        }
    }
}