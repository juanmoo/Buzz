

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Buzzer extends JFrame implements KeyListener{
	private boolean allow = true;
	private int player;
	private int category = 1;
	
	private static Team t1,t2;
	private JLabel t1Name, t2Name;
	GridBagConstraints gbc = new GridBagConstraints(); 
	private JButton Yes, No;
	private JLabel aLit, math, wHist, fArts, lSci, wLit, aGov, pSci, wGeo, uHist, lightning, alphabet;
	private JLabel pALit, pMath, pWHist, pFArts, pLSci, pWLit, pAGov, pPSci, pWGeo, pUHist, pLightning, pAlphabet;
	private JLabel pALit2, pMath2, pWHist2, pFArts2, pLSci2, pWLit2, pAGov2, pPSci2, pWGeo2, pUHist2, pLightning2, pAlphabet2;
	private JLabel tT1, tT2;
	private JLabel total;
	private JLabel buzzed;
   private JLabel questionN;
	
	private static int tossup, plightning, bonus, palphabet;
   
   
   
   public void PrintScores(Player p) {
      System.out.println(p.getName()+"\t"+p.getALit()+"\t"+p.getMath()+"\t"+p.getWHis()+"\t"+p.getFArts()+"\t"+p.getLSci()+"\t"+p.getWLit()+"\t"+p.getAGov()+"\t"+p.getPSci()+"\t"+p.getWGeo()+"\t"+p.getUHist()+"\t"+p.getAlphabet()+"\t"+p.getLightning());

   }
   
   public String QuestionTitle (int c) {
      String cat = "";
      String t = "";
      if (c<=3) {
         cat = "American Literature";
      }
      else if (c<=6) {
         cat = "Math";
      }
      else if (c <= 9) {
         cat = "World History";
      }
      else if (c <= 12) {
         cat = "Fine Arts";
      }
      else if (c <= 15) {
         cat = "Life Science";
      }
      else if (c <= 18) {
         cat = "World Literature";
      }
      else if (c <= 21) {
         cat = "American Government";
      }  
      else if (c <= 24) {
         cat = "Physical Science";
      }
      else if (c <= 27) {
         cat = "World Geography";
      }
      else if (c <= 30) {
         cat = "US History";
      }
      else if (c <= 50) {
         cat = "Alphabet";
      }
      else if (c <= 60) {
         cat = "Lightning";
      }
      
      if (c <= 30) {
      
         int n = c%3;
         switch (n) {
            case 1: t = "Team A";
            break;
            case 2: t = "Team B";
            break;
            case 0: t = "Tossup";
         }
        return cat+"  "+t;
      }
      
      else if (c<=50) {
         return cat+" "+(c-30);
      }
      
      else {
         return cat+" "+(c-50);
      }
   }
   
   

	
	
	public Buzzer (Team t1, Team t2) {
		
		addKeyListener(this);
		setFocusable(true);
	    setFocusTraversalKeysEnabled(false);
	    
		setLayout(new GridBagLayout());
		
		//EasySound sound1 = new EasySound("bells.wav");
		
		
		
	
		gbc.insets = new Insets(2000,100,0,0);
      
      //Question Number
      
         questionN = new JLabel(QuestionTitle(category));
         questionN.setFont(new Font("Serif", Font.BOLD, 15));
         gbc.gridx = 1;
         gbc.gridy = 0;
         add(questionN, gbc);
		
		//Buzzed Message
			buzzed = new JLabel("");
			buzzed.setFont(new Font("Serif", Font.BOLD, 20));
			gbc.gridx = 1;
			gbc.gridy = 19;
			//gbc.gridwidth = 3;
			add(buzzed, gbc);
		
		//Total Points
		
		tT1 = new JLabel(""+t1.getTot());
		gbc.gridx = 1;
		gbc.gridy = 18;
		add(tT1, gbc);
		
		tT2 = new JLabel(""+t2.getTot());
		gbc.gridx = 2;
		gbc.gridy = 18;
		add(tT2, gbc);
		
			//Total Points Label 
		
			total = new JLabel("Total");
			gbc.gridx = 0;
			gbc.gridy = 18;
			add(total, gbc);
		
		
		//Team Names
		t1Name = new JLabel(t1.getName());
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(t1Name, gbc);
		
		
		t2Name = new JLabel(t2.getName());
		gbc.gridx = 2;
		gbc.gridy = 1;
		add(t2Name, gbc);
		
		
		//Category Names
		aLit = new JLabel("\tAmerican Literature");
		gbc.gridx = 0;
		gbc.gridy = 6;
		add(aLit, gbc);
		
		math = new JLabel("\tMath");
		gbc.gridx = 0;
		gbc.gridy = 7;
		add(math, gbc);
		
		wHist = new JLabel("\tWorld History");
		gbc.gridx = 0;
		gbc.gridy = 8;
		add(wHist, gbc);
		
		fArts = new JLabel("\tFine Arts");
		gbc.gridx = 0;
		gbc.gridy = 9;
		add(fArts, gbc);
		
		lSci = new JLabel("\tLife Science");
		gbc.gridx = 0;
		gbc.gridy = 10;
		add(lSci, gbc);
		
		wLit = new JLabel("World Literature");
		gbc.gridx = 0;
		gbc.gridy = 11;
		add(wLit, gbc);
		
		aGov = new JLabel("American Government");
		gbc.gridx = 0;
		gbc.gridy = 12;
		add(aGov, gbc);
		
		pSci = new JLabel("Physical Science");
		gbc.gridx = 0;
		gbc.gridy = 13;
		add(pSci, gbc);
		
		wGeo = new JLabel("World Geography");
		gbc.gridx = 0;
		gbc.gridy = 14;
		add(wGeo, gbc);
		
		uHist = new JLabel("US History");
		gbc.gridx = 0;
		gbc.gridy = 15;
		add(uHist, gbc);
		
		/**/lightning = new JLabel("Lightning");
		gbc.gridx = 0;
		gbc.gridy = 17;
		add(lightning, gbc);
		
		alphabet = new JLabel("Alphabet");
		gbc.gridx = 0;
		gbc.gridy = 16;
		add(alphabet, gbc);
		
		//Points for team 1
		pALit = new JLabel(""+t1.getALit());
		gbc.gridx = 1;
		gbc.gridy = 6;
		add(pALit, gbc);
		
		pMath = new JLabel(""+t1.getMath());
		gbc.gridx = 1;
		gbc.gridy = 7;
		add(pMath, gbc);
		
		pWHist = new JLabel(""+t1.getWHis());
		gbc.gridx = 1;
		gbc.gridy = 8;
		add(pWHist, gbc);
		
		pFArts = new JLabel(""+t1.getFArts());
		gbc.gridx = 1;
		gbc.gridy = 9;
		add(pFArts, gbc);
		
		pLSci = new JLabel(""+t1.getLSci());
		gbc.gridx = 1;
		gbc.gridy = 10;
		add(pLSci, gbc);
		
		pWLit = new JLabel(""+t1.getWLit());
		gbc.gridx = 1;
		gbc.gridy = 11;
		add(pWLit, gbc);
		
		pAGov = new JLabel(""+t1.getAGov());
		gbc.gridx = 1;
		gbc.gridy = 12;
		add(pAGov, gbc);
		
		pPSci = new JLabel(""+t1.getPSci());
		gbc.gridx = 1;
		gbc.gridy = 13;
		add(pPSci, gbc);
		
		pWGeo = new JLabel(""+t1.getWGeo());
		gbc.gridx = 1;
		gbc.gridy = 14;
		add(pWGeo, gbc);
		
		pUHist = new JLabel(""+t1.getUHist());
		gbc.gridx = 1;
		gbc.gridy = 15;
		add(pUHist, gbc);
		
		pLightning = new JLabel(""+t1.getLightning());
		gbc.gridx = 1;
		gbc.gridy = 17;
		add(pLightning, gbc);
		
		pAlphabet = new JLabel(""+t1.getAlphabet());
		gbc.gridx = 1;
		gbc.gridy = 16;
		add(pAlphabet, gbc);
		
		// Points for team 2
		
		pALit2 = new JLabel(""+t2.getALit());
		gbc.gridx = 2;
		gbc.gridy = 6;
		add(pALit2, gbc);
		
		pMath2 = new JLabel(""+t2.getMath());
		gbc.gridx = 2;
		gbc.gridy = 7;
		add(pMath2, gbc);
		
		pWHist2 = new JLabel(""+t2.getWHis());
		gbc.gridx = 2;
		gbc.gridy = 8;
		add(pWHist2, gbc);
		
		pFArts2 = new JLabel(""+t2.getFArts());
		gbc.gridx = 2;
		gbc.gridy = 9;
		add(pFArts2, gbc);
		
		pLSci2 = new JLabel(""+t2.getLSci());
		gbc.gridx = 2;
		gbc.gridy = 10;
		add(pLSci2, gbc);
		
		pWLit2 = new JLabel(""+t2.getWLit());
		gbc.gridx = 2;
		gbc.gridy = 11;
		add(pWLit2, gbc);
		
		pAGov2 = new JLabel(""+t2.getAGov());
		gbc.gridx = 2;
		gbc.gridy = 12;
		add(pAGov2, gbc);
		
		pPSci2 = new JLabel(""+t2.getPSci());
		gbc.gridx = 2;
		gbc.gridy = 13;
		add(pPSci2, gbc);
		
		pWGeo2 = new JLabel(""+t2.getWGeo());
		gbc.gridx = 2;
		gbc.gridy = 14;
		add(pWGeo2, gbc);
		
		pUHist2 = new JLabel(""+t2.getUHist());
		gbc.gridx = 2;
		gbc.gridy = 15;
		add(pUHist2, gbc);
		
		pAlphabet2 = new JLabel(""+t2.getAlphabet());
		gbc.gridx = 2;
		gbc.gridy = 16;
		add(pAlphabet2, gbc);
		
		pLightning2 = new JLabel(""+t2.getLightning());
		gbc.gridx = 2;
		gbc.gridy = 17;
		add(pLightning2, gbc);
		
		
		
		

	}
	
	public static void main(String[] args) {
		//Team t1,t2;
		String tp1, tp2, tp3, tp4, t2p1, t2p2, t2p3, t2p4;
		String n1, n2;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Points per tossup: ");
		tossup = kb.nextInt();
		
		System.out.print("Points per bonus: ");
		bonus = kb.nextInt();
		
		System.out.print("Points per Lightning: ");
		plightning = kb.nextInt();
		
		System.out.print("Points per Alphabet: ");
		palphabet = kb.nextInt();
		
		
		
		Scanner kb1 = new Scanner(System.in);
		//Gets the names of people and teams
		
		System.out.print("Enter the name of Team 1: ");
		n1 = kb1.nextLine();
		System.out.print("\nNames of Team 1's players :\n\n");
		
		System.out.print("Enter the name of player 1 : ");
		tp1 = kb1.nextLine();
		System.out.print("\nEnter the name of player 2 : ");
		tp2 = kb1.nextLine();
		System.out.print("\nEnter the name of player 3 : ");
		tp3 = kb1.nextLine();
		System.out.print("\nEnter the name of player 4 : ");
		tp4 = kb1.nextLine();
		
		
		System.out.print("\n\nEnter the name of Team 2: ");
		n2 = kb1.nextLine();
		
		System.out.print("\n\n\nNames of Team 2's players :\n\n");
		
		System.out.print("Enter the name of player 1 : ");
		t2p1 = kb1.nextLine();
		System.out.print("\nEnter the name of player 2 : ");
		t2p2 = kb1.nextLine();
		System.out.print("\nEnter the name of player 3 : ");
		t2p3 = kb1.nextLine();
		System.out.print("\nEnter the name of player 4 : ");
		t2p4 = kb1.nextLine();
		
		//Creates teams w/ players of the names given
		
		t1 = new Team(n1, tp1, tp2, tp3, tp4);
		t2 = new Team(n2, t2p1, t2p2, t2p3, t2p4);
		
		//Display Window
		
		Buzzer window = new Buzzer(t1,t2);
		window.setSize(1000,550);
		//window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setTitle("Academic Team Match");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		
		//PLAYER CLICKS
		
		if(allow && (key == KeyEvent.VK_1 )) {
			EasySound sound1 = new EasySound("sound1.wav");
			sound1.play();
			player = 1;
			allow = false;
			buzzed.setText(t1.getPName(player)+" is Buzzed!");
		}
		
		if(allow && key == KeyEvent.VK_2) {
			EasySound sound2 = new EasySound("sound2.wav");
			sound2.play();
			player = 2;
			allow = false;
			buzzed.setText(t1.getPName(player)+" is Buzzed!");
		}
		
		if(allow && key == KeyEvent.VK_3) {
			EasySound sound3 = new EasySound("sound3.wav");
			sound3.play();
			player = 3;
			allow = false;
			buzzed.setText(t1.getPName(player)+" is Buzzed!");
		}
		
		if(allow && key == KeyEvent.VK_4) {
			EasySound sound4 = new EasySound("sound4.wav");
			sound4.play();
			player = 4;
			allow = false;
			buzzed.setText(t1.getPName(player)+" is Buzzed!");
		}
		
		if(allow && (key == KeyEvent.VK_5)) {
			EasySound sound5 = new EasySound("sound5.wav");
			sound5.play();
			player = 5;
			allow = false;
			buzzed.setText(t2.getPName(player)+" is Buzzed!");
		}
		
		if(allow && key == KeyEvent.VK_6) {
			EasySound sound6 = new EasySound("sound6.wav");
			sound6.play();
			player = 6;
			allow = false;
			buzzed.setText(t2.getPName(player)+" is Buzzed!");
		}
		
		if(allow && key == KeyEvent.VK_7) {
			EasySound sound7 = new EasySound("sound7.wav");
			sound7.play();
			player = 7;
			allow = false;
			buzzed.setText(t2.getPName(player)+" is Buzzed!");
		}
		
		if(allow && key == KeyEvent.VK_8) {
			EasySound sound8 = new EasySound("sound8.wav");
			sound8.play();
			player = 8;
			allow = false;
			buzzed.setText(t2.getPName(player)+" is Buzzed!");
		}
      
      if (key == KeyEvent.VK_P)  {
         System.out.println("Name\tALit\tMath\tWHis\tFArts\tLSci\tWLit\tAGov\tPSci\tWGeo\tUHist\tAlph\tLight");
         PrintScores(t1.p1);
         PrintScores(t1.p2);
         PrintScores(t1.p3);
         PrintScores(t1.p4);
         PrintScores(t2.p1);
         PrintScores(t2.p2);
         PrintScores(t2.p3);
         PrintScores(t2.p4);
         
      
      }
		
	
		
		//YES OR NO
		
		if (allow == false) {
			if(key == KeyEvent.VK_UP) {
				if (player<=4) {
					
					switch (category) {
					case 1: t1.setALit(player, tossup);
					break;
					case 2: case 3: t1.setALit(player, bonus);
					break;
					case 4: t1.setMath(player, tossup);
					break;
					case 5: case 6: t1.setMath(player, bonus);
					break;
					case 7: t1.setWHis(player, tossup);
					break; 
					case 8: case 9: t1.setWHis(player, bonus);
					break;
					case 10: t1.setFArts(player, tossup);
					break;
					case 11: case 12: t1.setFArts(player, bonus);
					break;
					case 13: t1.setLSci(player, tossup);
					break;
					case 14: case 15: t1.setLSci(player, bonus);
					break;
					case 16: t1.setWLit(player, tossup);
					break;
					case 17: case 18: t1.setWLit(player, bonus);
					break;
					case 19: t1.setAGov(player, tossup);
					break;
					case 20: case 21: t1.setAGov(player, bonus);
					break;
					case 22: t1.setPSci(player, tossup);
					break;
					case 23: case 24: t1.setPSci(player, bonus);
					break;
					case 25: t1.setWGeo(player, tossup);
					break;
					case 26: case 27: t1.setWGeo(player, bonus);
					break;
					case 28: t1.setUHist(player, tossup);
					break;
					case 29: case 30: t1.setUHist(player, bonus);
					break;
					case 31: t1.setAlphabet(player, palphabet);
					break;
					case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50:  t1.setAlphabet(player, palphabet);
					break;
					case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60: t1.setLightning(player, plightning);
						
					}
					
					
					t1.update();
					pALit.setText(""+t1.getALit());
					pMath.setText(""+t1.getMath());
					pWHist.setText(""+t1.getWHis());
					pFArts.setText(""+t1.getFArts());
					pLSci.setText(""+t1.getLSci());
					pWLit.setText(""+t1.getWLit());
					pAGov.setText(""+t1.getAGov());
					pPSci.setText(""+t1.getPSci());
					pWGeo.setText(""+t1.getWGeo());
					pUHist.setText(""+t1.getUHist());
					pAlphabet.setText(""+t1.getAlphabet());
					pLightning.setText(""+t1.getLightning());
					tT1.setText(""+t1.getTot());
					
				}
				else {
					player -= 4;
					switch (category) {
					case 1: t2.setALit(player, tossup);
					break;
					case 2: case 3: t2.setALit(player, bonus);
					break;
					case 4: t2.setMath(player, tossup);
					break;
					case 5: case 6: t2.setMath(player, bonus);
					break;
					case 7: t2.setWHis(player, tossup);
					break; 
					case 8: case 9: t2.setWHis(player, bonus);
					break;
					case 10: t2.setFArts(player, tossup);
					break;
					case 11: case 12: t2.setFArts(player, bonus);
					break;
					case 13: t2.setLSci(player, tossup);
					break;
					case 14: case 15: t2.setLSci(player, bonus);
					break;
					case 16: t2.setWLit(player, tossup);
					break;
					case 17: case 18: t2.setWLit(player, bonus);
					break;
					case 19: t2.setAGov(player, tossup);
					break;
					case 20: case 21: t2.setAGov(player, bonus);
					break;
					case 22: t2.setPSci(player, tossup);
					break;
					case 23: case 24: t2.setPSci(player, bonus);
					break;
					case 25: t2.setWGeo(player, tossup);
					break;
					case 26: case 27: t2.setWGeo(player, bonus);
					break;
					case 28: t2.setUHist(player, tossup);
					break;
					case 29: case 30: t2.setUHist(player, bonus);
					break;
					case 31: t2.setAlphabet(player, palphabet);
					break;
					case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50:  t2.setAlphabet(player, palphabet);
					break;
					case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60: t2.setLightning(player, plightning);
						
						
					}
					
					
					t2.update();
					pALit2.setText(""+t2.getALit());
					pMath2.setText(""+t2.getMath());
					pWHist2.setText(""+t2.getWHis());
					pFArts2.setText(""+t2.getFArts());
					pLSci2.setText(""+t2.getLSci());
					pWLit2.setText(""+t2.getWLit());
					pAGov2.setText(""+t2.getAGov());
					pPSci2.setText(""+t2.getPSci());
					pWGeo2.setText(""+t2.getWGeo());
					pUHist2.setText(""+t2.getUHist());
					pAlphabet2.setText(""+t2.getAlphabet());
					pLightning2.setText(""+t2.getLightning());
					tT2.setText(""+t2.getTot());
					
					
				}
				
				allow = true;
				buzzed.setText("");
				category++;
            questionN.setText(QuestionTitle(category));
			}
			
			else if (key == KeyEvent.VK_DOWN) {
            				allow = true;
				buzzed.setText("");
				//category++;
			}
         
                  
         			
		}
      
      if (key == KeyEvent.VK_RIGHT) {
            category++;
            questionN.setText(QuestionTitle(category));
            buzzed.setText("");
            allow = true;
         }
         
      if (key == KeyEvent.VK_K) {
            EasySound no = new EasySound("no.wav");
            no.play();

         }
     if (key == KeyEvent.VK_D) {
		EasySound dumb = new EasySound("dumb.wav");
		dumb.play();
	}

	    
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
