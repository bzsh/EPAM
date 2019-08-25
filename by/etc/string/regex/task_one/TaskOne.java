package by.etc.string.regex.task_one;

/*
Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
        операции: отсортировать абзацы по количеству предложений;
                  в каждом предложении отсортировать слова по длине;
                  отсортировать лексемы в предложении по убыванию
                  количества вхождений заданного символа,
                  а в случае равенства – поалфавиту.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        String text = "Доставщик принадлежит к элитному ордену , к избранным среди людей. Боевого духа у него выше крыши. Сейчас ему предстоит третья миссия за эту ночь. Черная, как активированный уголь, форма словно высасывает свет из воздуха. Пуля отскочит от арахноволокна этого скафандра, точно птица-крапивник от садовой двери, но испарина проносится как вихрь через лес, только что политый напалмом. Надо всеми суставами и костями – синтезированный бронегель: на ощупь как зернистый студень, защищает как стопка телефонных справочников.\n" +
                "\n" +
                "При приеме на работу ему выдали пушку. Доставщик никогда не марается о наличность, но всегда найдется простак, охочий до его машины или груза. Пушка крохотная, обтекаемая, весит мало – словно созданная оружейником-кутюрье; стреляет она крохотными стрелами, вылетающими со скоростью в пять раз большей, чем у самолета-шпиона модели «SR-71», а когда закончишь стрелять, ее нужно воткнуть в прикуриватель в автомобиле, поскольку работает она на аккумуляторах.\n" +
                "\n" +
                "Доставщик никогда не выхватывал ее в гневе или в страхе. Он достал ее лишь однажды в «Нагорье Хилы». Двое жлобов в этом понтовом ЖЭКе решили, будто могут получить заказ, не заплатив за него. Думали напугать Доставщика бейсбольной битой. Доставщик выхватил свою пушку, навел лазерный прицел на самоуверенного Луисвильского Отбивающего и выстрелил. Отдача была огромной – оружие словно взорвалось у него в руке. Средняя треть бейсбольной биты превратилась в столп горящих опилок, и их разнесло во все стороны, будто сверхновая вспыхнула. В руках у жлоба осталась рукоять биты, из которой валил молочно-белый дым, а сам он остался дурак дураком. Ничего не получил от Доставщика, кроме проблем на свою задницу.\n" +
                "\n" +
                "С тех пор Доставщик пушку держит в бардачке, а полагается вместо нее на пару самурайских мечей; впрочем, он всегда предпочитал их любому другому оружию. Жлобы из «Нагорья Хилы» огнестрельного оружия не испугались, поэтому Доставщик вынужден был пустить его в ход. Мечи сами за себя говорят.\n" +
                "\n" +
                "Энергии в аккумуляторах его машины хватит даже на то, чтобы забросить фунт бекона в Пояс Астероидов. Не в пример семейным малолитражкам и навороченным седанам, машина Доставщика эту энергию сбрасывает через начищенные зияющие сфинктеры. Когда Доставщик дает по газам, весь мир ходит ходуном. Вы скажете: а как же шипы сцепления на покрышках? Ага, у вашей тачки они крошечные и с асфальтом стыкуются в четырех местах размером с язык. У Доставщика не шипы, а липучки шириной в ляжку толстухи. Доставщик с дорогой контачит, разгоняется что твой дурной день, останавливается на песете[1].\n" +
                "\n" +
                "Почему Доставщик так снаряжен? Потому что люди на него полагаются? Он – образец для подражания. Это же Америка. Люди, черт побери, делают то, что пожелают, у вас с этим проблемы? У них есть на это право. А еще у них есть пушки, которые никто, мать их, не остановит. В результате у этой страны самая хреновая экономика в мире. Если уж на то пошло, мы говорим об экономическом балансе: как только мы перевели всю нашу промышленность в другие страны, как только все устаканилось и машины собирают в Боливии, а микроволновки – в Таджикистане, после чего продают их обратно нам, как только гигантские гонконгские корабли и дирижабли, способные за пятицентовик перевезти Северную Дакоту в Новую Зеландию, превратили наше превосходство в природных ресурсах в ничто, как только Рука Божия, собрав все исторические несправедливости, размазала их по глобусу толстым слоем того, что пакистанский фасовщик марихуаны считает благосостоянием, – хотите что скажу? Теперь есть всего четыре штуки, которые мы делаем лучше всех остальных.";

        String[] paragraphs = paragraphSeparator(text);
        System.out.println("---Текст разделенный по абзацам---");
        print(paragraphs);
        sortBySentances(paragraphs);
        System.out.println("---Отсортированные абзацы по количеству предложений---");
        print(paragraphs);
        System.out.println("---Текст разделеный на предложения---");
        print(sentenceSeparator(text));
        System.out.println("---Отсортированные слова по длинне---");
        print(sortWordsByLength(sentenceSeparator(text)));
        System.out.println("---Предложения с отсортированными лексемами по вхождениям символа 'c' ---");
        print(sortByOccurrences(sentenceSeparator(text), "с"));
    }

    private static int sentenceCounter(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("([^.!?]+[.!?])");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            count++;
        }

        return count;
    }

    private static String[] paragraphSeparator(String text) {
        String[] arr;

        arr = text.split("(\\n\\n)|(\\n)");
        return arr;
    }

    private static void sortBySentances(String[] paragraphs) {
        String temp;

        for (int i = paragraphs.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sentenceCounter(paragraphs[i - 1]) > sentenceCounter(paragraphs[i])) {
                    temp = paragraphs[j];
                    paragraphs[j] = paragraphs[j + 1];
                    paragraphs[j + 1] = temp;
                }
            }
        }
    }

    private static void print(String[] paragraphs) {
        System.out.println();
        for (String s : paragraphs) {
            if(s != null){
            System.out.println(s);}
        }
        System.out.println();
    }

    private static String[] sentenceSeparator(String paragraph) {
        String[] sentences;
        int count = 0;
        paragraph = paragraph.replaceAll("\\n", "");
        Pattern pattern = Pattern.compile("([^.!?]+[.!?])");
        Matcher matcher = pattern.matcher(paragraph);

        while (matcher.find()) {
            count++;
        }

        sentences = new String[count];
        count = 0;
        matcher.reset();

        while (matcher.find()) {
            String s = matcher.group(1);
            s = s.replaceAll("^\\s", "");
            sentences[count] = s;
            count++;
        }
        return sentences;
    }

    private static String[] sortWordsByLength(String[] sentences) {
        String[] tempArr;
        String temp;

        for (int i = 0; i < sentences.length; i++) {
            tempArr = wordSeparator(sentences[i]);

            for (int k = tempArr.length - 1; k > 0; k--) {
                for (int j = 0; j < k; j++) {
                    if (tempArr[j].length() > tempArr[j + 1].length()) {
                        temp = tempArr[j];
                        tempArr[j] = tempArr[j + 1];
                        tempArr[j + 1] = temp;
                    }
                }
            }

            temp = "";
            for (int m = 0; m < tempArr.length; m++) {
                temp += tempArr[m];
                temp += " ";
            }
            sentences[i] = temp;
        }
        return sentences;
    }

    private static String[] sortByOccurrences(String[] sentences, String symbol) {
        String[] tempArr = new String[sentences.length];
        String[] tempForWords;
        String[] words;
        int[] countsOccurences;
        int count;
        int iterator = 0;
        int h = 0;

        for (int i = 0; i < sentences.length; i++) {                  // перебераем предложения
            words = wordSeparator(sentences[i]);

            count = 0;
            for (int j = 0; j < words.length; j++) {                    //переводим в нижний регистр, подсчет количества слов с вхождениями
                words[j] = words[j].toLowerCase();
                if (words[j].contains(symbol)) {
                    count++;
                }
            }if(count > 0) {
                countsOccurences = new int[count]; // сколько слов с вхождениями, такой длинны и массив
                tempForWords = new String[count];  // сколько слов с вхождениями, такой длинны и массив

            count = 0;
            h = 0;
            for (int j = 0; j < words.length; j++) {                    //words массив со словами
                if (words[j].contains(symbol)) {                        // если нашел символ в слове
                    tempForWords[h] = words[j];                       //записываю слово в массив совпавших по условию слов tempForWords
                    for (int k = 0; k < words[j].length(); k++) {     // тут запускаю цикл который тресет слово на количество совпадаемых символов символов count будет хранить количество символов
                        if (words[j].charAt(k) == symbol.charAt(0)) {   //тут записываю в массив количества совпавших символов число count этого слова
                            count++;
                        }
                    }
                    countsOccurences[h] = count;
                    h++;
                    count = 0;
                }
            }
            String temp;
            int tmp;

            for (int k = countsOccurences.length - 1; k > 0; k--) {
                for (int j = 0; j < k; j++) {
                    if (countsOccurences[j] < countsOccurences[j + 1]) {
                        tmp = countsOccurences[j];
                        countsOccurences[j] = countsOccurences[j + 1];
                        countsOccurences[j + 1] = tmp;
                        temp = tempForWords[j];
                        tempForWords[j] = tempForWords[j + 1];
                        tempForWords[j + 1] = temp;
                    } else if(countsOccurences[j] == countsOccurences[j + 1]){
                        if(tempForWords[j].compareTo(tempForWords[j + 1]) > 0 ){    // по алфавиту(лексически)
                            temp = tempForWords[j];
                            tempForWords[j] = tempForWords[j + 1];
                            tempForWords[j + 1] = temp;
                        }
                    }
                }
            }
            tempArr[iterator] = "";
            for(int j = 0; j < tempForWords.length; j++){
                tempArr[iterator] += tempForWords[j] + " ";
            }
            iterator++;}
        }

        return tempArr;
    }

    private static String[] wordSeparator(String sentance) {
        String[] words = sentance.split("[,;:.!?\\s]+");
        return words;
    }
}

