package lab2_1;

import static edu.iis.mto.bsearch.BinarySearch.search;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import edu.iis.mto.bsearch.SearchResult;

public class Test {

    private int singleElement[] = new int[1];

    @org.junit.Test
    public void IsInSeq() {
        SearchResult result = search(singleElement[0], singleElement);
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(1));
    }

    @org.junit.Test
    public void IsNotInSeq() {
        SearchResult result = search(singleElement.length + 1, singleElement);
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(-1));
    }
}
