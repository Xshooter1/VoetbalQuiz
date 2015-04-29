/******************************************************************************\
**                            Dominique Rietveld                              **
**                            Student Avans Breda                             **
\******************************************************************************/

package soccerquiz.domain;

/**
 *
 * @author Dominique Rietveld
 */
public class Question {
    private String stadium, club;
    
    public Question (String stadium, String club){
        this.stadium = stadium;
        this.club = club;
    }
    
    public String getStadium(){
        return stadium;
    }
    
    public String getClub(){
        return club;
    }
}
