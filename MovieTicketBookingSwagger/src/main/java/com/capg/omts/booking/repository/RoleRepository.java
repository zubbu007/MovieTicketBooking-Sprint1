package com.capg.omts.booking.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.omts.booking.model.Role;
import com.capg.omts.booking.model.Roles;

@Repository(value="RoleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Optional<Role> findByRoleName(Roles role);
}
