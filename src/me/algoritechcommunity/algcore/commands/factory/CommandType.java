package me.algoritechcommunity.algcore.commands.factory;

import me.algoritechcommunity.algcore.config.ValueType;

public enum CommandType {
    HEAL("heal");


    private final String LABEL;

    CommandType(String label) {
        this.LABEL = label;
    }

    public String getLabel() {
        return this.LABEL;
    }
}
