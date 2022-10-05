package com.spyeic.crawler4j.io;

import java.io.IOException;
import java.io.Reader;

public class UTF8Reader extends UnicodeReader {
    public UTF8Reader(Reader in) {
        this(in, 8192);
    }

    public UTF8Reader(Reader in, int sz) {
        super(in, sz, 5);
    }

    protected int backslash() throws IOException {
        char next = buf[nextIndex++];
        switch (next) {
            case 'u' -> {
                tempBuf[0] = next;
                tempLength = 1;
                for (int j = 1; j < 5; j++) {
                    tempBuf[j] = (char) next(); //buf[nextIndex++];
                }
                try {
                    int uc = Integer.parseInt("" + tempBuf[1] + tempBuf[2] + tempBuf[3] + tempBuf[4], 16);
                    tempLength = 0;
                    return uc;
                } catch (Throwable t) {
                    tempLength += 4;
                    return (char) next();//buf[nextIndex++];
                }
            }
            case 'b' -> {
                return '\b';
            }
            case 'f' -> {
                return '\f';
            }
            case 'n' -> {
                return '\n';
            }
            case 'r' -> {
                return '\r';
            }
            case 't' -> {
                return '\t';
            }
            case '\\' -> throw new IOException("Unexpected token");
        }
        return next;
    }
}
