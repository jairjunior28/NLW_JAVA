package jrsoftwork.com.pass.in.repositories;

import jrsoftwork.com.pass.in.domain.attendeer.Attendeer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeersRepository extends JpaRepository<Attendeer,String> {
}
