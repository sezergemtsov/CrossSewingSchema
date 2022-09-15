package ru.CrossSewing.ColorFilter;

import java.awt.image.BufferedImage;
import java.util.List;

public interface ColorFilter {
    BufferedImage colorFiltration(List<?> colorList, BufferedImage img);
}
