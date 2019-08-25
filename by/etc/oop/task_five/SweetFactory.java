package by.etc.oop.task_five;

public class SweetFactory {

    public Sweet getSweet(TypeOfSweet type, int weight) {
        Sweet sweet = null;
        switch (type) {
            case GUM:
                sweet = new Gum(weight);
                break;
            case LOLLIPOP:
                sweet = new Lollipop(weight);
                break;
            case COOKIE:
                sweet = new Cookie(weight);
                break;
            case CHOCOLATE:
                sweet = new Chocolate(weight);
                break;
            case CANDY:
                sweet = new Candy(weight);
                break;
            default:
                throw new IllegalArgumentException("Wrong sweet type:" + type);
        }
        return sweet;
    }
}
