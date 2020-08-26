package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@Tag("simple_tests")
public class ParametrizedTest {
    static Logger logger = LoggerFactory.getLogger(ParametrizedTest.class);

    @Test
    @Tag("apple_tag")
    void parametrizedStringTest() {
        String item = System.getProperty("item", "orange");

        logger.info("\nitem = " + item);

        assertThat(item, is(equalTo("apple")));
    }
}
