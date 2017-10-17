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
public interface Question {
    //methods to override
    public void setQuestion(String question);
    
    public String getQuestion();
    
    public void setCandidates(String[] answers);
    
    public String[] getCandidates();
}
