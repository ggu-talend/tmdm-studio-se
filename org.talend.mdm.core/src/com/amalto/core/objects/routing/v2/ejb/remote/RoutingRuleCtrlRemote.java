 /*
 * Generated by XDoclet - Do not edit!
 * this class was prodiuced by xdoclet automagically...
 */
package com.amalto.core.objects.routing.v2.ejb.remote;

import java.util.*;

/**
 * This class is remote adapter to RoutingRuleCtrl. It provides convenient way to access
 * facade session bean. Inverit from this class to provide reasonable caching and event handling capabilities.
 *
 * Remote facade for RoutingRuleCtrl.
 * @xdoclet-generated at 3-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */

public class RoutingRuleCtrlRemote extends Observable
{
    static RoutingRuleCtrlRemote _instance = null;
    public static RoutingRuleCtrlRemote getInstance() {
        if(_instance == null) {
	   _instance = new RoutingRuleCtrlRemote();
	}
	return _instance;
    }

  /**
   * cached remote session interface
   */
  com.amalto.core.objects.routing.v2.ejb.remote.RoutingRuleCtrl _session = null;
  /**
   * return session bean remote interface
   */
   protected com.amalto.core.objects.routing.v2.ejb.remote.RoutingRuleCtrl getSession() {
      try {
   	if(_session == null) {
	   _session = com.amalto.core.objects.routing.v2.ejb.local.RoutingRuleCtrlUtil.getHome().create();
	}
	return _session;
      } catch(Exception ex) {
        // just catch it here and return null.
        // somebody can provide better solution
	ex.printStackTrace();
	return null;
      }
   }

   public com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJOPK putRoutingRule ( com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJO routingRule )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJOPK retval;
       retval =  getSession().putRoutingRule( routingRule );

      return retval;

   }

   public com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJO getRoutingRule ( com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJO retval;
       retval =  getSession().getRoutingRule( pk );

      return retval;

   }

   public com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJO existsRoutingRule ( com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJO retval;
       retval =  getSession().existsRoutingRule( pk );

      return retval;

   }

   public com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJOPK removeRoutingRule ( com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.RoutingRulePOJOPK retval;
       retval =  getSession().removeRoutingRule( pk );

      return retval;

   }

   public java.util.Collection getRoutingRulePKs ( java.lang.String regex )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.Collection retval;
       retval =  getSession().getRoutingRulePKs( regex );

      return retval;

   }

  /**
   * override this method to provide feedback to interested objects
   * in case collections were changed.
   */
  public void invalidate() {

  	setChanged();
	notifyObservers();
  }
}
