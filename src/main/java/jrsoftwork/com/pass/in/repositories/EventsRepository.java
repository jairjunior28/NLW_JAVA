package jrsoftwork.com.pass.in.repositories;
import jrsoftwork.com.pass.in.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EventsRepository extends JpaRepository<Event,String> {
}
