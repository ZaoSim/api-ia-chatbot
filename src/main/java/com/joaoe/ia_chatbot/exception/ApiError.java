package com.joaoe.ia_chatbot.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public record ApiError(
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    LocalDateTime timestamp,

    String path,

    String message,

    Integer code,

    String status,

    List<String> errors
) {
}
