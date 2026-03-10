package nimblix.in.HealthCareHub.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorStatusResponse {
    private Long doctorId;
    private String name;
    private String status;
    private String statusLabel;
}
