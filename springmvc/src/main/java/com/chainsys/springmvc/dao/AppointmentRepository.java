package com.chainsys.springmvc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.springmvc.pojo.Appointment;

	public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
		Appointment findById(long id);

		Appointment save(Appointment app);

		// use for adding a new Doctor
		void deleteById(long app_id);

		List<Appointment> findAll();
	}

