package meli.bootcamp.hibernate.service;

import meli.bootcamp.hibernate.model.UserBD;

import java.util.Optional;

public interface IUserBdService {

    Optional<UserBD> getUserById(int id);
    UserBD insertNewUser(UserBD newUser);
    void delete(int id);
}
