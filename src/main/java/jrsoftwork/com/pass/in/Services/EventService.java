package jrsoftwork.com.pass.in.Services;

import jrsoftwork.com.pass.in.domain.attendeer.Attendeer;
import jrsoftwork.com.pass.in.domain.event.Event;
import jrsoftwork.com.pass.in.domain.event.Exceptions.EventNotFoundException;
import jrsoftwork.com.pass.in.dto.event.EventIdDTO;
import jrsoftwork.com.pass.in.dto.event.EventRequestDTO;
import jrsoftwork.com.pass.in.dto.event.EventResponseDTO;
import jrsoftwork.com.pass.in.repositories.EventsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventsRepository eventRepository;
    private final AttendeeerService attendeersService;

    public EventResponseDTO getEventDetails(String eventId){
        Event event=this.eventRepository.findById(eventId).orElseThrow(()->new EventNotFoundException("Not found event with ID: " + eventId));
        List<Attendeer> attendeerList=this.attendeersService.getAllAttendeersFromEvent(eventId);
        return new EventResponseDTO(event,attendeerList.size());
    }
    public EventIdDTO createEvent(EventRequestDTO eventDTO){
        Event newEvent = new Event();
        newEvent.setTitle(eventDTO.title());
        newEvent.setDetails(eventDTO.details());
        newEvent.setMaximunAttendeers(eventDTO.maximunAttendeers());
        newEvent.setSlug(this.createSlug(eventDTO.title()));
        this.eventRepository.save(newEvent);
        return new EventIdDTO(newEvent.getId());
    }
    private String createSlug(String text){
        String normalized = Normalizer.normalize(text,Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{InCombiningDiacriticalMarks}","")
                .replaceAll("[^\\w\\s]","")
                .replaceAll("[\\s+]","-")
                .toLowerCase();
    }
}
