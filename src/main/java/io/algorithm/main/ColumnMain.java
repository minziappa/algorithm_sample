package io.algorithm.main;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class ColumnMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        String [][] table = null;
        int cntRow=0;
        int lenColumn = 0;
        int lenRow = 2;
        while (stdin.hasNext()) {

        	String strLine = stdin.nextLine().trim();
        	if(strLine.trim().equals(".")) {
        		break;
        	}

            String[] rowData = strLine.split(",");

        	if(cntRow==0) {

        		lenColumn = rowData.length;
            	table = new String[lenColumn][lenRow];
        		for(int i=0; i <lenColumn; i++) {
            		table[i][0] = rowData[i];
        		}
        		for(int k=0; k <lenColumn; k++) {
            		table[k][1] = "0";
        		}

        	} else {
        		for(int i=0; i < lenColumn; i++) {
            		table[i][1] = String.valueOf((Integer.valueOf(table[i][1]) + Integer.valueOf(rowData[i])));
        		}
        	}

    		cntRow++;
        }

        StringBuffer sb = new StringBuffer();

        // Have to make average in Here???
        for(int m=0; m < lenRow; m++) {
    		for(int n=0; n < table.length; n++) {
    			sb.append(table[n][m]).append(" ");
    		}
    		sb.append("\n");
        }
		System.out.print(sb.toString());

		stdin.close();
	}

}