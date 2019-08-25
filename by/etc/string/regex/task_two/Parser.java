package by.etc.string.regex.task_two;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Дана строка, содержащая следующий текст (xml-документ):
<notes>
 <note id = "1">
 <to>Вася</to>
 <from>Света</from>
 <heading>Напоминание</heading>
 <body>Позвони мне завтра!</body>
 </note>
 <note id = "2">
 <to>Петя</to>
 <from>Маша</from>
 <heading>Важное напоминание</heading>
 <body/>
 </note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.*/

public class Parser {


   public static String parse(String str) {


        String[] lines = splitByNewLine(str);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {

            builder.append("Содержимое: "+lines[i].replaceAll("<.*?>", "")+"\n");    //  содержимое
            builder.append("Открывающий тег: "+ findByRegex("<[^/].*?>", lines[i])+"\n");
            builder.append("Закрывающий тег: "+ findByRegex("</.*?>", lines[i])+"\n");
            builder.append("Без тела: "+ findByRegex("<[^/].*?>", lines[i])+ findByRegex("</.*?>",lines[i])+"\n");
            builder.append("---------------------------\n");
        }
        return builder.toString();
    }

    private static String[] splitByNewLine(String str)
    {
        String[] strArr = str.split("\\n");
        String[] withTagStr = new String[0];
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].matches("<.+>.+<.+>"))
            {
                withTagStr = extendArr(withTagStr,strArr[i]);
            }
        }
        return withTagStr;
    }

    private static String findByRegex(String regex, String str)
    {
        String result = "";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while(m.find())
        {
            result = str.substring(m.start(), m.end());
        }
        return result;
    }

    private static String[] extendArr(String[] arr, String str) {

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = str;
        return arr;
    }

}