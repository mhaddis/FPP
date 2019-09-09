package lesson4Hmw;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		//BinarySearch bs= new BinarySearch();
		int[] ar= {0,2,7,9,17,29};
		assertEquals(BinarySearch.bnrySearch(ar, 2, 0, 5), 1);
		assertEquals(BinarySearch.bnrySearch(ar, 5, 1, 5), -1);
		}

	@Test
	public void testMerge() {

		//Merge mr= new Merge();
		assertEquals(Merge.sorted("abc", "def"), "abcdef");
		assertEquals(Merge.sorted("ace", "bdf"), "abcdef");

		}
}