package by.etc.class_task.class_object.task_four;

public class Train implements Comparable<Train>{
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public Train() {
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int gettrainNumber() {
        return trainNumber;
    }

    public void settrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getdepartureTime() {
        return departureTime;
    }

    public void setdepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public int compareTo(Train o) {
        int result;
        result = this.destination.compareTo(o.destination);

        if(result == 0){
            result = this.departureTime.compareTo(o.departureTime);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination = '" + destination + '\'' +
                ", trainNumber = " + trainNumber +
                ", departureTime = '" + departureTime + '\'' +
                '}';
    }
}
