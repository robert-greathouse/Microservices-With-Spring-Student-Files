/**
 * 
 */
package tech.greathouse.spring.microservices.lab1.dao.sql.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import tech.greathouse.spring.microservices.lab1.model.Player;

/**
 * @author cyotee
 *
 */
@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
