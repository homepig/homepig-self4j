package com.homepig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {
    final static Logger logger = LoggerFactory.getLogger(Foo.class);

    public void doIt() {
        logger.debug("Did it Again!");
    }
}
