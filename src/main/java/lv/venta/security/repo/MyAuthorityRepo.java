package lv.venta.security.repo;

import org.springframework.data.repository.CrudRepository;

import lv.venta.model.MyAuthority;

public interface MyAuthorityRepo extends CrudRepository<MyAuthority, Long> {

}
