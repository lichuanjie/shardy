package psyco.shardy.config;

/**
 * Created by peng on 16/2/20.
 */
public interface SlaveMapping {

    SlaveMappingResult map(Object slaveColumn, String table);
}