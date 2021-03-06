.. _community_jdbcconfig_config:

JDBCConfig configuration
========================

The JDBCConfig module is configured in the file ``jdbcconfig/jdbcconfig.properties`` inside the :ref:`data_directory`.
The following properties may be set:

- ``enabled``: Use JDBCConfig.  Turn off to use the data directory for all configuration instead.

- ``initdb``: Initialize an empty database if this is set on true. 

- ``import`` : The import configuration option tells GeoServer whether to import the current catalog from the file system to the database or not. If set to true, it will be imported and the config option will be set the value 'false' for the next start up to avoid trying to re-import the catalog  configuration.

- ``initScript``: Path to initialisation script .sql file. Only used if initdb = true.

- ``jndiName``: The JNDI name for the data source. Only set this if you want to use JNDI, the JDBC configuration properties may still be set for in case the JNDI Lookup fails. 

- ``jdbcUrl``: JDBC direct connection parameters. 

- ``username``: JDBC connection username.

- ``password``: JDBC connection password.

- ``pool.minIdle``: minimum connections in pool  

- ``pool.maxActive``:  maximum connections in pool

- ``pool.poolPreparedStatements``: whether to pool prepared statements

- ``pool.maxOpenPreparedStatements``: size of prepared statement cache, only used if pool.poolPreparedStatements = true

- ``pool.testOnBorrow``: whether to validate connections when obtaining from the pool

- ``pool.validationQuery``: validation query for connections from pool, must be set when pool.testOnBorrow = true

