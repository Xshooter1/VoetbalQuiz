/******************************************************************************\
**                            Dominique Rietveld                              **
**                            Student Avans Breda                             **
\******************************************************************************/

package soccerquiz.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import soccerquiz.logic.QuizManager;
import soccerquiz.presentation.GUI;

/**
 *
 * @author Dominique Rietveld
 */
public class SoccerQuiz extends JFrame{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new SoccerQuiz();

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Soccer Quiz" );
        JPanel panel = new GUI();
        frame.setContentPane( panel );
        frame.setVisible( true );
        frame.pack();
        
        QuizManager quiz = new QuizManager();
        System.out.println(quiz.getRandomClubName());
        System.out.println("" + quiz.getStadiumNames());
    }

}
