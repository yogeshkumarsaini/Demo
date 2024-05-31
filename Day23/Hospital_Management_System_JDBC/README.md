# Hospital Management System

This Hospital Management System is a console-based Java application that allows users to manage patients, doctors, and appointments. The application provides CRUD (Create, Read, Update, Delete) operations for each entity.

## Features

### Patient Management
- Insert Patient Details
- Display All Patients Details
- Get Patient by ID
- Update Patient Details
- Delete Patient Details

### Doctor Management
- Insert Doctors Details
- Display All Doctors Details
- Get Doctor by ID
- Update Doctor Details
- Delete Doctor

### Appointment Management
- Insert Appointment Details
- Display All Appointment Details
- Get Detailed Appointments
- Get Appointment by ID
- Update Appointment Details
- Delete Appointment

## How to Run

1. **Clone the repository**
 ```
    git clone https://github.com/your-username/hospital-management-system.git
    cd hospital-management-system
```

2. **Open the project in your favorite IDE**

3. **Ensure you have the required database setup** (refer to the `DBUtil` class for the connection details). You need to create the tables `patients`, `doctors`, and `appointments` in your database.

4. **Run the main class** to start the application.

## Database Schema

### Patients Table
```sql
CREATE TABLE patients (
    patient_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    date_of_birth DATE,
    gender VARCHAR(10),
    contact_number VARCHAR(15),
    address VARCHAR(255)
);
```
### Doctors Table
```sql
CREATE TABLE doctors (
    doctor_id INT PRIMARY KEY AUTO_INCREMENT,
    dname VARCHAR(100),
    specialty VARCHAR(100),
    contactNumber VARCHAR(15),
    address VARCHAR(255)
);
```
### Appointments Table
```sql
CREATE TABLE appointments (
    appointment_id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT,
    doctor_id INT,
    appointment_date DATE,
    FOREIGN KEY (patient_id) REFERENCES patients(patient_id),
    FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id)
);
```

## Project Structure

```
src
├── dao
│   ├── PatientDAO.java
│   ├── DoctorDAO.java
│   └── AppointmentDAO.java
├── model
│   ├── Patients.java
│   ├── Doctors.java
│   └── Appointments.java
├── service
│   ├── PatientService.java
│   ├── DoctorService.java
│   └── AppointmentService.java
└── main
    └── HospitalManagementSystem.java
```

## Usage

1. Main Menu: On running the application, the main menu provides options to manage patients, doctors, and appointments.
2. Sub-Menus: Each main category has sub-options for CRUD operations.
3. User Inputs: Users can enter the required information as prompted in the console.

## Error Handling

The application handles SQL exceptions and provides relevant error messages to the user.

##Contributions

Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.
