/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedproject;

/**
 *
 * @author User
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="groupcreat")

public class Group implements java.io.Serializable {

    
    @Column(name=" chaptersNum")
    private String  ChaptersNum;
    
    @Column(name="name")
    private String Name;
    
   @Id
     @GeneratedValue
    @Column(name="groupId")
    private int GroupId = 1;

    
    public Group(){
        
    }
    
    
    
    public Group(int i,String c){
        this.GroupId=i;
        this.ChaptersNum=c;
        
    }
    
    public Group(String qu){      
        this.Name=qu;
        
    }
    public int getgroupId() {
        return GroupId;
    }

    public void setgroupId(int groupId) {
        this.GroupId = groupId;
    }
    
    public String getChaptersNum() {
        return ChaptersNum;
    }

    public void setChaptersNum(String chaptersNum) {
        this.ChaptersNum = chaptersNum;
    }

    

    public String getname() {
        return Name;
    }

    public void setname(String name) {
        this.Name = name;
    }

    
   
}

