package com.knoldus.request

import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.funsuite.AnyFunSuite

class EmployeeImplTest extends AnyFunSuite{
  val employeeValidator = mock[EmployeeValidator]
  val Neha:Employee = new Employee("Neha","Poddar",22,12000,"Intern","Knoldus","neha.poddar@gmail.com")
  val userImpl = new EmployeeImpl(employeeValidator)

  test("User can be ceated"){
    when(employeeValidator.employeeIsValid(Neha))thenReturn(true)
    val result = userImpl.createEmployee(Neha)
    assert(result.isDefined)
  }
  test("User can not be created"){
    when(employeeValidator.employeeIsValid(Neha))thenReturn(false)
    val result = userImpl.createEmployee(Neha)
    assert(result.isEmpty)
  }
}
