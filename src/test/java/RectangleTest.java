import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
    private static final double DELTA = 0.25;

    @Test
    public void shouldCalculateAreaCorrectly() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(50, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void shouldCalculateAreaOfSquareCorrectly() {
        Rectangle square =  Rectangle.createSquare(10);
        assertEquals(100, square.calculateArea(), DELTA);
    }
}