/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iVote;

/**
 *
 * @author mannyjuarez
 */
public class Student {
    //student contains an ID and the answer they've given, all private
    //with getter and setter methods
    private String studentID;
    private String answer;
    
    public void setStudentID(String ID)
    {
        studentID = ID;
    }
    
    public String getStudentID()
    {
        return studentID;
    }
    
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    
    public String getAnswer()
    {
        return answer;
    }
    
    
}
