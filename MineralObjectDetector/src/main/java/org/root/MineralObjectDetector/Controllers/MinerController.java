package org.root.MineralObjectDetector.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/miners")
public class MinerController {

    private final Logger logger = LoggerFactory.getLogger(MinerController.class);

    @RequestMapping(value = "current", method = RequestMethod.GET)
    public void Current(){
        logger.info("Current called!");
    }
}
