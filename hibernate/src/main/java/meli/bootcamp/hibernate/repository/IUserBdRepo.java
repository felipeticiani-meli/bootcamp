package meli.bootcamp.hibernate.repository;

import meli.bootcamp.hibernate.model.UserBD;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserBdRepo extends CrudRepository<UserBD, Integer> {

}
