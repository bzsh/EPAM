package by.etc.class_task.aggregation_composition.task_five;

public enum TypeOfTransport {
    BUS("by bus"),
    PLANE("by plane"),
    TRAIN("by train"),
    SHIP("by ship");

    private String title;

    TypeOfTransport(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public static String getTypes(){
        TypeOfTransport[] types = TypeOfTransport.values();
        String str = "";
        for(int i = 0; i < types.length; i++){
            str += "Тип : " + "\"" + types[i].name() + "\"" +  " - " + types[i].toString() + "\n";
        }
        return str;
    }
}
