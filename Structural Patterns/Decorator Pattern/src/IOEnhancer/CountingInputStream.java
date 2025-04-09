package IOEnhancer;

import java.io.IOException;
import java.io.InputStream;

public class CountingInputStream extends InputStreamDecorator {
    private int charCount = 0;
    private int wordCount = 0;
    private int lineCount = 0;
    private boolean lastWasWhitespace = true;

    public CountingInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        if (data != -1) {
            char c = (char) data;
            charCount++;

            if (Character.isWhitespace(c)) {
                if (!lastWasWhitespace) {
                    wordCount++;
                    lastWasWhitespace = true;
                }
                if (c == '\n') {
                    lineCount++;
                }
            } else {
                lastWasWhitespace = false;
            }

            System.out.println("Read byte: " + data + " char: '" + c + "'");
        }
        return data;
    }

    public void printStats() {
        System.out.println("\n--- Reading Statistics ---");
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + (wordCount + (!lastWasWhitespace ? 1 : 0)));
        System.out.println("Lines: " + (lineCount + 1));
    }
}
