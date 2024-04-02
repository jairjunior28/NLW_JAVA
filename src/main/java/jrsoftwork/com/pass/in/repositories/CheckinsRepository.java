package jrsoftwork.com.pass.in.repositories;

import jakarta.persistence.GenerationType;
import jrsoftwork.com.pass.in.domain.checkin.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckinsRepository extends JpaRepository<Checkin, Integer> {
}
