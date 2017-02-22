
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
public class Participants {
    private String name;
    private String id;
    private ArrayList<Sports> sports;

    public Participants(String name, String id) {
        this.name = name;
        this.id = id;
        this.sports = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }
    
    public boolean addSport(Sports sport){
        for(Sports temp : this.sports) {
            if(temp.getName().equalsIgnoreCase(sport.getName())){
                return false;
            }
        }
        this.sports.add(sport);
        return true;
}
    public boolean removeSport(Sports sport){
        for(Sports temp : this.sports) {
            if(temp.getName().equalsIgnoreCase(sport.getName())){
                this.sports.remove(temp);
            }
        }
        return false;
}
    
    public String getSports() {
        String list="Sports=";
        for (Sports temp : this.sports) {
            list+=temp.getName()+",";
        }
        list=list.substring(0, list.length()-1);
        return list;
    }
    public String getParticipants(){
        return "Name="+this.name+", Id="+this.id;
    }
    @Override
    public String toString(){
        return "Name="+this.name+", Id="+this.id+", "+getSports();
}

    void remove(Participants temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
