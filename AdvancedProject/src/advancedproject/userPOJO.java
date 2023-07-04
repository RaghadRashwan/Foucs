/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedproject;

/**
 *
 * @author 96653
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="user")
public class userPOJO  implements java.io.Serializable {
    
     @Id
     @Column(name="userName")
     private String usename;
     @Column(name="userEmail")
     private String useremail;
     @Column(name="userPass")
     private String userpass;

     
       public userPOJO() {
    }

    public userPOJO(String usename, String useremail, String userpass) {
        this.usename = usename;
        this.useremail = useremail;
        this.userpass = userpass;
    }

    public String getUsename() {
        return usename;
    }

    public String getUseremail() {
        return useremail;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
    
    
     
 

  


}
