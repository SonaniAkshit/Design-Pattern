package IOEnhancer;

import java.io.FilterInputStream;
import java.io.InputStream;

public abstract class InputStreamDecorator extends FilterInputStream {
    protected InputStreamDecorator(InputStream in) {
        super(in);
    }
}
