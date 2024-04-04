package jrsoftwork.com.pass.in.domain.attendeer;

import jrsoftwork.com.pass.in.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="attendeers")
@Getter//gerar get
@Setter//gerar sets
@AllArgsConstructor//construtor com parametros
@NoArgsConstructor//construtorsemparametros
public class Attendeer {
    @Id
    @Column(nullable = false,name="attendeers_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id = UUID.randomUUID().toString().replace("-", "");;
    @Column(nullable= false)
    private String name;
    @Column(nullable = false)
    private String email;
    @ManyToOne
    @JoinColumn(name="event_id",nullable = false)
    private Event event;
    @Column(nullable = false)
    private LocalDateTime created_at;

}
