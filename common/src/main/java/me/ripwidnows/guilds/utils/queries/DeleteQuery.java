package me.ripwidnows.guilds.utils.queries;

import java.util.ArrayList;
import java.util.List;

public class DeleteQuery implements Query{
    private final String table;
    private final List<String> wheres = new ArrayList<String>();
    public DeleteQuery(String table) {
        this.table = table;
    }

    public DeleteQuery where(String expression) {
        wheres.add(expression + "=?");
        return this;
    }
    public DeleteQuery where(String... expression) {
        for (String s : expression) {
            wheres.add(s + "=?");
        }
        return this;
    }
    public DeleteQuery where(String expression,Object value) {
        wheres.add(expression + "=" + (value instanceof String ? "'" + value +"'" : value));
        return this;
    }
    public DeleteQuery and(String expression) {
        where(expression);
        return this;
    }
    public DeleteQuery and(String expression,Object value) {
        where(expression,value);
        return this;
    }


    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("DELETE FROM ").append(table);

        if (wheres.size() > 0)
            builder.append(" WHERE ").append(separate(wheres, " AND "));

        return builder.toString();
    }

}
