package ru.yandex.practicum.catsgram.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class ManualJbdcConnectService {
    public static final String JDBC_URL="jdbc:mysql://cat.world:3306/allcats";
    public static final String JDBC_USERNAME="root";
    public static final String JDBC_PASSWORD="iamroot";
    public static final String JDBC_DRIVER="org.postgresql.Driver";

    public JdbcTemplate getTemplate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(JDBC_DRIVER);
        dataSource.setUrl(JDBC_URL);
        dataSource.setUsername(JDBC_USERNAME);
        dataSource.setPassword(JDBC_PASSWORD);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}
