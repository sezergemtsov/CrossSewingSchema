import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.CrossSewing.SymbolsSerialization.SymbolSerialization;
import ru.CrossSewing.SymbolsSerialization.Symbols;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SymbolSerializationTest {

    List<?> list = new ArrayList<>();
    SymbolSerialization sb;
    BufferedImage img;

    @BeforeEach
    public void set() {
        sb = new Symbols();
        try {
            img = ImageIO.read(new File("src/test/resources/TestImage.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void serializeTest() {
        //arrange
        //act
        list = sb.serializeSymbols(img);
        //assert
        assertThat(list, notNullValue());
    }
}
