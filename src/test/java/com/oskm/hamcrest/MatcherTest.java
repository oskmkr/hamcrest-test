package com.oskm.hamcrest;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by oskmkr on 2016-03-09.
 */
public class MatcherTest {

    @Test
    public void logicalMatchers() throws InterruptedException {

        String actual = "hello hamcrest";

        assertThat(actual, is(anything()));

        //assertThat(actual, describedAs(null, is(not(nullValue()))));

        assertThat(actual, is(not(nullValue())));

        assertThat(actual, is(notNullValue()));

        assertThat(actual, anyOf(is(nullValue()), is(notNullValue())));

        assertThat(actual, allOf(is(instanceOf(String.class)), is(notNullValue())));
    }

    @Test
    public void equalToExample() {
        Box box1 = new Box("box", 100, 100);
        Box box2 = new Box("box", 100, 100);

        assertThat(box1, is(equalTo(box2)));

        assertThat("hello" + " hamcrest", is(equalTo("hello hamcrest")));
        assertThat(1 + 1, is(equalTo(2)));
    }

    @Test
    public void instanceOfExample() {
        assertThat("Hello hamcrest", is(instanceOf(String.class)));
        assertThat(new Box(), is(instanceOf(Box.class)));
    }

    @Test
    public void sameInstanceEx() {
        Box box1 = new Box("box1", 100, 100);
        //Box box2 = new Box("box2", 100 ,100);
        Box box2 = box1;

        assertThat(box1, is(sameInstance(box2)));
    }

    @Test
    public void endsWithEx() {
        assertThat("hello hamcrest", is(endsWith("est")));
        //assertThat("hello hamcrest", is(endsWith("est ")));
        assertThat("hello hamcrest", is(endsWith("hamcrest")));
    }

    class Box {
        private String name;
        private Integer width;
        private Integer height;

        public Box() {
        }

        public Box(String name, Integer width, Integer height) {
            this.name = name;
            this.width = width;
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Box box = (Box) o;

            if (name != null ? !name.equals(box.name) : box.name != null) return false;
            if (width != null ? !width.equals(box.width) : box.width != null) return false;
            return !(height != null ? !height.equals(box.height) : box.height != null);

        }

    }
}
