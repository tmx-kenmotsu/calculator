package examples.flowanalysis;

import java.io.File;

public class NullAlways {
    public void createDir(File dir) {
        if (dir != null || !dir.exists())
            dir.mkdir();
    }
}