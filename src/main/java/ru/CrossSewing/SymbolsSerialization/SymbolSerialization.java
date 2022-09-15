package ru.CrossSewing.SymbolsSerialization;

import java.awt.image.BufferedImage;
import java.util.List;

public interface SymbolSerialization {
    List<BufferedImage> serializeSymbols(BufferedImage img);
}
