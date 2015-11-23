package net.saltfactory.tutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * filename : FixturespropertyTest.java
 * author   : saltfactory<saltfactory@gmail.com>
 * created  : 11/23/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootDemoApplication.class)
public class FixturesPropertyTest {
    @Autowired
    private FixturesProperty fixturesProperty;

    @Test
    public void testGetArticles() {
        List<Map> articles = fixturesProperty.getArticles();
        assertThat(articles.size(), is(3));
    }

}