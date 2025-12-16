package org.example.model;

public enum GameStatusEnum {

    NON_STARTED,
    INCOMPLETE,
    COMPLETE;


    private String label;

    private GameStatusEnum(final String label) {
        this.label = label;
    }

    GameStatusEnum() {

    }

    public String getLabel() {
        return label;
    }
}
