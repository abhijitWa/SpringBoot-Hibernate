package com.database;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

@RestController
public class Webapi {

	@Autowired
	SessionFactory sf;

	@PostMapping("insert")
	public Ab insert() {
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		Ab a = new Ab(15, "Abhijit", "Developer");
		ss.save(a);
		System.out.println(a);
		ts.commit();
		return a;
	}

	@PutMapping("update")
	public Ab update() {
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		Ab a = new Ab(12, "Abhijit", "Software Enge");
		ss.update(a);
		System.out.println(a);
		ts.commit();
		return a;
	}

	@DeleteMapping("delete")
	public Ab delete() {
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		Ab a = new Ab(12, "Abhijit", "Software Enge");
		ss.delete(a);
		System.out.println(a);
		ts.commit();
		return a;
	}

	@GetMapping("single")
	public Ab single() {
		Session ss = sf.openSession();
		Ab a = ss.get(Ab.class, 12);
		return a;
	}

	@GetMapping("Single/{id}")
	public Ab singlerecord(@PathVariable int id) {
		Session ss = sf.openSession();
		Ab a = ss.get(Ab.class, id);
		return a;
	}
	
	
	
	@PostMapping("insertb")
	public Ab insertb(@RequestBody Ab ab) {
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.save(ab);
		System.out.println(ab);
		ts.commit();
		return ab;
	}
	
	@PutMapping("updateb")
	public Ab updateb(@RequestBody Ab ab) {
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.update(ab);
		System.out.println(ab);
		ts.commit();
		return ab;
	}
	
	@DeleteMapping("deleteb")
	public Ab deleteb(@RequestBody Ab ab) {
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.delete(ab);
		System.out.println(ab);
		ts.commit();
		return ab;
	}
	
	
	@GetMapping("multiple")
	public List<Ab> multiple() {
		Session ss=sf.openSession();
		Query qr= ss.createQuery("from Ab");
		List<Ab> li=qr.list();
		for (Ab ab : li) {
			System.out.println(ab.getId()+" "+ab.getName()+" "+ab.getDesignation());
		}
		return li;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
