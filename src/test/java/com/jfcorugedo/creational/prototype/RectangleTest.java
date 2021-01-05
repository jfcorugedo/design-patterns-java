package com.jfcorugedo.creational.prototype;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - Rectangle must have a default width
 * - Rectangle must have a default height
 * - Rectangle must be created using prototype
 * - Each instance must be different from the previous one
 */
public class RectangleTest {

    @Test
    public void hasDefaultWidth() {

        Rectangle rectangle = PrototypeManager.buildRectangle();

        assertThat(rectangle.getWidth()).isEqualTo(20);
    }

    @Test
    public void hasDefaultHeight() {

        Rectangle rectangle = PrototypeManager.buildRectangle();

        assertThat(rectangle.getHeight()).isEqualTo(10);
    }
}
