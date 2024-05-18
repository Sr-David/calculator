import javax.swing.*;

public class ventana extends JFrame {
    public ventana() {
        this.setSize(385, 520);
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
        pantalla.setBounds(10, 10, 350, 100);
        pantalla.setEditable(false);
        pantalla.setText("Welcome!");
        pantalla.setEnabled(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setFont(new java.awt.Font("Consolas", 0, 30));
        pantalla.setBackground(new java.awt.Color((int) 09021f));
        panel.add(pantalla);
        JButton boton1 = new JButton("1");
        boton1.setBounds(10, 120, 80, 80);
        boton1.setForeground(new java.awt.Color((int) 0000000));
        boton1.setFont(new java.awt.Font("Consolas", 1, 20));
        boton1.setBackground(new java.awt.Color(0x54c2bb));
        boton1.setFocusPainted(false);
        panel.add(boton1);
        
        JButton boton2 = new JButton("2");
        boton2.setBounds(100, 120, 80, 80);
        boton2.setForeground(new java.awt.Color((int) 0000000));
        boton2.setFont(new java.awt.Font("Consolas", 1, 20));
        boton2.setBackground(new java.awt.Color(0x54c2bb));
        boton2.setFocusPainted(false);
        panel.add(boton2);
        
        JButton boton3 = new JButton("3");
        boton3.setBounds(190, 120, 80, 80);
        boton3.setForeground(new java.awt.Color((int) 0000000));
        boton3.setFont(new java.awt.Font("Consolas", 1, 20));
        boton3.setBackground(new java.awt.Color(0x54c2bb));
        boton3.setFocusPainted(false);
        panel.add(boton3);
        
        JButton boton4 = new JButton("4");
        boton4.setBounds(10, 210, 80, 80);
        boton4.setForeground(new java.awt.Color((int) 0000000));
        boton4.setFont(new java.awt.Font("Consolas", 1, 20));
        boton4.setBackground(new java.awt.Color(0x54c2bb));
        boton4.setFocusPainted(false);
        panel.add(boton4);
        
        JButton boton5 = new JButton("5");
        boton5.setBounds(100, 210, 80, 80);
        boton5.setForeground(new java.awt.Color((int) 0000000));
        boton5.setFont(new java.awt.Font("Consolas", 1, 20));
        boton5.setBackground(new java.awt.Color(0x54c2bb));
        boton5.setFocusPainted(false);
        panel.add(boton5);
        
        JButton boton6 = new JButton("6");
        boton6.setBounds(190, 210, 80, 80);
        boton6.setForeground(new java.awt.Color((int) 0000000));
        boton6.setFont(new java.awt.Font("Consolas", 1, 20));
        boton6.setBackground(new java.awt.Color(0x54c2bb));
        boton6.setFocusPainted(false);
        panel.add(boton6);
        
        JButton boton7 = new JButton("7");
        boton7.setBounds(10, 300, 80, 80);
        boton7.setForeground(new java.awt.Color((int) 0000000));
        boton7.setFont(new java.awt.Font("Consolas", 1, 20));
        boton7.setBackground(new java.awt.Color(0x54c2bb));
        boton7.setFocusPainted(false);
        panel.add(boton7);
        
        JButton boton8 = new JButton("8");
        boton8.setBounds(100, 300, 80, 80);
        boton8.setForeground(new java.awt.Color((int) 0000000));
        boton8.setFont(new java.awt.Font("Consolas", 1, 20));
        boton8.setBackground(new java.awt.Color(0x54c2bb));
        boton8.setFocusPainted(false);
        panel.add(boton8);
        
        JButton boton9 = new JButton("9");
        boton9.setBounds(190, 300, 80, 80);
        boton9.setForeground(new java.awt.Color((int) 0000000));
        boton9.setFont(new java.awt.Font("Consolas", 1, 20));
        boton9.setBackground(new java.awt.Color(0x54c2bb));
        boton9.setFocusPainted(false);
        panel.add(boton9);
        
        JButton boton0 = new JButton("0");
        boton0.setBounds(100, 390, 80, 80);
        boton0.setForeground(new java.awt.Color((int) 0000000));
        boton0.setFont(new java.awt.Font("Consolas", 1, 20));
        boton0.setBackground(new java.awt.Color(0x54c2bb));
        boton0.setFocusPainted(false);
        panel.add(boton0);

       
        JButton botonSuma = new JButton("+");
        botonSuma.setBounds(280, 120, 80, 80);
        botonSuma.setBackground(new java.awt.Color(0xbfe4e1));
        botonSuma.setFocusPainted(false);

        panel.add(botonSuma);
        JButton botonResta = new JButton("-");
        botonResta.setBounds(280, 210, 80, 80);
        botonResta.setBackground(new java.awt.Color(0xbfe4e1));
        botonResta.setFocusPainted(false);
        panel.add(botonResta);
        JButton botonMultiplicacion = new JButton("*");
        botonMultiplicacion.setBounds(280, 300, 80, 80);
        botonMultiplicacion.setFocusPainted(false);
        panel.add(botonMultiplicacion);
        botonMultiplicacion.setBackground(new java.awt.Color(0xbfe4e1));
        JButton botonDivision = new JButton("/");
        botonDivision.setFocusPainted(false);
        botonDivision.setBounds(280, 390, 80, 80);
        panel.add(botonDivision);
        botonDivision.setBackground(new java.awt.Color(0xbfe4e1));

        JButton botonIgual = new JButton("=");
        botonIgual.setBounds(190, 390, 80, 80);
        botonIgual.setBackground(new java.awt.Color(0xbfe4e1));
        botonIgual.setFocusPainted(false);
        panel.add(botonIgual);
        JButton botonBorrar = new JButton("C");
        botonBorrar.setBounds(10, 390, 80, 80);
        botonBorrar.setBackground(new java.awt.Color(0xbfe4e1));
        botonBorrar.setFocusPainted(false);
        panel.add(botonBorrar);


    }

}
