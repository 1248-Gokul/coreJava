package com.chainsys.miniproject.entry;
import com.chainsys.miniproject.test.TestAppointment;
import com.chainsys.miniproject.ui.AppointmentUI;
import com.chainsys.miniproject.ui.DoctorUI;
import com.chainsys.miniproject.ui.EmployeeUi;
import com.chainsys.miniproject.ui.EmployeeUi;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.ui.EmployeeUi;
/**
 * 
 * @author goku3159
 *
 */
public class Startup {
	public static void main(String[] args) {
		//System.out.println("Enter 1 for Add ");
		//menu
		//scanner
		//switch case
//		EmployeeUI.addNewEmployee();
//		TestemployeeDao.testUpdateEmployee();
//		TestDoctor.testInsertDoctor();//success
		//TestDoctor.testgetAllDoctors();//success
//		TestDoctor.testUpdateDoctor();//Error
//		TestDoctor.testgetAllDoctors();//success
		//TestDoctor.testDeleteDoctor();
//		TestDoctor.testGetDoctorById();
//		DoctorUI.addNewDoctor();
//		TestAppointment.testGetAppointmentsById();
//		TestAppointment.testgetAllAppointments();
		//TestAppointment.testInsertAppointment();
//		TestAppointment.testUpdateAppointment();
//		TestAppointment.testDeleteAppointment();
//		AppointmentUI.addNewAppointment();
//		EmployeeUI.fetchEmployeeById();
//		EmployeeUI.addNewEmployee();
//		EmployeeUI.fetchAllEmployee();
//		EmployeeUI.updateEmployee();
//		EmployeeUI.updateFirstnameOfEmployee();
//		EmployeeUI.updateSalaryOfEmployee();
		loadMenu();
	}
			private static void loadMenu() {
				System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
				java.util.Scanner sc = new java.util.Scanner(System.in);
		      try {
				int call = sc.nextInt();
				switch (call) {
				case 1:
					loadEmployeeMenu();
					break;
				case 2:
					loadDoctorMenu();
					break;
				case 3:
					loadAppointmentMenu();
					break;
				}
		      }finally {
		    	  sc.close();
		      }
			}

			private static void loadEmployeeMenu() {
				System.out.println("Enter Employee Method : 1=addNewEmployee , 2=fetchAllEmployee , 3=fetchEmployeeById ,4=updateEmployee ,5=updateFirstnameOfEmployee ,6=updateSalaryOfEmployee , 7=deleteEmploye");
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
				int call = sc.nextInt();
				
				switch (call) {
				case 1:
					EmployeeUi.addNewEmployee();
					break;

				case 2:
					EmployeeUi.fetchAllEmployee();
					break;
				case 3:
					EmployeeUi.fetchEmployeeById();
					break;
				case 4:
					EmployeeUi.UpdateEmployee();
					break;
				case 5:
					EmployeeUi.updateFirstnameOfEmployee();
					break;
				case 6:
					EmployeeUi.updateSalaryOfEmployee();
					break;
				case 7:
					EmployeeUi.deleteEmployee();
					break;
				}
				}finally {
					sc.close();
				}
			}

			private static void loadDoctorMenu() {
				System.out.println("Enter Doctor Method : 1=addNewDoctor ,2=getDoctorById ,3=getAllDoctorDetails ,4=updateDoctor ,5=updateDoctorFirstName ,6=deleteDoctor ");
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
				int call = sc.nextInt();
				switch (call) {
				case 1:
					DoctorUI.addNewDoctor();
					break;
				case 2:
					DoctorUI.getDoctorById();
					break;
				case 3:
					DoctorUI.getAllDoctorDetails();
					break;
				case 4:
					DoctorUI.updateDoctor();
					break;
				case 5:
					DoctorUI.updateDoctorFirstName();
					break;
				case 6:
					DoctorUI.deleteDoctor();
					break;
				}
				}
				finally {
					sc.close();
				}
			}

			private static void loadAppointmentMenu() {
				System.out.println("Enter Method : 1=addNewAppointment ,2=appointmentOption ,3=getPatientById ,4=getAllAppointmentDetails ,5=updateAppointment ,6=deleteAppointment");
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
				int call = sc.nextInt();
				switch (call) {
				case 1:
					AppointmentUI.addNewAppointment();
					break;
				case 2:
					AppointmentUI.appointmentOption();
					break;
				case 3:
					AppointmentUI.getPatientById();
					break;
				case 4:
					AppointmentUI.getAllAppointmentDetails();
					break;
				case 5:
					AppointmentUI.updateAppointment();
					break;
				case 6:
					AppointmentUI.deleteAppointment();
					break;
//				case 7:
//					AppointmentUI.updateAppDetails();
//					break;
//				case 8:
//					AppointmentUI.deleteAppointmentDetails();
//					break;
//				case 9:
//					AppointmentUI.getRightOuterJoinDoctorAndAppointment();
//					break;
//				case 10:
//					AppointmentUI.getFullOuterJoinDoctorAndAppointment();
//					break;
				}
				}finally {
					sc.close();
				}
			
			}
	}

