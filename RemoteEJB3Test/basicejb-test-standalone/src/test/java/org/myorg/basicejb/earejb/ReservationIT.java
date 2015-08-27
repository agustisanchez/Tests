package org.myorg.basicejb.earejb;

import javax.naming.InitialContext;

import javax.naming.NamingException;


import org.junit.Before;

import org.junit.Test;
import org.myorg.basicejb.ejb.ReservationRemote;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class ReservationIT {
    private static final Logger logger = LoggerFactory.getLogger(ReservationIT.class);
    
    private InitialContext jndi;
    private ReservationRemote reservation;
    
    @Before
    public void setUp() throws NamingException {
        logger.debug("getting jndi initial context");
        jndi=new InitialContext();
        logger.debug("jndi={}", jndi.getEnvironment());
        Object lookup = jndi.lookup("Reservation#org.myorg.basicejb.ejb.ReservationRemote");
        logger.debug("{}", lookup);
        reservation = (ReservationRemote) lookup;
    }

    @Test
    public void testPing() {
        logger.info("*** testPing ***");
        reservation.ping();
    }

}