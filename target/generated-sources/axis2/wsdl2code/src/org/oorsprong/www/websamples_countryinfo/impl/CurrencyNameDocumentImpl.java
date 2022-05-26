/*
 * An XML document type.
 * Localname: CurrencyName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CurrencyName(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CurrencyNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYNAME$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CurrencyName");
    
    
    /**
     * Gets the "CurrencyName" element
     */
    public org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName getCurrencyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName)get_store().find_element_user(CURRENCYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CurrencyName" element
     */
    public void setCurrencyName(org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName currencyName)
    {
        generatedSetterHelperImpl(currencyName, CURRENCYNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CurrencyName" element
     */
    public org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName addNewCurrencyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName)get_store().add_element_user(CURRENCYNAME$0);
            return target;
        }
    }
    /**
     * An XML CurrencyName(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CurrencyNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName
    {
        private static final long serialVersionUID = 1L;
        
        public CurrencyNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCURRENCYISOCODE$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCurrencyISOCode");
        
        
        /**
         * Gets the "sCurrencyISOCode" element
         */
        public java.lang.String getSCurrencyISOCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCURRENCYISOCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sCurrencyISOCode" element
         */
        public org.apache.xmlbeans.XmlString xgetSCurrencyISOCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCURRENCYISOCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sCurrencyISOCode" element
         */
        public void setSCurrencyISOCode(java.lang.String sCurrencyISOCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCURRENCYISOCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCURRENCYISOCODE$0);
                }
                target.setStringValue(sCurrencyISOCode);
            }
        }
        
        /**
         * Sets (as xml) the "sCurrencyISOCode" element
         */
        public void xsetSCurrencyISOCode(org.apache.xmlbeans.XmlString sCurrencyISOCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCURRENCYISOCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCURRENCYISOCODE$0);
                }
                target.set(sCurrencyISOCode);
            }
        }
    }
}
