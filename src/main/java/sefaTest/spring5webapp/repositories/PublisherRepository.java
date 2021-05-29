package sefaTest.spring5webapp.repositories;

import sefaTest.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maril on 27.05.21
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
