/******************************************************************************\
**                            Dominique Rietveld                              **
**                            Student Avans Breda                             **
\******************************************************************************/

package soccerquiz.logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import soccerquiz.domain.Question;

/**
 *
 * @author Dominique Rietveld
 */
public class QuizManager {
    private ArrayList<Question> questions;
    private HashSet<String> stadiums;
    
    public QuizManager(){
        questions = new ArrayList<>();
        stadiums = new HashSet<>();
        
        newQuestion(new Question("Rat Verlegh Stadion","NAC Breda"));
        newQuestion(new Question("Riwal Hoogwerkers Stadion","FC Dordrecht"));
        newQuestion(new Question("De kuip","Feyenoord"));
        newQuestion(new Question("stadion Woudestein","Excelsior"));
        newQuestion(new Question("Amsterdam ArenA","Ajax"));
    }
    
    public void newQuestion(Question q){
        questions.add(q);
    }
    
    public HashSet<String> getStadiumNames(){
        for(Question q : questions){
            stadiums.add(q.getStadium());
        }
        return stadiums;
    }
    
    public String getRandomClubName(){
        Random rand = new Random();
        int index = rand.nextInt(questions.size());
        String randomClub = questions.get(index).getClub();
        return randomClub;
    }
    
    public boolean check(String stadiumName, String clubName){
        return false;
    }
}
