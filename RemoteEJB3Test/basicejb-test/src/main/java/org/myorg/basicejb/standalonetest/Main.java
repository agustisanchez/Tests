package org.myorg.basicejb.standalonetest;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.myorg.basicejb.ejb.ReservationRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		logger.debug("getting jndi initial context");
		Context jndi = new InitialContext();
		logger.debug("jndi={}", jndi.getEnvironment());
		ReservationRemote reservation = (ReservationRemote) jndi
				.lookup("Reservation#org.myorg.basicejb.ejb.ReservationRemote");
		logger.info("*** testPing ***");
		reservation.ping();

	}

}
