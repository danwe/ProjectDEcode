
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;

import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import main.Steps;


public class PorjectDan implements  ActionListener {
	
	private String arr[][]=new String[5][2];
	private int loc[]=new int[5];
	private int loc1111[]=new int[5];
	int countError=0;
	int countersum=0;
	private int rec[]=new int[5];
	Boolean yy=true;
	Boolean path=false,out=false,step=false,ontol=false,ontolsta=false;
	private int loc4[]=new int[5];
	private int loc22[]=new int[5];
	Boolean resssssss=false;
	private int arrr[]=new int[5];
	private int arrr2[]=new int[5];
	private String result;
	private String St[]=new String[5];
	private String newarrr[][]=new String[5][2];
	static // Definition of global values and items that are part of the GUI.
	String check="false";
	int lineError=0;
	JLabel mouseMoveLabel;
	String checklearn;
	int checeheeee=0;
	Boolean ch=true;
	int saveAspress, pathProsaveAspress, ontologysaveAspress, ontologyStatussaveAspress,stepFilesaveAspress;
	int redScoreAmount = 0,danadn,iii=0;
	int blueScoreAmount = 0,ee=0;
	int saveAsa,pathProa, ontologya, ontologyStatusa,stepFilea,starta,clearAlla,foo;
	JPanel titlePanel, scorePanel, buttonPanel;
	JLabel pathLabel, saveasLabel,ontologyLabel,ontologyStatusLabel, stepFileLabel,redScore, blueScore,input,Option,MoreOption;
	JButton saveAs, pathPro, ontology, ontologyStatus,stepFile,start,clearAll;
	JButton saveAslink, pathProlink, ontologylink, ontologyStatuslink,stepFilelink;
	JButton lear,learshkuf,clearresu,clearlog;
	JCheckBox jcbChin;
	JTextArea _resultArea;
	String file1,file2,david,file;
	private static String DESELECTED_LABEL = "if you want to learn more";
	private static String SELECTED_LABEL = "thank about this you dont see thos more";
	File file111;
	String fileontology,filestepFile,fileontologyStatus;
	private boolean le=false;
	private boolean lookresult=false;
	


	public JPanel createContentPane (){
		
		try {
			writeLog();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inint3();
		checkLerana();//if was learn
		readres();//read res
		
		def();//defenition
		checktwo();//
		shorting();//short
		inint();
		JPanel totalGUI = new JPanel();

		totalGUI.setLayout(null);
		totalGUI.setBackground(Color.blue);

		// Creation of a Panel to contain the title labels
		titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(0, 0);
		titlePanel.setSize(1000,1080);

		totalGUI.add(titlePanel);

		// Creation of a Panel to contain the score labels.
		scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setLocation(0, 0);
		scorePanel.setSize(800, 800);
		scorePanel.setOpaque(false);
		totalGUI.add(scorePanel);
		// Creation of a Panel to contain all the JButtons.
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(0, 80);
		buttonPanel.setSize(1000, 1000);
		buttonPanel.setOpaque(false);
		totalGUI.add(buttonPanel);

		input = new JLabel();
		input.setText("         INPUTS VALUE:");
		//input.setl(true);
		//input.set);
		input.setForeground(Color.GREEN);
		input.setLayout(null);
		input.setLocation(0, 0);
		input.setSize(150, 30);
		buttonPanel.add(input);
		
		Option = new JLabel();
		Option.setText("OPTIONS:");
		Option.setForeground(Color.GREEN);
		Option.setLayout(null);
		Option.setLocation(450, 0);
		Option.setSize(150, 30);
		buttonPanel.add(Option);


		MoreOption = new JLabel();
		MoreOption.setText("MORE OPTION:");
		//input.setl(true);
		//input.set);
		MoreOption.setForeground(Color.GREEN);
		MoreOption.setLayout(null);
		MoreOption.setLocation(430, 300);
		MoreOption.setSize(150, 30);
		buttonPanel.add(MoreOption);
		
		lear = new JButton("TUTORIAL");
		lear.setLocation(400,350 );
		if(le){
			lear.setBackground(Color.RED);
			lear.setForeground(Color.WHITE);
		}
		else{
			lear.setBackground(Color.WHITE);
			lear.setForeground(Color.RED);
		}
		lear.setSize(150, 30);
		lear.addActionListener(this);
		buttonPanel.add(lear);

		clearresu = new JButton("CLEAR RESULT");
		clearresu.setLocation(400,loc4[2]);

		clearresu.setSize(150, 30);
		clearresu.setEnabled(false);
		clearresu.addActionListener(this);
		buttonPanel.add(clearresu);


		pathPro = new JButton("PATH PROJECT FILE");

		pathPro.setLocation(0,loc[0] );
		if(le)
			pathPro.setLocation(0, loc22[0]);
		pathPro.setSize(190, 30);
		//pathPro.getPreferredSize();
		pathPro.addActionListener(this);
		buttonPanel.add(pathPro);

		saveAs = new JButton("Out Put()");
		saveAs.setLocation(0,loc[1]);
		if(le)
			saveAs.setLocation(0,loc22[1]);

		saveAs.setSize(190, 30);
		//saveAs.setEnabled(false);
		saveAs.addActionListener(this);
		buttonPanel.add(saveAs);

		ontology = new JButton("Load Ontology");

		ontology.setLocation(0, loc[2]);
		if(le)
			ontology.setLocation(0, loc22[2]);
		ontology.setSize(190, 30);
		//ontology.setEnabled(false);
		ontology.addActionListener(this);
		buttonPanel.add(ontology);


		ontologyStatus = new JButton("Load ontologyStatus");
		ontologyStatus.setLocation(0, loc[3]);
		if(le)
			ontologyStatus.setLocation(0,loc22[3]);

		ontologyStatus.setSize(190, 30);
		//ontologyStatus.setEnabled(false);
		ontologyStatus.addActionListener(this);
		buttonPanel.add(ontologyStatus);

		stepFile = new JButton("Load rb");
		stepFile.setLocation(0, loc[4]);
		if(le)
			stepFile.setLocation(0,loc22[4]);

		stepFile.setSize(190, 30);
		//stepFile.setEnabled(false);
		stepFile.addActionListener(this);
		buttonPanel.add(stepFile);



		start = new JButton("START");
		start.setLocation(400, loc4[0]);
		start.setSize(150, 30);
		start.addActionListener(this);
		start.setEnabled(false);
		buttonPanel.add(start);

		clearAll = new JButton("CLEAR");
		clearAll.setLocation(400, loc4[1]);
		clearAll.setSize(150, 30);

		//clearAll
		clearAll.addActionListener(this);
		clearAll.setEnabled(false);
		buttonPanel.add(clearAll);

		pathProlink = new JButton("Link");
		pathProlink.setLocation(150, loc[0]);
		if(le)
			pathProlink.setLocation(150, loc22[0]);
		pathProlink.setSize(120, 30);
		pathProlink.setEnabled(false);
		pathProlink.addActionListener(this);


		pathProlink.setForeground(Color.GREEN);
		pathProlink.setOpaque(false);
		pathProlink.setContentAreaFilled(false);
		pathProlink.setBorderPainted(false);


		buttonPanel.add(pathProlink);

		saveAslink = new JButton("Link");
		saveAslink.setLocation(150, loc[1]);
		if(le)
			saveAslink.setLocation(150, loc22[1]);
		saveAslink.setSize(120, 30);
		saveAslink.setForeground(Color.GREEN);
		saveAslink.setEnabled(false);
		saveAslink.setOpaque(false);
		saveAslink.setContentAreaFilled(false);
		saveAslink.setBorderPainted(false);

		saveAslink.addActionListener(this);
		buttonPanel.add(saveAslink);

		ontologylink = new JButton("Link");
		ontologylink.setLocation(150, loc[2]);
		if(le)
			ontologylink.setLocation(150, loc22[2]);
		ontologylink.setSize(120, 30);
		ontologylink.setEnabled(false);
		ontologylink.addActionListener(this);
		ontologylink.setForeground(Color.GREEN);
		ontologylink.setOpaque(false);
		ontologylink.setContentAreaFilled(false);
		ontologylink.setBorderPainted(false);
		buttonPanel.add(ontologylink);


		ontologyStatuslink = new JButton("Link");


		ontologyStatuslink.setLocation(150, loc[3]);
		if(le)
			ontologyStatuslink.setLocation(150, loc22[3]);
		ontologyStatuslink.setSize(120, 30);
		ontologyStatuslink.setEnabled(false);
		ontologyStatuslink.addActionListener(this);
		ontologyStatuslink.setForeground(Color.GREEN);
		ontologyStatuslink.setOpaque(false);
		ontologyStatuslink.setContentAreaFilled(false);
		ontologyStatuslink.setBorderPainted(false);
		buttonPanel.add(ontologyStatuslink);

		stepFilelink = new JButton("Link");
		stepFilelink.setLocation(150, loc[4]);
		if(le)
			stepFilelink.setLocation(150, loc22[4]);
		stepFilelink.setSize(120, 30);

		stepFilelink.addActionListener(this);
		stepFilelink.setForeground(Color.GREEN);
		stepFilelink.setOpaque(false);
		stepFilelink.setEnabled(false);
		stepFilelink.setContentAreaFilled(false);
		stepFilelink.setBorderPainted(false);
		buttonPanel.add(stepFilelink);

		learshkuf = new JButton("LINK OUT FILE");
		learshkuf.setLocation(400, 200);

		learshkuf.setSize(150, 30);

		learshkuf.addActionListener(this);
		learshkuf.setForeground(Color.GREEN);
		learshkuf.setOpaque(false);
		learshkuf.setEnabled(false);
		learshkuf.setContentAreaFilled(false);
		learshkuf.setBorderPainted(false);
		
		buttonPanel.add(learshkuf);
	
		clearlog = new JButton("CLEAR LOG");
		clearlog.setLocation(400, 200);

		clearlog.setSize(150, 30);
		clearlog.addActionListener(this);
		clearlog.setEnabled(false);

		if(lookresult){
			//readarray();
			clearlog.setEnabled(true);
			learshkuf.setEnabled(true);
			stepFilelink.setEnabled(true);
			ontologylink.setEnabled(true);
			
			ontologyStatuslink.setEnabled(true);
			pathProlink.setEnabled(true);
			saveAslink.setEnabled(true);
			start.setEnabled(true);
			clearresu.setEnabled(true);
			clearAll.setEnabled(true);
			
			readresult();
		}


		titlePanel.setOpaque(false);
		_resultArea = new JTextArea(1, 40);
		_resultArea.setSize(100, 100);
		if(lookresult){
			//spliteLine();
			_resultArea.setText(result);
			clearresu.setEnabled(true);
		}
		else{
			_resultArea.setText("what you want to check???");
		
			//writeres("false");
		}
		_resultArea.setDisabledTextColor(Color.RED);
		_resultArea.setBackground(Color.BLACK);
		_resultArea.setEnabled(false);
		JScrollPane scrollingArea = new JScrollPane(_resultArea);
		scrollingArea.setSize(20, 20);


		buttonPanel.setLayout(new BorderLayout());

		buttonPanel.add(scrollingArea, BorderLayout.EAST);

		totalGUI.setOpaque(true);
		return totalGUI;
	}

	private void readarray() {
		
				BufferedReader in;
				result="";
				try{
					int o=0;
					in = new BufferedReader(new FileReader("array"));
					String s;

					while((s = in.readLine()) != null){
						arr[o][0] = s;
						o++;
					}
					in.close();
				}catch(Exception e){
					e.printStackTrace();
				}
	}

	private void def() {
		// TODO Auto-generated method stub
		loc[0]=50;
		loc[1]=100;
		loc[2]=150;
		loc[3]=200;
		loc[4]=250;
		loc4[0]=50;
		loc4[1]=100;
		loc4[2]=150;
		loc4[3]=200;
		loc4[4]=250;
		loc1111[0]=50;
		loc1111[1]=100;
		loc1111[2]=150;
		loc1111[3]=200;
		loc1111[4]=250;
		St[0]="path";
		St[1]="saveas";
		St[2]="ontology";
		St[3]="ontologystatus";
		St[4]="step";

		arrr[0]=readcounter(St[0]);	
		arrr[1]=readcounter(St[1]);
		arrr[2]=readcounter(St[2]);
		arrr[3]=readcounter(St[3]);
		arrr[4]=readcounter(St[4]);
		arrr[0]=readcounter(St[0]);
		checkarr();
		arrr2[0]=readcounter(St[0]);
		arrr2[1]=readcounter(St[1]);
		arrr2[2]=readcounter(St[2]);
		arrr2[3]=readcounter(St[3]);
		arrr2[4]=readcounter(St[4]);	

	}

	private void readres() {
		// TODO Auto-generated method stub
		Scanner s = null;
		try {
			//notice the path is fully qualified path
			try {
				s = new Scanner(new File("result"));
				//JOptionPane.showMessageDialog(null,  "yes:goooddddd ");
				//check=1;
				check=s.nextLine();
				if(check.equals("true"))
					lookresult=true;
				//JOptionPane.showMessageDialog(null,  check);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (s.hasNext()) {
				//System.out.println(s.next());

			}
		} finally {
			if (s != null) {
				s.close();
			}
		}


	}

	private void readresult() {
		
		BufferedReader in;
		
		result="";
		try{
			in = new BufferedReader(new FileReader("/home/student/workspace/ProjectDan/out/log.log"));
			String s;
			lineError=0;
			while((s = in.readLine()) != null){
				if(lineError>=countersum){
				countersum++;
				lineError++;
				String aaaa = checkREprin(s);
				//countersum=lineError;
				//if(!s.equals(" "))
					result=result+aaaa+'\n';
				}else{
					lineError++;
				
				}
			}
				
			
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void inint3() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
			for(int j=0;j<2;j++)
				newarrr[i][j]=" ";
	}

	private void shorting() {

		for(int a=0;a<5;a++)
			for(int aaaaa=0;aaaaa<5;aaaaa++)
				if(newarrr[aaaaa][1].equals(St[a]))

					//if()
					loc22[a]=loc[4-aaaaa];
	}

	private void checkLerana() {
		// TODO Auto-generated method stub
		Scanner s = null;
		try {
			
			try {
				s = new Scanner(new File("learn"));
				
				check=s.nextLine();
				if(check.equals("true"))
					le=true;
				if(check.equals("false"))
					le=false;
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (s.hasNext()) {
			}
		} finally {
			if (s != null) {
				s.close();
			}
		}

	}
	private void checktwo() {	
		for(int aa=0;aa<5;aa++)
			for(int ii=0;ii<5;ii++)
				if(newarrr[ii][0].equals(Integer.toString(arrr2[aa]))){
					if(newarrr[ii][1].equals(" "))	{
						newarrr[ii][1]=St[aa];
						rec[aa]=arrr2[aa];
						arrr2[aa]=0;
						;}
				}
		for(int aa=0;aa<5;aa++)
			arrr2[aa]=rec[aa];
	}

	private void checkarr() {
		//int[] arrrrrr=arrr2;
		Arrays.sort(arrr);
		int vv=0;
		System.out.println(Arrays.asList(arrr));
		for (int number : arrr) {
			newarrr[vv][0]=Integer.toString(number);
			// System.out.println("Number = " + number);
			vv+=1; 
		}
	}

	private int readcounter(String  val) {
		// TODO Auto-generated method stub
		Scanner ss = null;
		try {
			try {
				ss = new Scanner(new File(val));
				check=ss.nextLine();
				danadn=Integer.parseInt(check);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (ss.hasNext()) {
				System.out.println(ss.next());

			}
		} finally {
			if (ss != null) 
				ss.close();

		}
		return danadn;
	}
	private void inint() {
		// TODO Auto-generated method stub
		for(int w=0;w<5;w++){
			arr[w][0]="";
			inti2();
		}
	}

	private void inti2() {
		for(int w=0;w<5;){
			arr[0][1]="save as";
			arr[1][1]="path project";
			arr[2][1]="ontology";
			arr[3][1]="ontologyStatus";
			arr[4][1]="file step";
			w++;
		}


	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lear)
		{

			checkLerana();
			if(le){
				learn111();
				//readres();

				def();//defenition

				checktwo();//
				shorting();//short

				//def();
				pathPro.setLocation(0, loc1111[0]);
				saveAs.setLocation(0, loc1111[1]);
				ontology.setLocation(0, loc1111[2]);
				ontologyStatus.setLocation(0, loc1111[3]);
				stepFile.setLocation(0, loc1111[4]);
				pathProlink.setLocation(150, loc1111[0]);
				saveAslink.setLocation(150, loc1111[1]);
				ontologylink.setLocation(150, loc1111[2]);
				ontologyStatuslink.setLocation(150, loc1111[3]);
				stepFilelink.setLocation(150, loc1111[4]);

			}
			if(!le){
				//checkLerana();
				dontlearn();

				//readres();
				def();//defenition

				checktwo();//
				shorting();//short
				pathPro.setLocation(0, loc22[0]);
				saveAs.setLocation(0, loc22[1]);
				ontology.setLocation(0, loc22[2]);
				ontologyStatus.setLocation(0, loc22[3]);
				stepFile.setLocation(0, loc22[4]);
				pathProlink.setLocation(150, loc22[0]);
				saveAslink.setLocation(150, loc22[1]);
				ontologylink.setLocation(150, loc22[2]);
				ontologyStatuslink.setLocation(150, loc22[3]);
				stepFilelink.setLocation(150, loc22[4]);
			}
	
		
		}
		if(e.getSource() == clearlog)
		{
	//		
			
			} 
		if(e.getSource() == pathPro)
		{
	//		asda();
			//progrssBar1();
			clearAll.setEnabled(true);
			saveOneClick("path");
			final JFileChooser fc1 = new JFileChooser(david);
			JList list1 = new JList();
			fc1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			String s;
			if (JFileChooser.APPROVE_OPTION == fc1.showOpenDialog(list1)) {
				file = fc1.getSelectedFile().getName().toLowerCase();
				arr[0][0]=file;
				arr[0][1]="path project";
				pathProlink.setEnabled(true);
				checkAndSend(file);
				pathProlink.setEnabled(true);
				file = file.toUpperCase();
				ckeckstart();
				clearAll.setEnabled(true);
				
				 
			}
			

		}
		 if(e.getSource() == saveAs)
		{
			 clearAll.setEnabled(true);
			 saveOneClick("saveas");
			 final JFileChooser fc = new JFileChooser(david);
				JList list = new JList();
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if (JFileChooser.APPROVE_OPTION == fc.showOpenDialog(list)) {
					file = fc.getSelectedFile().toString()+"/";
					arr[1][0]=file;
					//JOptionPane.showMessageDialog(null, arr[0][0], "arr[0][0]", JOptionPane.QUESTION_MESSAGE);
					saveAslink.setEnabled(true);
					arr[1][1]="save file";
					//JOptionPane.showMessageDialog(null, arr[0][1], "arr[0][1]", JOptionPane.QUESTION_MESSAGE);
					checkAndSend(file);
					clearAll.setEnabled(true);
					ckeckstart();
					saveAs.setBackground(Color.WHITE);
					saveAs.setForeground(Color.BLACK);
					
				} 
			

		}
		if(e.getSource() == ontology)
		{
			clearAll.setEnabled(true);
			//ontologyStatus.setEnabled(true);
			saveOneClick("ontology");
			final JFileChooser fcontology = new JFileChooser(david);
			FileNameExtensionFilter filter = new FileNameExtensionFilter("xml file", "XML", "XML");
			fcontology.setFileFilter(filter);
			JList listontology = new JList();
			fcontology.setFileSelectionMode(JFileChooser.FILES_ONLY);
			if (JFileChooser.APPROVE_OPTION == fcontology.showOpenDialog(listontology)) {
				ontology.setBackground(Color.WHITE);
				//ontology.setBackground(Color.WHITE);
				fileontology = fcontology.getSelectedFile().toString();
				arr[2][0]=fileontology;
				ontologylink.setEnabled(true);
				arr[2][1]="file ontology";

				checkAndSend(arr[2][0]);
				ckeckstart();
				clearAll.setEnabled(true);
				
			}
		}
		if(e.getSource() == ontologyStatus)
		{
			//ckeckstart();
			clearAll.setEnabled(true);
			saveOneClick("ontologystatus");
			final JFileChooser fcontologyStatus = new JFileChooser(david);
			FileNameExtensionFilter filter = new FileNameExtensionFilter("xml file", "XML", "XML");
			fcontologyStatus.setFileFilter(filter);
			JList listontologyStatus = new JList();
			fcontologyStatus.setFileSelectionMode(JFileChooser.FILES_ONLY);
			if (JFileChooser.APPROVE_OPTION == fcontologyStatus.showOpenDialog(listontologyStatus)) {
				fileontologyStatus = fcontologyStatus.getSelectedFile().toString();
				arr[3][0]=fileontologyStatus;
				ontologyStatuslink.setEnabled(true);
				arr[3][1]="file ontology Status";
				checkAndSend(arr[3][0]);
				ckeckstart();

			
			}
		}
		if(e.getSource() == stepFile)
		{
			clearAll.setEnabled(true);

			saveOneClick("step");
			final JFileChooser fcstepFile = new JFileChooser(david);
			FileNameExtensionFilter filter = new FileNameExtensionFilter("rb file", "rb", "rb");
			fcstepFile.setFileFilter(filter);
			JList liststepFile = new JList();
			fcstepFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
			if (JFileChooser.APPROVE_OPTION == fcstepFile.showOpenDialog(liststepFile)) {
				filestepFile = fcstepFile.getSelectedFile().toString();
				//stepFilelink.setText(arr[4][0]);
				arr[4][0]=filestepFile;
				arr[4][1]="file step File";
				checkAndSend(arr[4][0]);
				stepFilelink.setEnabled(true);
				//String ntext=shorttext(arr[4][0]);
				stepFilelink.setText("LInk");
				ckeckstart();
				
			
			}
		}

		if(e.getSource() == start)
		{	
			
			
			resssssss=true;
			
			yy=false;
			if(arr[1][0].equals("/home/student/Documents/KoDEgen-master/Examples/ATM/features/")){
					try {

						//                	 ROJECT_NAME                             name of project
						//                	 PATH                                             path to save generated files
						//                	 ONTOLOGY_PATH                         ontology xml file 
						//                	 ONTOLOGY_STATES_PATH          ontology states xml file
						//                	 STEP_FILE_PATH                          steps file folder
						//
						
						resssssss=true;
					
						Steps.main(new String[]{arr[0][0],
							
								arr[1][0],
								arr[2][0],
								arr[3][0],
								arr[4][0]
								/*"ATM",
								"/home/student/Documents/KoDEgen-master/Examples/ATM/features/",
								"/home/student/Documents/KoDEgen-master/Examples/ATM/ATM.xml",
								"/home/student/Documents/KoDEgen-master/Examples/ATM/ATM_ontology_state.xml",
								"/home/student/Documents/KoDEgen-master/Examples/ATM/features/step_definitions/ATM_steps.rb"
/*
								"ATM",
								"/home/student/Documents/KoDEgen-master/Examples/ATM/features/",
								"/home/student/Documents/KoDEgen-master/Examples/ATM/ATM.xml",
								"/home/student/Documents/KoDEgen-master/Examples/ATM/ATM_ontology_state.xml",
						"/home/student/Documents/KoDEgen-master/Examples/ATM/features/step_definitions/ATM_steps.rb"
					*/	}
								);
						
					
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						

					}
					readresult();
					//	checkREprin();				
					_resultArea.setText(result);
					clearresu.setEnabled(true);
					learshkuf.setEnabled(true);
			}
			else{
			saveAs.setBackground(Color.RED);
			saveAs.setForeground(Color.WHITE);
			JOptionPane.showMessageDialog(null, "Error in Out Put (features): ","You neet to change the link", JOptionPane.ERROR_MESSAGE);
			}	
		}
		
		 if(e.getSource() == clearAll){
			for(int r=0;r<5;r++)
				arr[r][0]="";
			saveAslink.setEnabled(false);
			pathProlink.setEnabled(false);
			ontologylink.setEnabled(false);
			ontologyStatuslink.setEnabled(false);
			stepFilelink.setEnabled(false);
			start.setEnabled(false);
			clearAll.setEnabled(false);
			david="";
			//JOptionPane.showMessageDialog(null, "clear all valuse!","information", JOptionPane.INFORMATION_MESSAGE);
		}	
		if(e.getSource() == saveAslink)
		{
			if(arr[1][0]==""){
			//	JOptionPane.showMessageDialog(null, "no insert save as", "no path ", JOptionPane.ERROR_MESSAGE);}
			}
			else{
			//
				
				JOptionPane.showMessageDialog(null, arr[1][0], "Out Put ", JOptionPane.INFORMATION_MESSAGE);
				
			}

		}
		if(e.getSource() == pathProlink)
		{
			if(arr[0][0]==""){
			//	JOptionPane.showMessageDialog(null, "this is empty", "Name Project", JOptionPane.ERROR_MESSAGE);
				
			}
			else{
				JOptionPane.showMessageDialog(null, arr[0][0], "Name Project", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if(e.getSource() == ontologylink)
		{
			if(arr[2][0]==""){
			//	JOptionPane.showMessageDialog(null, "this is empty", "no path ", JOptionPane.ERROR_MESSAGE);
			}
			else{
				
				Desktop dt = Desktop.getDesktop();
				try {
					dt.open( new File(arr[2][0]) );
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ontology.setBackground(Color.WHITE);
				ontology.setForeground(Color.BLACK);
				
			}
		}
		if(e.getSource() == ontologyStatuslink)
		{
			if(arr[3][0]==""){
			//	JOptionPane.showMessageDialog(null, "this is empty", "no path ", JOptionPane.ERROR_MESSAGE);
			}
			else{

				Desktop dt = Desktop.getDesktop();
				try {
					dt.open( new File(arr[3][0]) );
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}}
		if(e.getSource() == stepFilelink)
		{
			if(filestepFile==""){}
			//	JOptionPane.showMessageDialog(null, "no insert path file", "no path ", JOptionPane.ERROR_MESSAGE);
			else{
				Desktop dt = Desktop.getDesktop();
			
			
				try {
					dt.open( new File(arr[4][0]) );
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			//JOptionPane.showMessageDialog(null,"step file... ");

		}
		if(e.getSource() == learshkuf)
		{
			checkLerana();
			if(true){
				Desktop dt = Desktop.getDesktop();
				
					try {
						dt.open( new File("/home/student/workspace/ProjectDan/out/log.log") );
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		}
		if(e.getSource() == clearresu)
		{
			if(lookresult)
				clearresu.setEnabled(false);
			learshkuf.setEnabled(false);
			_resultArea.setText("what do you want to check?");
			
		}
		
		
	}

	private void writeLog() throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub

		PrintWriter writer = new PrintWriter("/home/student/workspace/ProjectDan/out/log.log", "UTF-8");
		//JOptionPane.showMessageDialog(null,  "yes: ");
		writer.println("");
		//writer.println("The second line");F
		writer.close();
		
	}

	

	private String checkREprin(String li) {
		
		String[] out = li.split(" ");
		
			String d,dd;
			if(out[1].equals("ERROR") && out[4].equals("Parsing")){
					 d=out[out.length-1];
					 
					d= d.substring(5);
					checkErrorB(d);
					
					// String removeCurrency=d.getText().toString().substring(3);
					//JOptionPane.showMessageDialog(null, d , "ERROR:", JOptionPane.ERROR_MESSAGE);
		
		}
			if(out[1].equals("ERROR") && out[4].equals("XML") && out[5].equals("document")){
				String as="";
				for(int i=3;i<out.length;i++){
					as=as+out[i] + " " ;
											}
				whatFix(as);
				
	}
			
			if(out[1].equals("ERROR") && out[4].equals("The") && out[5].equals("element")){
				String as="";
				for(int i=3;i<out.length;i++){
					as=as+out[i] + " " ;
											}
				whatFix(as);
				
				
	}
			if(out[1].equals("ERROR") && out[3].equals("Root")){
				JOptionPane.showMessageDialog(null, "this problem dont can to fix", "ERROR:", JOptionPane.ERROR_MESSAGE);
	}
		lineError++;
		return li;	
	}

	private void whatFix(java.lang.String dd) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, dd , "TIP FOR FIX:", JOptionPane.INFORMATION_MESSAGE);
	}

	private void checkErrorB(java.lang.String d) {
		// TODO Auto-generated method stub
		if(d.equals(arr[2][0])){
			//JOptionPane.showMessageDialog(null, "perfect", "TIP: ", JOptionPane.CANCEL_OPTION);
			ontology.setBackground(Color.RED);
			ontology.setBackground(Color.RED);
		}	
	}

	private void learn111() {
		// TODO Auto-generated method stub
		lear.setBackground(Color.WHITE);
		lear.setForeground(Color.RED);
		try {
			writelern("false");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dontlearn() {
		// TODO Auto-generated method stub
		lear.setBackground(Color.RED);
		lear.setForeground(Color.WHITE);
		try {
			writelern("true");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void ckeckstart() {

		// TODO Auto-generated method stub
		if(arr[0][0].equals("") ||arr[1][0].equals("") ||arr[2][0].equals("") ||arr[3][0].equals("") ||arr[4][0].equals("")){
			start.setEnabled(false);

		}
		else
			start.setEnabled(true);
	}

	private void writelern(java.lang.String string2) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub

		PrintWriter writer = new PrintWriter("learn", "UTF-8");
		//JOptionPane.showMessageDialog(null,  "yes: ");
		writer.println(string2);
		//writer.println("The second line");
		writer.close();


	}

	private void saveOneClick(java.lang.String string2){//insert 1
		// TODO Auto-generated method stub
		Scanner ss = null;
		try {
			//notice the path is fully qualified path
			try {
				ss = new Scanner(new File(string2));
				
				String dan=ss.nextLine();
				foo = Integer.parseInt(dan);
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			while (ss.hasNext()) {
				System.out.println(ss.next());

			}
		} finally {
			if (ss != null) {
				ss.close();
				try {
					writeto(string2, foo+1);
					//System.out.println("aaaaaa");
				} catch (FileNotFoundException e) {
					//System.out.println("avcvvcxa");
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}









	private void writeto(java.lang.String string2, int i) throws FileNotFoundException, UnsupportedEncodingException  {
		PrintWriter writer = new PrintWriter(string2, "UTF-8");
		//JOptionPane.showMessageDialog(null,  "yes: ");
		writer.println(i);
		//writer.println("The second line");
		writer.close();
	}

	private java.lang.String checkAndSend(java.lang.String arr2) {
		david=arr2;
		return david;
	}

	private static void createAndShowGUI() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("GUI EDcode");
		
		PorjectDan demo = new PorjectDan();
		frame.setContentPane(demo.createContentPane());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(1650,1080);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setVisible(true);


		read();

		select();
	}

	private static void read() {
		// TODO Auto-generated method stub
		Scanner s = null;
		try {
			//notice the path is fully qualified path
			try {
				s = new Scanner(new File("checkFile.txt"));

				check=s.nextLine();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (s.hasNext()) {

			}
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	public static void newfile( ) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer = new PrintWriter("checkFile.txt", "UTF-8");
		writer.println("false");		
		writer.close();
	}
	private static void select() {
		if (check.equals("true"))
		{

			JFrame frame = new JFrame("Tutorial initial operation");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			TextArea textArea=new TextArea(getStrinaaag(),20,110);
			frame.add(textArea);
			textArea.setBackground(SystemColor.info); // yellow
			//textArea.setSelectionStart(5);
			textArea.setEditable(false);
			frame.setLayout(new FlowLayout());
			frame.setSize(500,680);
			frame.setVisible(true);


			frame.pack();
			//frame.setVisible(true);

			JCheckBox checkBox = new JCheckBox(DESELECTED_LABEL);

			// Define ActionListener
			ActionListener actionListener = new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					AbstractButton abstractButton = (AbstractButton)actionEvent.getSource();
					boolean selected = abstractButton.getModel().isSelected();

					String newLabel = (selected ? SELECTED_LABEL : DESELECTED_LABEL);
					if (selected){
						try {
							newfile();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (UnsupportedEncodingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					abstractButton.setText(newLabel);
				}
			};
			ChangeListener changeListener = new ChangeListener() {
				public void stateChanged(ChangeEvent changeEvent) {
					AbstractButton abstractButton = (AbstractButton)changeEvent.getSource();
					ButtonModel buttonModel = abstractButton.getModel();
					boolean armed = buttonModel.isArmed();
					boolean pressed = buttonModel.isPressed();
					boolean selected = buttonModel.isSelected();
					System.out.println("Changed: " + armed + "/" + pressed + "/" + selected);
				}
			};

			ItemListener itemListener = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					AbstractButton abstractButton = (AbstractButton)itemEvent.getSource();
					Color foreground = abstractButton.getForeground();
					Color background = abstractButton.getBackground();
					int state = itemEvent.getStateChange();
					if (state == ItemEvent.SELECTED) {
						abstractButton.setForeground(background);
						abstractButton.setBackground(foreground);
					}
				}
			};

			checkBox.addActionListener(actionListener);
			checkBox.addChangeListener(changeListener);
			checkBox.addItemListener(itemListener);
			checkBox.setMnemonic(KeyEvent.VK_S);
			Container contentPane = frame.getContentPane();
			contentPane.add(checkBox, BorderLayout.PAGE_END);
			frame.setSize(950, 450);
			frame.setLocation(400,200);
			frame.setVisible(true);
		}
	}
	private static java.lang.String getStrinaaag() {
		// TODO Auto-generated method stub
		String retu="";

		retu="This document is meant to assist users prior to writing their software " +'\n'+'\n'+
				"   1)Path Project Button – The user must choose the relevant project, both the file name and the project name must be the same." +'\n'+'\n'+
				"   2)Save As – The user must choose an output folder in order to get a result/error." +'\n'+'\n'+
				"   3)Ontology - The user must choose a file which contains ontology.XML" +'\n'+'\n'+
				"   4)Ontology Status – The user must choose a file which contains ontologystatus.xml" +'\n'+'\n'+
				"   5)Step File – The user must choose a file which contains stepfile.rb" +'\n'+'\n'+
				"   6)Start – If all required files have been chosen, the user may click “Start” and run the test." +'\n'+'\n'+
				"   7)Clear All – If the user wishes to delete the chosen files, the user may click “Clear All” and the chosen files will be deleted." +'\n'+'\n'+
				"   8)If you wish to hide the tutorial, click close the window."	;

		return retu;
	}
	public static void main(String[] args) {
		//	writeresufalse();

		checkfile();

		createAndShowGUI();
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		/*SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				try {

					//                	 ROJECT_NAME                             name of project
					//                	 PATH                                             path to save generated files
					//                	 ONTOLOGY_PATH                         ontology xml file 
					//                	 ONTOLOGY_STATES_PATH          ontology states xml file
					//                	 STEP_FILE_PATH                          steps file folder
					//

					Steps.main(new String[]{"ATM",
							"/home/student/Documents/KoDEgen-master/Examples/ATM/features/",
							"/home/student/Documents/KoDEgen-master/Examples/ATM/ATM.xml",
							"/home/student/Documents/KoDEgen-master/Examples/ATM/ATM_ontology_state.xml",
					"/home/student/Documents/KoDEgen-master/Examples/ATM/features/step_definitions/ATM_steps.rb"});
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});*/
	}



	private static void checkfile() {
		File f = new File("checkFile.txt");
		if(!(f.exists())){
			System.out.println("yes");
		}
		else{
			System.out.println("fail");
		}
	}


}
