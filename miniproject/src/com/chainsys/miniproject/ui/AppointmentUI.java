package com.chainsys.miniproject.ui;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import java.util.Iterator;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;
import com.chaisys.miniproject.commonutil.InvalidInputDataException;
import com.chaisys.miniproject.commonutil.Validator;
public class AppointmentUI {
	
		public static void appointmentOption() {
			Scanner sc=new Scanner(System.in);
			System.out.println("press 1 for add new appointment");
			System.out.println("press 2 for see the appointment details");
			System.out.println("press 3 for see all appointments detail");
			System.out.println("press 4 for update appointment details");
			System.out.println("press 5 for delete appointment detail");
			System.out.println("press 6 for update patient by appointment id");
			System.out.println("press 7 for update collected fees");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				addNewAppointment();
				break;
			case 2:
				getPatientById();
				break;
			case 3:
				 updateAppointment();
				break;
			case 4:
				deleteAppointment();
				break;
			case 5:
				getAllAppointmentDetails();
				break;
//			case 6:
//				updatePatientName();
//				break;
//			case 7:
//				updateCollectedfees();
//				break;
			default:
				System.out.println("enter the number 7 and below");
			}
		}
			public static void addNewAppointment() {
				Scanner sc = new Scanner(System.in);
				Appointment newapp = new Appointment();
				System.out.println("Enter Appointment Id: ");
				String id =sc.nextLine();
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				int apId = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(apId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newapp.setAPPOIMENT_ID(Integer.parseInt(id));
				Calendar c1 = Calendar.getInstance();
				java.util.Date newDate =c1.getTime();
				newapp.setAPPOIMENT_DATE(newDate);
				System.out.println("Enter Patient_Name: ");
				String name = sc.nextLine();
				try {
					Validator.checkStringForParse(name);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newapp.setPATIENT_NAME(name);
				System.out.println("Enter Doctor ID: ");
				String id1 = sc.nextLine();
				try {
					Validator.checkStringForParse(id1);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				int docId = Integer.parseInt(id1);
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newapp.setDOC_ID(docId);				
				System.out.println("Enter Standard_Fees: ");
				float fees = sc.nextFloat();
				try {
					Validator.checkfee(fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newapp.setFEES_COLLECTED(fees);
				int result = AppointmentDao.insertAppointment(newapp);
				System.out.println(result);
				}
			
				public static void updateAppointment() {
					java.util.Scanner sc = new java.util.Scanner(System.in);
					try {
						Appointment newap = new Appointment();
						System.out.println("Enter Appointment_id :");
						String id = sc.nextLine();
						try {
							Validator.checkStringForParse(id);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						int apId = Integer.parseInt(id);
						try {
							Validator.CheckNumberForGreaterThanZero(apId);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						newap.setAPPOIMENT_ID(apId);

						Calendar c1 = Calendar.getInstance();
						java.util.Date newDate = new java.util.Date();
						newap.setAPPOIMENT_DATE(newDate);
						System.out.println("Enter Update Doctor_Id :");
						String id1 = sc.nextLine();
						try {
							Validator.checkStringForParse(id1);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						int docId = Integer.parseInt(id1);
						try {
							Validator.CheckNumberForGreaterThanZero(docId);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						newap.setDOC_ID(docId);
						System.out.println("Enter Update Patient Name :");
						String name = sc.nextLine();
						try {
							Validator.checkStringForParse(name);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						newap.setPATIENT_NAME(name);
						System.out.println("Enter Update Fees Collected :");
						float fees = sc.nextFloat();
						try {
							Validator.checkfee(fees);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						newap.setFEES_COLLECTED(fees);
						int result = AppointmentDao.updateAppointment(newap);
						System.out.println(result);
					} finally {
						sc.close();
					}
				}
				public static void deleteAppointment() {
					java.util.Scanner sc = new java.util.Scanner(System.in);
					try {
						Appointment newap = new Appointment();
						System.out.println("Enter Appointment_id :");
						String id = sc.nextLine();
						try {
							Validator.checkStringForParse(id);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						int apId = Integer.parseInt(id);
						try {
							Validator.CheckNumberForGreaterThanZero(apId);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						newap.setAPPOIMENT_ID(apId);
						int result = AppointmentDao.deleteAppointment(Integer.parseInt(id));
						System.out.println(result);
					} finally {
						sc.close();
					}
				}

				public static void getPatientById() {
					java.util.Scanner sc = new java.util.Scanner(System.in);
					try {
						Appointment newap = new Appointment();
						System.out.println("Enter Appointment_id :");
						String id = sc.nextLine();
						try {
							Validator.checkStringForParse(id);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						int apId = Integer.parseInt(id);
						try {
							Validator.CheckNumberForGreaterThanZero(apId);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
							return;
						}
						newap.setAPPOIMENT_ID(apId);
						Appointment result = AppointmentDao.getAppointmentById(Integer.parseInt(id));
						System.out.println(result.getAPPOIMENT_ID() + " " + result.getAPPOIMENT_DATE() + " " + result.getDOC_ID() + " "
								+ result.getPATIENT_NAME() + " " + result.getFEES_COLLECTED());
					} finally {
						sc.close();
					}
				}

				public static void getAllAppointmentDetails() {
					List<Appointment> allAppointments = AppointmentDao.getAllAppointment();
					Iterator<Appointment> apIterator = allAppointments.iterator();
					while (apIterator.hasNext()) {
						Appointment ap = apIterator.next();
						System.out.println(ap.getAPPOIMENT_ID() + " " + ap.getAPPOIMENT_DATE() + " " + ap.getDOC_ID() + " "
								+ ap.getPATIENT_NAME() + " " + ap.getFEES_COLLECTED());
					}
				}
			}

			