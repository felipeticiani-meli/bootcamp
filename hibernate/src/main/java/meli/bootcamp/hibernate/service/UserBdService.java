package meli.bootcamp.hibernate.service;

import meli.bootcamp.hibernate.model.UserBD;
import meli.bootcamp.hibernate.repository.IUserBdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBdService {

    @Autowired
    private IUserBdRepo repo;

    public UserBD getUserById(int id) {
        return (UserBD) repo.findById(id).orElse(null);
    }
}
