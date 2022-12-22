import org.jetbrains.annotations.NotNull;

import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
import javax.swing.event.MouseInputListener ;
public class MyApp extends JFrame implements MouseInputListener, ActionListener {

     JLabel topLabel = new JLabel();
    JPanel top =new JPanel();
    JPanel mid = new JPanel();
    JPanel bottom = new JPanel()  ;
    JPanel left = new JPanel() ;
    JPanel right = new JPanel();


    JLabel leftLabel = new JLabel() ;
    JLabel rightLabel =new JLabel() ;
    JLabel midLabel =new JLabel() ;
    JLabel midLabel2 = new JLabel()  ;
    JLabel midLabel3  = new JLabel();
    JLabel midLabel4  =new JLabel() ;

    JButton bottomBoutton1  = new JButton() ;
    JButton bottomBouton2 = new JButton()  ;
    JButton topBoutton =new JButton() ;

    public MyApp(){
        JPanel container = new JPanel() ;

        container.setLayout(new BorderLayout());


        JPanel top = new JPanel() ;
        JPanel mid= new JPanel() ;
        JPanel bottom  =new JPanel() ;
        JPanel left  =new JPanel() ;
        JPanel right =new JPanel() ;

        JLabel topLabel = new JLabel("Hello Steudent ") ;
        JLabel leftLabel = new JLabel("EP ") ;
        JLabel rightLabel = new JLabel("welcome ") ;
        JLabel midLabel = new JLabel("1 ") ;
        JLabel midLabel2 = new JLabel("2 ") ;
        JLabel midLabel3 = new JLabel("3 ") ;
        JLabel midLabel4 = new JLabel("4 ") ;

        this.addMouseListener(this);
        JButton bottomBoutton1 = new JButton("Submit") ;
        JButton bottomBouton2 = new JButton("Reset") ;
        JButton topBoutton = new JButton("Switch") ;
        topBoutton.addActionListener(this);

        mid.setLayout(new GridLayout(2,2) ) ;
        top.add(topLabel) ;
        mid.add(midLabel) ;
        mid.add(midLabel2) ;
        mid.add(midLabel3) ;
        mid.add(midLabel4) ;

        left.add(leftLabel) ;
        right.add(rightLabel) ;
        bottom.add(bottomBoutton1) ;
        bottom.add(bottomBouton2) ;

        container.add(top, BorderLayout.NORTH) ;
        container.add(mid , BorderLayout.CENTER) ;
        container.add(bottom, BorderLayout.SOUTH) ;
        container.add(left , BorderLayout.WEST ) ;
        container.add(right , BorderLayout.EAST) ;
        add(container) ;
        setSize(500,500) ;
        setVisible(true) ;
    }


    /**
     * @param e the event to be processed
     */
    public void mouseClicked(MouseEvent e){


        int x =e.getX();
        int y = e.getY() ;
        int sx = e.getXOnScreen() ;
        int sy =e.getYOnScreen() ;
        JOptionPane.showMessageDialog(null ,"x = "+x+ "y = "+y +"\n" + "xScreen = "+sx +"yScreen = " + sy) ;
    }


    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        topLabel.setForeground(Color.red) ;

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
