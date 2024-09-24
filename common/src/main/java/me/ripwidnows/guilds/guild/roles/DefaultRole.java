package me.ripwidnows.guilds.guild.roles;

import java.util.ArrayList;

public class DefaultRole extends Role {
    public DefaultRole(String name, String color) {
        super(-2, name, color,new ArrayList<>());
    }
}
