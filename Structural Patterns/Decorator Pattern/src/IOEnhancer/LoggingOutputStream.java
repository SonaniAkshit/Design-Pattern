package IOEnhancer;

import java.io.IOException;
import java.io.OutputStream;

public class LoggingOutputStream extends OutputStreamDecorator {

    public LoggingOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println("Writing byte: " + b + " char: '" + (char) b + "'");
        super.write(b);
    }
}
