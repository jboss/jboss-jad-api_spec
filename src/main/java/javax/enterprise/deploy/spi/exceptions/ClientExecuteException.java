package javax.enterprise.deploy.spi.exceptions;

/**
 * Errors setting up an application client
 */
public class ClientExecuteException extends Exception
{
   // Constants -----------------------------------------------------
   
   // Attributes ----------------------------------------------------
   
   // Static --------------------------------------------------------
   
   // Constructors --------------------------------------------------
   
   /**
	 * Create an exception with a null reason.
	 */
   public ClientExecuteException()
   {
      super();
   }

   /**
	 * Create an exception with a reason.
	 * 
	 * @param reason the reason
	 */
   public ClientExecuteException(String reason)
   {
      super(reason);
   }
   
   // Public --------------------------------------------------------
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
