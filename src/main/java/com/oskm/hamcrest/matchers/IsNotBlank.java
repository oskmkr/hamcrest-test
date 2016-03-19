package com.oskm.hamcrest.matchers;

import org.apache.commons.lang.StringUtils;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/**
 * Created by oskmkr on 2016-03-15.
 */
public class IsNotBlank extends TypeSafeMatcher<String> {

    @Override
    protected boolean matchesSafely(String s) {
        return StringUtils.isNotBlank(s);
    }

    public void describeTo(Description description) {
        description.appendText("not blank string");
    }

    @Factory
    public static <T> Matcher<String> notBlank() {
        return new IsNotBlank();
    }
}
