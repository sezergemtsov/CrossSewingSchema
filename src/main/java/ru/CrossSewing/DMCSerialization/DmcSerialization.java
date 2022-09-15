package ru.CrossSewing.DMCSerialization;

import java.io.File;
import java.util.List;

public interface DmcSerialization <T> {
    List<T> serializeDMC(File source);
}
