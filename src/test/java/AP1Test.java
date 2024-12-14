package src.test.java;
import src.main.java.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AP1Test {

    AP1 ap1 = new AP1();

    @Test
    public void scoresIncreasingTest() {
        assertTrue(ap1.scoresIncreasing(new int[] {1, 3, 4}));
        assertFalse(ap1.scoresIncreasing(new int[] {1, 3, 2}));
        assertTrue(ap1.scoresIncreasing(new int[] {1, 2, 3, 5}));
    }

    @Test
    public void scores100Test() {
        assertTrue(ap1.scores100(new int[] {1, 100, 100, 2}));
        assertFalse(ap1.scores100(new int[] {1, 100, 2, 100}));
        assertFalse(ap1.scores100(new int[] {1, 2, 3, 4}));
    }

    @Test
    public void scoresClumpTest() {
        assertTrue(ap1.scoresClump(new int[] {3, 4, 5}));
        assertFalse(ap1.scoresClump(new int[] {3, 4, 6}));
        assertTrue(ap1.scoresClump(new int[] {1, 3, 5, 5,}));
    }

    @Test
    public void scoresAverageTest() {
        assertEquals(4, ap1.scoresAverage(new int[] {2, 2, 4, 4}));
        assertEquals(4, ap1.scoresAverage(new int[] {4, 4, 4, 2, 2, 2}));
        assertEquals(4, ap1.scoresAverage(new int[] {3, 4, 5, 1, 2, 3}));
        assertEquals(6, ap1.scoresAverage(new int[] {5, 6}));
        assertEquals(5, ap1.scoresAverage(new int[] {5, 4}));
    }

    @Test
    public void wordsCountTest() {
        assertEquals(2, ap1.wordsCount(new String[] {"a", "bb", "b", "ccc"}, 1));
        assertEquals(1, ap1.wordsCount(new String[] {"a", "bb", "b", "ccc"}, 3));
        assertEquals(0, ap1.wordsCount(new String[] {"a", "bb", "b", "ccc"}, 4));
    }

    @Test
    public void wordsFrontTest() {
        assertArrayEquals(new String[] {"a"}, ap1.wordsFront(new String[] {"a", "b", "c", "d"}, 1));
        assertArrayEquals(new String[] {"a", "b"}, ap1.wordsFront(new String[] {"a", "b", "c", "d"}, 2));
        assertArrayEquals(new String[] {"a", "b", "c"}, ap1.wordsFront(new String[] {"a", "b", "c", "d"}, 3));
    }

    @Test
    public void wordsWithoutListTest() {
        assertEquals(java.util.Arrays.asList("a", "bb", "b"), ap1.wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 3));
        assertEquals(java.util.Arrays.asList("a", "b", "ccc"), ap1.wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 2));
        assertEquals(java.util.Arrays.asList("bb", "ccc"), ap1.wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 1));
        assertEquals(java.util.Arrays.asList("a", "bb", "b", "ccc"), ap1.wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 4));

    }

    @Test
    public void hasOneTest() {
        assertTrue(ap1.hasOne(10));
        assertFalse(ap1.hasOne(22));
        assertTrue(ap1.hasOne(101));
    }

    @Test
    public void dividesSelfTest() {
        assertTrue(ap1.dividesSelf(128));
        assertTrue(ap1.dividesSelf(12));
        assertFalse(ap1.dividesSelf(120));
    }

    @Test
    public void copyEvensTest() {
        assertArrayEquals(new int[] {2, 4}, ap1.copyEvens(new int[] {3, 2, 4, 5, 8}, 2));
        assertArrayEquals(new int[] {2, 4, 8}, ap1.copyEvens(new int[] {3, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[] {6, 2, 4}, ap1.copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 3));
    }

    @Test
    public void copyEndyTest() {
        assertArrayEquals(new int[] {9, 90}, ap1.copyEndy(new int[] {9, 11, 90, 22, 6}, 2));
        assertArrayEquals(new int[] {9, 90, 6}, ap1.copyEndy(new int[] {9, 11, 90, 22, 6}, 3));
        assertArrayEquals(new int[] {1, 1}, ap1.copyEndy(new int[] {12, 1, 1, 13, 0, 20}, 2));
    }

    @Test
    public void matchUpTest() {
        assertEquals(1, ap1.matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "xx", "bb"}));
        assertEquals(2, ap1.matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "b", "bb"}));
        assertEquals(1, ap1.matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"", "", "ccc"}));
    }

    @Test
    public void scoreUpTest() {
        assertEquals(6, ap1.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "c", "b", "c"}));
        assertEquals(11, ap1.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "a", "b", "c"}));
        assertEquals(16, ap1.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "a", "b", "b"}));
    }

    @Test
    public void wordsWithoutTest() {
        assertArrayEquals(new String[] {"b", "c"}, ap1.wordsWithout(new String[] {"a", "b", "c", "a"}, "a"));
        assertArrayEquals(new String[] {"a", "c", "a"}, ap1.wordsWithout(new String[] {"a", "b", "c", "a"}, "b"));
        assertArrayEquals(new String[] {"a", "b", "a"}, ap1.wordsWithout(new String[] {"a", "b", "c", "a"}, "c"));
    }

    @Test
    public void scoresSpecialTest() {
        assertEquals(40, ap1.scoresSpecial(new int[] {12, 10, 4}, new int[] {2, 20, 30}));
        assertEquals(40, ap1.scoresSpecial(new int[] {20, 10, 4}, new int[] {2, 20, 10}));
        assertEquals(20, ap1.scoresSpecial(new int[] {12, 11, 4}, new int[] {2, 20, 31}));
    }

    @Test
    public void sumHeightsTest() {
        assertEquals(6, ap1.sumHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, ap1.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
        assertEquals(11, ap1.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
    }

    @Test
    public void sumHeights2Test() {
        assertEquals(7, ap1.sumHeights2(new int[] {5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, ap1.sumHeights2(new int[] {5, 3, 6, 7, 2}, 0, 1));
        assertEquals(15, ap1.sumHeights2(new int[] {5, 3, 6, 7, 2}, 0, 4));
    }

    @Test
    public void bigHeightsTest() {
        assertEquals(1, ap1.bigHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
        assertEquals(0, ap1.bigHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
        assertEquals(1, ap1.bigHeights(new int[] {5, 3, 6, 7, 3}, 0, 4));
    }

    @Test
    public void userCompareTest() {
        assertEquals(-1, ap1.userCompare("bb", 1, "zz", 2));
        assertEquals(1, ap1.userCompare("bb", 1, "aa", 2));
        assertEquals(0, ap1.userCompare("bb", 1, "bb", 1));
    }

    @Test
    public void mergeTwoTest() {
        assertArrayEquals(new String[] {"a", "b", "c"}, ap1.mergeTwo(new String[] {"a", "c", "z"}, new String[] {"b", "f", "z"}, 3));
        assertArrayEquals(new String[] {"a", "c", "f"}, ap1.mergeTwo(new String[] {"a", "c", "z"}, new String[] {"c", "f", "z"}, 3));
        assertArrayEquals(new String[] {"c", "f", "g"}, ap1.mergeTwo(new String[] {"f", "g", "z"}, new String[] {"c", "f", "g"}, 3));
    }

    @Test
    public void commonTwoTest() {
        assertEquals(2, ap1.commonTwo(new String[] {"a", "c", "x"}, new String[] {"b", "c", "d", "x"}));
        assertEquals(3, ap1.commonTwo(new String[] {"a", "c", "x"}, new String[] {"a", "b", "c", "x", "z"}));
        assertEquals(3, ap1.commonTwo(new String[] {"a", "b", "c"}, new String[] {"a", "b", "c"}));
    }
}
