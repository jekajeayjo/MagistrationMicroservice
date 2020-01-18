package md.MainBack.repositories;

import md.MainBack.enteties.UserEntety;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntety,Integer> {
}
