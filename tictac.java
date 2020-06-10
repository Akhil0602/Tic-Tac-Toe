import java.awt.*;
import java.awt.event.*;
public class tictac extends Frame implements ActionListener
{
    Button[] b=new Button[9];
    int c=0;
    public tictac()
    {
        setVisible(true);
        setSize(320,350);
        setLocation(200,100);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setLayout(null);
        setBackground(Color.black);
        int i,j,k=0,x=10,y=37;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[k]=new Button();
                b[k].setSize(100,100);
                b[k].setLocation(x,y);
                x+=100;
                b[k].addActionListener(this);
                add(b[k]);
                k++;
            }
            x=10;y+=100;
        }
        setFont(new Font("Algeria",Font.BOLD
        ,40));
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b1=(Button)e.getSource();
        if(c%2==0)
        b1.setLabel("X");
        else
        b1.setLabel("O");
        c++;
        b1.removeActionListener(this);
        if(b[0].getLabel()=="X"&&b[1].getLabel()=="X"&&b[2].getLabel()=="X"
            ||
            b[3].getLabel()=="X"&&b[4].getLabel()=="X"&&b[5].getLabel()=="X"
            ||
            b[6].getLabel()=="X"&&b[7].getLabel()=="X"&&b[8].getLabel()=="X"
            ||
            b[0].getLabel()=="X"&&b[3].getLabel()=="X"&&b[6].getLabel()=="X"
            || 
            b[1].getLabel()=="X"&&b[4].getLabel()=="X"&&b[7].getLabel()=="X"
            ||
            b[2].getLabel()=="X"&&b[5].getLabel()=="X"&&b[8].getLabel()=="X"
            ||
            b[0].getLabel()=="X"&&b[4].getLabel()=="X"&&b[8].getLabel()=="X"
            ||
            b[6].getLabel()=="X"&&b[4].getLabel()=="X"&&b[2].getLabel()=="X")
            {
                System.out.println("\u000CPlayer One wins");
                for(int i=0;i<9;i++)
                b[i].removeActionListener(this);
            }
            
            if(b[0].getLabel()=="O"&&b[1].getLabel()=="O"&&b[2].getLabel()=="O"
            ||
            b[3].getLabel()=="O"&&b[4].getLabel()=="O"&&b[5].getLabel()=="O"
            ||
            b[6].getLabel()=="O"&&b[7].getLabel()=="O"&&b[8].getLabel()=="O"
            ||
            b[0].getLabel()=="O"&&b[3].getLabel()=="O"&&b[6].getLabel()=="O"
            || 
            b[1].getLabel()=="O"&&b[4].getLabel()=="O"&&b[7].getLabel()=="O"
            ||
            b[2].getLabel()=="O"&&b[5].getLabel()=="O"&&b[8].getLabel()=="O"
            ||
            b[0].getLabel()=="O"&&b[4].getLabel()=="O"&&b[8].getLabel()=="O"
            ||
            b[6].getLabel()=="O"&&b[4].getLabel()=="O"&&b[2].getLabel()=="O")
            {
            System.out.println("\u000CPlayer Two wins");
            for(int i=0;i<9;i++)
             b[i].removeActionListener(this);
            }
    

    }
    public static void main(String args[])
    {
      tictac t=new tictac();
    }
}