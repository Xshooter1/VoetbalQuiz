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
    public ArrayList<Question> questions;
    private HashSet<String> stadiums;
    
    /**
     * Constructor
     */
    public QuizManager(){
        questions = new ArrayList<>();
        stadiums = new HashSet<>();
        
        newQuestion(new Question("Rat Verlegh Stadion","NAC Breda"));
        newQuestion(new Question("Riwal Hoogwerkers Stadion","FC Dordrecht"));
        newQuestion(new Question("De kuip","Feyenoord"));
        newQuestion(new Question("stadion Woudestein","Excelsior"));
        newQuestion(new Question("Amsterdam ArenA","Ajax"));
    }
    
    /**
     *
     * @param q question object
     */
    public void newQuestion(Question q){
        questions.add(q);
    }
    
    /**
     *
     * @return stadium names in a hashset with a string type
     */
    public HashSet<String> getStadiumNames(){
        for(Question q : questions){
            stadiums.add(q.getStadium());
        }
        return stadiums;
    }
    
    /**
     *
     * @return random clubname based on the questions arraylist length and a random number
     */
    public String getRandomClubName(){
        Random rand = new Random();
        int index = rand.nextInt(questions.size());
        String randomClub = questions.get(index).getClub();
        return randomClub;
    }
    
    /**
     *
     * @param stadiumName name of the selected stadium
     * @param clubName name of the club in the question
     * @return the result of checking the location of both parameters
     */
    public boolean check(String stadiumName, String clubName){
        if(clubName == null){
            clubName = "Default";
        }
        boolean a = false;
        for(Question q : questions){
            if(q.getStadium().equals(stadiumName) && q.getClub().equals(clubName)){
                a = true;
                break;
            }
            else
            {
                a = false;
            }
        }    
        return a;
    }
}
