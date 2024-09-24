package me.ripwidnows.guilds.guild.roles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Role {
    private int id;
    private String name;
    private String color;
    private final List<RolePermissions> permissions;

    public Role(int id, String name, String color, RolePermissions... permissions) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.permissions = List.of(permissions);
    }

    public String getDisplayName(){
        return color + name;
    }
}
