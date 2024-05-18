import javax.swing.*;
public class ventana extends JFrame {
    public ventana() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        JTextField pantalla = new JTextField();
        pantalla.setBounds(10, 10, 360, 50);
        panel.add(pantalla);
        JButton boton1 = new JButton("1");
        boton1.setBounds(10, 70, 80, 80);
        panel.add(boton1);
        JButton boton2 = new JButton("2");
        boton2.setBounds(100, 70, 80, 80);
        panel.add(boton2);
        JButton boton3 = new JButton("3");
        boton3.setBounds(190, 70, 80, 80);
        panel.add(boton3);
        JButton boton4 = new JButton("4");
        boton4.setBounds(10, 160, 80, 80);
        panel.add(boton4);
        JButton boton5 = new JButton("5");
        boton5.setBounds(100, 160, 80, 80);
        panel.add(boton5);
        JButton boton6 = new JButton("6");
        boton6.setBounds(190, 160, 80, 80);
        panel.add(boton6);
        JButton boton7 = new JButton("7");
        boton7.setBounds(10, 250, 80, 80);
        panel.add(boton7);
        JButton boton8 = new JButton("8");
        boton8.setBounds(100, 250, 80, 80);
        panel.add(boton8);
        JButton boton9 = new JButton("9");
        boton9.setBounds(190, 250, 80, 80);
        panel.add(boton9);
        JButton boton0 = new JButton("0");
        boton0.setBounds(100, 340, 80, 80);
        panel.add(boton0);
        JButton botonSuma = new JButton("+");
        botonSuma.setBounds(280, 70, 80, 80);
        panel.add(botonSuma);
        JButton botonResta = new JButton("-");
        botonResta.setBounds(280, 160, 80, 80);
        panel.add(botonResta);
        JButton botonMultiplicacion = new JButton("*");
        botonMultiplicacion.setBounds(280, 250, 80, 80);
        panel.add(botonMultiplicacion);
        JButton botonDivision = new JButton("/");
        botonDivision.setBounds(280, 340, 80, 80);
        panel.add(botonDivision);
        JButton botonIgual = new JButton("=");
        botonIgual.setBounds(190, 340, 80, 80);
        panel.add(botonIgual);
        JButton botonBorrar = new JButton("C");
        botonBorrar.setBounds(10, 340, 80, 80);
        panel.add(botonBorrar);

        
    }

}
