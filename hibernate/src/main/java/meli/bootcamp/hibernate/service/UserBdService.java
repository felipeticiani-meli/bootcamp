package meli.bootcamp.hibernate.service;

import meli.bootcamp.hibernate.model.UserBD;
import meli.bootcamp.hibernate.repository.IUserBdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserBdService implements IUserBdService{

    @Autowired
    private IUserBdRepo repo;

    @Override
    public Optional<UserBD> getUserById(int id) {
        return repo.findById(id);
    }

    @Override
    public UserBD insertNewUser(UserBD newUser) {
        if (newUser.getId() > 0) return null;
        return repo.save(newUser);
    }

    @Override
    public void delete(int id) {
        if (repo.findById(id).isPresent())
            repo.deleteById(id);
        // TODO: lançar exception notfound
    }

    @Override
    public List<UserBD> getAllUsers() {
        return (List<UserBD>) repo.findAll();
    }
}
