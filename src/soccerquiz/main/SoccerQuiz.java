/******************************************************************************\
**                            Dominique Rietveld                              **
**                            Student Avans Breda                             **
\******************************************************************************/

package soccerquiz.main;

import javax.swing.JFrame;
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
        JFrame frame = new SoccerQuiz();

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Soccer Quiz" );
        frame.setContentPane( new GUI() );
        frame.setVisible( true );
        frame.pack();
    }

}
