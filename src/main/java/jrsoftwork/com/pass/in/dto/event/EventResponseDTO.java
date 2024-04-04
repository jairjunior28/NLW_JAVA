package jrsoftwork.com.pass.in.dto.event;

import jrsoftwork.com.pass.in.domain.event.Event;
import lombok.Getter;

@Getter
public class EventResponseDTO {
    EventDetailDTO  event;
    public EventResponseDTO(Event event,Integer numberOfAttendeers){
        this.event = new EventDetailDTO(
                event.getId(),
                event.getTitle(),
                event.getDetails(),
                event.getSlug(),
                event.getMaximunAttendeers(),
                numberOfAttendeers);
    }
}
