package basicmeeting.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "userAdmin")
public class userAdmin 
{ 
    @Id
    int id;
    String adminname;
    

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "admin_id")
    private List<Meeting> meetings=new ArrayList<>();

   

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getAdminname() {
        return adminname;
    }



    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }



    public List<Meeting> getMeetings() {
        return meetings;
    }

    

}
