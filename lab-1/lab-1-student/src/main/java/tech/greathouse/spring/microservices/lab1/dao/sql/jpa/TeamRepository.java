/**
 * 
 */
package tech.greathouse.spring.microservices.lab1.dao.sql.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import tech.greathouse.spring.microservices.lab1.model.Team;

/**
 * @author cyotee
 *
 */
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository <Team, Long> {

}
