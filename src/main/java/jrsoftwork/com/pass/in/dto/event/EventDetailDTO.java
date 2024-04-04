package jrsoftwork.com.pass.in.dto.event;

public record EventDetailDTO(
        String id,
        String tilte,
        String details,
        String slug,
        Integer maximunAttendeers,
        Integer attendeersAmount ) {
}
