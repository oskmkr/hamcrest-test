package com.oskm.hamcrest.matchers;

import org.junit.Test;

import static com.oskm.hamcrest.matchers.IsNotBlank.notBlank;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

/**
 * Created by oskmkr on 2016-03-15.
 */
public class IsNotBlankTest {

    @Test
    public void isNotBlank() {

        // given
        // when
        String blankStr = " ";
        String blankStr2 = "";
        String notBlankStr = "hello";

        // then
        assertThat(blankStr, is(not(notBlank())));
        assertThat(blankStr2, is(not(notBlank())));
        assertThat(notBlankStr, is(notBlank()));

    }



}