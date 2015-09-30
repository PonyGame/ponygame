package com.ponygame.initializer;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * As an alternative way of configuring Spring's DelegatingFilterProxy we need this class extending
 * AbstractSecurityWebApplicationInitializer to be created.
 *
 * It is going to be detected by Spring and be used to register DelegatingFilterProxy automatically
 */
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer {

}
