package me.ripwidnows.guilds.guild.roles;

import java.util.ArrayList;
import java.util.List;

public class LeaderRole extends Role {
    public LeaderRole(String name, String color) {
        super(-1, name, color, List.of(RolePermissions.values()));
    }
}
