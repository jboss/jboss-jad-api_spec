package javax.enterprise.deploy.spi.exceptions;

/**
 * Errors while generating a Deployment manager
 */
public class DeploymentManagerCreationException extends Exception
{
   // Constants -----------------------------------------------------
   
   // Attributes ----------------------------------------------------
   
   // Static --------------------------------------------------------
   
   // Constructors --------------------------------------------------
   
   /**
	 * Create an exception with a reason.
	 * 
	 * @param reason the reason
	 */
   public DeploymentManagerCreationException(String reason)
   {
      super(reason);
   }
   
   // Public --------------------------------------------------------
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
