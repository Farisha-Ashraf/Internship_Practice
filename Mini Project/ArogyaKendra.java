//  The management system should have the following features: - 
// Add a patient’s details to the system whenever there is a new patient admitted. 
// The patient details should include his/her Name, age, Gender, Aadhar Card number, contact number, city, address, date of admission, guardian's Name, guardian’s address, guardian’s contact number. Assign a unique id to each patient admitted. 
// Note: Validate user entered data. Such as 
// Number of digits in age is 1 or 2 digits. 
// Aadhar card number should contains 12 digits. 
// Contact number should contain 10 digits only. 
// The system can show the list of patients at any point of time. Basically, the system should be dynamic and a real time system. In other words, it can provide results at any point of time without any delays. Display proper error message if patients list is empty. 
// Given the unique id assigned to a patient, provide all the details of that patient. 
// In other words, the system should provide details about a patient using his/her unique id or Name. 
// The system can provide the list of all the patients from a particular city or a state. Also provide the list of patients belonging to a particular age group. For example, you can be asked to give the list of patients in the age group 50-60. Handle NullPointerException if user entered values are empty.  
// Mark the patient recovered when he starts working fine. 
// The system should be able to delete the information of a patient when asked to.  Handle NullPointerException if user entered patient id is not present in list. 
// Implement these features using efficient data structures, collections  and OOP concepts learnt in the Java Foundation course. Write clean and organized codes using proper objects and methods.
import java.util.*;
import java.util.ArrayList;

class Patient {
  private static int nextId = 100;

  private int id;
  private String name;
  private int age;
  private String gender;
  private String aadharNumber;
  private String contactNumber;
  private String city;
  private String address;
  private Date dateOfAdmission;
  private String guardianName;
  private String guardianAddress;
  private String guardianContactNumber;
  private boolean recovered;

  public Patient(String name, int age, String gender, String aadharNumber, String contactNumber, String city,
      String address, String guardianName, String guardianAddress, String guardianContactNumber) {
    this.id = nextId++;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.aadharNumber = aadharNumber;
    this.contactNumber = contactNumber;
    this.city = city;
    this.address = address;
    this.dateOfAdmission = dateOfAdmission;
    this.guardianName = guardianName;
    this.guardianAddress = guardianAddress;
    this.guardianContactNumber = guardianContactNumber;
    this.recovered = false;
  }

  int getId() {
    return id;
  }

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  String getGender() {
    return gender;
  }

  String getAadharNumber() {
    return aadharNumber;
  }

  String getContactNumber() {
    return contactNumber;
  }

  String getCity() {
    return city;
  }

  String getAddress() {
    return address;
  }

  Date getDateOfAdmission() {
    return dateOfAdmission;
  }

  String getGuardianName() {
    return guardianName;
  }

  String getGuardianAddress() {
    return guardianAddress;
  }

  String getGuardianContactNumber() {
    return guardianContactNumber;
  }

  boolean isRecovered() {
    return recovered;
  }

  void setName(String name) {
    this.name = name;
  }

  void setAge(int age) {
    this.age = age;
  }

  void setGender(String gender) {
    this.gender = gender;
  }

  void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  void setCity(String city) {
    this.city = city;
  }

  void setAadharNumber(String aadharNumber) {
    this.aadharNumber = aadharNumber;
  }

  void setAddress(String address) {
    this.address = address;
  }

  void setDateOfAdmission(Date dateOfAdmission) {
    this.dateOfAdmission = dateOfAdmission;
  }

  void setGuardianName(String guardianName) {
    this.guardianName = guardianName;
  }

  void setGaurdianContactNumber(String gaurdianContactNumber) {
    this.guardianContactNumber = gaurdianContactNumber;
  }

  void setGuardianAddress(String guardianAddress) {
    this.guardianAddress = guardianAddress;
  }

  void setGuardianContactNumber(String guardianContactNumber) {
    this.guardianContactNumber = guardianContactNumber;
  }

  public void setRecovered(boolean recovered) {
    this.recovered = recovered;
  }

  public void displayPatientDetails() {
    System.out.println("Patient Name: " + getName());
    System.out.println("Patient Age: " + getAge());
    System.out.println("Patient Gender: " + getGender());
    System.out.println("Patient Aadhar number: " + getAadharNumber());
    System.out.println("Patient Contact number: " + getContactNumber());
    System.out.println("Patient City: " + getCity());
    System.out.println("Patient Address: " + getAddress());
    System.out.println("Patient Date of admission: " + getDateOfAdmission());
    System.out.println("Patient Guardian name: " + getGuardianName());
    System.out.println("Patient Guardian address: " + getGuardianAddress());
    System.out.println("Patient Guardian contact number: " + getGuardianContactNumber());
    System.out.println("Patient Unique ID: " + getId());
    System.out.println("Patient Recovered: " + isRecovered());
  }

  class PatientManagementSystem {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Patient> patientList = new ArrayList<Patient>();

    void addPatient(String name, int age, String gender, String aadharNumber, String contactNumber, String city,
        String address, String guardianName, String guardianAddress, String guardianContactNumber)
        throws IllegalArgumentException {
      Patient patient = new Patient(name, age, gender, aadharNumber, contactNumber, city, address, guardianName,
          guardianAddress, guardianContactNumber);
      patientList.add(patient);
      System.out.println("Patient added with id: " + patient.getId());
    }

    public Patient getPatientById(int id) {
      for (Patient patient : patientList) {
        if (patient.getId() == id) {
          return patient;
        }
      }
      return null;
    }

    public List<Patient> getPatientsByCity(String city) {
      List<Patient> patients = new ArrayList<>();
      for (Patient patient : patientList) {
        if (patient.getCity().equals(city)) {
          patients.add(patient);
        }
      }
      return patients;
    }

    public List<Patient> getPatientsByAgeGroup(int startAge, int endAge) {
      List<Patient> patients = new ArrayList<>();
      for (Patient patient : patientList) {
        int age = patient.getAge();
        if (age >= startAge && age <= endAge) {
          patients.add(patient);
        }
      }
      return patients;
    }

    public void markPatientAsRecovered(int id) throws NullPointerException {
      Patient patient = getPatientById(id);
      if (patient == null) {
        throw new NullPointerException("Patient with id " + id + " not found");
      } else if (patient.isRecovered() == true) {
        System.out.println("Patient is already marked as recovered");
      } else {
        patient.setRecovered(true);
        System.out.println("Patient marked as recovered");
      }
    }

    public void deletePatient(int id) throws NullPointerException {
      Patient patient = getPatientById(id);
      if (patient == null) {
        throw new NullPointerException("Patient with id " + id + " not found");
      }
      patientList.remove(patient);
      System.out.println("Patient with id " + id + " deleted");
    }

    void displayPatients() {
      if (patientList.size() == 0) {
        System.out.println("No patients found");
      } else {
        System.out.println("List of patients:");
        for (Patient patient : patientList) {
          System.out.println("Patient Id is: " + patient.getId());
          System.out.println("Patient Name is: " + patient.getName());
          System.out.println("Patient Age: " + patient.getAge());
          System.out.println("Patient Gender: " + patient.getGender());
          System.out.println("Patient Aadhar Number: " + patient.getAadharNumber());
          System.out.println("Patient Contact Number: " + patient.getContactNumber());
          System.out.println("Patient City: " + patient.getCity());
          System.out.println("Patient Address: " + patient.getAddress());
          System.out.println("Patient Date of Admission: " + patient.getDateOfAdmission());
          System.out.println("Patient Guardian Name: " + patient.getGuardianName());
          System.out.println("Patient Guardian Address: " + patient.getGuardianAddress());
          System.out.println("Patient Guardian Contact Number: " + patient.getGuardianContactNumber());
          System.out.println("Patient Recovered: " + patient.isRecovered());
          System.out.println();
        }
      }
    }
  }
}

public class MiniProject {
  public static void main(String[] args) {
    PatientManagementSystem patientSystem = new PatientManagementSystem();
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      System.out.println("WELCOME TO AROGYA KENDRA");
      System.out.println("*****");
      System.out.println("Please choose the below option:");
      System.out.println("*****");
      System.out.println("1. Add patient");
      System.out.println("2. Show all patients");
      System.out.println("3. Show patient details by ID");
      System.out.println("4. Show patients by city");
      System.out.println("5. Show patients by age group");
      System.out.println("6. Mark patient as recovered");
      System.out.println("7. To Delete Patient");
      System.out.println("8. Exit");

      System.out.println("******");
      System.out.println("Enter your choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.print("patient name: ");
          String name = sc.next();
          System.out.print("patient age: ");
          int age = sc.nextInt();
          if (age < 1 || age > 99) {
            throw new IllegalArgumentException("Age should be between 1 and 99");
          }
          System.out.print("patient gender: ");
          String gender = sc.next();
          System.out.print("patient Aadhar number: ");
          String aadharNumber = sc.next();
          if (aadharNumber.length() != 12) {
            throw new IllegalArgumentException("Aadhar Card number should contain 12 digits only");
          }
          System.out.print("patient contact number: ");
          String contactNumber = sc.next();
          if (contactNumber.length() != 10) {
            throw new IllegalArgumentException("Contact number should contain 10 digits only");
          }
          System.out.print("patient city: ");
          String city = sc.next();
          System.out.print("patient address: ");
          String address = sc.next();
          System.out.print("patient date of Admission: ");
          String dateOfAdmission = sc.next();

          System.out.print("patient guardian name: ");
          String guardianName = sc.next();
          System.out.print("patient guardian address: ");
          String guardianAddress = sc.next();
          System.out.print("patient guardian contact number: ");
          String guardianContactNumber = sc.next();
          try {
            patientSystem.addPatient(name, age, gender, aadharNumber, contactNumber, city, address, guardianName,
                guardianAddress, guardianContactNumber);
          } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
          }
          break;
        case 2:
          patientSystem.displayPatients();
          break;
        case 3:
          System.out.print("Enter patient ID: ");
          int id = sc.nextInt();
          Patient patient = patientSystem.getPatientById(id);
          if (patient != null) {
            System.out.println("Patient found:");
            System.out.println(patient);
          } else {
            System.out.println("Patient not found");
          }
          break;
        case 4:
          System.out.print("patient city: ");
          String patientCity = sc.next();
          List<Patient> patientsByCity = patientSystem.getPatientsByCity(patientCity);
          if (patientsByCity.size() > 0) {
            System.out.println("Patients found:");
            for (Patient p : patientsByCity) {
              p.displayPatientDetails();
            }
          } else {
            System.out.println("No patients found");

          }
          break;
        case 5:
          System.out.print("start age: ");
          int startAge = sc.nextInt();
          System.out.print("end age: ");
          int endAge = sc.nextInt();
          List<Patient> patientsByAgeGroup = patientSystem.getPatientsByAgeGroup(startAge, endAge);
          if (patientsByAgeGroup.size() > 0) {
            System.out.println("Patients found:");
            for (Patient p : patientsByAgeGroup) {
              p.displayPatientDetails();
            }
          } else {
            System.out.println("No patients found");
          }
          break;
        case 6:
          System.out.print("patient ID: ");
          int recoverId = sc.nextInt();
          patientSystem.markPatientAsRecovered(recoverId);
          break;
        case 7:
          int did = sc.nextInt();
          patientSystem.deletePatient(did);
          break;
        case 8:
          exit = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
  }
}