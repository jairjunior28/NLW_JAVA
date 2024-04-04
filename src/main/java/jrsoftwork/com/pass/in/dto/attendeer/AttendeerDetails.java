package jrsoftwork.com.pass.in.dto.attendeer;

import java.time.LocalDateTime;

public record AttendeerDetails(String id, String name, String email, LocalDateTime createdAt,LocalDateTime checkinAt) {
}
