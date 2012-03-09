package javax.enterprise.deploy.shared;

/**
 * An enumeration of deployment states.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public class StateType
{
   // Constants -----------------------------------------------------

   /** The RUNNING integer value */
   private static final int RUNNING_INT = 0;
   /** The COMPLETED integer value */
   private static final int COMPLETED_INT = 1;
   /** The FAILED integer value */
   private static final int FAILED_INT = 2;
   /** The RELEASED integer value */
   private static final int RELEASED_INT = 3;
   
   /** The state type for an RUNNING */
   public static final StateType RUNNING = new StateType(RUNNING_INT);
   /** The state type for an COMPLETED */
   public static final StateType COMPLETED = new StateType(COMPLETED_INT);
   /** The state type for an FAILED */
   public static final StateType FAILED = new StateType(FAILED_INT);
   /** The state type for an RELEASED */
   public static final StateType RELEASED = new StateType(RELEASED_INT);

   /** The state types */
   private static final StateType[] stateTypes = new StateType[]
   {
      RUNNING, COMPLETED, FAILED, RELEASED
   };

   /** The state descriptions */
   private static final String[] stateDescs = new String[]
   {
      "Running",
      "Completed", 
      "Failed", 
      "Released"
   };
   
   // Attributes ----------------------------------------------------
   
   /** The value */
   private int value;
   
   /**
    * Create a new StateType
    *
    * @param value the value
    */
   protected StateType(int value)
   {
      this.value = value;
   }
   
   // Public --------------------------------------------------------
   
   /**
    * Get the value
    *
    * @return the value
    */
   public int getValue()
   {
      return value;
   }
   
   /**
    * Get the string table for class command type
    *
    * [todo] check this?
    * @return the string table
    */
   protected String[] getStringTable()
   {
      return stateDescs;
   }
   
   /**
    * Get the enumerated values for module type
    *
    * @return the string table
    */
   protected StateType[] getEnumValueTable()
   {
      return stateTypes;
   }

   /**
    * Get the state type for an integer
    *
    * @param type the type
    * @return the state type
    */
   public static StateType getStateType(int type)
   {
      if (type >= stateTypes.length)
         return null;
      return stateTypes[type];
   }

   public String toString()
   {
      return stateDescs[value];
   }

   /**
    * Return the offset of the first element
    *
    * @return the offset
    */
   protected int getOffset()
   {
      return RUNNING_INT;
   }
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
