package me.ripwidnows.guilds.guild;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface GuildManager<P> {
    CompletableFuture<Guild<P>> createGuild(Guild<P> guild);
    CompletableFuture<Void> deleteGuild(Guild<P> Guild);
    boolean isGuildNameExists(String name);
    boolean isGuildTagExists(String tag);
    void modifyGuild(Guild<P> guild, Consumer<Guild<P>> action);
}
