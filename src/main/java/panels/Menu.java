package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import constants.Constants;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Menu {
	
	private static final Logger log = LogManager.getLogger( Menu.class );
	
	private JFrame frame = new JFrame( Constants.MenuText.MENU_TRIS );
	
	private JPanel mainPanel = new JPanel();
	private JLabel titolo = new JLabel ( Constants.MenuText.TITOLO, SwingConstants.CENTER );
	
	
	public Boolean isSinglePlayer;
	
	public Menu() {
		
		generateTitolo();
		
		JPanel buttonsPanel = generateButtonsPanel();
		
		mainPanel.setLayout( new GridLayout(3, 2) );
		
		mainPanel.add(buttonsPanel);
		
		
		
		frame.setSize(1920,1080);   
		frame.add(mainPanel);
		
		frame.setVisible( true ); 
		
	}

	private void generateTitolo() {
		
		titolo.setAlignmentX(1);
		titolo.setFont( Constants.Fonts.SANS_SERIF );
		mainPanel.add(titolo);
		
	}
	
	private JPanel generateButtonsPanel() {
		
		JPanel buttonsPanel = new JPanel();
		
		JButton buttons [] = generateButtons(); 
		
		for (JButton button : buttons) {
			buttonsPanel.add(button);
		}
		
		return buttonsPanel;
	}

	private JButton[] generateButtons() {
		
		JButton [] buttonArray  = new JButton [Constants.MenuButtons.MENU_BUTTONS.size()];
		
		for ( int i = 0; i<buttonArray.length; i++ ) {
			buttonArray[i] = generateGenericButton(Constants.MenuButtons.MENU_BUTTONS.get(i));
		}
		
		return buttonArray;
	}

	private JButton generateGenericButton ( String buttonText ) {
		
		JButton menuButton = new JButton(buttonText);
		
		menuButton.setPreferredSize(new Dimension(150,150));
		
		menuButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			buttonEventDispatcher(e.getActionCommand());

			}
        });
		
		return menuButton;
		
	}
	
	private void buttonEventDispatcher(String actionCommand) {
		
		switch ( actionCommand ) {
		
		case Constants.Modalita.GIOCATORE_SINGOLO : 
			
			log.info("Modalità giocatore singolo scelta.");
			
			break;
		
		case Constants.Modalita.MULTIGIOCATORE :
			
			log.info("Modalità multigiocatore scelta.");
			
			break;
		
		}
		
		
	}

	

}
