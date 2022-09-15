import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.CrossSewing.ColorFilter.ColorFilter;
import ru.CrossSewing.ColorFilter.Filter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ColorFilterTest {

    BufferedImage img;
    List<Color> colorList = new ArrayList<>();
    ColorFilter cf;

    @BeforeEach
    public void set() {
        cf = new Filter();
        colorList.add(Color.black);
        try {
            img = ImageIO.read(new File("src/test/resources/TestImage.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void colorFiltrationTest() {

        //arrange
        int[] expectedPixels = new int[4];
        expectedPixels[0] = Color.black.getRed();
        expectedPixels[1] = Color.black.getGreen();
        expectedPixels[2] = Color.black.getBlue();
        expectedPixels[3] = Color.black.getAlpha();

        //act
        BufferedImage result = cf.colorFiltration(colorList,img);
        Raster raster = result.getRaster();
        int[] pixels = raster.getPixel(1,1,new int[4]);


        //assert
        assertThat(pixels,equalTo(expectedPixels));
    }
}
