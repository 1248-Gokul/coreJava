package com.chainsys.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.services.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	DoctorService drservice;

	@GetMapping("/doclist")
	public String getAllDoctor(Model model) {
		List<Doctor> doclist = drservice.getdoctor();
		model.addAttribute("alldoctor", doclist);
		return "list-doctors";
	}

	@GetMapping("/finddoctorid")
	public String findDoctorById(@RequestParam("docId") int id, Model model) {
		Doctor thedoc = drservice.findById(id);
		model.addAttribute("finddoctorbyid", thedoc);
		return "find-doctor-id-form";
	}

	@GetMapping("/adddocform")
	public String showAddForm(Model model) {
		Doctor thedoc = new Doctor();
		model.addAttribute("addDoctor", thedoc);
		return "add-doctor-form";
	}

	@PostMapping("/adddoc")
	public String addNewEmployees(@ModelAttribute("addDoctor") Doctor thedoc) {
		drservice.save(thedoc);
		return "redirect:/doctor/doclist";
	}

	@GetMapping("/updatedocform")
	public String showUpdateForm(@RequestParam("docId") int id, Model model) {
		Doctor thedoc = drservice.findById(id);
		model.addAttribute("updatedoctor", thedoc);
		return "update-doctor-form";
	}

	@PostMapping("/updatedoc")
	public String updateEmployees(@ModelAttribute("updatedoctor") Doctor thedoc) {
		drservice.save(thedoc);
		return "redirect:/doctor/doclist";
	}

	@GetMapping("/deletedoctor")
	public String deleteDoctors(@RequestParam("docId") int id) {
		drservice.findById(id);
		return "redirect:/doctor/doclist";
	}

	@GetMapping("/getdocapp")
	public String getAppointmnets(@RequestParam("id") int id, Model model) {
		DoctorAppointmentsDTO dto = drservice.getdoctorAndAppointments(id);
		model.addAttribute("getdoc", dto.getDoctor());
		model.addAttribute("applist", dto.getAppointment());
		return "list-doctor-appointment";
	}

	@GetMapping("/trans")
	public void testTransaction(@RequestParam("id") int id) {
		DoctorAppointmentsDTO dto = new DoctorAppointmentsDTO();
		Doctor dr = new Doctor();
		dr.setDoc_id(id);
		dr.setDoc_name("Gokul");
		Date drdob = new Date(98, 05, 14);
		dr.setDob(drdob);
		dr.setSpeciality("Ear");
		dr.setCity("Theni");
		dr.setPhone_no(757458349l);
		dr.setFees(2000);
		dto.setDoctor(dr);
		List<Appointment> applist = new ArrayList<Appointment>();
		for (int i = 0; i <= 5; i++) {
			Appointment app = new Appointment();
			app.setAPPOIMENT_ID(i);
			Date dt = new Date(22, 07, 25);
			app.setAPPOIMENT_DATE(dt);
			app.setDOC_ID(id);
			app.setPATIENT_NAME("Praveena");
			app.setFEES_COLLECTED(i * 500);
			dto.addAppointment(app);

		}
	}
}