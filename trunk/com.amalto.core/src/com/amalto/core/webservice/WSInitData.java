// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.core.webservice;


public class WSInitData {
    protected boolean zap;
    protected java.lang.String xmlSchema;
    
    public WSInitData() {
    }
    
    public WSInitData(boolean zap, java.lang.String xmlSchema) {
        this.zap = zap;
        this.xmlSchema = xmlSchema;
    }
    
    public boolean isZap() {
        return zap;
    }
    
    public void setZap(boolean zap) {
        this.zap = zap;
    }
    
    public java.lang.String getXmlSchema() {
        return xmlSchema;
    }
    
    public void setXmlSchema(java.lang.String xmlSchema) {
        this.xmlSchema = xmlSchema;
    }
}
