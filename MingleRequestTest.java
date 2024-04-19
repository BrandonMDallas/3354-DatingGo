import org.junit.Test;

import static org.junit.Assert.*;

public class MingleRequestTest {
    @Test
    public void check(){
        MingleRequest message= new MingleRequest();
        assertEquals(1,message.mingleResponse(200));
        assertTrue(message.engagedInMingle);
        assertEquals(2,message.mingleResponse(202));
        assertFalse(message.engagedInMingle);
        assertEquals(0,message.mingleResponse(400));
        assertFalse(message.engagedInMingle);
        assertEquals(0,message.mingleResponse(500));
        assertEquals(0,message.mingleResponse(100));
        assertEquals(0,message.mingleResponse(300));


    }
}