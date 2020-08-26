package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@Tag("simple_tests")
public class SimpleTests {
    @Test
    void positiveTest() {
        int a = 2, b = 3;

        assertThat(a * b, is(equalTo(6)));
    }

    @Test
    void negativeTest() {
        int a = 2, b = 3;

        assertThat(a * b, is(equalTo(7)));
    }

    @Test
    @Tag("not_you")
    void notYouTest() {
        int a = 2, b = 3;

        assertThat(a * b, is(equalTo(75)));
    }
}
