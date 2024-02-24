package basicmeeting.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basicmeeting.demo.model.Meeting;
import basicmeeting.demo.repository.MeetingRepo;

@Service
public class MeetingService {
    @Autowired
    MeetingRepo inforepo;
    public Meeting addprofileinfo(Meeting info){
        return inforepo.save(info);
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
}