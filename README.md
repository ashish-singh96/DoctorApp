# Doctor Patient Platform

This is a backend API project built using Spring Boot Framework and Hibernate for carrying out database operations. The platform allows doctors to register their patients through a mobile or web portal and suggest the best doctor based on patient’s symptoms.<br>

# Features
Add a doctor to the platform<br>
Add a patient along with their symptoms<br>
Suggest the best doctor based on the patient’s symptom and location<br>


# Doctor
In our database, we will have the following fields for the doctor entity:<br>

Name (should be at least 3 characters)<br>
City (should be at max 20 characters)<br>
Email (should be a valid email address)<br>
Phone number (should be at least 10 numbers)<br>
Speciality (can have 4 values i.e. Orthopedic, Gynecology, Dermatology, ENT specialist)<br>
A doctor can be added or removed from the platform.<br>

# Patient
In our database, we will have the following fields for the patient entity:
<br>
Name (should be at least 3 characters)<br>
City (should be at max 20 characters)<br>
Email (should be a valid email address)<br>
Phone number (should be at least 10 numbers)<br>
Symptom (can have the following values only: Arthritis, Back Pain, Tissue injuries (comes under Orthopedic speciality), Dysmenorrhea (comes under Gynecology speciality), Skin infection, skin burn (comes under Dermatology speciality), Ear pain (comes under ENT speciality))
A patient can be added or removed from the platform.

# Edge-Cases
If there isn’t any doctor on that location (i.e. outside Delhi, Noida, Faridabad), the response should be “We are still waiting to expand to your location”<br>
If there isn’t any doctor for that symptom on that location, the response should be “There isn’t any doctor present at your location for your symptom”<br>


# Technologies Used
Java 17<br>
Spring Boot Framework(version - 3.0.6)<br>
Hibernate<br>
Swagger (optional)<br>
MySQL database<br>

# Validation
The following fields are validated at the backend:<br>

Name (should be at least 3 characters)<br>
City (should be at max 20 characters)<br>
Email (should be a valid email address)<br>
Phone number (should be at least 10 number)<br>

# Summary
The project requires creating entities for doctors and patients, along with their respective fields and validations. The system should be able to suggest doctors based on the patient's location and symptom. The logic for suggestion should be based on the speciality of the doctor and the symptom of the patient. The project needs to be implemented using Spring Boot framework for core functionalities along with Hibernate for database operations. Swagger can be used to list all the APIs. The project aims to provide a comprehensive solution for doctors and patients to manage their medical records and provide quick and efficient suggestions for better healthcare.

