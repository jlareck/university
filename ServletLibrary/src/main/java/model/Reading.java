package model;

import lombok.Data;

@Data
public class Reading {
    private long bookId;
    private long userId;

    public Reading(long userId, long bookId) {
        this.bookId = bookId;
        this.userId = userId;
    }
}
