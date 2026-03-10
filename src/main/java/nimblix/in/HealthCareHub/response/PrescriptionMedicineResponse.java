package nimblix.in.HealthCareHub.response;

import lombok.Data;
import nimblix.in.HealthCareHub.model.PrescriptionMedicines;

import java.util.List;

@Data
public class PrescriptionMedicineResponse<Object> {

    private String Message;
    private String Status;
    private List<PrescriptionMedicines> data;

    public PrescriptionMedicineResponse(String Message, String Status, List data) {
        this.Status=Status;
        this.Message=Message;
        this.data=data;
    }
}
