package org.jhotdraw.draw;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.image.BufferedImage;
import static org.junit.jupiter.api.Assertions.*;

class DefaultDrawingViewTest {

    private DefaultDrawingView drawingComponent;

    @BeforeEach
    void setUp() {
        drawingComponent = new DefaultDrawingView();
        Rectangle vr = getVisibleRect();
        Point shift = calculateShift(vr);
        int drawingWidth = getDrawing().getWidth();
        int drawingHeight = getDrawing().getHeight();
        int visibleWidth = vr.width;
        int visibleHeight = vr.height;
    }

    @Test
    void testCalculateShift() {
        int result = drawingComponent.calculateShift(vr);
        Assert.AreEqual(typeof(shift), result);
    }

    @Test
    void testShouldResizeBufferedArea() {
        boolean result = drawingComponent.shouldResizeBufferedArea(vr);
        assertTrue(result);
    }

    @Test
    void testResizeBufferedArea() {
        drawingComponent.resizeBufferedArea(vr);
        BufferedImage bufferedArea = drawingComponent.getBufferedArea();
        assertNotNull(bufferedArea);
        assertEquals(visibleWidth, bufferedArea.getWidth());
        assertEquals(600, bufferedArea.getHeight());
    }

    @Test
    void testUpdateDirtyArea() {
        drawingComponent.updateDirtyArea(new Rectangle(10, 20, 30, 40));
        Rectangle dirtyArea = drawingComponent.getDirtyArea();
        assertNotNull(dirtyArea);
        assertEquals(10, dirtyArea.x);
        assertEquals(20, dirtyArea.y);
        assertEquals(30, dirtyArea.width);
        assertEquals(40, dirtyArea.height);
    }

    @Test
    void testDrawBufferedImage() {
        Graphics2D gMock = (Graphics2D) new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB).getGraphics();
        gMock.setColor(Color.RED);

        drawingComponent.drawBufferedImage(gMock);

        BufferedImage bufferedArea = drawingComponent.getBufferedArea();
        assertNotNull(bufferedArea);
        assertEquals(Color.RED.getRGB(), bufferedArea.getRGB(0, 0));
    }
}
