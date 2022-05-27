package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chaisys.miniproject.commonutil.InvalidInputDataException;
import com.chaisys.miniproject.commonutil.Validator;




/**
 * Servlet implementation class Doctors
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Doctors() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			out.println(dr.getDOC_ID() + " " + dr.getDOC_NAME() + " " + dr.getDOB() + " " + dr.getSPECIALITY()
					+ " " + dr.getCITY() + " " + dr.getPHONE_NO() + " " + dr.getFEES());
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("click").equals("Add Doctor")) {
		PrintWriter out = response.getWriter();
		try
		{
			Doctor doc=new Doctor();
		String id=request.getParameter("id");
		try {
			Validator.checkStringForParse(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		doc.setDOC_ID(docId);
		String name = request.getParameter("name");
		try {
			Validator.checkStringOnly(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		doc.setDOC_NAME(name);
		SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Doc_HireDate = request.getParameter("date");
		// Date hire_date=hire_dateFormate.parse(emp_HireDate);
		try {
			Validator.checkDateFormat(Doc_HireDate);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		Date newDate = null;
		try {
			newDate = hire_dateFormate.parse(Doc_HireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			Validator.CheckNofutureDate(newDate);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setDOB(newDate);
		String sp = request.getParameter("specilyst");
		try {
			Validator.checkStringOnly(sp);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		
		doc.setSPECIALITY(sp);
		String cy = request.getParameter("city");
		try {
			Validator.checkStringOnly(cy);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		doc.setCITY(cy);
		String Phone=request.getParameter("phone_no");
		try {
			Validator.checklengthOfPhno(Phone);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}		
		long phoneno=Long.parseLong(Phone);
		doc.setPHONE_NO(phoneno);
		String fee=request.getParameter("fees");
		float fees = Float.parseFloat(fee);
		try {
			Validator.checkfee(fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		doc.setFEES(fees);
		int result = DoctorDao.insertDoctor(doc);
		out.println("<div> Add New Doctor: "+result+"</div>");		
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}} else if (request.getParameter("click").equals("UPDATE DOCTOR")) {
        doPut(request, response);
    } else if (request.getParameter("click").equals("Delete Doctor")) {
        doDelete(request, response);
    }
}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			Doctor newdoc = new Doctor();
			String id = request.getParameter("id");
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
			out.println("Deleted successfully "+result);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try
		{
			Doctor doc=new Doctor();
		String id=request.getParameter("id");
		try {
			Validator.checkStringForParse(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		int docId = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(docId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		doc.setDOC_ID(docId);
		String name = request.getParameter("name");
		try {
			Validator.checkStringOnly(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		doc.setDOC_NAME(name);
		SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Doc_HireDate = request.getParameter("date");
		// Date hire_date=hire_dateFormate.parse(emp_HireDate);
		try {
			Validator.checkDateFormat(Doc_HireDate);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		Date newDate = null;
		try {
			newDate = hire_dateFormate.parse(Doc_HireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			Validator.CheckNofutureDate(newDate);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		doc.setDOB(newDate);
		String sp = request.getParameter("specilyst");
		try {
			Validator.checkStringOnly(sp);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		
		doc.setSPECIALITY(sp);
		String cy = request.getParameter("city");
		try {
			Validator.checkStringOnly(cy);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		doc.setCITY(cy);
		String Phone=request.getParameter("phone_no");
		try {
			Validator.checklengthOfPhno(Phone);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}		
		long phoneno=Long.parseLong(Phone);
		doc.setPHONE_NO(phoneno);
		String fee=request.getParameter("fees");
		float fees = Float.parseFloat(fee);
		try {
			Validator.checkfee(fees);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		doc.setFEES(fees);
		int result = DoctorDao.updateDoctor(doc);
		out.println("<div> Update Doctor: "+result+"</div>");		
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}	

}
}

	

	
		
	


