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
    //take note of the student ID to check if answered previously
    List<String> studentVoters = new ArrayList<String>();
    
    //keeps count of the all responses to the answers
    private int[] count;
            
    //a Question object that will be either multiple or single depending on input
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
    
    //now that the question type has been decided, the actual question may be set
    public void setQuestion(String question)
    {
        this.question.setQuestion(question);
        System.out.println(this.question.getQuestion());
    }
    
    //now the candidates or answers to the question have been set
    public void configureCandidates(String[] answers)
    {
        this.question.setCandidates(answers);
        for (int i = 0; i < answers.length; i++)
        {
            System.out.println(answers[i]);
        }
        count = new int[answers.length];
    }
    
    //take a student and an answer, and if the student has answered before then
    //they aren't allowed to answer again, they're vote will stay the same. 
    //The options are not case sensitive and include a, b, c, d,right, and wrong
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
    
    //prints the results of the votes.
    public void printResults()
    {
        for (int i = 0; i < count.length; i++)
        {
            System.out.println(question.getCandidates()[i] + ": " + count[i]);
        }
        System.out.println();
    }
    
}
