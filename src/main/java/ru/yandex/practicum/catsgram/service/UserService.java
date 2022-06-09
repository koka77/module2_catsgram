package ru.yandex.practicum.catsgram.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.catsgram.dao.UserDao;
import ru.yandex.practicum.catsgram.exception.InvalidEmailException;
import ru.yandex.practicum.catsgram.exception.UserAlreadyExistException;
import ru.yandex.practicum.catsgram.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public Optional<User> findUserById(String id) {
        return userDao.findUserById(id);
    }

/*

    public Collection<User> findAll() {
        return users.values();
    }

    public User createUser(User user) {
        checkNicname(user);
        if (users.containsKey(user.getEmail())) {
            throw new UserAlreadyExistException(String.format(
                    "Пользователь с электронной почтой %s уже зарегистрирован.",
                    user.getEmail()
            ));
        }
        users.put(user.getEmail(), user);
        return user;
    }

    public User updateUser(User user) {
        checkNicname(user);
        users.put(user.getEmail(), user);

        return user;
    }

    public User findUserByEmail(String email) {
        if (email == null) {
            return null;
        }
        return users.get(email);
    }
*/

    private void checkNicname(User user) {
        if (user.getNickname() == null || user.getNickname().isBlank()) {
            throw new InvalidEmailException("Никнейм не может быть пустым.");
        }
    }
}