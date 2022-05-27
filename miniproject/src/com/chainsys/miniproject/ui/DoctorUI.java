package com.chainsys.miniproject.ui;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chaisys.miniproject.commonutil.InvalidInputDataException;
import com.chaisys.miniproject.commonutil.Validator;
public class DoctorUI {
		public static void addNewDoctor() {
			Scanner sc = new Scanner(System.in);
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor Id: ");
			String id =sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId =sc.nextInt();
			newdoc.setDOC_ID(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringForParse(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			System.out.println("Enter Doctor Name: ");
			newdoc.setDOC_NAME(sc.nextLine());
			
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate =c1.getTime();
			newdoc.setDOB(newDate);
			System.out.println("Enter Specilyst: ");
			String sp = sc.nextLine();
			try {
				Validator.checkStringForParse(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			
			newdoc.setSPECIALITY(sc.nextLine());
			System.out.println("Enter City: ");
			String cy = sc.nextLine();
			try {
				Validator.checkStringForParse(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setCITY(sc.nextLine());
			System.out.println("Enter Phone_Number: ");
			newdoc.setPHONE_NO(sc.nextLong());			
			System.out.println("Enter Standard_Fees: ");
			float fees = sc.nextFloat();
			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setFEES(fees);
			newdoc.setFEES(sc.nextFloat());
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println(result);
		}

			public static void updateDoctor() {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
					Doctor newdoc = new Doctor();
					System.out.println("Enter Doctor_Id :");
					String id = sc.nextLine();
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					int docId = Integer.parseInt(id);
					newdoc.setDOC_ID(Integer.parseInt(id));
					try {
						Validator.CheckNumberForGreaterThanZero(docId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					Doctor doc = DoctorDao.getDoctorById(docId);
					if (doc == null) {
						System.out.println("Doctor Doesn't Exist For Id " + docId);
						return;
					}
					newdoc.setDOC_ID(docId);
					System.out.println("Enter Update Name :");
					String name = sc.nextLine();
					try {
						Validator.checkStringForParse(name);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setDOC_NAME(name);
//					newdoc.setDOC_NAME(name);
					Calendar c1 = Calendar.getInstance();
					java.util.Date newDate = new java.util.Date();
					newdoc.setDOB(newDate);
					System.out.println("Enter Update Speciality :");
					String sp = sc.nextLine();
					try {
						Validator.checkStringForParse(sp);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setSPECIALITY(sp);
					// newdoc.setSpeciality(sc.nextLine());
					System.out.println("Enter Update City :");
					String cy = sc.nextLine();
					try {
						Validator.checkStringForParse(cy);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setCITY(cy);
					System.out.println("Enter Update Phone_Number");
					newdoc.setPHONE_NO(sc.nextLong());
					System.out.println("Enter Update Standard_Fees :");
					float fees = sc.nextFloat();
					try {
						Validator.checkfee(fees);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setFEES(fees);
					int result = DoctorDao.updateDoctor(newdoc);
					System.out.println(result);
				} finally {
					sc.close();
				}
			}

			public static void updateDoctorFirstName() {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
					Doctor newdoc = new Doctor();
					System.out.println("Enter Doctor_Id :");
					String id = sc.nextLine();
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					int docId = Integer.parseInt(id);
					newdoc.setDOC_ID(Integer.parseInt(id));
					try {
						Validator.CheckNumberForGreaterThanZero(docId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					Doctor doc = DoctorDao.getDoctorById(docId);
					if (doc == null) {
						System.out.println("Doctor Doesn't Exist For Id " + docId);
						return;
					}
					newdoc.setDOC_ID(docId);
					System.out.println("Enter Update Name :");
					String name = sc.nextLine();
					try {
						Validator.checkStringForParse(name);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					newdoc.setDOC_NAME(name);
					int result = DoctorDao.updateDoctorFirstName(Integer.parseInt(id), name);
					System.out.println(result);
				} finally {
					sc.close();
				}
			}
			public static void deleteDoctor() {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
					Doctor newdoc = new Doctor();
					System.out.println("Enter Doctor_Id :");
					String id = sc.nextLine();
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					int docId = Integer.parseInt(id);
					newdoc.setDOC_ID(Integer.parseInt(id));
					try {
						Validator.CheckNumberForGreaterThanZero(docId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					Doctor doc = DoctorDao.getDoctorById(docId);

					if (doc == null) {
						System.out.println("Doctor Doesn't Exist For Id " + docId);
						return;
					}
					newdoc.setDOC_ID(docId);
					int result = DoctorDao.deleteDoctor(Integer.parseInt(id));
					System.out.println(result);
				} finally {
					sc.close();
				}
			}

			public static void getDoctorById() {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				try {
					Doctor newdoc = new Doctor();
					System.out.println("Enter Doctor_Id :");
					String id = sc.nextLine();
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					int docId = Integer.parseInt(id);
					newdoc.setDOC_ID(Integer.parseInt(id));
					try {
						Validator.CheckNumberForGreaterThanZero(docId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
						return;
					}
					Doctor doc = DoctorDao.getDoctorById(docId);
					if (doc == null) {
						System.out.println("Doctor Doesn't Exist For Id " + docId);
						return;
					}
					newdoc.setDOC_ID(docId);
					Doctor result = DoctorDao.getDoctorById(Integer.parseInt(id));
					System.out.println(result.getDOC_ID() + " " + result.getDOC_NAME() + " " + result.getDOB() + " "
							+ result.getSPECIALITY() + " " + result.getCITY() + " " + result.getPHONE_NO() + " "
							+ result.getFEES());
				} finally {
					sc.close();
				}
			}
			public static void getAllDoctorDetails() {
				List<Doctor> allDoctor = DoctorDao.getAllDoctor();
				Iterator<Doctor> drIterator = allDoctor.iterator();
				while (drIterator.hasNext()) {
					Doctor dr = drIterator.next();
					System.out.println(dr.getDOC_ID() + " " + dr.getDOC_NAME() + " " + dr.getDOB() + " " + dr.getSPECIALITY()
							+ " " + dr.getCITY() + " " + dr.getPHONE_NO() + " " + dr.getFEES());
				}
			}
		}