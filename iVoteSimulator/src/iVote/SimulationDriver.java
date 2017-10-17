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
        vote.printResults();
        vote = new iVoteService();
        type = "multiple";
        vote.configureQuestion(type);
        question = "What year was I born?";
        vote.setQuestion(question);
        String[] choices = new String[4];
        choices[0] = "a. 2000";
        choices[1] = "b. 1990";
        choices[2] = "c. 1994";
        choices[3] = "d. 1996";
        vote.configureCandidates(choices);
        student = new Student();
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
        vote.printResults();
    }
}
