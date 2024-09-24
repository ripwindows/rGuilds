package me.ripwidnows.guilds.guild.statistics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public abstract class StatisticsProvider {

    Set<Variable<?>> variables = new HashSet<>();

    protected void addVariable(Variable<?> variable) {
        variables.add(variable);
    }

    public Variable<?> getVariable(String name) {
        for (Variable<?> variable : variables) {
            if (variable.getName().equals(name)) {
                return variable;
            }
        }
        return null;
    }


    public abstract void init();
}
