package IOEnhancer;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public abstract class OutputStreamDecorator extends FilterOutputStream {
    protected OutputStreamDecorator(OutputStream out) {
        super(out);
    }
}
