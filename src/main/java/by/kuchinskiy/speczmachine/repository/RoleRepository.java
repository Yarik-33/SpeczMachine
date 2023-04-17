package by.kuchinskiy.speczmachine.repository;

import by.kuchinskiy.speczmachine.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {}