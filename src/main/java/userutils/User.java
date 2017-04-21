//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.09 at 01:42:52 PM EET 
//


package userutils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="username" use="required" type="{http://www.example.org/user}Username" />
 *       &lt;attribute name="passwd" use="required" type="{http://www.example.org/user}Passwd" />
 *       &lt;attribute name="authToken" use="required" type="{http://www.example.org/user}Token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User")
public class User {
	
	
	@Id
	@Pattern(regexp="[a-zA-Z0-9_]{5,20}", message="Username must be 5 to 20 characters long, " + 
			"only digits, letters(Latin only) and underscore permitted.")
	@XmlAttribute(name = "username", required = true)
    protected String username = "";
    
    @Pattern(regexp="[0-9a-zA-Z]{5,20}", message="Password must be 5 to 20 characters(Latin only) long, " + 
			"only digits and letters permitted.")
    @XmlAttribute(name = "passwd", required = true)
    protected String passwd = "";
    
    @XmlAttribute(name = "nonLocked", required = true)
    protected boolean nonLocked = true;
    
    @XmlAttribute(name = "passwordNonExpired", required = true)
    protected boolean passwordNonExpired = true;
    
    @XmlAttribute(name = "authorities", required = true)
    protected String authorities = "ROLE_USER";
    
    public User(
			String username, String passwd,	boolean nonLocked, 
			boolean passwordNonExpired, String authorities) {
		this.username = username;
		this.passwd = passwd;
		this.nonLocked = nonLocked;
		this.passwordNonExpired = passwordNonExpired;
		this.authorities = authorities;
	}

	public User(){
    	
    }
    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the passwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Sets the value of the passwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswd(String value) {
        this.passwd = value;
    }
   
	public boolean passwordNonExpired() {
		return passwordNonExpired;
	}
	
	public void setPasswordNonExpired(boolean value) {
		this.passwordNonExpired = value;
	}
	

	public boolean nonLocked() {
		return nonLocked;
	}
	
	public void setNonLocked(boolean value){
		this.nonLocked = value;
	}

	public String getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	 @Override
	 public boolean equals(Object o){
	   	return this.getUsername().equals(((User) o).getUsername());
	 }
	    
	 @Override
	 public int hashCode(){
	   	return this.getUsername().hashCode();
	 }
	 
	 @Override
	 public String toString(){
		 StringBuilder sb = new StringBuilder();
		 sb.append("Username: " + this.username + "\n");
		 sb.append("Passwd: " + this.passwd + "\n");
		 sb.append("nonLocked: " + this.nonLocked + "\n");
		 sb.append("passwordNonExpired: " + this.passwordNonExpired + "\n");
		 sb.append("Authorities: " + this.authorities + "\n");
		 return sb.toString();
	 }
}