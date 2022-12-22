import javax.swing.* ;
import java.awt.event.* ;
import java.awt.* ;




public class MyFenetre extends JFrame implements MouseListener,ActionListener {
    JLabel topLabel = new JLabel("Hello Student") ;
    MyFenetre (){
        JPanel container = new JPanel() ;
        container.setLayout(new BorderLayout());
        JPanel top = new JPanel() ;
        JPanel bottom = new JPanel () ;
        JPanel mid = new JPanel() ;
        JPanel left= new JPanel () ;
        JPanel right = new JPanel() ;

        JButton bottomBoutton1 = new JButton("Submit") ;
        JButton bottomBoutton2 = new JButton("Reset") ;
        JButton bottomBoutton3 = new JButton("Switch") ;


        JLabel topLabel = new JLabel("Hello Student ");
        JLabel leftLabel= new JLabel("EP");
        JLabel rightLabel = new JLabel("WELCOME");

        JLabel midLabel1 = new JLabel("1");
        JLabel midLabel2= new JLabel("2");
        JLabel midLabel3 = new JLabel("3");
        JLabel midLabel4= new JLabel("4");

        left.add(leftLabel) ;
        right.add(rightLabel) ;
        bottom.add(bottomBoutton1) ;
        bottom.add(bottomBoutton2) ;
        bottom.add(bottomBoutton3) ;

        container.add(top, BorderLayout.NORTH) ;
        container.add(mid, BorderLayout.CENTER) ;
        container.add(bottom, BorderLayout.SOUTH) ;
        container.add(left, BorderLayout.WEST) ;
        container.add(right, BorderLayout.EAST) ;
        add(container) ;
        setSize(500,500);

        setVisible(true);







    }






    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
