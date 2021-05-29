package sefaTest.spring5webapp.repositories;

import sefaTest.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maril on 27.05.21
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
