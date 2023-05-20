package quickdrop;

public class VerifyRequest {
    private int requestID;
    private int status;
    private double fee;
    private String pickUpLocation;
    private String dropOffLocation;
    private double weight;
    private int userId;
    
    public VerifyRequest(int requestID, String pickUpLocation, String dropOffLocation, double weight) {
        this.requestID = requestID;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.weight = weight;
    }
    
    public VerifyRequest(int requestID, String pickUpLocation, String dropOffLocation, double fee, int status, double weight, int user) {
        this.requestID = requestID;
        this.status = status;
        this.fee = fee;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.weight = weight;
        userId = user;
    }

    public VerifyRequest() {
    }
    

    public int getRequestID() {
        return requestID;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public double getWeight() {
        return weight;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "VerifyRequest{" + "requestID=" + requestID + ", pickUpLocation=" + pickUpLocation + ", dropOffLocation=" + dropOffLocation + ", weight=" + weight + '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    
    
}
