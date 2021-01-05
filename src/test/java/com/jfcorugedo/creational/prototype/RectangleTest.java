package com.jfcorugedo.creational.prototype;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - Rectangle must have a default width and height
 * - Rectangle must have a default background color
 * - Rectangle must be created using prototype
 * - Each instance must be different from the previous one
 */
public class RectangleTest {

    @Test
    public void hasDefaultWidth() {

        Rectangle rectangle = PrototypeManager.buildRectangle();

        assertThat(rectangle.getWidth()).isEqualTo(20);
    }
}