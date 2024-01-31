package com.example.SpringProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringProject.Entity.ContactUs;

public interface ContactRepo extends JpaRepository<ContactUs,Long> {

}
