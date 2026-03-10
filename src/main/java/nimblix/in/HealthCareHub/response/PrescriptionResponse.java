package nimblix.in.HealthCareHub.response;

import lombok.Data;

@Data
public class PrescriptionResponse<Prescription> {

    private String Message;
    private String Status;
    private Object data;

    public PrescriptionResponse(String Status,String Message,Object data) {
        this.Status=Status;
        this.Message=Message;
        this.data=data;
    }
}
