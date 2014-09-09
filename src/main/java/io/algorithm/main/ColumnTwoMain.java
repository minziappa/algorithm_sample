package io.algorithm.main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ColumnTwoMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String entrada = "";

        int cntRow=0;
        int lenColumn = 0;
        int lenRow = 2;
    	String [][] table = null;

        while((entrada = br.readLine()) != null) {
        	String[] colume = entrada.split(",");

        	if(cntRow==0) {
        		lenColumn = colume.length;
            	table = new String[lenColumn][lenRow];
        	}

    		for(int i=0; i <lenColumn; i++) {
        		table[i][cntRow] = colume[i];
    		}

        	cntRow++;
        	if(cntRow == 3) {
        		break;
        	}
        }

        for(int m=0; m < table.length; m++) {
    		for(int n=0; n < table[0].length; n++) {
        		System.out.println(table[m][n]);
    		}
        }
	}

}