package ru.CrossSewing.SchemaBuilder;

import java.awt.image.BufferedImage;
import java.util.List;

public class SchemaBuild implements SchemaBuilder{
    @Override
    public BufferedImage mapBuilder(List<BufferedImage> symbolList, BufferedImage img) {
        return null;
    }

    @Override
    public BufferedImage schemaBuilder(List<BufferedImage> symbolList, BufferedImage img) {
        return img;
    }
}
