//package za.ca.cput.assignment5kaylin.serviceTests.churchClasses;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import za.ca.cput.assignment5kaylin.domain.churchClasses.BaptismClass;
//import za.ca.cput.assignment5kaylin.factory.churchClasses.BaptismClassFactory;
//import za.ca.cput.assignment5kaylin.service.churchClasses.implementation.BaptismClassServiceImplementation;
//
//import java.util.Set;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class BaptismClassServiceImplementationTest
//{
// @Autowired
// private BaptismClassServiceImplementation service;
// private Set<BaptismClass> classes;
// BaptismClass c1;
// BaptismClass c2;
//
// @Before
// public void setUp() throws Exception {
//  //this.baprep = BaptismClassRepositoryImplementation.getRepository();
// }
//
// @Test
// public void l_create()
// {
//  c1 = BaptismClassFactory.getBapClass("SC25", "08:15");
//  c2 = BaptismClassFactory.getBapClass("BC25", "16:00");
//  BaptismClass c = this.service.create(c1);
//  Assert.assertEquals(c1, c);
//  BaptismClass cc = this.service.create(c2);
//  Assert.assertEquals(c2, cc);
// }
//
// @Test
// public void m_read()
// {
//  String s = "BC25";
//  BaptismClass c1 = this.service.read(s);
//
//  Assert.assertEquals(s, c1.getClassNo());
//  System.out.println(c1.getClassNo() + c1.getClassTime());
// }
//
// @Test
// public void n_update()
// {
//  c1 = BaptismClassFactory.getBapClass("SC25", "08:15");
//  BaptismClass c = this.service.update(c1);
//  Assert.assertEquals(c1, c);
//  System.out.println(c.getClassNo() + "\n" +c.getClassTime());
// }
//
// @Test
// public void o_delete()
// {
//  String s = "SC25";
//  this.service.delete(s);
//  classes = this.service.getAll();
//  int size = classes.size();
//  Assert.assertEquals(classes.size(), size);
// }
//
// @Test
// public void p_getAll()
// {
//  classes = this.service.getAll();
//  Assert.assertEquals(2, classes.size());
//
//  System.out.println(classes.size());
// }
//}
