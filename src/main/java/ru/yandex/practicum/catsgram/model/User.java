package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Data
public class User {
    private String id;

    private String username;

    private String nickname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return nickname.equals(user.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}