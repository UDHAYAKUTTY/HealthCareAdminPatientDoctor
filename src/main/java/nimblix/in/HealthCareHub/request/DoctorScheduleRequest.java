package nimblix.in.HealthCareHub.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DoctorScheduleRequest {

    private Long patientId;
    private String operationName;
    private LocalDate operationDate;
    private String status;

}
