package string;

public class Main {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        // This loop creates a string by concatenating
        // the numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            stringBuffer.append(i);
            stringBuilder.append(i);
        }

        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);
    }
}

