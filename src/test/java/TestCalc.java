import io.qameta.allure.*;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Epic("Epic 1")
public class TestCalc {


    @Test
    @Story("Story 1")
    @Description("Description related to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag 1")
    @Link("https://example.org")
    public void testAdd() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(7, calc.Add(4, 3));

    }

    private Calculator createCalc() {
        return new Calculator();
    }

    @Test
    @Story("User Story2")
    @Description("Description related to TestAddWithNegative")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("Tag 2")
    public void testAddWithNegative() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(-6, calc.Add(-2, -3) );
    }


}
