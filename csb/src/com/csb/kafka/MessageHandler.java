package com.csb.kafka;

/**
 * Created by evgeniyh on 12/03/17.
 */
public interface MessageHandler {
    void handle(String message);
}
