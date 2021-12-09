/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author thinker
 */
public class ResearchStud extends Student {

    private String topic;
    private int noofPapers;

    public ResearchStud(String topic, int noofPapers, int id, String name, String dept) {
        super(id, name, dept);
        this.topic = topic;
        this.noofPapers = noofPapers;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setNoofPapers(int noofPapers) {
        this.noofPapers = noofPapers;
    }

    public String getTopic() {
        return topic;
    }

    public int getNoofPapers() {
        return noofPapers;
    }
    
}
