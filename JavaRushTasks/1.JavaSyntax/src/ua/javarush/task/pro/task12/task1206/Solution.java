package ua.javarush.task.pro.task12.task1206;

/* 
Аналіз рядків
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю2, ц00е буде нова20 фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int digits=0;
        char[] characters=new char[string.length()];
         string.getChars(0,string.length()-1,characters,0 );

        for (Character charac: characters ) {
            if ( Character.isDigit(charac)){
                digits++;
            }
        }

        return digits;
    }
    
    // public static int countDigits(String string) {
    //        int countDigits = 0;
    //        for (int i = 0; i < string.length(); i++) {
    //            if (Character.isDigit(string.charAt(i))) {
    //                countDigits++;
    //            }
    //        }
    //        return countDigits;
    //    }

    public static int countLetters(String string) {
        int letters=0;
        char[] characters=new char[string.length()];
        string.getChars(0,string.length()-1,characters,0 );

        for (Character charac: characters ) {
            if ( Character.isLetter(charac)){
                letters++;
            }
        }
       return letters; //напишіть тут ваш код
    }

    public static int countSpaces(String string) {
        int spaces=0;
        char[] characters=new char[string.length()];
        string.getChars(0,string.length()-1,characters,0 );

        for (Character charac: characters ) {
            if ( Character.isSpace(charac)){
                spaces++;
            }
        }
        return spaces;
    }
}
