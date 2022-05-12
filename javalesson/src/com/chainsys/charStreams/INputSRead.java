package com.chainsys.charStreams;

import java.io.IOException;
import java.io.InputStreamReader;

public class INputSRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
        InputStreamReader sr= new InputStreamReader(System.in);
        System.out.println("Enter characetr,'q' to quit");
        do
        {
            c=(char) sr.read();
            System.out.println(c);
        }
        while(c!='q');



	}

}
