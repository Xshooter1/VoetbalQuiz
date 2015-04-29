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
    
    /**
     * Constructor for a new question
     * @param stadium name of the stadium as string
     * @param club name of the club as string
     */
    public Question (String stadium, String club){
        this.stadium = stadium;
        this.club = club;
    }
    
    /**
     *
     * @return stadium name
     */
    public String getStadium(){
        return stadium;
    }
    
    /**
     *
     * @return club name
     */
    public String getClub(){
        return club;
    }
}
