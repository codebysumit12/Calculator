//MyApplet.java
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;//ActionListener

/*
<applet code="calc.class" width="500" height="500" >
</applet>
*/


public class calc extends Applet implements ActionListener
{
TextField a;
Button b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,ab,ac;
double a4,b4,c4;
char op;

public void init()
{
setLayout(null);
a=new TextField(40);
b=new Button("ABS");
c=new Button("Backspace");
d=new Button("Clear");
e=new Button("7");
f=new Button("8");
g=new Button("9");
h=new Button("+");
i=new Button("%");
j=new Button("4");
k=new Button("5");
l=new Button("6");
m=new Button("-");
n=new Button("=");
o=new Button("1");
p=new Button("2");
q=new Button("3");
r=new Button("*");
s=new Button("SQRT");
t=new Button("0");
u=new Button(".");
v=new Button("+/-");
w=new Button("/");
x=new Button("1/X");


y=new Button("Sin");
y.setForeground(Color.white);

z=new Button("Cos");
z.setForeground(Color.white);

ab=new Button("Tan");
ab.setForeground(Color.white);

ac=new Button("Log");
ac.setForeground(Color.white);



setBackground(Color.gray);




add(a);
add(b);
add(c);
add(d);
add(e);
add(f);
add(g);
add(h);
add(i);
add(j);
add(k);
add(l);
add(m);
add(n);
add(o);
add(p);
add(q);
add(r);
add(s);
add(t);
add(u);
add(v);
add(w);
add(x);
add(y);
add(z);
add(ab);
add(ac);

b.setBackground(Color.yellow);
c.setBackground(Color.yellow);
d.setBackground(Color.yellow);
e.setBackground(Color.pink);
f.setBackground(Color.pink);
g.setBackground(Color.pink);
h.setBackground(Color.green);
i.setBackground(Color.green);
j.setBackground(Color.pink);
k.setBackground(Color.pink);
l.setBackground(Color.pink);
m.setBackground(Color.green);
n.setBackground(Color.green);
o.setBackground(Color.pink);
p.setBackground(Color.pink);
q.setBackground(Color.pink);
r.setBackground(Color.green);
s.setBackground(Color.green);
t.setBackground(Color.pink);
u.setBackground(Color.pink);
v.setBackground(Color.pink);
w.setBackground(Color.green);
x.setBackground(Color.green);
y.setBackground(Color.blue);
z.setBackground(Color.blue);
ab.setBackground(Color.blue);
ac.setBackground(Color.blue);






a.setBounds(50,50,400,50);
b.setBounds(50,120,120,50);
c.setBounds(190,120,120,50);
d.setBounds(330,120,120,50);
e.setBounds(50,190,75,30);
f.setBounds(145,190,75,30);
g.setBounds(240,190,75,30);
h.setBounds(335,190,50,30);
i.setBounds(395,190,50,30);
j.setBounds(50,240,75,30);
k.setBounds(145,240,75,30);
l.setBounds(240,240,75,30);
m.setBounds(335,240,50,30);
n.setBounds(395,240,50,30);
o.setBounds(50,290,75,30);
p.setBounds(145,290,75,30);
q.setBounds(240,290,75,30);
r.setBounds(335,290,50,30);
s.setBounds(395,290,50,30);
t.setBounds(50,340,75,30);
u.setBounds(145,340,75,30);
v.setBounds(240,340,75,30);
w.setBounds(335,340,50,30);
x.setBounds(395,340,50,30);
y.setBounds(50,390,85,30);
z.setBounds(155,390,85,30);
ab.setBounds(260,390,85,30);
ac.setBounds(360,390,85,30);


b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
e.addActionListener(this);
f.addActionListener(this);
g.addActionListener(this);
h.addActionListener(this);
i.addActionListener(this);
j.addActionListener(this);
k.addActionListener(this);
l.addActionListener(this);
m.addActionListener(this);
n.addActionListener(this);
o.addActionListener(this);
p.addActionListener(this);
q.addActionListener(this);
s.addActionListener(this);
t.addActionListener(this);
u.addActionListener(this);
v.addActionListener(this);
w.addActionListener(this);
x.addActionListener(this);
y.addActionListener(this);
z.addActionListener(this);
ab.addActionListener(this);
ac.addActionListener(this);






}//init()


public void actionPerformed(ActionEvent e1)
{
String s1=e1.getActionCommand();//"1"

if(s1.equals("1"))
{

String s4=a.getText().concat("1");

a.setText(s4);
}


if(s1.equals("2"))
{
String s4=a.getText().concat("2");
a.setText(s4);
}

if(s1.equals("3"))
{
String s4=a.getText().concat("3");
a.setText(s4);
}

if(s1.equals("4"))
{
String s4=a.getText().concat("4");
a.setText(s4);
}

if(s1.equals("5"))
{
String s4=a.getText().concat("5");
a.setText(s4);
}

if(s1.equals("6"))
{
String s4=a.getText().concat("6");
a.setText(s4);
}

if(s1.equals("7"))
{
String s4=a.getText().concat("7");
a.setText(s4);
}

if(s1.equals("8"))
{
String s4=a.getText().concat("8");
a.setText(s4);
}

if(s1.equals("9"))
{
String s4=a.getText().concat("9");
a.setText(s4);
}

if(s1.equals("0"))
{
String s4=a.getText().concat("0");
a.setText(s4);
}

if(s1.equals("."))
{
String s4=a.getText().concat(".");
a.setText(s4);
}

if(s1.equals("Clear"))
{

a.setText("");
}

if(s1.equals("+"))
{
a4=Double.parseDouble(a.getText());
a.setText("");
op='+';
}

if(s1.equals("-"))
{
a4=Double.parseDouble(a.getText());
a.setText("");
op='-';
}

if(s1.equals("*"))
{
a4=Double.parseDouble(a.getText());
a.setText("");
op='*';
}

if(s1.equals("/"))
{
a4=Double.parseDouble(a.getText());
a.setText("");
op='/';
}

if(s1.equals("%"))
{
a4=Double.parseDouble(a.getText());
a.setText("");
op='%';
}


if(s1.equals("SQRT"))
{
}

if(s1.equals("1/X"))
{
}



if(s1.equals("="))
{
b4=Double.parseDouble(a.getText());
a.setText("");

switch(op)
{
case '+':
c4=a4+b4;
a.setText(""+c4);
break;

case '-':
c4=a4-b4;
a.setText(""+c4);
break;

case '*':
c4=a4*b4;
a.setText(""+c4);
break;


case '%':
c4=a4%b4;
a.setText(""+c4);
break;

case '/':
c4=a4/b4;
a.setText(""+c4);
break;

}//swich
}//=


if(s1.equals("SQRT"))
{
a4=Double.parseDouble(a.getText());
b4=Math.sqrt(a4);
a.setText(""+b4);
}

if(s1.equals("ABS"))
{
a4=Double.parseDouble(a.getText());
b4=Math.abs(a4);
a.setText(""+b4);
}

if(s1.equals("+/-"))
{
a4=Double.parseDouble(a.getText());
b4=-1.0*(a4);
a.setText(""+b4);
}

if(s1.equals("Sin"))
{
a4=Double.parseDouble(a.getText());
b4=-Math.sin((a4*Math.PI)/180.0);
a.setText(""+b4);
}

if(s1.equals("Cos"))
{
a4=Double.parseDouble(a.getText());
b4=-Math.cos((a4*Math.PI)/180.0);
a.setText(""+b4);
}

if(s1.equals("Tan"))
{
a4=Double.parseDouble(a.getText());
b4=-Math.tan((a4*Math.PI)/180.0);
a.setText(""+b4);
}

if(s1.equals("Log"))
{
a4=Double.parseDouble(a.getText());
b4=-Math.log((a4)/180.0);
a.setText(""+b4);
}

if(s1.equals("1/X"))
{
a4=Double.parseDouble(a.getText());
b4=1.0/a4;
a.setText(""+b4);
}

if(s1.equals("Backspace"))
{
int a4=Integer.parseInt(a.getText());
int b4=a4/10;
a.setText(""+b4);
}





}
}