package domain.event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="events")
@Getter//gerar get
@Setter//gerar sets
@AllArgsConstructor//construtor com parametros
@NoArgsConstructor//construtorsemparametros
public class Event {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String details;
    @Column(nullable = false, unique = true)
    private String slug;
    @Column(nullable = false, name="maximun_attendeers")
    private Integer maximunAttendeers;
}
