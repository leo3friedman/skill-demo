import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
	public void subtraction() {
		assertEquals(2, SkillDemo.subtract(4,3)); // Fails at first
	}
}
