package me.ripwidnows.guilds.guild;

import me.ripwidnows.guilds.guild.roles.RolesProvider;
import me.ripwidnows.guilds.guild.statistics.StatisticsProvider;

import java.util.Date;
import java.util.Set;

public interface Guild<P> {
    String name();
    String tag();
    String description();
    Integer maxMembers();
    Integer maxRoles();
    Long experience();
    Long level();
    Date creationDate();
    Character color();
    StatisticsProvider getStatistics();
    RolesProvider getRoles();
    Set<P> getMembers();
    Set<P> geOnlineMembers();
}
