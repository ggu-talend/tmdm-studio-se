/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.objects.menu.ejb.local;

/**
 * Local interface for MenuCtrl.
 * @xdoclet-generated at 12-10-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface MenuCtrlLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Creates or updates a menu
    * @throwsXtentisxception 
    */
   public com.amalto.core.objects.menu.ejb.MenuPOJOPK putMenu( com.amalto.core.objects.menu.ejb.MenuPOJO menu ) throws com.amalto.core.util.XtentisException;

   /**
    * Get menu
    * @throws XtentisException
    */
   public com.amalto.core.objects.menu.ejb.MenuPOJO getMenu( com.amalto.core.objects.menu.ejb.MenuPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Get a Menu - no exception is thrown: returns null if not found
    * @throws XtentisException
    */
   public com.amalto.core.objects.menu.ejb.MenuPOJO existsMenu( com.amalto.core.objects.menu.ejb.MenuPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Remove a Menu
    * @throws XtentisException
    */
   public com.amalto.core.objects.menu.ejb.MenuPOJOPK removeMenu( com.amalto.core.objects.menu.ejb.MenuPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Retrieve all Menu PKs
    * @throws XtentisException
    */
   public java.util.Collection getMenuPKs( java.lang.String regex ) throws com.amalto.core.util.XtentisException;

}
