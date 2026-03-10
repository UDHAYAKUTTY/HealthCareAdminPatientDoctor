package nimblix.in.HealthCareHub.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorRegistrationRequest {

    private String doctorName;
    private String doctorEmail;
    private String password;
    private String qualification;
    private Long experience;
    private String description;
    private String phoneNo;
    private Long doctorId;
    private Long hospitalId;
    private String specializationName;
    private Double consultationFee;
    private String comment;
    private Integer rating;

    private String availableDate;    // format: "dd-MM-yyyy"  e.g. "04-03-2026"
    private String startTime;        // format: "HH:mm"       e.g. "09:00"
    private String endTime;          // format: "HH:mm"       e.g. "17:00"
    private boolean isAvailable;     // true = doctor is available that day
    private String doctorStatus; //  Status as String — values from HealthCareConstants
}