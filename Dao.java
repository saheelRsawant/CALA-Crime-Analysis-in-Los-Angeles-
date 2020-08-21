package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.*;
import com.util.Utility;

public class Dao {
	
	public ArrayList<Query_Output> retrieve(){
		ArrayList<Query_Output> Query1_List = new ArrayList<Query_Output>();
		//ArrayList<Integer> count_list = new ArrayList<Integer>();
		//ArrayList<Crime> crime_array = new ArrayList<Crime>();
		//ArrayList<Crime_Details> crimeDetails_array = new ArrayList<Crime_Details>();
		//ArrayList<Crime_Address> crimeAddress_array = new ArrayList<Crime_Address>();
		
		Connection con = Utility.getConnection();
		
		try {
			//PreparedStatement ps = con.prepareStatement("select * from flight_1422677 inner join luggage_1422677 on flight_1422677.flightid=luggage_1422677.flightid");
			PreparedStatement ps = con.prepareStatement(" SELECT age, count(casenumber)FROM Case_Record CR NATURAL JOIN Victim_Details NATURAL JOIN Crime NATURAL JOIN Crime_Address NATURAL JOIN Crime_Details WHERE age BETWEEN 16 and 30  AND gender like 'F' AND areaName='Central' AND weapondesc like '%STRONG-ARM%' GROUP BY(age) ORDER BY age asc");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int age = rs.getInt(1);
				int count = rs.getInt(2);
				Query_Output output1 = new Query_Output();
				output1.setNum1(age);
				output1.setNum2(count);
				if(output1 != null)
				Query1_List.add(output1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Query1_List; 
	}
	
	public ArrayList<Query_Output> retrieve2(){
		ArrayList<Query_Output> Query2_List = new ArrayList<Query_Output>();
		//ArrayList<Integer> count_list = new ArrayList<Integer>();
		//ArrayList<Crime> crime_array = new ArrayList<Crime>();
		//ArrayList<Crime_Details> crimeDetails_array = new ArrayList<Crime_Details>();
		//ArrayList<Crime_Address> crimeAddress_array = new ArrayList<Crime_Address>();
		
		Connection con = Utility.getConnection();
		
		try {
			System.out.println("Entering Query 2 dao");
			PreparedStatement ps = con.prepareStatement("SELECT AName as Top10Areas, NoOfCrimes\n" + 
					"FROM (SELECT distinct areaname as AName, count(Weapondesc) as NoofCrimes\n" + 
					"     FROM Crime_details Natural JOIN Crime\n" + 
					"                         Natural Join Crime_Address\n" + 
					"      WHERE areaID = areaID AND casenumber = casenumber AND weapondesc = 'VERBAL THREAT'\n" + 
					"      GROUP By areaname\n" + 
					"      ORDER BY NoofCrimes DESC)\n" + 
					"WHERE Rownum <=10");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String area = rs.getString(1);
				int countCrime = rs.getInt(2);
				
				Query_Output output2 = new Query_Output();
				
				output2.setStr1(area);
				output2.setNum1(countCrime);
				if(output2 != null)
					Query2_List.add(output2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Query2_List; 
	}

	public ArrayList<Query_Output> retrieve3(){
		ArrayList<Query_Output> Query3_List = new ArrayList<Query_Output>();
		//ArrayList<Integer> count_list = new ArrayList<Integer>();
		//ArrayList<Crime> crime_array = new ArrayList<Crime>();
		//ArrayList<Crime_Details> crimeDetails_array = new ArrayList<Crime_Details>();
		//ArrayList<Crime_Address> crimeAddress_array = new ArrayList<Crime_Address>();
		
		Connection con = Utility.getConnection();
		
		try {
			System.out.println("Entering Query 3 dao");
			PreparedStatement ps = con.prepareStatement("(SELECT AreaName, CRIMECODEDESC, Premisedesc\n" + 
					"FROM Case_Record NATURAL JOIN Victim_Details\n" + 
					"                NATURAL JOIN Crime\n" + 
					"                NATURAL JOIN Crime_Address\n" + 
					"                NATURAL JOIN Crime_Details\n" + 
					"WHERE AreaName like '%Hollywood%'\n" + 
					"AND Premisedesc like '%PARKING UNDERGROUND/BUILDING'\n" + 
					"AND CRIMECODEDESC = 'BURGLARY FROM VEHICLE'\n" + 
					"AND timeOccurred >= 0700 AND timeOccurred <=2300) \n" + 
					"\n" + 
					"UNION\n" + 
					"(SELECT AreaName, CRIMECODEDESC, Premisedesc\n" + 
					"FROM Case_Record NATURAL JOIN Victim_Details\n" + 
					"                NATURAL JOIN Crime\n" + 
					"                NATURAL JOIN Crime_Address\n" + 
					"                NATURAL JOIN Crime_Details\n" + 
					"WHERE AreaName like '%Hollywood%'\n" + 
					"AND Premisedesc like '%PARKING LOT'\n" + 
					"AND CRIMECODEDESC = 'BATTERY - SIMPLE ASSAULT' \n" + 
					"AND timeOccurred >= 0700 AND timeOccurred <=2300)");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String area = rs.getString(1);
				String crimeDesc = rs.getString(2);
				String premiseDesc = rs.getString(3);
				
				Query_Output output3 = new Query_Output();
				
				output3.setStr1(area);
				output3.setStr2(premiseDesc);
				output3.setStr3(crimeDesc);
				if(output3 != null)
				Query3_List.add(output3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Query3_List; 
	}

	public ArrayList<Query_Output> retrieve4(){
		ArrayList<Query_Output> Query4_List = new ArrayList<Query_Output>();
		//ArrayList<Integer> count_list = new ArrayList<Integer>();
		//ArrayList<Crime> crime_array = new ArrayList<Crime>();
		//ArrayList<Crime_Details> crimeDetails_array = new ArrayList<Crime_Details>();
		//ArrayList<Crime_Address> crimeAddress_array = new ArrayList<Crime_Address>();
		
		Connection con = Utility.getConnection();
		
		try {
			System.out.println("Entering Query 4 dao");
			PreparedStatement ps = con.prepareStatement("SELECT PremiseDesc as PD, count(Crimecode) as Crimes\n" + 
					"      FROM Crime_details CD, Crime C, Case_Record CR, Victim_Details VD\n" + 
					"      WHERE CD.casenumber = C.casenumber AND cr.casenumber=c.casenumber AND vd.casenumber = cd.casenumber\n" + 
					"      AND cr.statusdesc like '%Invest Cont' AND VD.descent like 'B%'\n" + 
					"      AND CR.DATEREPORTED = CR.DATEOCCURRED\n" + 
					"      AND cr.timeoccurred > 2100\n" + 
					"      GROUP BY PremiseDesc\n" + 
					"      HAVING count(Crimecode) > 20\n" + 
					"      ORDER BY Crimes DESC");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String premise = rs.getString(1);
				int crimeCount = rs.getInt(2);
				
				Query_Output output4 = new Query_Output();
				
				output4.setStr1(premise);
				output4.setNum1(crimeCount);
				
				
				if(output4 != null)
				Query4_List.add(output4);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Query4_List; 
	}
	
	public ArrayList<Query_Output> retrieve5(){
		ArrayList<Query_Output> Query5_List = new ArrayList<Query_Output>();
		//ArrayList<Integer> count_list = new ArrayList<Integer>();
		//ArrayList<Crime> crime_array = new ArrayList<Crime>();
		//ArrayList<Crime_Details> crimeDetails_array = new ArrayList<Crime_Details>();
		//ArrayList<Crime_Address> crimeAddress_array = new ArrayList<Crime_Address>();
		
		Connection con = Utility.getConnection();
		
		try {
			System.out.println("Entering Query 5 dao");
			PreparedStatement ps = con.prepareStatement("SELECT C.areaName\n" + 
					"FROM Case_Record CR , Crime_Address C\n" + 
					"WHERE CR.caseNumber=C. caseNumber AND extract(year from CR.dateOccurred) < 2015\n" + 
					"MINUS\n" + 
					"SELECT C.areaName\n" + 
					"FROM Case_Record CR , Crime_Address C\n" + 
					"WHERE CR.caseNumber=C. caseNumber AND extract(year from CR.dateOccurred) > 2015");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String area = rs.getString(1);
				
				Query_Output output5 = new Query_Output();
				
				output5.setStr1(area);
				
				
				if(output5 != null)
				Query5_List.add(output5);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Query5_List; 
	}
}
