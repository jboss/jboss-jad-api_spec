package javax.enterprise.deploy.model;

import java.beans.PropertyChangeEvent;

/**
 * An event describing ConfigBeans added/changed/removed from a configuration
 */
public final class XpathEvent
{
   // Constants -----------------------------------------------------

   /** A bean is added */
   public static final Object BEAN_ADDED = new Object();
   /** A bean is removed */
   public static final Object BEAN_REMOVED = new Object();
   /** A bean is changed */
   public static final Object BEAN_CHANGED = new Object();
   
   // Attributes ----------------------------------------------------
   
   /** The bean */
   private DDBean bean;
   /** The type */
   private Object type;
   /** The property change event */
   private PropertyChangeEvent propertyChangeEvent;
   
   // Static --------------------------------------------------------
   
   // Constructors --------------------------------------------------
   
   /**
    * Create a new XpathEvent
    *
    * @param bean the bean
    * @param type the event type
    */
   public XpathEvent(DDBean bean, Object type)
   {
      this.bean = bean;
      this.type = type;
   }
   
   // Public --------------------------------------------------------
   
   /**
    * Get the property change event
    *
    * @return the property change event
    */
   public PropertyChangeEvent getChangeEvent()
   {
      return propertyChangeEvent;
   }
   
   /**
    * Set the property change event
    *
    * @param propertyChangeEvent the property change event
    */
   public void setChangeEvent(PropertyChangeEvent propertyChangeEvent)
   {
      this.propertyChangeEvent = propertyChangeEvent;
   }
   
   /**
    * Get the DDBean
    *
    * @return the DDBean
    */
   public DDBean getBean()
   {
      return bean;
   }
   
   /**
    * Is it an add event
    *
    * @return true when it is an add event, false otherwise
    */
   public boolean isAddEvent()
   {
      return type == BEAN_ADDED;
   }
   
   /**
    * Is it a remove event
    *
    * @return true when it is a remove event, false otherwise
    */
   public boolean isRemoveEvent()
   {
      return type == BEAN_REMOVED;
   }
   
   /**
    * Is it a change event
    *
    * @return true when it is a change event, false otherwise
    */
   public boolean isChangeEvent()
   {
      return type == BEAN_CHANGED;
   }
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
