package lk.ijse._17_springboot_logins.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/demo")
public class DemoController {
//    trace,debug,info,warn,error

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);
    @GetMapping("log-demo")
    public String logDemo(){
        log.trace("This is a Trace Log");
        log.debug("This is a Debug Log");
        log.info("This is a Info Log");
        log.error("This is a Error Log");
        log.warn("This is a Warn Log");
        return "Logging Demo";
    }
}
