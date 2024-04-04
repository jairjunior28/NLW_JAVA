package jrsoftwork.com.pass.in.Services;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import jrsoftwork.com.pass.in.domain.attendeer.Attendeer;
import jrsoftwork.com.pass.in.domain.checkin.Checkin;
import jrsoftwork.com.pass.in.dto.attendeer.AttendeerDetails;
import jrsoftwork.com.pass.in.dto.attendeer.AttendeerListResponseDTO;
import jrsoftwork.com.pass.in.repositories.AttendeersRepository;
import jrsoftwork.com.pass.in.repositories.CheckinsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AttendeeerService {
    private AttendeersRepository attendeersRepository;
    private CheckinsRepository checkinsRepository;
    public List<Attendeer> getAllAttendeersFromEvent(String eventId){
        List<Attendeer> attendeerList=this.attendeersRepository.findByEventId(eventId);
        return attendeerList;
    }
    public AttendeerListResponseDTO getEventsAttendeer(String eventId){
        List<Attendeer> attendeerList = this.getAllAttendeersFromEvent(eventId);
        List<AttendeerDetails> attendeerDetailsList =attendeerList.stream().map(attendeer -> {
            Optional<Checkin>  checkin = this.checkinsRepository.findByAttendeerId(attendeer.getId());
            LocalDateTime checkedInAt = checkin.isPresent()?checkin.get().getCreated_at() : null;
            return  new AttendeerDetails(attendeer.getId(),attendeer.getName(),attendeer.getEmail(),attendeer.getCreated_at(),checkedInAt);
        }).toList();
        return new AttendeerListResponseDTO(attendeerDetailsList);
    }
}
