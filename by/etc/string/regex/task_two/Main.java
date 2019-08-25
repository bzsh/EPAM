package by.etc.string.regex.task_two;

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

public class Main {

    public static void main(String[] args) {

        String str
                = "<notes>\n"
                + "<note id = \"1\">\n"
                + "<to>Vasya</to>\n"
                + "<from>Sveta</from>\n"
                +"<heading>Reminder</heading>\n"
                + "<body>Call me tomorrow!</body>\n"
                + "</note>\n"
                + "<note id = \"2\">\n"
                + "<to>Petya</to>\n"
                + "<from>Masha</from>\n"
                +"<heading>Important reminder</heading>\n"
                + "</note>\n"
                +"</notes>";

        System.out.println(Parser.parse(str));

    }

}
