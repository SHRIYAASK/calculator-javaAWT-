
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Calculator extends Frame implements ActionListener{
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,div,addi,mul,sub,root,power,AC,CE,equals;
        Label l1,l2,l3;
        TextField content;
        String tocalculate="";
        int currentNumber,total=0,a;
        String operation,str="",lastOperation ,lt;
        public Calculator()
        {
            setLayout(null);
            //label 
            
            l1= new Label();
            l1.setBounds(150, 35,100, 10);
            add(l1);
            l1.setText(""+tocalculate);
            // Text field
            content = new TextField();
            content.setBounds(20,50, 190, 40);
           // ((Label) content).setAlignment(RIGHT_ALIGNMENT);
            add(content);
            // square root
            root= new Button("squr");
            root.setBounds(20, 100, 40, 40);
            add(root);
            root.addActionListener(this);
            // no 1
            b1= new Button("1");
            b1.setBounds(20, 150, 40, 40);
            add(b1);
            b1.addActionListener(this);
        //  no4
            b4= new Button("4");
            b4.setBounds(20, 200, 40, 40);
            add(b4);
            b4.addActionListener(this);
            // no7
            b7 =new Button("7");
            b7.setBounds(20 , 250, 40, 40);
            add(b7);
            b7.addActionListener(this);
            // div
            div=new Button("/");
            div.setBounds(20, 300, 40, 40);
            add(div);
            div.addActionListener(this);
            // power
            power=new Button("^");
            power.setBounds(70, 100, 40, 40);
            add(power);
            power.addActionListener(this);
            // no2
            b2=new Button("2");
            b2.setBounds(70, 150, 40, 40);
            add(b2);
            b2.addActionListener(this);
            // no5
            b5=new Button("5");
            b5.setBounds(70, 200, 40, 40);
            add(b5);
            b5.addActionListener(this);
            // no 8
            b8=new Button("8");
            b8.setBounds(70, 250, 40, 40);
            add(b8);
            b8.addActionListener(this);
            // no 0
            b0=new Button("0");
            b0.setBounds(70, 300, 40, 40);
            add(b0);
            b0.addActionListener(this);
            //AC
            AC=new Button("AC");
            AC.setBounds(120, 100, 40, 40);
            add(AC);
            AC.addActionListener(this);
            //no 3
            b3=new Button("3");
            b3.setBounds(120, 150, 40, 40);
            add(b3);
            b3.addActionListener(this);
            //no 6
            b6=new Button("6");
            b6.setBounds(120, 200, 40, 40);
            add(b6);
            b6.addActionListener(this);
            //no 9
            b9=new Button("9");
            b9.setBounds(120, 250, 40, 40);
            add(b9);
            b9.addActionListener(this);
            //equals
            equals=new Button("=");
            equals.setBounds(120, 300, 90, 40);
            add(equals);
            equals.addActionListener(this);
            // button CE
            CE=new Button("CE");
            CE.setBounds(170, 100, 40, 40);
            add(CE);
            CE.addActionListener(this);
            // add
            addi=new Button("+");
            addi.setBounds(170, 150, 40, 40);
            add(addi);
            addi.addActionListener(this);
            // sub
            sub=new Button("-");
            sub.setBounds(170, 200, 40, 40);
            add(sub);
            sub.addActionListener(this);
            // mul
            mul=new Button("x");
            mul.setBounds(170, 250, 40, 40);
            add(mul);
            mul.addActionListener(this);
            //label history
            l3=new Label("history:");
            l3.setBounds(20,350,100,15);
            add(l3);
            l2=new Label();
            l2.setBounds(150, 370, 100,10);
            add(l2);
            // windowclosing
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we)
                {
                    dispose();
                }
            });
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
        str =ae.getActionCommand();
        //System.out.println("str"+str);
        if(str.equals("1"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("2"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("3"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("4"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("5"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("6"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("7"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("8"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("9"))
        {
            content.setText(content.getText()+str);
        }
        else if(str.equals("0"))
        {
            content.setText(content.getText()+str);
        }
        else if (str.equals("AC")) {
            content.setText("");
            l1.setText("");
            l2.setText("");
            total = 0;
            lastOperation = "+";
        } 
        // Handle CE
        else if (str.equals("CE")) {
            if (!content.getText().isEmpty()) {
                content.setText(content.getText().substring(0, content.getText().length() - 1));
            }
        }
        else if(content.getText().equals(""))
        {
            content.setText("");
            l1.setText("");
            System.out.println("Syntax error");
        }
        else 
        {
            System.out.println("hello");
            if (str.equals("+") || str.equals("-") || str.equals("x") || str.equals("/")||str.equals("^") ) {
                System.out.println("hello");
                if (!(content.getText().isEmpty())) {
                    currentNumber = Integer.parseInt(content.getText());
                    System.out.println("current number"+currentNumber);
                    lastOperation=str;
                    System.out.println("last operation"+lastOperation);
                    //l1.setText("");
                    // Perform the previous operation
                    switch (lastOperation) {
                        case "+":
                            total += currentNumber;
                            System.out.println("total:"+total);
                            lt="+";
                           // content.setText(total+"");
                            break;
                        case "-":
                            if(total>0)
                            {
                                total-=currentNumber;
                            }
                            else
                            {
                                total=currentNumber;
                            }
                            lt="-";
                            System.out.println("total:"+total);
                            //content.setText(total+"");
                            break;
                        case "x":
                            total=1;
                            total *= currentNumber;
                            lt="x";
                            break;
                        case "/":
                            if (currentNumber != 0) {
                                total /= currentNumber;
                            } else {
                                content.setText("Error: Divide by zero");
                                return;
                            }
                            break;
                        case "^":
                            total=currentNumber;
                            lt="^";
                            break;
                    }
                    
                }
                // Update the display
                l1.setText(l1.getText() + content.getText() + str);
                content.setText("");
        
                // Update last operation
                lastOperation = lt;
                System.out.println("lt="+lastOperation);
                // Show result if "=" is pressed
                //l1.setText("");
                
            }   
            if (str.equals("=")) {
                 System.out.println("lt"+lt);
                System.out.println(content.getText());
                if(lt.equals("+"))
                {
                    int a=Integer.parseInt(content.getText());
                    System.out.println("a: "+a);
                    total+=a;
                    System.out.println(total);
                }
                else if(lt.equals("-"))
                {
                    int a=Integer.parseInt(content.getText());
                    System.out.println("a: "+a);
                    total-=a;
                    System.out.println(total);
                }
                else if(lt.equals("x"))
                {
                    a=Integer.parseInt(content.getText());
                    System.out.println("a"+a);
                    total*=a;
                    System.out.println(total);
                }
                else if(lt.equals("^"))
                {
                    a=Integer.parseInt(content.getText());
                    System.out.println("a"+a);
                    total=(int) Math.pow(total,a);
                    System.out.println(total);
                }
                System.out.println("a"+a);
                l2.setText(l1.getText() + content.getText() + str);
                l1.setText("");
                content.setText("");
                content.setText(String.valueOf(total));
                total = 0;
                // Reset total for next calculation
                lastOperation = "+"; // Reset last operation
            }
        }
    }
}
