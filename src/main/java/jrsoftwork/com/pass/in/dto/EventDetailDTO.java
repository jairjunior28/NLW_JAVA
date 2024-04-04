package jrsoftwork.com.pass.in.dto;

public record EventDetailDTO(
        String id,
        String tilte,
        String details,
        String slug,
        Integer maximunAttendeers,
        Integer attendeersAmount ) {
}
