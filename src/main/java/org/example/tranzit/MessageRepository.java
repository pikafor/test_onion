package org.example.tranzit;

import org.example.tranzit.model.Message;

public interface MessageRepository {
    Message createMessage(long chatId, String text);
}
