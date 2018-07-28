package com.leong.masteringextjs.core;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author leongfeng created on 2018-07-27.
 */
public class ControllerRuntimeException extends RuntimeException {
    public ControllerRuntimeException() {
        super();
    }

    public ControllerRuntimeException(String message) {
        super(message);
    }

    public ControllerRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ControllerRuntimeException(Throwable cause) {
        super(cause);
    }

}
