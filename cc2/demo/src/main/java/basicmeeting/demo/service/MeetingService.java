package basicmeeting.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basicmeeting.demo.model.Meeting;
import basicmeeting.demo.model.userAdmin;
import basicmeeting.demo.repository.MeetingRepo;
import basicmeeting.demo.repository.userAdminRepo;

@Service
public class MeetingService {
    @Autowired
    MeetingRepo inforepo;


    @Autowired userAdminRepo meet;

    public userAdmin addprofileinfo(userAdmin info){
        return meet.save(info);
    }
    public List<Meeting> getprofileinfo(){
        return inforepo.findAll();
    }
   
    public Meeting changehostkey(Long meetingid,Meeting info){
        Meeting meetAvail = inforepo.findById(meetingid).orElse(null);   
        if(meetAvail!=null){
            meetAvail.setHostkey(info.getHostkey());
            return inforepo.saveAndFlush(meetAvail);
        }
        else
        return null;
    }
    public String deleteinfo(Long meetingid){
        inforepo.deleteById(meetingid);
        return ("User deleted");
    }

    public List<userAdmin> getall()
    {
        return meet.selectall();
    }
}