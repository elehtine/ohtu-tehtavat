package ohtuesimerkki;

import java.util.List;
import java.util.ArrayList;

import org.junit.*;
import org.junit.Before;
//import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        stats = new Statistics(readerStub);
    }  

    @Test
    public void searchFindName() {
        String name = "Semenko";
        assertEquals(name, stats.search(name).getName());
    }

    @Test
    public void searchFindNull() {
        String name = "noname";
        assertNull(stats.search(name));
    }

    @Test
    public void teamFind() {
        assertEquals(3, stats.team("EDM").size());
        assertEquals(1, stats.team("PIT").size());
        assertEquals("Yzerman", stats.team("DET").get(0).getName());
    }

    @Test
    public void topScorers() {
        List<Player> top = stats.topScorers(4);
        assertEquals(4, top.size());
        assertEquals("Gretzky", top.get(0).getName());
        assertEquals("Kurri", top.get(3).getName());
    }

}

