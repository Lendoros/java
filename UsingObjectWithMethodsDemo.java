import javax.swing.*;

class MyClass
{
    static int counter = 0;
    static JTextArea textArea;

    MyClass(){
        counter++;
        textArea.append("Create " + counter + "\n");
    }
    
    static void show(){
        textArea.append("How much: " + counter + "\n");
    }
}

class UsingObjectWithMethodsDemo extends JFrame
{
    public UsingObjectWithMethodsDemo()
    {
        setTitle("Object Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        MyClass.textArea = new JTextArea();
        MyClass.textArea.setEditable(false);
        add(new JScrollPane(MyClass.textArea));
        
        setVisible(true);
        
        // Выполнение логики
        MyClass.show();
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();
        MyClass objC = new MyClass();
        MyClass.show();
        objB.show();
        objC.show();
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new UsingObjectWithMethodsDemo());
    }
}
