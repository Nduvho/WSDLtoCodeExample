/*
 * An XML document type.
 * Localname: ListOfCurrenciesByCodeResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCurrenciesByCodeResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCurrenciesByCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCurrenciesByCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCURRENCIESBYCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByCodeResponse");
    
    
    /**
     * Gets the "ListOfCurrenciesByCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.ListOfCurrenciesByCodeResponse getListOfCurrenciesByCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.ListOfCurrenciesByCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.ListOfCurrenciesByCodeResponse)get_store().find_element_user(LISTOFCURRENCIESBYCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCurrenciesByCodeResponse" element
     */
    public void setListOfCurrenciesByCodeResponse(org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.ListOfCurrenciesByCodeResponse listOfCurrenciesByCodeResponse)
    {
        generatedSetterHelperImpl(listOfCurrenciesByCodeResponse, LISTOFCURRENCIESBYCODERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCurrenciesByCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.ListOfCurrenciesByCodeResponse addNewListOfCurrenciesByCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.ListOfCurrenciesByCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.ListOfCurrenciesByCodeResponse)get_store().add_element_user(LISTOFCURRENCIESBYCODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCurrenciesByCodeResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCurrenciesByCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponseDocument.ListOfCurrenciesByCodeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCurrenciesByCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFCURRENCIESBYCODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByCodeResult");
        
        
        /**
         * Gets the "ListOfCurrenciesByCodeResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency getListOfCurrenciesByCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency)get_store().find_element_user(LISTOFCURRENCIESBYCODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfCurrenciesByCodeResult" element
         */
        public void setListOfCurrenciesByCodeResult(org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency listOfCurrenciesByCodeResult)
        {
            generatedSetterHelperImpl(listOfCurrenciesByCodeResult, LISTOFCURRENCIESBYCODERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfCurrenciesByCodeResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency addNewListOfCurrenciesByCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency)get_store().add_element_user(LISTOFCURRENCIESBYCODERESULT$0);
                return target;
            }
        }
    }
}
