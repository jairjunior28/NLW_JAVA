package jrsoftwork.com.pass.in.controllers;
import jrsoftwork.com.pass.in.Services.EventService;
import jrsoftwork.com.pass.in.dto.event.EventIdDTO;
import jrsoftwork.com.pass.in.dto.event.EventRequestDTO;
import jrsoftwork.com.pass.in.dto.event.EventResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;
    @GetMapping("/{eventId}")
    public ResponseEntity<EventResponseDTO> getEvent(@PathVariable String eventId){
        EventResponseDTO event =this.eventService.getEventDetails(eventId);
        return ResponseEntity.ok(event);
    }
    @PostMapping
    public ResponseEntity<EventIdDTO> createEvent(@RequestBody EventRequestDTO body, UriComponentsBuilder uriComponentsBuilder){
        EventIdDTO eventIdDTO= this.eventService.createEvent(body);
        var uri = uriComponentsBuilder.path("/events/{id}").buildAndExpand(eventIdDTO.eventId()).toUri();
        return ResponseEntity.created(uri).body(eventIdDTO);
    }
}
