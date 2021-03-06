//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 05:03:57 PM EET 
//


package quoteutils;

import java.util.HashSet;
import java.util.Iterator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quotes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quotes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/quote}Quote" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


@XmlRootElement(name="Quotes")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quotes", propOrder = {
    "quote"
})
public class Quotes {

    @XmlElement(name = "Quote", required = true)
    protected HashSet<Quote> quote;

    /**
     * Gets the value of the quote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quote }
     * 
     * 
     */
    
    protected void print(){
    	Iterator<Quote> i = quote.iterator();
    	while(i.hasNext()){
    		System.out.println(i.next().getText());
    	}
    }
    
   }
