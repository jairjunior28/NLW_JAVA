package jrsoftwork.com.pass.in.Services;

import jrsoftwork.com.pass.in.domain.attendeer.Attendeer;
import jrsoftwork.com.pass.in.domain.event.Event;
import jrsoftwork.com.pass.in.dto.EventResponseDTO;
import jrsoftwork.com.pass.in.repositories.AttendeersRepository;
import jrsoftwork.com.pass.in.repositories.EventsRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventsRepository eventRepository;
    private final AttendeersRepository attendeersRepository;

    public EventResponseDTO getEventDetails(String eventId){
        Event event=this.eventRepository.findById(eventId).orElseThrow(()->new RuntimeException("Not found event with ID:" + eventId));
        List<Attendeer> attendeerList=this.attendeersRepository.findByEventId(eventId);
        return new EventResponseDTO(event,attendeerList.size());
    }
}
