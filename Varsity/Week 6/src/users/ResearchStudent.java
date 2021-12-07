/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author USER
 */
public class ResearchStudent extends Student {

    private String ResearchTopic;
    private int noOfPapers;

    public ResearchStudent(String name, String nationality, String bg, int id, float cgpa, String department, String ResearchTopic, int noOfPapers) {
        super(name, nationality, bg, id, cgpa, department);
        this.ResearchTopic = ResearchTopic;
        this.noOfPapers = noOfPapers;
    }

    public String getResearchTopic() {
        return ResearchTopic;
    }

    public void setResearchTopic(String ResearchTopic) {
        this.ResearchTopic = ResearchTopic;
    }

    public int getNoOfPapers() {
        return noOfPapers;
    }

    public void setNoOfPapers(int noOfPapers) {
        this.noOfPapers = noOfPapers;
    }

    public void showall() {
        showinfo();
        System.out.println("And his Research topic is = " + ResearchTopic);
    }
}
