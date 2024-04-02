package jrsoftwork.com.pass.in.domain.checkin;

import jrsoftwork.com.pass.in.domain.attendeer.Attendeer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
@Entity
@Table(name="checkins")
@Getter//gerar get
@Setter//gerar sets
@AllArgsConstructor//construtor com parametros
@NoArgsConstructor//construtorsemparametros
public class Checkin {
    @Id
    @Column(nullable = false,name="attendeers_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private LocalDateTime created_at;
    @OneToOne
    @JoinColumn(name="attendeers_id",nullable = false)
    private Attendeer attendeers_id;
}
