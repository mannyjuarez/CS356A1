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
public class TrueFalse implements Question{
    private String question;
    private String[] candidates = new String[2];
    
    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public void setCandidates(String[] answers) {
        for (int i = 0; i < candidates.length; i ++)
        {
            candidates[i] = answers[i];
        }
    }
    
    public String[] getCandidates()
    {
        return candidates;
    }
}
