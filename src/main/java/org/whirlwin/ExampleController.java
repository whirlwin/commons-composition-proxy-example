package org.whirlwin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public final class ExampleController {

    @CompositionProxyEndpoint
    @RequestMapping(method = RequestMethod.GET, value = "example1")
    @ResponseBody
    public String example1() {
        return "foobar!";
    }
}
