package jrsoftwork.com.pass.in.repositories;

import jrsoftwork.com.pass.in.domain.attendeer.Attendeer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendeersRepository extends JpaRepository<Attendeer,String> {
    List<Attendeer> findByEventId(String eventId);
}
