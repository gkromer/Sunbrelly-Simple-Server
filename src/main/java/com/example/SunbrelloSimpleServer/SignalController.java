package com.example.SunbrelloSimpleServer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin
public class SignalController {
 Integer signal = 0;
    Logger logger = Logger.getLogger(SignalController.class.getName());

    /**
     * @return: receives and returns a signal
     */
    @RequestMapping(value = "/postSignal", method = RequestMethod.POST)
    public int sayHello(@RequestBody SignalDto signal) {
        logger.log(Level.INFO, "Signal received = " + signal.getSignal());
        return signal.getSignal();
    }


}
