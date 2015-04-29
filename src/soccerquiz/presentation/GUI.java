/******************************************************************************\
**                            Dominique Rietveld                              **
**                            Student Avans Breda                             **
\******************************************************************************/

package soccerquiz.presentation;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Dominique Rietveld
 */
public class GUI extends JPanel{
    private JButton knop;
    private JTextField uitkomst;

    public GUI() {
        knop = new JButton( "Verstuur" );
        Bevolking kh = new Bevolking();
        knop.addActionListener( kh );
        uitkomst = new JTextField( 10 );
        add( knop );
        add( uitkomst );
    }

    class Bevolking implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            double bevolking = Double.parseDouble(uitkomst.getText());
            bevolking = bevolking * 1.02;
            uitkomst.setText( String.valueOf(bevolking));
        }
    }

}
