package com.iteco.io;

import com.iteco.regex.SomeText;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь до файла:");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        SomeText someText = new SomeText("", new ArrayList<>());
        Pattern pattern = Pattern.compile("[A-Za-zА-Яа-я0-9 \n]");
        InputStreamReader fis =new InputStreamReader(
                new FileInputStream(file),
                StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        while(fis.ready()){
            stringBuilder.append((char) fis.read());
        }

        if (stringBuilder.length() > 128) {
            System.out.println("В файлe " + stringBuilder.length() +
                    "\nФайл превышает 128 символов. \n" +
                    "К сожалению не выйдет\n");
        } else {
            Matcher matcher = pattern.matcher(stringBuilder);
            while (matcher.find()){
                stringBuilder1.append(matcher.group());
            }

            String[] t = stringBuilder1.toString().toLowerCase().split("[ \n]");
            stringBuilder1.delete(0, stringBuilder1.length());

            for (int i = 0; i < t.length; i++) {
                String string = t[i].trim();
                stringBuilder1.append(string);
                if (string.length() > 6){
                    someText.getBigWords().add(string);
                }
            }
            someText.setText(stringBuilder1.toString());
        }
        stringBuilder1.delete(0, stringBuilder1.length());

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\users\\user\\test.txt");
        fileOutputStream.write(someText.getText().getBytes());
        String string = "\n";
        for (String bigWord : someText.getBigWords()) {
            stringBuilder1.append(bigWord).append(", ");
        }
        string += stringBuilder1.substring(0, stringBuilder1.length()-2);
        fileOutputStream.write(string.getBytes());
    }
}
