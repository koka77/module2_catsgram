package ru.yandex.practicum.catsgram.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.yandex.practicum.catsgram.dao.UserDao;
import ru.yandex.practicum.catsgram.model.User;
import ru.yandex.practicum.catsgram.service.ManualJbdcConnectService;

import java.util.Optional;

@Component
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    private final ManualJbdcConnectService manualJbdcConnectService;

    public UserDaoImpl(ManualJbdcConnectService manualJbdcConnectService) {
        this.manualJbdcConnectService = manualJbdcConnectService;
        this.jdbcTemplate = manualJbdcConnectService.getTemplate();
    }

    @Override
    public Optional<User> findUserById(String id) {
        return Optional.empty();
    }
}
