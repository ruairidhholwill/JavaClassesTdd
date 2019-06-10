import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 20);
    }

    @Test
    public void canPrintAsHasEnoughSheets(){
        assertEquals(80, printer.canPrint(2, 10));
    }

    @Test
    public void canNotPrintAsNotEnoughSheets(){
        assertEquals(100, printer.canPrint(10, 11));
    }

    @Test
    public void tonerReducesBy1PerPage(){
        assertEquals(10, printer.reduceToner(10));
    }


}
