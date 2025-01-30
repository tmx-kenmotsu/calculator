package examples.flowanalysis;

import java.io.IOException;

public class UncontrolledCommandLine {

    public static void main(String[] args) throws IOException {
        String script = System.getenv(args[0]);
        if (script != null) {
            // BAD: The script to be executed is controlled by the user.
            Runtime.getRuntime().exec(script);
        }
    }
}
