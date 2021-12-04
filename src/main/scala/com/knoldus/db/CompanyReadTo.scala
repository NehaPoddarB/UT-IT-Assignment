package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadTo {

  val knoldusCompany: Company = Company("Knoldus", "Knoldus@gmail.com", "Noida")
  val flipkartCompany: Company = Company("FlipKart", "flipkart1502@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Flipkart" -> flipkartCompany)
  def getCompanyByName(name: String): Option[Company] = companies.get(name)


}
