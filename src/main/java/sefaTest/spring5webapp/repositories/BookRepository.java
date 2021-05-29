package sefaTest.spring5webapp.repositories;

import sefaTest.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maril on 27.05.21
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
