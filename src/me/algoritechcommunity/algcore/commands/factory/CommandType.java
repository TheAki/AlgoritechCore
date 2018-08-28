package me.algoritechcommunity.algcore.commands.factory;

import me.algoritechcommunity.algcore.config.ValueType;

public enum CommandType {
    HEAL("heal", "hil");


    private final String LABEL;
    private final String[] ALIASES;

    CommandType(String label, String... aliases) {
        this.LABEL = label;
        this.ALIASES = aliases;
    }

    public String getLabel() {
        return this.LABEL;
    }

    public String[] getAliases() {
        return this.ALIASES;
    }
}
