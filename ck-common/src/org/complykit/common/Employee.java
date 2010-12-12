package org.complykit.common;
/**
 * Users are often going to need to be able to write rules that 
 * implicate an employee in the company in one way or another.
 * 
 * Like the other objects in the common package, the idea 
 * here is to define just a simple base class. However, if another 
 * specialized problem domain needs to have a more specialized construct,
 * then it should define a subclass. For example, if the tax domain
 * needs more detail about a specific employee, then it should create a subclass
 * called TaxEmployee.
 * 
 * @author michael
 *
 */
public class Employee {
}