package ru.CrossSewing.SchemaBuilder;

import java.awt.image.BufferedImage;
import java.util.List;

public interface SchemaBuilder {
    BufferedImage mapBuilder (List<BufferedImage> symbolList,BufferedImage img);
    BufferedImage schemaBuilder(List<BufferedImage> symbolList, BufferedImage img);
}
