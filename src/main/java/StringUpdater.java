public final class StringUpdater {

    public static String turnLetters(String inputString) {

        if (inputString == null) {
            return "";
        }

        if (inputString.length() <= 1) {
            return inputString;
        }

        char[] chars = inputString.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            }
            else if (!Character.isLetter(chars[right])) {
                right--;
            }
            else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                right--;
                left++;
            }
        }
        return new String(chars);
    }
}
