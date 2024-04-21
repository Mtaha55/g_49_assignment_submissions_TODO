package com.MTH.Sequencer;

public class TodoItemSequencer {
    private static int todoItemId = 0;

    public static int nextId() {
        return ++todoItemId;
    }
}