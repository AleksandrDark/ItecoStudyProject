package com.iteco.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        stringBuilder.append("Люблю грозу в начале мая,\n" +
                "Когда весенний, первый гром,\n" +
                "Как бы резвяся и играя,\n" +
                "Грохочет в небе голубом.\n" +
                "Гремят раскаты молодые,\n" +
                "Вот дождик брызнул, пыль летит,\n" +
                "Повисли перлы дождевые,\n" +
                "И солнце нити золотит.\n" +
                "С горы бежит поток проворный,\n" +
                "В лесу не молкнет птичий гам,\n" +
                "И гам лесной, и шум нагорный –\n" +
                "Все вторит весело громам.\n" +
                "Ты скажешь: ветреная Геба,\n" +
                "Кормя Зевесова орла,\n" +
                "Громокипящий кубок с неба,\n" +
                "Смеясь, на землю пролила.");
        stringBuilder.insert(80, "79271234567@yandex.ru,  " +
                "+79226704510, " +
                "+74955555050, " +
                "+74994444550, " +
                "AdminVasilev@mail.ru , " +
                "userVasilev@mail.ue, " +
                "moderator@goodle.com, ");

        Pattern phonePattern = Pattern.compile("\\+*\\d{11}");
        Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = phonePattern.matcher(stringBuilder);
        while (matcher.find()){
            String s = matcher.group();
            s = s.replace(s.substring(s.indexOf("7")+1), "*");
            System.out.println(s);
        }

        Matcher matcher1 = emailPattern.matcher(stringBuilder);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }
    }
}
