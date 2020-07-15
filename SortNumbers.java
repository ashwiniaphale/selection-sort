package firstProject;


import javax.swing.JFrame; 


public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Sort Numbers"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SortNumbersPanel panel = new SortNumbersPanel(); 
		
		frame.getContentPane().add(panel);
		
		frame.pack(); 
		frame.setVisible(true); 
	}

}
