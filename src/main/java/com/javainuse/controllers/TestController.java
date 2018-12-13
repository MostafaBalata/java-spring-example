package com.javainuse.controllers;

import com.github.javafaker.Faker;
import com.javainuse.model.Account;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TestController {


  private Account generateAccount() {
    Faker faker = new Faker();

    Account emp = new Account();
    emp.setName(faker.name().name());
    emp.setTrackId(faker.idNumber().valid());
    emp.setDomain(faker.idNumber().invalid());
    return emp;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Listing firstPage() {
    ArrayList<Account> accounts = new ArrayList<Account>();

    for (Integer i = 0; i < 20; i++) {
      accounts.add(generateAccount());
    }


    return new Listing(20, 1, accounts);
  }

  @RequestMapping(value = "/", method = RequestMethod.GET, params = {"search", "page"})
  public Listing firstPage(@RequestParam String search) {
    ArrayList<Account> accounts = new ArrayList<Account>();
    accounts.add(generateAccount());
    return new Listing(1, 1, accounts);
  }

  @SuppressWarnings("unused")
  Listing getFallback() {
    System.err.println("Timeout Timeout Timeout");
    return new Listing(0, 0, new ArrayList<Account>());
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Account magicService() {
    return generateAccount();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.POST)
  public Account create(@PathVariable String id) {
    Faker faker = new Faker();
    System.out.println("ID: " + id);
    Account emp = new Account();
    emp.setName(faker.name().name());
    emp.setTrackId(faker.idNumber().valid());
    emp.setDomain(faker.idNumber().invalid());
    System.out.println(emp.toString());
    return emp;
  }
}
