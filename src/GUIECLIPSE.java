import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIECLIPSE extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIECLIPSE frame = new GUIECLIPSE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIECLIPSE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnValentina = new JButton("Valentina");
		btnValentina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnValentina, "Hola desde la rama Valentina");
			}
			
		});
		btnValentina.setBounds(29, 48, 113, 22);
		contentPane.add(btnValentina);
		

		JButton btnEmilio = new JButton("Emilio");
		btnEmilio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnEmilio, "Hola desde la rama Emilio");
			}
			
			
			
			
			
		});
		btnEmilio.setBounds(242, 48, 113, 22);
		contentPane.add(btnEmilio);
		
		
		
		
		
		
		

		JButton btnandy = new JButton("Andrea");
		btnandy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnandy, "Hola desde la rama de Andrea");
			}
			
		});
		btnandy.setBounds(29, 203, 89, 23);
		contentPane.add(btnandy);


	}
}
