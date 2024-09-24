package me.ripwidnows.guilds.guild.roles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class RolesProvider {

    Set<Role> roles = new HashSet<>();

    protected void addRole(Role role) {
        roles.add(role);
    }

    public Role getRole(String name) {
        for (Role role : roles) {
            if (role.getName().equalsIgnoreCase(name)) {
                return role;
            }
        }
        return null;
    }
    public abstract void init();
    public abstract DefaultRole defaultRole();
    public abstract LeaderRole leaderRole();
}
