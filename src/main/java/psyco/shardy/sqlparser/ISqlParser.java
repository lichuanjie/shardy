package psyco.shardy.sqlparser;

import psyco.shardy.SqlParseException;

import java.util.List;

/**
 * Created by lipeng on 16/2/4.
 */
public interface ISqlParser {

    void init(String sql) throws SqlParseException;

    String getTableName();

    SqlType getType();

    List<String> getWhereColumns();

    boolean setTableName(String tableName);

    String toSql();

}