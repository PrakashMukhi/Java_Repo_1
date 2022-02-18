import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class FootballTeamTest {

    @Test
    //test method for Chelsea
    public void testgetTeamName1() {
        FootballTeam ft = new FootballTeam("Chelsea", 33, "Happy Foot ");
        assertEquals("Chelsea", ft.getTeamName());
    }
    @Test
    //test method for Liverpool
    public void testgetTeamName2() {
        FootballTeam ft = new FootballTeam("Liverpool", 45, "Bet Company ");
        assertEquals("Liverpool", ft.getTeamName());
    }
    @Test
    //test method for Manchester United
    public void testgetTeamName3() {
        FootballTeam ft = new FootballTeam("Manchester United", 37, "Nice Stadium");
        assertEquals("Manchester United", ft.getTeamName());
    }
    @Test
    //test method for points of Chelsea
    public void testgetPoint1() {
        FootballTeam ft = new FootballTeam("Chelsea", 33, "Happy Foot ");
        assertEquals(33, ft.getPoints());
    }
    @Test
    //test method for points of Liverpool
    public void testgetPoint2() {
        FootballTeam ft = new FootballTeam("Liverpool", 45, "Bet Company ");
        assertEquals(45, ft.getPoints());
    }
    @Test
    //test method for points of Manchester United
    public void testgetPoint3() {
        FootballTeam ft = new FootballTeam("Manchester United", 37, "Nice Stadium");
        assertEquals(37, ft.getPoints());
    }
    }
