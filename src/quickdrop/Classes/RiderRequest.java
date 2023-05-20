package quickdrop.Classes;

public class RiderRequest {
    private int userID;
    private int requestID;
    private String pickUpLocation;
    private String dropOffLocation;
    private double weight;
    private double fee;

    public RiderRequest(int userID, int requestID, String pickUpLocation, String dropOffLocation, double weight, double fee) {
        this.userID = userID;
        this.requestID = requestID;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.weight = weight;
        this.fee = fee;
    }

    public int getUserID() {
        return userID;
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

    public void setUserID(int userID) {
        this.userID = userID;
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

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    
    
}
