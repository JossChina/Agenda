import javax.swing.*;

public class JFrameEliminar extends JFrame {
    PanelEliminar eliminar = new PanelEliminar();

    public JFrameEliminar() {
        initComponents();
    }

    private void initComponents() {
        this.setBounds(580,180,300,300);
        setSize(300, 300);
        setTitle("Eliminar");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(eliminar);
        setVisible(true);
    }
}
