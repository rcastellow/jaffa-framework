CREATE TABLE J_SAVED_QUERIES (
        QUERY_ID          VARCHAR(100) NOT NULL,
        USER_ID          VARCHAR(20) NOT NULL,
        COMPONENT_REF          VARCHAR(100) NOT NULL,
        CONTEXT_REF          VARCHAR(100),
        QUERY_NAME          VARCHAR(100) NOT NULL,
        IS_DEFAULT          CHAR(1),
        CRITERIA          LONGTEXT
) ENGINE=InnoDB
