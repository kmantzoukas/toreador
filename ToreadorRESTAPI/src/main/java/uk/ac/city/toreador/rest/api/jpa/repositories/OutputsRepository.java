package uk.ac.city.toreador.rest.api.jpa.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.city.toreador.rest.api.entities.Output;

public interface OutputsRepository extends CrudRepository<Output, Long>{
	
}
