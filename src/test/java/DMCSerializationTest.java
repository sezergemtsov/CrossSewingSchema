import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.CrossSewing.DMCSerialization.DMC;
import ru.CrossSewing.DMCSerialization.DmcSerialization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DMCSerializationTest {
    List<?> list = new ArrayList<>();
    DmcSerialization dmc;
    File file;

    @BeforeEach
    public void set() {
        dmc = new DMC();
        file = new File("src/test/resources/TestDMC.csv");
    }

    @Test
    public void dmcSerializationTest() {
        //arrange
        //act
        list = dmc.serializeDMC(file);
        //assert
        assertThat(list, notNullValue());
    }
}
