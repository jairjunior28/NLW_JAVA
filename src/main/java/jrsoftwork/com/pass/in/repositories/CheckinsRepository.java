package jrsoftwork.com.pass.in.repositories;

import jakarta.persistence.GenerationType;
import jrsoftwork.com.pass.in.domain.checkin.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CheckinsRepository extends JpaRepository<Checkin, Integer> {
    Optional<Checkin> findByAttendeerId(String attendeerId);
}
