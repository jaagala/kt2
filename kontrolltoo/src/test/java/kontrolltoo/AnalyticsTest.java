package test.java.kontrolltoo;

import jdk.internal.jline.internal.TestAccessible;

public class AnalyticsTest{

    @Before
    public void logStartOfSession(){
        System.out.println("Testimine algas.");
    }

    @Test
    public void testIfFileIsNotEmpty(){
        System.out.println("Test vaatab, ega fail ei ole tühi.");
        
    }

    @Test
    public void testIfWordsAreSplit(){

    }

    @Test
    public void testIfWordsAreLowerCase(){

    }

    @Test
    public void testIfCountingWordsWorks(){
        
    }
}