import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Employee1Test {
@Test
public void testFinalSalary1() {
    Employee1 emp1 = new Employee1();
    emp1.getInfo("John Smith",5,10);
    emp1.computeBaseSalary();
    emp1.addSal();
    emp1.addWork();
   assertEquals(210,emp1.FinalSalary(),0);
}
    @Test
    public void testFinalSalary2() {
        Employee1 emp1 = new Employee1();
        emp1.getInfo("Sandra Wang ",4,5);
        emp1.computeBaseSalary();
        emp1.addSal();
        emp1.addWork();
        assertEquals(110,emp1.FinalSalary(),0);
    }
    @Test
    public void testFinalSalary3() {
        Employee1 emp1 = new Employee1();
        emp1.getInfo("Gio Rossi",7,12);
        emp1.computeBaseSalary();
        emp1.addSal();
        emp1.addWork();
        assertEquals(255,emp1.FinalSalary(),0);
    }
}
