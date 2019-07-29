import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void createsInstanceOfHero() {
        Hero hero = new Hero("Batman", 25, "Rich", "None");
        assertTrue(hero instanceof Hero);
    }

    @Test
    public void savesName()
    {
        Hero hero = new Hero("Batman",25,"Rich","None");
        assertEquals("Batman",hero.getName());
    }

    @Test
    public void savesAge()
    {
        Hero hero = new Hero("Batman",25,"Rich","None");
        assertEquals(25,hero.getAge());
    }

    @Test
    public void saveSpecialPowers()
    {
        Hero hero = new Hero("Batman",25,"Rich","None");
        assertEquals("Rich",hero.getPower());
    }

    @Test
    public void savesWeakness()
    {
        Hero hero = new Hero("Batman",25,"Rich","None");
        assertEquals("None",hero.getWeakness());
    }

    @Test
    public void all_returns_all_instancesOfHero()
    {
        Hero hero = new Hero("Batman1",35,"Rich","None");
        Hero hero1 = new Hero("Batman",25,"Rich","None");
        assertTrue(Hero.all().contains(hero));
        assertTrue(Hero.all().contains(hero1));
    }

    @Test
    public void clear_emptiesAllCategoriesFromList_0() {
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }

    @Test
    public void getId_heroInstantiateWithAnId_1() {
        Hero.clear();
        Hero hero = new Hero("Batman1",35,"Rich","None");
        assertEquals(1,hero.getId());
    }

    @Test
    public void find_returnsCategoryWithSameId_secondCategory() {
        Hero.clear();
        Hero hero = new Hero("Batman1",35,"Rich","None");
        assertEquals(Hero.find(hero.getId()), hero);
    }

    @Test
    public void find_hero_by_name() {
        Hero.clear();
        Hero hero = new Hero("Batman1",35,"Rich","None");
        assertTrue(Hero.findHeroByName("Batman1"));
    }

    @Test
    public void find_returnsNullWhenNoTaskFound_null() {
        assertTrue(Hero.find(1000) == null);
    }



}