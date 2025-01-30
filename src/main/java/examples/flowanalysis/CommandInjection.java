package examples.flowanalysis;

import javax.servlet.http.HttpServletRequest;

public class CommandInjection {

    void systemInjection(HttpServletRequest req) throws Exception
    {
        String sCommand = "call process_data.exe -params " + req.getParameter("command_parameters");
        Runtime.getRuntime().exec(sCommand);
    }
}
