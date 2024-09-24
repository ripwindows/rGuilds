package me.ripwidnows.guilds.guild;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface GuildLoader<P> {
    CompletableFuture<Void> loadAll();
    CompletableFuture<Void> saveAll();
    List<Guild<P>> getGuilds();
    List<Guild<P>> getActiveGuilds();
    Optional<Guild<P>> getGuild(String name);
    Optional<Guild<P>> getGuild(P player);
    Optional<Guild<P>> getGuild(GuildMember guildMember);
}
