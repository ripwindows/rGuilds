package me.ripwidnows.guilds.guild.statistics;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Variable<T extends Number> {
    private String name;
    private T defaultValue;
}
