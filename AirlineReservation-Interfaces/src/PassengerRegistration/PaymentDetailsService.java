/**
 * PaymentDetailsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PassengerRegistration;

public interface PaymentDetailsService extends javax.xml.rpc.Service {
    public java.lang.String getPaymentDetailsAddress();

    public PassengerRegistration.PaymentDetails getPaymentDetails() throws javax.xml.rpc.ServiceException;

    public PassengerRegistration.PaymentDetails getPaymentDetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
