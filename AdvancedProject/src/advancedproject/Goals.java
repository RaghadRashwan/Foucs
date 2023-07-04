
package advancedproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author shaha
 */
@Entity
@Table(name = "groupgoals")
public class Goals implements java.io.Serializable{
    
    @Id
    @Column(name = "goalId")
    private int GoalId;
   
    @Column(name = "groupId")
    private int groupID;
    @Column(name = "goal_description")
    private String Goal_description;
    
    
    public Goals() {
    }

    public void setGoalId(int GoalId) {
        this.GoalId = GoalId;
    }

    public void setGoal_description(String Goal_description) {
        this.Goal_description = Goal_description;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getGoalId() {
        return GoalId;
    }

    public String getGoal_description() {
        return Goal_description;
    }

    public int getGroupID() {
        return groupID;
    }

    public Goals(int GoalId, String Goal_description, int groupID) {
        this.GoalId = GoalId;
        this.Goal_description = Goal_description;
        this.groupID = groupID;
    }
    
}
