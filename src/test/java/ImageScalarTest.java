import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.CrossSewing.ImageScaler.ImageScalar;
import ru.CrossSewing.ImageScaler.Scaler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageScalarTest {

    ImageScalar scaler;
    BufferedImage img;


    @BeforeEach
    public void set() {
        scaler = new Scaler();
        try {
            img = ImageIO.read(new File("src/test/resources/TestImage.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void scaleTest() {
        //arrange
        int width = img.getWidth();
        int height = img.getHeight();
        int expectedScaleRate = width/height;
        //act
        BufferedImage result = scaler.scale(img);
        int rW = result.getWidth();
        int rH = result.getHeight();
        int rRate = rW/rH;
        //assert
        assertThat(rRate,equalTo(expectedScaleRate));
        assertThat(rW,not(width));
    }
}
