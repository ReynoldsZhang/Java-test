package com.spyeic.crawler4j.io;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/**
 * Notes that this reader may not fit all files.
 */
public abstract class UnicodeReader extends Reader {
    protected final Reader in;
    protected final char[] buf, tempBuf;
    protected int nextIndex, nChars, tempLength, tempIndex;

    public UnicodeReader(Reader in, int sz, int tsz) {
        this.in = in;
        this.buf = new char[sz];
        this.tempBuf = new char[tsz];
    }

    /**
     * When reader reads a backslash
     * @return next decoded character
     */

    protected abstract int backslash() throws IOException;

    /**
     * Notes that you can only convert one character once, so it doesn't support other read method.
     *
     * @return next character
     */
    @Override
    public int read() throws IOException {
        synchronized (lock) {
            if (nextIndex >= nChars) {
                fill();
                if (nChars < 0) {
                    return -1;
                }
            }
            if (tempLength > 0) {
                char temp = tempBuf[tempIndex++];

                if (temp == '\\') {
                    return backslash();
                } else {
                    return temp;
                }
            }
            tempIndex = 0;
            int i = buf[nextIndex++];
            if ((char) i == '\\') {
                return backslash();
            }
            return i;
        }
    }

    protected void fill() throws IOException {
        int sz;
        do {
            sz = in.read(buf, 0, buf.length);
        } while (sz == 0);
        nChars = sz;
        nextIndex = 0;
    }

    protected int next() throws IOException {
        if (nextIndex >= nChars) {
            fill();
            if (nChars < 0) {
                return -1;
            }
        }
        return buf[nextIndex++];
    }

    @Override
    public long transferTo(Writer out) throws IOException {
        throw new IOException("Not supported");
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        throw new IOException("Not supported");
    }

    @Override
    public int read(CharBuffer target) throws IOException {
        throw new IOException("Not supported");
    }

    @Override
    public int read(char[] cbuf) throws IOException {
        throw new IOException("Not supported");
    }

    @Override
    public long skip(long n) throws IOException {
        throw new IOException("Not supported");
    }

    @Override
    public boolean ready() throws IOException {
        return in.ready();
    }

    @Override
    public void close() throws IOException {
        in.close();
    }
}
