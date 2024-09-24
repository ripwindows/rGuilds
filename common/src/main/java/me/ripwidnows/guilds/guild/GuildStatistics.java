package me.ripwidnows.guilds.guild;

import me.ripwidnows.guilds.guild.statistics.StatisticsProvider;
import me.ripwidnows.guilds.guild.statistics.Variable;

public class GuildStatistics extends StatisticsProvider {

    @Override
    public void init() {
        addVariable(new Variable<>("kills",1));
    }
}
