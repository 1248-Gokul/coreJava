package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Appointment;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;
import com.chaisys.miniproject.commonutil.InvalidInputDataException;
import com.chaisys.miniproject.commonutil.Validator;

/**
 * Servlet implementation class Appointment
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Appointments() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out= response.getWriter();
		List<Appointment> allAppointments = AppointmentDao.getAllAppointment();
		Iterator<Appointment> apIterator = allAppointments.iterator();
		while (apIterator.hasNext()) {
			Appointment ap = apIterator.next();
			out.println( ap.getAPPOIMENT_ID() + " " + ap.getAPPOIMENT_DATE() + " " + ap.getDOC_ID() + " "
					+ ap.getPATIENT_NAME() + " " + ap.getFEES_COLLECTED());
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("click").equals("ADD APPOINTMENT")) {
		PrintWriter out = response.getWriter();
		try {
			Appointment newapp = new Appointment();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int apId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(apId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newapp.setAPPOIMENT_ID(apId);
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("date");
			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.CheckNofutureDate(newDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newapp.setAPPOIMENT_DATE(newDate);
			String doc_id = request.getParameter("docId");
			try {
				Validator.checkStringForParse(doc_id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();

			}
			int apId1 = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(apId1);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();

			}
			newapp.setDOC_ID(Integer.parseInt(doc_id));
			String name = request.getParameter("name");
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();

			}
			newapp.setPATIENT_NAME(name);
			String fees = request.getParameter("fees");
			float feess = Float.parseFloat(fees);
			try {
				Validator.checkfee(feess);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newapp.setFEES_COLLECTED(feess);
			int result = AppointmentDao.insertAppointment(newapp);
			out.println(result + " row inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	 else if (request.getParameter("click").equals("Update APPOINTMENT")) {
        doPut(request, response);
    } else if (request.getParameter("click").equals("Delete")) {
        doDelete(request, response);
    }	
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try {
			Appointment newap = new Appointment();
			String id = request.getParameter("id");
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
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("date");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.CheckNofutureDate(newDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newap.setAPPOIMENT_DATE(newDate);
			String id1 = request.getParameter("docId");
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
			String name = request.getParameter("name");
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setPATIENT_NAME(name);
			String feess = request.getParameter("fees");
			float fees = Float.parseFloat(feess);
			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newap.setFEES_COLLECTED(fees);
			int result = AppointmentDao.updateAppointment(newap);
			out.println("<div> Update Appointment: " + result + "</div>");
		} finally {

		}

	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		Appointment newapp = null;
		int result = 0;
		int appId = 0;
		try {
			newapp = new Appointment();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			appId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(appId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newapp.setAPPOIMENT_ID(appId);
			result = AppointmentDao.deleteAppointment(appId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		out.println("<div> Delete Appointment: " + result + "</div>");
	}

}
	
	
		