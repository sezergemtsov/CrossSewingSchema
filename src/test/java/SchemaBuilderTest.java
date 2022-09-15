import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.CrossSewing.SchemaBuilder.SchemaBuild;
import ru.CrossSewing.SchemaBuilder.SchemaBuilder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SchemaBuilderTest {

    List<BufferedImage> list = new ArrayList<>();
    BufferedImage img;
    SchemaBuilder sb;
    int indent = 10;

    @BeforeEach
    public void set() {
        sb = new SchemaBuild();
        list.clear();

        img = new BufferedImage(2,2,1);;
        list.add(new BufferedImage(5,5,1));

    }

    @Test
    public void mapBuilderTest() {
        //arrange
        //act
        BufferedImage result = sb.mapBuilder(list,img);
        //assert
        assertThat(result,notNullValue());

    }
    @Test
    public void schemaBuildTest() {
        //arrange
        int expectedHeight = list.get(0).getHeight()+indent+indent;
        //act
        BufferedImage result = sb.schemaBuilder(list, img);
        int height = result.getHeight();
        //assert
        assertThat(height,equalTo(expectedHeight));
    }
}
