import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameAgenda extends JFrame implements ActionListener {
    JButton btnAltas, btnConsulta, btnBuscar, btnModificar, btnEliminar;

    public JFrameAgenda() {
        iniciarMenu(); 
    }
    public void iniciarMenu(){

        //creacion de opciones
        setLayout(new GridLayout(7, 2));
        btnAltas = new JButton("Altas");
        btnConsulta = new JButton("Consultar");
        btnBuscar = new JButton("Buscar");
        btnModificar = new JButton("Modificar");
        btnEliminar = new JButton("Eliminar");

        //agregar al frame
        add(btnAltas);
        add(btnConsulta);
        add(btnBuscar);
        add(btnModificar);
        add(btnEliminar);
         

        //Para las opciones de la tabla
        btnAltas.addActionListener(this);
        btnConsulta.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnModificar.addActionListener(this);


        //Otro
        this.setBounds(500,100,475,335);
        this.setResizable(isMaximumSizeSet());//desactiva opcion maximizar
    	this.getContentPane().setBackground(Color.LIGHT_GRAY);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAltas){
            new JFrameAltas();
        }
        
        if(e.getSource()==btnConsulta){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameConsultas();
            }else{
                JOptionPane.showMessageDialog(null, "No Existen Registros",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==btnBuscar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameBuscar();
            }else{
                JOptionPane.showMessageDialog(null, "No Existen Registros",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==btnModificar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameModificar();
            }else{
                JOptionPane.showMessageDialog(null, "No Existen Registros",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource()==btnEliminar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameEliminar();
            }else{
                JOptionPane.showMessageDialog(null, "No Existen Registros",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}