package IOEnhancer;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sampleText = "Hello world!\nThis is a test.";

        try (
                ByteArrayInputStream byteIn = new ByteArrayInputStream(sampleText.getBytes());
                CountingInputStream countingIn = new CountingInputStream(byteIn);

                ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
                LoggingOutputStream loggingOut = new LoggingOutputStream(byteOut);
        ) {
            int data;
            while ((data = countingIn.read()) != -1) {
                loggingOut.write(data);
            }

            loggingOut.flush();
            countingIn.printStats();

            System.out.println("\n--- OutputStream Result ---");
            System.out.println(byteOut.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
