
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class Sports {
    private String name;
    private ArrayList<Participants> participants;

    public Sports(String name) {
        this.name = name;
        this.participants= new ArrayList();
    }

    public String getName() {
        return this.name;
    }
    
    public boolean addParticipants(Participants participants){
        for(Participants temp : this.participants) {
            if(temp.getName().equalsIgnoreCase(participants.getName())){
                return false;
            }
        }
        this.participants.add(participants);
        participants.addSport(this);
        return true;
    }
    public boolean removeParticipants(Participants participants){
        for(Participants temp : this.participants) {
            if(temp.getName().equalsIgnoreCase(participants.getName())){
                participants.remove(temp);
                return true;
            }
        } return false;
}
    @Override
    public String toString(){
        String string="Sport="+this.getName()+"\nAttendees={\n";
        for (Participants student : participants) {
            string+="\t Name="+student.getName()+",ID="+student.getId()+"\n";
        }
        string += "\t }";
        return string;
}
}
