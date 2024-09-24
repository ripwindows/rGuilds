package me.ripwidnows.guilds.guild;

import lombok.Getter;

import java.util.UUID;

@Getter
public class GuildMember {
    private final UUID uuid;
    private final String guildName;
    private final int guildRank;
    private final long mute;
    public GuildMember(UUID uuid, String guildName, int guildRank, long mute) {
        this.uuid = uuid;
        this.guildName = guildName;
        this.guildRank = guildRank;
        this.mute = mute;
    }

    public boolean isInGuild(){
        return !guildName.equalsIgnoreCase("NONE");
    }
    public boolean isLeader(){
        return guildRank == -1;
    }
}
