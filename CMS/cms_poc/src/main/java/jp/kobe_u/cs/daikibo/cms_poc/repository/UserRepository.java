package jp.kobe_u.cs.daikibo.cms_poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.kobe_u.cs.daikibo.cms_poc.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    public User findByEmail(String email);

}