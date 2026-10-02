package lv.venta.security.repo;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.MyUser;

public interface MyUserRepo extends CrudRepository<MyUser, Long> {

	boolean existsByUsername(String username);

	MyUser findByUsername(String username);

}
