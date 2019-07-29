import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void creates_instanceOfSquad() {
        Squad squad = new Squad(7, "Squad A", "fight crime");
        assertTrue(squad instanceof Squad);
    }

    @Test
    public void saves_Size_7()
    {
        Squad squad = new Squad(7,"Squad A","fight crime");
        assertEquals(5, squad.getSize());
    }

    @Test
    public void saves_squadName_squad_A()
    {
        Squad squad = new Squad(7,"Squad A","fight crime");
        assertEquals("Squad A", squad.getName());
    }

    @Test
    public void saves_fight_crime()
    {
        Squad squad = new Squad(7,"Squad A","fight crime");
        assertEquals("fight crime", squad.getCause());
    }

    @Test
    public void all_returns_all_instancesOfSquad()
    {
        Squad squad1 = new Squad(7,"Squad A","fight crime");
        Squad squad2 = new Squad(7,"Squad A","fight crime");
        assertTrue(Squad.all().contains(squad1));
        assertTrue(Squad.all().contains(squad2));
    }

    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }

    @Test
    public void getId_SquadInstantiateWithAnId_1() {
        Squad.clear();
        Squad squad = new Squad(7,"Squad A","fight crime");
        assertEquals(1,squad.getId());
    }

    @Test
    public void find_returnsCategoryWithSameId_secondCategory() {
        Squad.clear();
        Squad squad = new Squad(7,"Squad A","fight crime");
        assertEquals(Squad.find(squad.getId()), squad);
    }

    @Test
    public void getSquad_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad squad = new Squad(7,"Squad A","fight crime");
        assertEquals(0, squad.getHeroes().size());
    }

    @Test
    public void addsHeroesToList_true() {
        Squad squad = new Squad(7,"Squad A","fight crime");
        Hero hero = new Hero("Batman",25,"Rich","None");
        squad.addHero(hero);
        assertTrue(squad.getHeroes().contains(hero));
    }


}