package by.etc.class_task.aggregation_composition.task_five;

public enum  TypeOfFood {
    RO ("room only"),
    BB ("bed & breakfast"),
    HB ("half board"),
    FB ("full board"),
    AI ("all inclusive"),
    UAI ("ultra all inclusive");

    private String title;

    TypeOfFood(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public static String getTypes(){
        TypeOfFood[] types = TypeOfFood.values();
        String str = "";
        for(int i = 0; i < types.length; i++){
            str += "Тип : " + "\"" + types[i].name() + "\"" +  " - " + types[i].toString() + "\n";
        }
        return str;
    }
}
