package com.MTH.Sequencer;

public class TodoItemTaskSequencer {
    private static int todoItemTaskId = 0;

    public static int nextId() {
        return ++todoItemTaskId;
    }
}
