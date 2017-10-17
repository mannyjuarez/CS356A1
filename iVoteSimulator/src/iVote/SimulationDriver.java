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
public class SimulationDriver {
    
    public static void main(String[] args)
    {
        //create a service that will use a true/false style
        //set the question and potential answers
        iVoteService vote = new iVoteService();
        String type = "true/false";
        vote.configureQuestion(type);
        String question = "Is a dog a feline?";
        vote.setQuestion(question);
        String[] answers = new String[2];
        answers[0] = "1. right";
        answers[1] = "2. wrong";
        vote.configureCandidates(answers);
        Student student = new Student();
        
        //generate a random ID and a random answer
        int ID;
        int random;
        for (int i = 0; i < 20; i++)
        {
            ID = ((int)(Math.random() * 10));
            String str = "" + ID;
            random = (int)(Math.random()*2);
            student.setStudentID(str);
            if (random == 0)
            {
                vote.takeAnswers(student,"right");
            }
            else
            {
                vote.takeAnswers(student, "wrong");
            }
        }
        
        //print results
        vote.printResults();
        
        //create a new service for multiple choice
        vote = new iVoteService();
        type = "multiple";
        vote.configureQuestion(type);
        
        //configure the question and answers
        question = "What year was I born?";
        vote.setQuestion(question);
        String[] choices = new String[4];
        choices[0] = "a. 2000";
        choices[1] = "b. 1990";
        choices[2] = "c. 1994";
        choices[3] = "d. 1996";
        vote.configureCandidates(choices);
        student = new Student();
        
        //create 20 different instances of the student to answer the question
        //but allow the random ID to be between 0-30 for there to be a chance of
        //a repeat. Answers are also randomly generated, somewhere between 0-4 
        //to allow the 4 options. D ends up having a higher probability of occuring
        for (int i = 0; i < 20; i++)
        {
            ID = ((int)(Math.random() * 30));
            String str = "" + ID;
            random = (int)(Math.random()*4);
            student.setStudentID(str);
            if (random == 0)
            {
                vote.takeAnswers(student,"a");
            }
            else if (random == 1)
            {
                vote.takeAnswers(student, "b");
            }
            else if (random == 2)
            {
                vote.takeAnswers(student, "c");
            }
            else
                vote.takeAnswers(student, "d");
        }
        
        //print results
        vote.printResults();
    }
}
