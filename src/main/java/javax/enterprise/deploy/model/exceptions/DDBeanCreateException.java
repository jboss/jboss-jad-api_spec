package javax.enterprise.deploy.model.exceptions;

/**
 * Errors while generating a DDBean
 */
public class DDBeanCreateException extends Exception
{
   // Constants -----------------------------------------------------
   
   // Attributes ----------------------------------------------------
   
   // Static --------------------------------------------------------
   
   // Constructors --------------------------------------------------
   
   /**
	 * Create an exception with a null reason.
	 */
   public DDBeanCreateException()
   {
      super();
   }

   /**
	 * Create an exception with a reason.
	 * 
	 * @param reason the reason
	 */
   public DDBeanCreateException(String reason)
   {
      super(reason);
   }
   
   // Public --------------------------------------------------------
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
