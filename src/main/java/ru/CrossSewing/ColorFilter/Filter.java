package ru.CrossSewing.ColorFilter;

import java.awt.image.BufferedImage;
import java.util.List;

public class Filter implements ColorFilter {
    @Override
    public BufferedImage colorFiltration(List<?> colorList, BufferedImage img) {
        return img;
    }
}
