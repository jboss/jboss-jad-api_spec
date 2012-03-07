package javax.enterprise.deploy.spi.exceptions;

/**
 * Errors when a method is not supported
 */
public class OperationUnsupportedException extends Exception
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
   public OperationUnsupportedException(String reason)
   {
      super(reason);
   }
   
   // Public --------------------------------------------------------
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
