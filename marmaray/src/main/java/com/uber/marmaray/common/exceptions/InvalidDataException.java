/*
 * Copyright (c) 2018 Uber Technologies, Inc.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package com.uber.marmaray.common.exceptions;

import com.uber.marmaray.common.converters.data.HoodieSinkDataConverter;
import lombok.NonNull;
import org.apache.avro.generic.GenericRecord;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * It is a checked exception and should be thrown when there is either missing or invalid user defined field in
 * data. Check {@link HoodieSinkDataConverter#getKey(GenericRecord)}
 * for an example.
 */
public class InvalidDataException extends Exception {

    public InvalidDataException(@NotEmpty final String message) {
        super(message);
    }

    public InvalidDataException(@NotEmpty final String message, @NonNull final Throwable t) {
        super(message, t);
    }
}
