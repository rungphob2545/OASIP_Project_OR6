package sit.int221.oasip.dto.eventdto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class EventDtoDetail {
 private Integer id;
 private String bookingName;
 private String bookingEmail;
 private ZonedDateTime startTime;
 private Integer durations;
 private String categoryName;
 private String note;
}
