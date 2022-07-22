package meli.bootcamp.hibernate.service;

import meli.bootcamp.hibernate.model.UserBD;
import meli.bootcamp.hibernate.repository.IUserBdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserBdService implements IUserBdService{

    @Autowired
    private IUserBdRepo repo;

    public Optional<UserBD> getUserById(int id) {
        return repo.findById(id);
    }
}
