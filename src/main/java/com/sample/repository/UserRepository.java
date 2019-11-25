/**
 * 
 */
package com.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.sample.model.User;

/**
 * @author user
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByLastName(String lastName);

	User findById(long id);
}
