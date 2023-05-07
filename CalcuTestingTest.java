import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcuTestingTest {
    CalcuTesting calcu;
    @BeforeEach
    void setUp() throws Exception {
        this.calcu=new CalcuTesting();
    }

    @Test
    void testaddCount() {
        assertTrue(this.calcu.addCount()==1);
        assertTrue(this.calcu.addCount()==2);
        assertTrue(this.calcu.addCount()==3);
        this.calcu.addCount();
        assertFalse(this.calcu.getCount()==2,"Should be 4  not 2");
//        fail("Not yet implemented");
        assertEquals(4,this.calcu.getCount());
        assertNotEquals(4,this.calcu.addCount());
    }

    @Test
    void testsubCount() {
        assertTrue(this.calcu.subCount()==-1);
        assertEquals(-2,this.calcu.subCount());
        this.calcu.subCount();
        assertNotEquals(-2,this.calcu.getCount(),"Should be -3");
        assertEquals(-3,this.calcu.getCount());
        assertFalse(this.calcu.subCount()==-3,"Should be -4");
//        fail("Not yet implemented");
    }
}