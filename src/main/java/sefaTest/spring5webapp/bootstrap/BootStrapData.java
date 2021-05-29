package sefaTest.spring5webapp.bootstrap;

import sefaTest.spring5webapp.domain.Author;
import sefaTest.spring5webapp.domain.Book;
import sefaTest.spring5webapp.domain.Publisher;
import sefaTest.spring5webapp.repositories.AuthorRepository;
import sefaTest.spring5webapp.repositories.BookRepository;
import sefaTest.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by maril on 27.05.21
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SM Publishing");
        publisher.setCity("Eskisehir");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author sefa = new Author("Sefa", "Maril");
        Book ddd = new Book("Domain Driven Design", "123123");
        sefa.getBooks().add(ddd);
        ddd.getAuthors().add(sefa);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(sefa);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author dan = new Author("Daniel", "Liang");
        Book DS = new Book("Java Programming and DS", "434112161");
        dan.getBooks().add(DS);
        DS.getAuthors().add(dan);

        DS.setPublisher(publisher);
        publisher.getBooks().add(DS);

        authorRepository.save(dan);
        bookRepository.save(DS);
        publisherRepository.save(publisher);

        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
}
