/******************************************************************************\
**                            Dominique Rietveld                              **
**                            Student Avans Breda                             **
\******************************************************************************/

package soccerquiz.presentation;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.util.HashSet;
import javax.swing.*;
import soccerquiz.domain.Question;
import soccerquiz.logic.QuizManager;

/**
 *
 * @author Dominique Rietveld
 */
public class GUI extends Container{
    private JButton button1, button2, button3;
    private JTextField question;
    private JTextArea result;
    private JLabel label1, label2, label3;
    private JComboBox answer;
    private QuizManager quiz;
    private JPanel north,centre,south;

    /**
     * Constructor
     */
    public GUI() {
        setLayout(new BorderLayout());
        
        quiz = new QuizManager();
        north = new JPanel();
        centre = new JPanel();
        south = new JPanel();
        
        button1 = new JButton( "Nieuw" );
        button1.addActionListener( new New() );
        
        button2 = new JButton( "Controleer" );
        button2.addActionListener( new Check() );
        
        button3 = new JButton( "Sluiten" );
        button3.addActionListener( new Close() );
        
        question = new JTextField( 10 );
        question.setEditable(false);
        
        result = new JTextArea( 3, 20 );
        result.setEditable(false);
        result.setLineWrap(true);
        
        label1 = new JLabel("Hoe heet het stadion van");
        label2 = new JLabel("Antwoord");
        label3 = new JLabel("Feedback");
        
        answer = new JComboBox();
        for(String s : quiz.getStadiumNames()){
            answer.addItem(s);
        }
        
        add(north, BorderLayout.NORTH);
        add(centre, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        
        north.add( label1 );
        north.add( question );
        north.add( button1 );
        
        centre.add( label2 );
        centre.add( answer );
        centre.add( button2 );
        
        south.add( label3 );
        south.add( result );
        south.add( button3 );
        
    }

    class New implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            question.setEditable(true);
            String randclub = quiz.getRandomClubName();
            question.setText(randclub);
            question.setEditable(false);
        }
    }
    
    class Check implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            boolean check = quiz.check((String) answer.getSelectedItem(), question.getText());
            String s = "onbekend";
            if(check != true){
                for(Question q : quiz.questions){
                if(q.getClub().equals(question.getText())){
                    s = q.getStadium();
                }
            }
                result.setText("Fout geantwoord, het juiste antwoord was " + s + ".");
            }
            else
            {
                result.setText("Antwoord juist");
            }
        }
    }
    
    class Close implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            System.exit(0);
        }
    }
}
