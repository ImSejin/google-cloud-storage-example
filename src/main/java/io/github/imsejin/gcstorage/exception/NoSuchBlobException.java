/*
 * MIT License
 *
 * Copyright (c) 2021 Im Sejin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.imsejin.gcstorage.exception;

/**
 * Exception for when cannot find the blob that have such a name.
 *
 * @see io.github.imsejin.gcstorage.core.Helper#getBlob(String)
 */
public class NoSuchBlobException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NoSuchBlobException(Throwable cause) {
        super(cause);
    }

    public NoSuchBlobException(String message) {
        super(message);
    }

    public NoSuchBlobException(String format, Object... args) {
        super(String.format(format, args));
    }

    public NoSuchBlobException(Throwable cause, String message) {
        super(message, cause);
    }

    public NoSuchBlobException(Throwable cause, String format, Object... args) {
        super(String.format(format, args), cause);
    }

}
