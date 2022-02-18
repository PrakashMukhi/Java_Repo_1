import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasketballTeamTest {

    @Test
    //test method for Boston Celtics team
    public  void testgetTeamName1(){
        BasketballTeam bt=new BasketballTeam("Boston Celtics",10);
        assertEquals("Boston Celtics", bt.getTeamName());
    }
   @Test
   //test method for Los Angeles Lakers team
   public  void testgetTeamName2(){
        BasketballTeam bt=new BasketballTeam("Los Angeles Lakers",8);
        assertEquals("Los Angeles Lakers", bt.getTeamName());
    }
    @Test
    //test method for Cleveland Cavaliers team
    public  void testgetTeamName3(){
        BasketballTeam bt=new BasketballTeam("Cleveland Cavaliers",6);
        assertEquals("Cleveland Cavaliers", bt.getTeamName());
    }
    @Test
//test method for point of Boston Celtics
    public  void testgetPoints1(){
        BasketballTeam bt=new BasketballTeam("Boston Celtics",10);
        assertEquals(10, bt.getPoints());
    }
    @Test
//test method for point of Los Angeles Lakers
    public  void testgetPoints2(){
        BasketballTeam bt=new BasketballTeam("Los Angeles Lakers",8);
        assertEquals(8, bt.getPoints());
    }
    @Test
    //test method for point of Cleveland Cavaliers
    public  void testgetPoints3(){
        BasketballTeam bt=new BasketballTeam("Cleveland Cavaliers",6);
        assertEquals(6, bt.getPoints());
    }

}
