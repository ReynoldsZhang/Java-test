package com.spyeic.crawler4j.io;

import java.io.IOException;
import java.io.Reader;

public class UTF32Reader extends UnicodeReader {
    public UTF32Reader(Reader in) {
        this(in, 8192);
    }

    public UTF32Reader(Reader in, int sz) {
        super(in, sz, 20);
    }

    @Override
    protected int backslash() throws IOException {
        return -1;
    }
}
