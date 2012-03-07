package javax.enterprise.deploy.spi.status;

import javax.enterprise.deploy.spi.exceptions.ClientExecuteException;
import java.io.Serializable;

/**
 * Installs configures and runs an application client.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface ClientConfiguration extends Serializable
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------
   
   /**
    * Executes the client 
    *
    * @throws ClientExecuteException when the configuration is incomplete
    */
   void execute() throws ClientExecuteException;
}
