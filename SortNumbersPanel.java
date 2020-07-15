package firstProject;

import java.lang.Math; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Arrays;

public class SortNumbersPanel extends JPanel {

	
	private JButton generate;
	private JButton sort; 
	//private String count;
	private JLabel label; 

	
	public SortNumbersPanel() {
		
		generate = new JButton("Generate!");
		sort = new JButton("Sort!");
		
		
		label = new JLabel("0, 0, 0, 0, 0, 0, 0, 0, 0, 0");
		
		ButtonListener listener = new ButtonListener();
		
		generate.addActionListener(listener);
		sort.addActionListener(listener);
		
		add(generate);
		add(sort);
		
		add(label);

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 400));
		
		
	
	}

	private class ButtonListener implements ActionListener {
		
		int[] arr = new int[10]; 
		

		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub

			
			if(event.getSource() == generate) {
				
				for(int i = 0; i < 10; i++) {
					arr[i] = (int)(Math.random() * 50 + 1); 
				}
				label.setText("Generated Sequence: " + Arrays.toString(arr));
				
			}
			
			else {
				selectionSort(arr);
				label.setText("Sorted Sequence: " + Arrays.toString(arr));
			}
			
			
		}
		
		
		public void selectionSort(int[] arr) {
			for(int i= 0; i < arr.length - 1; i++) {
				
				int min = i; 
				for (int j = i+1; j < arr.length; j++) {
					if(arr[j] < arr[min])
						min = j; 
				}
				
				int first = arr[min]; 
				arr[min] = arr[i]; 
				arr[i] = first; 
			}
		}

		}
	}


