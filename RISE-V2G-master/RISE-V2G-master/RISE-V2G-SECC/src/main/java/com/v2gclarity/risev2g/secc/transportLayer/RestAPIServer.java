package com.v2gclarity.risev2g.secc.transportLayer;

import java.util.Observable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * A simple Jetty server which starts the HSRM Wallbox API Endpoint.
 * 
 * @author Fabian Birk
 *
 */
public class RestAPIServer extends Observable implements Runnable {

	private Logger logger = LogManager.getLogger(this.getClass().getSimpleName());
	private static final RestAPIServer uniqueRestServerInstance = new RestAPIServer();
	private ServletContextHandler context;
	private Server jettyServer;

	private RestAPIServer() {
	}

	public static RestAPIServer getInstance() {
		return uniqueRestServerInstance;
	}

	public boolean initialize() {
		return true;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			context = new ServletContextHandler(ServletContextHandler.SESSIONS);
			context.setContextPath("/");

			jettyServer = new Server(8080);
			jettyServer.setHandler(context);

			ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
			jerseyServlet.setInitOrder(0);

			jerseyServlet.setInitParameter("jersey.config.server.provider.classnames",
					"com.v2gclarity.risev2g.secc.wallboxServerEndpoint.rest.openapi.CommunicationSessionApi");

			try {
				jettyServer.start();

				getLogger().info("Rest server started at port 8080.");

				jettyServer.join();
			} catch (Exception e) {
				System.err.print(e);
				getLogger().error("Jetty Server Exception", e);
				stop();
			}
		}
		stop();
	}
	
	public void stop() {
		try {
			jettyServer.stop();
		} catch (Exception e) {
			System.err.print(e);
			getLogger().error("Jetty Server Exception", e);
		} finally {
			jettyServer.destroy();
		}
	}

	public Logger getLogger() {
		return logger;
	}

}
