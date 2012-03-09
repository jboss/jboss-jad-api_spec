package javax.enterprise.deploy.shared;

/**
 * An enumeration of deployment status action types.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public class ActionType
{
   // Constants -----------------------------------------------------

   /** The Execute integer value */
   private static final int EXECUTE_INT = 0;
   /** The Cancel integer value */
   private static final int CANCEL_INT = 1;
   /** The Stop integer value */
   private static final int STOP_INT = 2;
   
   /** The action type for EXECUTE */
   public static final ActionType EXECUTE = new ActionType(EXECUTE_INT);
   /** The action type for CANCEL  */
   public static final ActionType CANCEL = new ActionType(CANCEL_INT);
   /** The action type for STOP */
   public static final ActionType STOP = new ActionType(STOP_INT);

   /** The action types */
   private static final ActionType[] actionTypes = new ActionType[]
   {
      EXECUTE, CANCEL, STOP                                                                 
   };

   /** The action descriptions */
   private static final String[] actionDescs = new String[]
   {
      "Execute",
      "Cancel",
      "Stop"
   };
   
   // Attributes ----------------------------------------------------
   
   /** The value */
   private int value;
   
   // Constructors --------------------------------------------------
   
   /**
    * Create a new ActionType
    *
    * @param value the value
    */
   protected ActionType(int value)
   {
      this.value = value;
   }
   
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
    * Get the string table for class action type
    *
    * [todo] check this?
    * @return the string table
    */
   protected String[] getStringTable()
   {
      return actionDescs;
   }
   
   /**
    * Get the enumerated values for module type
    *
    * @return the string table
    */
   protected ActionType[] getEnumValueTable()
   {
      return actionTypes;
   }

   /**
    * Get the action type for an integer
    *
    * @param type the type
    * @return the action type
    */
   public static ActionType getActionType(int type)
   {
      if (type >= actionTypes.length)
         return null;
      return actionTypes[type];
   }

   public String toString()
   {
      return actionDescs[value];
   }

   /**
    * Return the offset of the first element
    *
    * @return the offset
    */
   protected int getOffset()
   {
      return EXECUTE_INT;
   }

}
