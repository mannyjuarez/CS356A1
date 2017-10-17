/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iVote;

import java.util.*;

/**
 *
 * @author mannyjuarez
 */
public class iVoteService {
    List<String> studentVoters = new ArrayList<String>();
    private int[] count;
            
    private Question question;
    
    public void configureQuestion(String input)
    {
        if (input.equalsIgnoreCase("Multiple"))
        {
            this.question = new MultipleChoice();
            
        }
        else if (input.equalsIgnoreCase("True/False"))
        {
            this.question = new TrueFalse();
        }
    }
    
    public void setQuestion(String question)
    {
        this.question.setQuestion(question);
        System.out.println(this.question.getQuestion());
    }
    
    public void configureCandidates(String[] answers)
    {
        this.question.setCandidates(answers);
        for (int i = 0; i < answers.length; i++)
        {
            System.out.println(answers[i]);
        }
        count = new int[answers.length];
    }
    
    public void takeAnswers(Student student, String answer)
    {
        if (studentVoters.contains(student.getStudentID())) {}
        else
        {
            studentVoters.add(student.getStudentID());
            if (answer.equalsIgnoreCase("a"))
                count[0]++;
            else if (answer.equalsIgnoreCase("b"))
                count[1]++;
            else if (answer.equalsIgnoreCase("c"))
                count[2]++;
            else if (answer.equalsIgnoreCase("d"))
                count[3]++;
            else if (answer.equalsIgnoreCase("right"))
                count[0]++;
            else if (answer.equalsIgnoreCase("wrong"))
                count[1]++;  
        }
    }
    
    public void printResults()
    {
        for (int i = 0; i < count.length; i++)
        {
            System.out.println(question.getCandidates()[i] + ": " + count[i]);
        }
        System.out.println();
    }
    
}
