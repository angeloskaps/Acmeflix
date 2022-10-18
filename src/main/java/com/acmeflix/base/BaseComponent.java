package com.acmeflix.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class BaseComponent {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    private void init() {
        logger.trace("Loaded {}.", getClass());
    }

    @PreDestroy
    private void destroy() {
        logger.trace("{} is about to be destroyed.", getClass().getName());
    }


}
