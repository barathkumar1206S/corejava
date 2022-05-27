package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.test.TestAppointment;
import com.chainsys.miniproject.test.TestDoctor;
import com.chainsys.miniproject.test.TestEmployeeDao;
import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {

public static void main(String[] args) {	
	loadmenu();
	

}


private static void loadmenu() {
	System.out.println("Enter menu:  ");
	java.util.Scanner sc=new 	java.util.Scanner(System.in);
try {
	int call=sc.nextInt();
	switch(call) {
	case 1:
		loadEmployee();
		break;
	case 2:
		loadDoctor();
		break;
	case 3:
		loadAppointment();
		break;
	}}
	finally {
		sc.close();
	}
}
private static void loadEmployee() {
	System.out.println("Enter Employee Method:");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	try {
		int call=sc.nextInt();
		switch(call) {
		case 1:
			EmployeeUi.addNewEmployee();
		break;
		case 2:
		EmployeeUi.viewEmployeeDetails();;
		break;
		case 3:
			EmployeeUi.ViewAllEmployeeDetails();
			break;
		case 4:
			EmployeeUi.updateEmpDetails();
			break;
		case 5:
			EmployeeUi.deleteEmpdetails();
			break;
		}}
		finally {
			sc.close();
		}

}
private static void loadDoctor() {
	System.out.println("Enter Doctor Method: ");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	try {
		int call = sc.nextInt();
		switch(call) {
		case 1:
			DoctorUi.addNewDoctor();
			break;
		case 2:
			DoctorUi.updateDocDetails();
			break;
		
		case 3:
			DoctorUi.viewDoctorDetails();
			break;
		case 4:
			DoctorUi.ViewAllDoctorDetails();
			break;
	   case 5:
	DoctorUi.deleteDoctordetails();
			break;
		}}
		finally {
			sc.close();
		}
	}
	
 
private static void loadAppointment() {
	System.out.println("Enter Appointment method:");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	try {
		int call=sc.nextInt();
		switch(call) {
		case 1:
			AppointmentUi.addNewAppointments();
			break;
		case 2:
			AppointmentUi.updateAppDetails();
			break;
		case 3:
			AppointmentUi.viewAppointmentDetails();
			break;
		case 4:
			AppointmentUi.ViewAllAppointmentDetails();
			break;
		case 5:
			AppointmentUi.deleteAppointmentDetails();
			break;
		}
	}
	finally {
		sc.close();
	}
	
}

}
