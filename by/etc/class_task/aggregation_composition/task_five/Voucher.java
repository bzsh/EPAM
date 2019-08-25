package by.etc.class_task.aggregation_composition.task_five;

public class Voucher implements Comparable<Voucher>{
    private int id;
    private String country;
    private TypeOfTour type;
    private TypeOfFood food;
    private TypeOfTransport transport;

    public Voucher(int id, String country, TypeOfTour type, TypeOfFood food, TypeOfTransport transport) {
        this.id = id;
        this.country = country;
        this.type = type;
        this.food = food;
        this.transport = transport;
    }

    public Voucher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TypeOfTour getType() {
        return type;
    }

    public void setType(TypeOfTour type) {
        this.type = type;
    }

    public TypeOfFood getFood() {
        return food;
    }

    public void setFood(TypeOfFood food) {
        this.food = food;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public void setTransport(TypeOfTransport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "id = " + id +
                ", country = '" + country + '\'' +
                ", type = " + type +
                ", food = " + food +
                ", transport = " + transport +
                '}';
    }

    @Override
    public int compareTo(Voucher o) {
        return this.country.compareTo(o.country);
    }
}
