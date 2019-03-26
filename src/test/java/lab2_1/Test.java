package lab2_1;

import static edu.iis.mto.bsearch.BinarySearch.search;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;

import edu.iis.mto.bsearch.SearchResult;

public class Test {

    private int singleElement[] = new int[1];
    private int seq[] = new int[100];

    @Before
    public void initTest() {
        for (int i = 0; i < 100; i++) {
            seq[i] = i + 1;
        }
        singleElement[0] = 1;

    }

    @org.junit.Test
    public void IsInSeq() {
        SearchResult result = search(singleElement[0], singleElement);
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(1));
    }

    @org.junit.Test
    public void IsNotInSeq() {
        SearchResult result = search(2, singleElement);
        assertThat(result.isFound(), is(false));
        assertThat(result.getPosition(), is(-1));
    }

    @org.junit.Test
    public void IsFirstEleInSeq() {
        SearchResult result = search(seq[0], seq);
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(1));
    }

    @org.junit.Test
    public void IsLastEleInSeq() {
        SearchResult result = search(seq[seq.length - 1], seq);
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(seq.length));
    }

    @org.junit.Test
    public void IsMiddleEleInSeq() {
        SearchResult result = search(seq[seq.length / 2 - 1], seq);
        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), is(seq.length / 2));
    }

    @org.junit.Test
    public void IsNotEleInSeq() {
        SearchResult result = search(-1, seq);
        assertThat(result.isFound(), is(false));
        assertThat(result.getPosition(), is(-1));
    }

}
