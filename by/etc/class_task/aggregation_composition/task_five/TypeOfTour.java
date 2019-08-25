package by.etc.class_task.aggregation_composition.task_five;

public enum TypeOfTour {
    REST("отдых"),
    EXCURSIONS("экскурсии"),
    HEALTH("лечение"),
    SHOPPING("шопинг"),
    CRUISE("круиз");

    private String title;

    TypeOfTour(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public static String getTypes(){
        TypeOfTour[] types = TypeOfTour.values();
        String str = "";
        for(int i = 0; i < types.length; i++){
            str += "Тип : " + "\"" + types[i].name() + "\"" +  " - " + types[i].toString() + "\n";
        }
        return str;
    }
}
