/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.ejb.remote;

/**
 * Home interface for DroppedItemCtrl.
 * @xdoclet-generated at 3-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface DroppedItemCtrlHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/DroppedItemCtrl";
   public static final String JNDI_NAME="amalto/remote/core/droppeditemctrl";

   public com.amalto.core.ejb.remote.DroppedItemCtrl create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
