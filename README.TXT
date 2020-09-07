------------------------------------------------------------------------
PROJECT TITLE: CourseWork 1
PURPOSE OF PROJECT: Burglary Incident Database
VERSION or DATE: 11/12/2018 
AUTHOR: Wyatt Patterson
USER INSTRUCTIONS:
------------------------------------------------------------------------
This project is a database for burglary incidents in the local area. Burglaries are 
referred to as "incidents," and will be recorded at a particular postcode location
and will record the value of the good stolen. The different areas of the country are
referred to as "districts" and will collect data so they can be summarized by the
number of incidents.

Incident Class
The Incident Class stores and retrieves information about the value, postcode, 
month, and the year in which the crime was reported.

District Class
The District class stores and retrieves the names of the local district. The district
class also holds a list of burglary incidents that can return the following:

-Incident with the highest value
-The average incident value recorded in the district for a user inputted year
-A list of all incidents recorded in the district with a value greater than a
given amount of money

Reporting Class
The Reporting class holds information about all of the districts. It also includes
lists which return the following:

-The district with the largest average value for a given year
-The largest value ever recorded
-A list of all incidents recorded with a value greater than a given amount of 
money

ReportingIO
The ReportingIO Class is a menu for the user that allows the user to choose the
following features:

-Enter District Data
-Enter Incident Data

The class also gives the user the option to input a chosen year and largest value 
amount for comparison to find the district and value greater than.

The ReportingIO class also provides the user with statistics on:

 - The district with the largest average value incident for an inputted year
 - All incidents with a value greater than a given amount
 
 The class allows to choose either feature, input data about districts and incidents,
 and returns the user to the menu.
