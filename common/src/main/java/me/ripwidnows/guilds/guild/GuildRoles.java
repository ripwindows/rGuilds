package me.ripwidnows.guilds.guild;

import me.ripwidnows.guilds.guild.roles.*;

import java.util.ArrayList;
import java.util.List;

public class GuildRoles extends RolesProvider {
    @Override
    public void init() {
        addRole(new Role(1,"Admin", "&4&l",
                RolePermissions.MODIFY_NAME,
                RolePermissions.MODIFY_DESCRIPTION,
                RolePermissions.DEMOTE));
    }

    @Override
    public DefaultRole defaultRole() {
        return new DefaultRole("Default", "&9");
    }

    @Override
    public LeaderRole leaderRole() {
        return new LeaderRole("Leader", "&4");
    }
}
