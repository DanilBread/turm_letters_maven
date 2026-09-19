public class Main {
    public static void main(String[] args) {
        String inputString = "J@va the be$t!123";
        String resultString = StringUpdater.turnLetters(inputString);
        System.out.printf("Исходная строка:   %s\n" +
                "Полученная строка: %s", inputString, resultString);
    }
}


