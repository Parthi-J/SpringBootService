/**
 * 
 */
package com.sample.repository;

import org.springframework.data.repository.CrudRepository;
import com.sample.entity.UserEntity;

/**
 * @author user
 *
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
