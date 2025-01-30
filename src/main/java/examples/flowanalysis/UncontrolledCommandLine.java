package examples.flowanalysis;

import java.io.IOException;

public class UncontrolledCommandLine {

    public void test() throws IOException {
        String script = System.getenv("SCRIPTNAME");
        if (script != null) {
            // BAD: The script to be executed is controlled by the user.
            Runtime.getRuntime().exec(script);
        }
    }
}
