package jrsoftwork.com.pass.in.dto;

import jrsoftwork.com.pass.in.domain.event.Event;

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
