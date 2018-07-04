import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleTest {
    private Circle circle;
    private static final double DELTA = 0.25;

    @Before
    public void CreateCircleOfRadius4() {
        circle = new Circle(4);
    }

    @Test
    public void shouldCalculatePerimeterCorrectly() {
        assertEquals(25.12, circle.calculatePerimeter(), DELTA);
    }

    @Test
    public void shouldCalculateAreaCorrectly() {
        assertEquals(50.24, circle.calculateArea(), DELTA);
    }
}