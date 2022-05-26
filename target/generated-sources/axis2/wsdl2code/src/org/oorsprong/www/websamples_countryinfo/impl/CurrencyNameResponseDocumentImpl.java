/*
 * An XML document type.
 * Localname: CurrencyNameResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CurrencyNameResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CurrencyNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CurrencyNameResponse");
    
    
    /**
     * Gets the "CurrencyNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.CurrencyNameResponse getCurrencyNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.CurrencyNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.CurrencyNameResponse)get_store().find_element_user(CURRENCYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CurrencyNameResponse" element
     */
    public void setCurrencyNameResponse(org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.CurrencyNameResponse currencyNameResponse)
    {
        generatedSetterHelperImpl(currencyNameResponse, CURRENCYNAMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CurrencyNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.CurrencyNameResponse addNewCurrencyNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.CurrencyNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.CurrencyNameResponse)get_store().add_element_user(CURRENCYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CurrencyNameResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CurrencyNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CurrencyNameResponseDocument.CurrencyNameResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CurrencyNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CURRENCYNAMERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CurrencyNameResult");
        
        
        /**
         * Gets the "CurrencyNameResult" element
         */
        public java.lang.String getCurrencyNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYNAMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrencyNameResult" element
         */
        public org.apache.xmlbeans.XmlString xgetCurrencyNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYNAMERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CurrencyNameResult" element
         */
        public void setCurrencyNameResult(java.lang.String currencyNameResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYNAMERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYNAMERESULT$0);
                }
                target.setStringValue(currencyNameResult);
            }
        }
        
        /**
         * Sets (as xml) the "CurrencyNameResult" element
         */
        public void xsetCurrencyNameResult(org.apache.xmlbeans.XmlString currencyNameResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYNAMERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYNAMERESULT$0);
                }
                target.set(currencyNameResult);
            }
        }
    }
}
