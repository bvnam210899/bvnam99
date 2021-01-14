package single.responsibility.cohension.ex1;

public class SquareAreaCalculator {
    int size = 5;

    public int calculateArea() {
        var realSquare = size * size;
        return realSquare;
    }
}
