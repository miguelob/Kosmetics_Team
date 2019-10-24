package icai.dtc.isw.gui;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JRadioButton;

public class PantallaCrearReview extends JFrame {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaCrearReview frame = new PantallaCrearReview();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PantallaCrearReview() throws HeadlessException {
		
		//Header
		//Brand name to the left
		//Profile button to the right
		
		JPanel header = new JPanel();
		header.setForeground(new Color(0, 0, 0));
		header.setBorder(new MatteBorder(15, 10, 15, 15, (Color) new Color(255, 153, 153)));
		header.setBackground(new Color(255, 153, 153));
		getContentPane().add(header, BorderLayout.NORTH);
		header.setLayout(new BorderLayout(0, 0));
		
		//Brand name
		//Button that takes the user to the main page
		MyJButton mjbtnKosmetics = new MyJButton("Kosmetics.");
		header.add(mjbtnKosmetics, BorderLayout.WEST);
		
		//Profile button
		//Takes the user to his profile
		MyJButton mjbtnProfile = new MyJButton("Profile");
		header.add(mjbtnProfile, BorderLayout.EAST);
		
		//Main panel
		//Includes product name
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		//Products name
		
		MyJLabel mjlblProductName = new MyJLabel("Lip Blush Bundle");
		mjlblProductName.setHorizontalAlignment(SwingConstants.CENTER);
		mjlblProductName.setFont(GUIConstants.FONT_BIG_TITLE);
		panel_1.add(mjlblProductName, BorderLayout.NORTH);
		
		//Sub panel to the main panel
		//Does not include the products name
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(50, 200, 50, 100, (Color) new Color(255, 255, 255)));
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		//Panel with buttons for the stars
		//The user can choose how many stars will be given to the product
		
		JPanel panelStars = new JPanel();
		panelStars.setLayout(new BorderLayout());
		panelStars.setBackground(new Color(255, 255, 255));
		panel_2.add(panelStars, BorderLayout.NORTH);

		JPanel panelStarsDescription = new JPanel();
		panelStarsDescription.setBackground(Color.WHITE);
		panelStarsDescription.add(new MyJLabel("Your overall rating of this product"));
		panelStars.add(panelStarsDescription, BorderLayout.NORTH);
		JPanel panelStarFlow = new JPanel();
		panelStarFlow.setBackground(Color.WHITE);
		panelStars.add(panelStarFlow, BorderLayout.CENTER);
		
		MyJButton2States lblStar_1 = new MyJButton2States(new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"));
		lblStar_1.setContentAreaFilled(false);
		panelStarFlow.add(lblStar_1);
		MyJButton2States lblStar_2 = new MyJButton2States(new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"));
		panelStarFlow.add(lblStar_2);
		MyJButton2States lblStar_3 = new MyJButton2States(new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"));
		panelStarFlow.add(lblStar_3);
		MyJButton2States lblStar_4 = new MyJButton2States(new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"));
		panelStarFlow.add(lblStar_4);
		MyJButton2States lblStar_5 = new MyJButton2States(new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"), new ImageIcon("media/icons/star.png"));
		panelStarFlow.add(lblStar_5);
		
		//Panel for the review's text and quick survey
		JPanel panelShareYourExperience = new JPanel();
		panelShareYourExperience.setLayout(new BorderLayout());
		panel_2.add(panelShareYourExperience, BorderLayout.CENTER);
		JTextPane txtpnShareYourExperience = new JTextPane();
		txtpnShareYourExperience.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtpnShareYourExperience.setCaretColor(Color.BLACK);
		txtpnShareYourExperience.setBorder(new LineBorder(new Color(192, 192, 192), 2));
		txtpnShareYourExperience.setText("Share your experience: the quality, the price, did it meet your expectations?...");
		txtpnShareYourExperience.setForeground(Color.DARK_GRAY);
		panelShareYourExperience.add(txtpnShareYourExperience, BorderLayout.CENTER);
		
		//Panel for the quick survey
		//It includes the product's questions
		//and 3 possible answers : "yes", "I'm not sure", "no".
		JPanel panelSurvey = new JPanel();
		panelSurvey.setBorder(new MatteBorder(25, 1, 1, 1, (Color) Color.WHITE));
		panelSurvey.setBackground(Color.WHITE);
		panelShareYourExperience.add(panelSurvey, BorderLayout.SOUTH);
		panelSurvey.setLayout(new GridLayout(0, 1, 0, 0));
		addSurvey(panelSurvey);

		
		
		//Panel with other users' reviews 
		JPanel panelAside = new JPanel();
		panelAside.setBorder(new MatteBorder(1, 100, 1, 50, (Color) new Color(255, 255, 255)));
		panelAside.setBackground(Color.WHITE);
		panel_2.add(panelAside, BorderLayout.EAST);
		panelAside.setLayout(new GridLayout(0, 1, 0, 0));
		
		//Panel for an indivifual review from a different user
		JPanel panelIndividualReview = new JPanel();
		panelIndividualReview.setBackground(Color.WHITE);
		panelAside.add(panelIndividualReview);
		panelIndividualReview.setLayout(new BorderLayout(0, 0));
		
		MyJLabel mjlblUsername = new MyJLabel("maroacc");
		mjlblUsername.setFont(GUIConstants.FONT_REGULAR);
		panelIndividualReview.add(mjlblUsername, BorderLayout.NORTH);
		
		MyJLabel mjlblReviewText = new MyJLabel("<html>The lip blush formula in entirely different than the matte lip kits, <br>"
				+ "but still has the vibrant beautiful appearance. <br>"
				+ "It�s light weight and smooth, feels like butter. This product doesn�t get crusty or dry out. <br>"
				+ "All four shades are stunning and highly pigmented. New favorite for sure!!</html>");
		mjlblReviewText.setFont(GUIConstants.FONT_REGULAR);
		mjlblReviewText.setForeground(Color.LIGHT_GRAY);
		panelIndividualReview.add(mjlblReviewText, BorderLayout.CENTER);
		
		MyJLabel mjlblUser = new MyJLabel("maroacc");
		panelAside.add(mjlblUser);
	}
	
	public void addSurvey(JPanel panelSurvey)
	{
		//First Question
		MyJLabel mjlblIsItLong = new MyJLabel("Is it long-lasting?");
		panelSurvey.add(mjlblIsItLong);
		
		JPanel panelSurveyRadioButtons = new JPanel();
		panelSurveyRadioButtons.setBackground(Color.WHITE);
		panelSurvey.add(panelSurveyRadioButtons);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setBackground(Color.WHITE);
		rdbtnYes.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons.add(rdbtnYes);
		
		JRadioButton rdbtnNotSure = new JRadioButton("I'm not sure");
		rdbtnNotSure.setBackground(Color.WHITE);
		rdbtnNotSure.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons.add(rdbtnNotSure);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBackground(Color.WHITE);
		rdbtnNo.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons.add(rdbtnNo);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnYes);
		group.add(rdbtnNotSure);
		group.add(rdbtnNo);

		
		//Second Question
		
		MyJLabel mjlblHighPigmented = new MyJLabel("Is it highly pigmented?");
		panelSurvey.add(mjlblHighPigmented);
		
		JPanel panelSurveyRadioButtons2 = new JPanel();
		panelSurveyRadioButtons2.setBackground(Color.WHITE);
		panelSurvey.add(panelSurveyRadioButtons2);
		
		JRadioButton rdbtnYes2 = new JRadioButton("Yes");
		rdbtnYes2.setBackground(Color.WHITE);
		rdbtnYes2.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons2.add(rdbtnYes2);
		
		JRadioButton rdbtnNotSure2 = new JRadioButton("I'm not sure");
		rdbtnNotSure2.setBackground(Color.WHITE);
		rdbtnNotSure2.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons2.add(rdbtnNotSure2);
		
		JRadioButton rdbtnNo2 = new JRadioButton("No");
		rdbtnNo2.setBackground(Color.WHITE);
		rdbtnNo2.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons2.add(rdbtnNo2);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnYes2);
		group2.add(rdbtnNotSure2);
		group2.add(rdbtnNo2);
		
		//Third Question
		
		MyJLabel mjlblMatte = new MyJLabel("Is it matte?");
		panelSurvey.add(mjlblMatte);
		
		JPanel panelSurveyRadioButtons3 = new JPanel();
		panelSurveyRadioButtons3.setBackground(Color.WHITE);
		panelSurvey.add(panelSurveyRadioButtons3);
		
		JRadioButton rdbtnYes3 = new JRadioButton("Yes");
		rdbtnYes3.setBackground(Color.WHITE);
		rdbtnYes3.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons3.add(rdbtnYes3);
		
		JRadioButton rdbtnNotSure3 = new JRadioButton("I'm not sure");
		rdbtnNotSure3.setBackground(Color.WHITE);
		rdbtnNotSure3.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons3.add(rdbtnNotSure3);
		
		JRadioButton rdbtnNo3 = new JRadioButton("No");
		rdbtnNo3.setBackground(Color.WHITE);
		rdbtnNo3.setFont(GUIConstants.FONT_REGULAR);
		panelSurveyRadioButtons3.add(rdbtnNo3);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnYes3);
		group3.add(rdbtnNotSure3);
		group3.add(rdbtnNo3);
		
	}


}