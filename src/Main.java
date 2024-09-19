import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        String[] stringArray = {"ab", "cd", "ef"};

        int count = 0;
        for (String str : stringArray) {
            count += str.length();
        }
        char[] charArray = new char[count];

        int i = 0;
        for (String str : stringArray) {
            for (char c : str.toCharArray()) {
                charArray[i++] = c;
            }
        }

        System.out.println(Arrays.toString(charArray));

    }

    public static void task2() {
        String stroke = "12345";
        StringBuilder sb = new StringBuilder(stroke);
        sb = sb.delete(1, 4);
        System.out.println(sb);
    }

    public static void task3() {

        String stroke = "1203405";
        for (int i = 0; i < stroke.length(); i++) {
            if (stroke.charAt(i) == '0')
                System.out.println(i);
        }
    }
}

