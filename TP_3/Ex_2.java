import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;
import javax.swing.event.*;

import javax.swing.event.MouseInputListener;





public class Ex_2 extends JFrame implements ActionListener{

    ImageIcon nature = new ImageIcon("/home/lamis_/Pictures/download.jpeg") ;
    ImageIcon sea = new ImageIcon("/home/lamis_/Pictures/sea.jpeg") ;
    ImageIcon mountain = new ImageIcon("/home/lamis_/Pictures/montains.jpg") ;
    ImageIcon sun = new ImageIcon("/home/lamis_/Pictures/sun.jpg") ;

    JPanel left = new JPanel() ;
    JPanel right = new JPanel() ;
    JPanel container= new JPanel() ;
    JButton buttom1 = new JButton("nature") ;
    JButton buttom2 = new JButton("Sun") ;
    JButton buttom3 = new JButton("Sea") ;
    JButton buttom4 = new JButton("Mountain") ;


    JLabel imageLabel = new JLabel("image") ;
    Ex_2(){
        setSize(500 , 500) ;
        setVisible(true);
        add(container) ;
        container.setLayout(new GridLayout(1,1));
        container.add(left) ;
        container.add(right) ;
        left.setLayout(new GridLayout(4,1)) ;
        left.add(buttom1) ;
        left.add(buttom2) ;
        left.add(buttom3) ;
        left.add(buttom4) ;
        right.add(imageLabel) ;
        buttom1.addActionListener(this);
        buttom2.addActionListener(this);
        buttom3.addActionListener(this);
        buttom4.addActionListener(this);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource()==buttom1) ;
        if(e.getSource()==buttom1) imageLabel.setIcon(nature) ;
        if(e.getSource()==buttom2) imageLabel.setIcon(sea) ;
        if(e.getSource()==buttom3) imageLabel.setIcon(sun) ;
        if(e.getSource()==buttom4) imageLabel.setIcon(mountain) ;

    }


}
