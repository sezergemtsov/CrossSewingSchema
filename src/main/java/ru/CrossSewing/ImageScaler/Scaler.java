package ru.CrossSewing.ImageScaler;

import java.awt.image.BufferedImage;

public class Scaler implements ImageScalar{
    @Override
    public BufferedImage scale(BufferedImage img) {
        return img;
    }
}
