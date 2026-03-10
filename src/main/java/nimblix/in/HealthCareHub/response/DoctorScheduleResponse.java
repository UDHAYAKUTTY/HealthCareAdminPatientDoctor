package nimblix.in.HealthCareHub.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorScheduleResponse {

    private Long scheduleId;
    private Long doctorId;
    private Long patientId;
    private String operationName;
    private LocalDate operationDate;
    private String status;

}
