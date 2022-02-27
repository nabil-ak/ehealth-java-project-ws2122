# EHealth Projekt Wintersemester 2021/22

## Features
* Login and Register Account
* Create, Delete and Move Appointment
* Admin Tab for the Admin to manage the Accounts
* Profil Tab so the user can change his credentials
* Reminder Mail  
* Confirmation Mail
* Modern GUI
* Export Profil as PDF
* MySQL Database
* Google Maps API for the Doctor Searching
## Gui

### Login
![Alt Text](https://i.imgur.com/msiBkz2.png)

### Register
![Alt Text](https://i.imgur.com/qHh2JWO.jpg)

### Dashboard
![Alt Text](https://i.imgur.com/q2rkpXN.jpg)

### Profil
![Alt Text](https://i.imgur.com/yz6iInZ.jpg)

### Create Appointment
![Alt Text](https://i.imgur.com/AK1mWzV.png)

### Select Doctor
![Alt Text](https://i.imgur.com/4rqAYuA.png)

### Admin
![Alt Text](https://i.imgur.com/d6MdaK6.jpg)

## ToDoList

### User Profiles 
- [x] Create user profiles and login (authentication) 
  - [x] Provide GUI interface 
  - [x] *Store* login data in database   
  - [x] *Encrypt* login data in database 
- [x] Admin permission to access, edit and delete users  
  - [x] Admin account placeholder
  - [x] Design admin panel
  - [x] Implement accessor, editor and deletor in admin panel

### UI
- [x] Create navigation panels
- [x] Admin panel visibility
- [x] Dashboard
  - [x] Fetch user's appointment
  - [x] Export health information as PDF
- [x] Create appointment
  - [x] Doctor suggestions
  - [x] Redirect to Dashboard after Appointment created
- [x] Profile / Admin
  - [x] Display user data
  - [x] Edit user data panel

### Create Appointments
- [x] Create and pass Appointment entity as java class
  - [x] Entry contains info about *appointment* 
- [x] Store Appointment entity in database
  - [x] Prepare to display stored appointments on dashboards
- [x] *Reminder* functionality
  - [x] Drop down menu to select time
  - [x] Email notification 

### Delete and Edit Appointments
- [x] Delete appointment
- [x] Edit appointment
- [x] User get *email notifcation* on delete/edit

### Documentation
- [x] Include *Javadoc* as API for classes, methods, attributes
- [x] *Diagrams* describing the software architecture and functionality
- [x] *Project documentation* (max. 18 pages) (see requirements)
  - [x] Description
  - [x] Motivation
  - [x] Requirements
  - [x] Organisation/Task distribution
  - [x] Technical descriptions and solutions
  - [x] Conclusion
